/**
 * CreatePatientCls.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class CreatePatientCls  implements java.io.Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -1111782019799067893L;

	private java.lang.String UHID;

    private java.lang.String imgClsName;

    public CreatePatientCls() {
    }

    public CreatePatientCls(
           java.lang.String UHID,
           java.lang.String imgClsName) {
           this.UHID = UHID;
           this.imgClsName = imgClsName;
    }


    /**
     * Gets the UHID value for this CreatePatientCls.
     * 
     * @return UHID
     */
    public java.lang.String getUHID() {
        return UHID;
    }


    /**
     * Sets the UHID value for this CreatePatientCls.
     * 
     * @param UHID
     */
    public void setUHID(java.lang.String UHID) {
        this.UHID = UHID;
    }


    /**
     * Gets the imgClsName value for this CreatePatientCls.
     * 
     * @return imgClsName
     */
    public java.lang.String getImgClsName() {
        return imgClsName;
    }


    /**
     * Sets the imgClsName value for this CreatePatientCls.
     * 
     * @param imgClsName
     */
    public void setImgClsName(java.lang.String imgClsName) {
        this.imgClsName = imgClsName;
    }

    private java.lang.Object __equalsCalc = null;
    @SuppressWarnings("unused")
	public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreatePatientCls)) return false;
        CreatePatientCls other = (CreatePatientCls) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.UHID==null && other.getUHID()==null) || 
             (this.UHID!=null &&
              this.UHID.equals(other.getUHID()))) &&
            ((this.imgClsName==null && other.getImgClsName()==null) || 
             (this.imgClsName!=null &&
              this.imgClsName.equals(other.getImgClsName())));
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
        if (getUHID() != null) {
            _hashCode += getUHID().hashCode();
        }
        if (getImgClsName() != null) {
            _hashCode += getImgClsName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreatePatientCls.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">CreatePatientCls"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("UHID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "UHID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imgClsName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "imgClsName"));
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
