/**
 * GetSerialNumberResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

@SuppressWarnings("serial")
public class GetSerialNumberResponse  implements java.io.Serializable {
    private java.lang.String getSerialNumberResult;

    public GetSerialNumberResponse() {
    }

    public GetSerialNumberResponse(
           java.lang.String getSerialNumberResult) {
           this.getSerialNumberResult = getSerialNumberResult;
    }


    /**
     * Gets the getSerialNumberResult value for this GetSerialNumberResponse.
     * 
     * @return getSerialNumberResult
     */
    public java.lang.String getGetSerialNumberResult() {
        return getSerialNumberResult;
    }


    /**
     * Sets the getSerialNumberResult value for this GetSerialNumberResponse.
     * 
     * @param getSerialNumberResult
     */
    public void setGetSerialNumberResult(java.lang.String getSerialNumberResult) {
        this.getSerialNumberResult = getSerialNumberResult;
    }

    private java.lang.Object __equalsCalc = null;
    @SuppressWarnings("unused")
	public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSerialNumberResponse)) return false;
        GetSerialNumberResponse other = (GetSerialNumberResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getSerialNumberResult==null && other.getGetSerialNumberResult()==null) || 
             (this.getSerialNumberResult!=null &&
              this.getSerialNumberResult.equals(other.getGetSerialNumberResult())));
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
        if (getGetSerialNumberResult() != null) {
            _hashCode += getGetSerialNumberResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSerialNumberResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetSerialNumberResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getSerialNumberResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetSerialNumberResult"));
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
