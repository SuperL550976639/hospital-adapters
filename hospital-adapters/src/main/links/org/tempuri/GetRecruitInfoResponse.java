/**
 * GetRecruitInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

@SuppressWarnings("serial")
public class GetRecruitInfoResponse  implements java.io.Serializable {
    private java.lang.String getRecruitInfoResult;

    public GetRecruitInfoResponse() {
    }

    public GetRecruitInfoResponse(
           java.lang.String getRecruitInfoResult) {
           this.getRecruitInfoResult = getRecruitInfoResult;
    }


    /**
     * Gets the getRecruitInfoResult value for this GetRecruitInfoResponse.
     * 
     * @return getRecruitInfoResult
     */
    public java.lang.String getGetRecruitInfoResult() {
        return getRecruitInfoResult;
    }


    /**
     * Sets the getRecruitInfoResult value for this GetRecruitInfoResponse.
     * 
     * @param getRecruitInfoResult
     */
    public void setGetRecruitInfoResult(java.lang.String getRecruitInfoResult) {
        this.getRecruitInfoResult = getRecruitInfoResult;
    }

    private java.lang.Object __equalsCalc = null;
    @SuppressWarnings("unused")
	public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetRecruitInfoResponse)) return false;
        GetRecruitInfoResponse other = (GetRecruitInfoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getRecruitInfoResult==null && other.getGetRecruitInfoResult()==null) || 
             (this.getRecruitInfoResult!=null &&
              this.getRecruitInfoResult.equals(other.getGetRecruitInfoResult())));
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
        if (getGetRecruitInfoResult() != null) {
            _hashCode += getGetRecruitInfoResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetRecruitInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetRecruitInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getRecruitInfoResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetRecruitInfoResult"));
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
