package com.sybercare.hospital.migrate.manager;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.sybercare.hospital.common.utils.UserException;
import com.sybercare.hospital.migrate.service.MigrateService;
import com.sybercare.hospital.migrate.utils.BeanUtils;
import com.sybercare.hospital.migrate.utils.Constants;

@Component
public class MigrateManager {
	private List<String> beanNames = new ArrayList<String>();

	public MigrateManager() {
		beanNames.add(Constants.ROLE_SERVICE);
		beanNames.add(Constants.DEPT_SERVICE);
		beanNames.add(Constants.USER_SERVICE);
		beanNames.add(Constants.PATIENT_SERVICE);
		beanNames.add(Constants.ADVICE_SERVICE);
		beanNames.add(Constants.METER_SERVICE);
		beanNames.add(Constants.QA_SERVICE);
		beanNames.add(Constants.CRISIS_SERVICE);
		beanNames.add(Constants.PERIOD_SERVICE);
		beanNames.add(Constants.BLOOD_SERVICE);
	}

	public void executor() {
		for (String beanName : beanNames) {
			Object object = BeanUtils.getBean(beanName);
			if (object instanceof MigrateService) {
				MigrateService service = (MigrateService) object;
				try {
					service.doMigrate();
				} catch (UserException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
