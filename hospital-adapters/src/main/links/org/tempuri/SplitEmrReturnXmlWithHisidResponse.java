/**
 * SplitEmrReturnXmlWithHisidResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

@SuppressWarnings("serial")
public class SplitEmrReturnXmlWithHisidResponse  implements java.io.Serializable {
    private java.lang.String splitEmrReturnXmlWithHisidResult;

    public SplitEmrReturnXmlWithHisidResponse() {
    }

    public SplitEmrReturnXmlWithHisidResponse(
           java.lang.String splitEmrReturnXmlWithHisidResult) {
           this.splitEmrReturnXmlWithHisidResult = splitEmrReturnXmlWithHisidResult;
    }


    /**
     * Gets the splitEmrReturnXmlWithHisidResult value for this SplitEmrReturnXmlWithHisidResponse.
     * 
     * @return splitEmrReturnXmlWithHisidResult
     */
    public java.lang.String getSplitEmrReturnXmlWithHisidResult() {
        return splitEmrReturnXmlWithHisidResult;
    }


    /**
     * Sets the splitEmrReturnXmlWithHisidResult value for this SplitEmrReturnXmlWithHisidResponse.
     * 
     * @param splitEmrReturnXmlWithHisidResult
     */
    public void setSplitEmrReturnXmlWithHisidResult(java.lang.String splitEmrReturnXmlWithHisidResult) {
        this.splitEmrReturnXmlWithHisidResult = splitEmrReturnXmlWithHisidResult;
    }

    private java.lang.Object __equalsCalc = null;
    @SuppressWarnings("unused")
	public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SplitEmrReturnXmlWithHisidResponse)) return false;
        SplitEmrReturnXmlWithHisidResponse other = (SplitEmrReturnXmlWithHisidResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.splitEmrReturnXmlWithHisidResult==null && other.getSplitEmrReturnXmlWithHisidResult()==null) || 
             (this.splitEmrReturnXmlWithHisidResult!=null &&
              this.splitEmrReturnXmlWithHisidResult.equals(other.getSplitEmrReturnXmlWithHisidResult())));
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
        if (getSplitEmrReturnXmlWithHisidResult() != null) {
            _hashCode += getSplitEmrReturnXmlWithHisidResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SplitEmrReturnXmlWithHisidResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">SplitEmrReturnXmlWithHisidResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("splitEmrReturnXmlWithHisidResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SplitEmrReturnXmlWithHisidResult"));
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
