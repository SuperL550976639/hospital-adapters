/**
 * SetUserOrgs.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

@SuppressWarnings("serial")
public class SetUserOrgs  implements java.io.Serializable {
    private java.lang.String userXml;

    private java.lang.String orgXml;

    public SetUserOrgs() {
    }

    public SetUserOrgs(
           java.lang.String userXml,
           java.lang.String orgXml) {
           this.userXml = userXml;
           this.orgXml = orgXml;
    }


    /**
     * Gets the userXml value for this SetUserOrgs.
     * 
     * @return userXml
     */
    public java.lang.String getUserXml() {
        return userXml;
    }


    /**
     * Sets the userXml value for this SetUserOrgs.
     * 
     * @param userXml
     */
    public void setUserXml(java.lang.String userXml) {
        this.userXml = userXml;
    }


    /**
     * Gets the orgXml value for this SetUserOrgs.
     * 
     * @return orgXml
     */
    public java.lang.String getOrgXml() {
        return orgXml;
    }


    /**
     * Sets the orgXml value for this SetUserOrgs.
     * 
     * @param orgXml
     */
    public void setOrgXml(java.lang.String orgXml) {
        this.orgXml = orgXml;
    }

    private java.lang.Object __equalsCalc = null;
    @SuppressWarnings("unused")
	public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SetUserOrgs)) return false;
        SetUserOrgs other = (SetUserOrgs) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userXml==null && other.getUserXml()==null) || 
             (this.userXml!=null &&
              this.userXml.equals(other.getUserXml()))) &&
            ((this.orgXml==null && other.getOrgXml()==null) || 
             (this.orgXml!=null &&
              this.orgXml.equals(other.getOrgXml())));
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
        if (getUserXml() != null) {
            _hashCode += getUserXml().hashCode();
        }
        if (getOrgXml() != null) {
            _hashCode += getOrgXml().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SetUserOrgs.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">SetUserOrgs"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userXml");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "userXml"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orgXml");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "orgXml"));
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
