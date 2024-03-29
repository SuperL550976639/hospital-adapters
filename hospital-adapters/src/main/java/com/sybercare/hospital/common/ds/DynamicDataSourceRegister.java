package com.sybercare.hospital.common.ds;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.bind.RelaxedDataBinder;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.support.DefaultConversionService;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 功能：动态数据源注册，启动动态数据源请在启动类中（如SpringBootSampleApplication）
 * 添加 @Import(DynamicDataSourceRegister.class)
 * 
 * @author 任梁荣
 */
public class DynamicDataSourceRegister implements ImportBeanDefinitionRegistrar, EnvironmentAware {

	private static final Logger logger = LoggerFactory.getLogger(DynamicDataSourceRegister.class);

	private ConversionService conversionService = new DefaultConversionService();
	private PropertyValues dataSourcePropertyValues;

	// 如配置文件中未指定数据源类型，使用该默认值
	private static final Object DATASOURCE_TYPE_DEFAULT = "org.apache.tomcat.jdbc.pool.DataSource";

	// 数据源
	private DataSource defaultDataSource;
	private Map<String, DataSource> customDataSources = new HashMap<>();

	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		Map<Object, Object> targetDataSources = new HashMap<Object, Object>();
		targetDataSources.put("dataSource", defaultDataSource);
		DynamicDataSourceContextHolder.dataSourceIds.add("dataSource");
		targetDataSources.putAll(customDataSources);
		for (String key : customDataSources.keySet()) {
			DynamicDataSourceContextHolder.dataSourceIds.add(key);
		}
		GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
		beanDefinition.setBeanClass(DynamicDataSource.class);
		beanDefinition.setSynthetic(true);
		MutablePropertyValues mpv = beanDefinition.getPropertyValues();
		mpv.addPropertyValue("defaultTargetDataSource", defaultDataSource);
		mpv.addPropertyValue("targetDataSources", targetDataSources);
		registry.registerBeanDefinition("dataSource", beanDefinition);
		logger.info("Dynamic DataSource Registry");
	}

	/**
	 * 创建DataSource
	 *
	 * @param type
	 * @param driverClassName
	 * @param url
	 * @param username
	 * @param password
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public DataSource buildDataSource(Map<String, Object> dsMap) {
		try {
			Object type = dsMap.get("type");
			if (type == null)
				type = DATASOURCE_TYPE_DEFAULT;// 默认DataSource
			Class<? extends DataSource> dataSourceType;
			dataSourceType = (Class<? extends DataSource>) Class.forName((String) type);
			String driverClassName = dsMap.get("driver-class-name").toString();
			String url = dsMap.get("url").toString();
			String username = dsMap.get("username").toString();
			String password = dsMap.get("password").toString();
			DataSourceBuilder factory = DataSourceBuilder.create().driverClassName(driverClassName).url(url)
					.username(username).password(password).type(dataSourceType);

			DataSource dataSource = factory.build();

			org.apache.tomcat.jdbc.pool.DataSource tomcatDataSource = (org.apache.tomcat.jdbc.pool.DataSource) dataSource;

			// 每30秒运行一次空闲连接回收器
			tomcatDataSource.setTimeBetweenEvictionRunsMillis(30000);
			// 池中的连接空闲30分钟后被回收
			tomcatDataSource.setMinEvictableIdleTimeMillis(60000);

			tomcatDataSource.setLogAbandoned(true);
			// 连接泄漏回收参数，当可用连接数少于3个时才执行
			tomcatDataSource.setRemoveAbandoned(true);
			// 连接泄漏回收参数，60秒，泄露的连接可以被删除的超时值
			tomcatDataSource.setRemoveAbandonedTimeout(60);

			// 指明连接是否被空闲连接回收器(如果有)进行检验.如果检测失败,则连接将被从池中去除.
			tomcatDataSource.setTestWhileIdle(true);
			// 借出连接时不要测试，否则很影响性能
			tomcatDataSource.setTestOnBorrow(false);
			// 验证使用的SQL语句
			tomcatDataSource.setValidationQuery("select 1");
			// 在每次空闲连接回收器线程(如果有)运行时检查的连接数量
			tomcatDataSource.setNumTestsPerEvictionRun(3);

			/*
			 * 方案1、定时对连接做测试，测试失败就关闭连接。
			 * 
			 * 
			 * //每30秒运行一次空闲连接回收器 tomcatDataSource.setTimeBetweenEvictionRunsMillis(30000);
			 * // 指明连接是否被空闲连接回收器(如果有)进行检验.如果检测失败,则连接将被从池中去除.
			 * tomcatDataSource.setTestWhileIdle(true); //借出连接时不要测试，否则很影响性能
			 * tomcatDataSource.setTestOnBorrow(false); //验证使用的SQL语句
			 * tomcatDataSource.setValidationQuery("select 1");
			 * //在每次空闲连接回收器线程(如果有)运行时检查的连接数量 tomcatDataSource.setNumTestsPerEvictionRun(3);
			 * 
			 * 
			 * 方案2、控制连接的空闲时间达到N分钟，就关闭连接，（然后可再新建连接）。 //池中的连接空闲30分钟后被回收
			 * tomcatDataSource.setMinEvictableIdleTimeMillis(60000);
			 * 
			 * 以上两个方案使用任意一个就可以解决以述两类问题。如果只使用方案2，建议 N <= 5分钟。连接断开后最多5分钟后可恢复。
			 * 
			 * 也可混合使用两个方案，建议 N = 30分钟。
			 * 
			 */

			return tomcatDataSource;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 加载多数据源配置
	 */
	@Override
	public void setEnvironment(Environment env) {
		initDefaultDataSource(env);
		initCustomDataSources(env);
	}

	/**
	 * 初始化主数据源
	 */
	private void initDefaultDataSource(Environment env) {
		RelaxedPropertyResolver propertyResolver = new RelaxedPropertyResolver(env, "spring.datasource.");
		Map<String, Object> dsMap = new HashMap<>();
		dsMap.put("type", propertyResolver.getProperty("type"));
		dsMap.put("driver-class-name", propertyResolver.getProperty("driver-class-name"));
		dsMap.put("url", propertyResolver.getProperty("url"));
		dsMap.put("username", propertyResolver.getProperty("username"));
		dsMap.put("password", propertyResolver.getProperty("password"));
		defaultDataSource = buildDataSource(dsMap);
		dataBinder(defaultDataSource, env);
	}

	/**
	 * 为DataSource绑定更多数据
	 *
	 * @param dataSource
	 * @param env
	 */
	private void dataBinder(DataSource dataSource, Environment env) {
		RelaxedDataBinder dataBinder = new RelaxedDataBinder(dataSource);
		dataBinder.setConversionService(conversionService);
		dataBinder.setIgnoreNestedProperties(false);
		dataBinder.setIgnoreInvalidFields(false);
		dataBinder.setIgnoreUnknownFields(true);
		if (dataSourcePropertyValues == null) {
			Map<String, Object> rpr = new RelaxedPropertyResolver(env, "spring.datasource").getSubProperties(".");
			Map<String, Object> values = new HashMap<>(rpr);
			values.remove("type");
			values.remove("driver-class-name");
			values.remove("url");
			values.remove("username");
			values.remove("password");
			dataSourcePropertyValues = new MutablePropertyValues(values);
		}
		dataBinder.bind(dataSourcePropertyValues);
	}

	/**
	 * 初始化更多数据源
	 */
	private void initCustomDataSources(Environment env) {
		RelaxedPropertyResolver propertyResolver = new RelaxedPropertyResolver(env, "custom.datasource.");
		String dsPrefixs = propertyResolver.getProperty("names");
		if (StringUtils.isNotBlank(dsPrefixs)) {
			for (String dsPrefix : dsPrefixs.split(",")) {
				Map<String, Object> dsMap = propertyResolver.getSubProperties(dsPrefix + ".");
				DataSource ds = buildDataSource(dsMap);
				customDataSources.put(dsPrefix, ds);
				dataBinder(ds, env);
			}
		}
	}
}
