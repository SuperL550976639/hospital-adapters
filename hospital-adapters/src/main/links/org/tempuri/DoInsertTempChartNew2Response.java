/**
 * DoInsertTempChartNew2Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

@SuppressWarnings("serial")
public class DoInsertTempChartNew2Response  implements java.io.Serializable {
    private boolean doInsertTempChartNew2Result;

    private java.lang.String errorMsg;

    public DoInsertTempChartNew2Response() {
    }

    public DoInsertTempChartNew2Response(
           boolean doInsertTempChartNew2Result,
           java.lang.String errorMsg) {
           this.doInsertTempChartNew2Result = doInsertTempChartNew2Result;
           this.errorMsg = errorMsg;
    }


    /**
     * Gets the doInsertTempChartNew2Result value for this DoInsertTempChartNew2Response.
     * 
     * @return doInsertTempChartNew2Result
     */
    public boolean isDoInsertTempChartNew2Result() {
        return doInsertTempChartNew2Result;
    }


    /**
     * Sets the doInsertTempChartNew2Result value for this DoInsertTempChartNew2Response.
     * 
     * @param doInsertTempChartNew2Result
     */
    public void setDoInsertTempChartNew2Result(boolean doInsertTempChartNew2Result) {
        this.doInsertTempChartNew2Result = doInsertTempChartNew2Result;
    }


    /**
     * Gets the errorMsg value for this DoInsertTempChartNew2Response.
     * 
     * @return errorMsg
     */
    public java.lang.String getErrorMsg() {
        return errorMsg;
    }


    /**
     * Sets the errorMsg value for this DoInsertTempChartNew2Response.
     * 
     * @param errorMsg
     */
    public void setErrorMsg(java.lang.String errorMsg) {
        this.errorMsg = errorMsg;
    }

    private java.lang.Object __equalsCalc = null;
    @SuppressWarnings("unused")
	public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoInsertTempChartNew2Response)) return false;
        DoInsertTempChartNew2Response other = (DoInsertTempChartNew2Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.doInsertTempChartNew2Result == other.isDoInsertTempChartNew2Result() &&
            ((this.errorMsg==null && other.getErrorMsg()==null) || 
             (this.errorMsg!=null &&
              this.errorMsg.equals(other.getErrorMsg())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += (isDoInsertTempChartNew2Result() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getErrorMsg() != null) {
            _hashCode += getErrorMsg().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoInsertTempChartNew2Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">doInsertTempChartNew2Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doInsertTempChartNew2Result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "doInsertTempChartNew2Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorMsg");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "errorMsg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    @SuppressWarnings("rawtypes")
	public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    @SuppressWarnings("rawtypes")
	public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
