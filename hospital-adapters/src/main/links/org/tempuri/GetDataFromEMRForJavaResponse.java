/**
 * GetDataFromEMRForJavaResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

@SuppressWarnings("serial")
public class GetDataFromEMRForJavaResponse  implements java.io.Serializable {
    private java.lang.String getDataFromEMRForJavaResult;

    public GetDataFromEMRForJavaResponse() {
    }

    public GetDataFromEMRForJavaResponse(
           java.lang.String getDataFromEMRForJavaResult) {
           this.getDataFromEMRForJavaResult = getDataFromEMRForJavaResult;
    }


    /**
     * Gets the getDataFromEMRForJavaResult value for this GetDataFromEMRForJavaResponse.
     * 
     * @return getDataFromEMRForJavaResult
     */
    public java.lang.String getGetDataFromEMRForJavaResult() {
        return getDataFromEMRForJavaResult;
    }


    /**
     * Sets the getDataFromEMRForJavaResult value for this GetDataFromEMRForJavaResponse.
     * 
     * @param getDataFromEMRForJavaResult
     */
    public void setGetDataFromEMRForJavaResult(java.lang.String getDataFromEMRForJavaResult) {
        this.getDataFromEMRForJavaResult = getDataFromEMRForJavaResult;
    }

    private java.lang.Object __equalsCalc = null;
    @SuppressWarnings("unused")
	public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDataFromEMRForJavaResponse)) return false;
        GetDataFromEMRForJavaResponse other = (GetDataFromEMRForJavaResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getDataFromEMRForJavaResult==null && other.getGetDataFromEMRForJavaResult()==null) || 
             (this.getDataFromEMRForJavaResult!=null &&
              this.getDataFromEMRForJavaResult.equals(other.getGetDataFromEMRForJavaResult())));
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
        if (getGetDataFromEMRForJavaResult() != null) {
            _hashCode += getGetDataFromEMRForJavaResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDataFromEMRForJavaResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetDataFromEMRForJavaResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getDataFromEMRForJavaResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetDataFromEMRForJavaResult"));
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
