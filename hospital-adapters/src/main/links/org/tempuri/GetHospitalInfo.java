/**
 * GetHospitalInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

@SuppressWarnings("serial")
public class GetHospitalInfo  implements java.io.Serializable {
    private java.lang.String hisid;

    private java.lang.String HTML;

    private java.lang.String errorMsg;

    public GetHospitalInfo() {
    }

    public GetHospitalInfo(
           java.lang.String hisid,
           java.lang.String HTML,
           java.lang.String errorMsg) {
           this.hisid = hisid;
           this.HTML = HTML;
           this.errorMsg = errorMsg;
    }


    /**
     * Gets the hisid value for this GetHospitalInfo.
     * 
     * @return hisid
     */
    public java.lang.String getHisid() {
        return hisid;
    }


    /**
     * Sets the hisid value for this GetHospitalInfo.
     * 
     * @param hisid
     */
    public void setHisid(java.lang.String hisid) {
        this.hisid = hisid;
    }


    /**
     * Gets the HTML value for this GetHospitalInfo.
     * 
     * @return HTML
     */
    public java.lang.String getHTML() {
        return HTML;
    }


    /**
     * Sets the HTML value for this GetHospitalInfo.
     * 
     * @param HTML
     */
    public void setHTML(java.lang.String HTML) {
        this.HTML = HTML;
    }


    /**
     * Gets the errorMsg value for this GetHospitalInfo.
     * 
     * @return errorMsg
     */
    public java.lang.String getErrorMsg() {
        return errorMsg;
    }


    /**
     * Sets the errorMsg value for this GetHospitalInfo.
     * 
     * @param errorMsg
     */
    public void setErrorMsg(java.lang.String errorMsg) {
        this.errorMsg = errorMsg;
    }

    private java.lang.Object __equalsCalc = null;
    @SuppressWarnings("unused")
	public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetHospitalInfo)) return false;
        GetHospitalInfo other = (GetHospitalInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hisid==null && other.getHisid()==null) || 
             (this.hisid!=null &&
              this.hisid.equals(other.getHisid()))) &&
            ((this.HTML==null && other.getHTML()==null) || 
             (this.HTML!=null &&
              this.HTML.equals(other.getHTML()))) &&
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
        if (getHisid() != null) {
            _hashCode += getHisid().hashCode();
        }
        if (getHTML() != null) {
            _hashCode += getHTML().hashCode();
        }
        if (getErrorMsg() != null) {
            _hashCode += getErrorMsg().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetHospitalInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">getHospitalInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hisid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Hisid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HTML");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "HTML"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
