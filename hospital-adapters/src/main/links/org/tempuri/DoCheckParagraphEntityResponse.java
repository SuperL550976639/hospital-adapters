/**
 * DoCheckParagraphEntityResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class DoCheckParagraphEntityResponse  implements java.io.Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 2980331607988969132L;
	private int doCheckParagraphEntityResult;

    public DoCheckParagraphEntityResponse() {
    }

    public DoCheckParagraphEntityResponse(
           int doCheckParagraphEntityResult) {
           this.doCheckParagraphEntityResult = doCheckParagraphEntityResult;
    }


    /**
     * Gets the doCheckParagraphEntityResult value for this DoCheckParagraphEntityResponse.
     * 
     * @return doCheckParagraphEntityResult
     */
    public int getDoCheckParagraphEntityResult() {
        return doCheckParagraphEntityResult;
    }


    /**
     * Sets the doCheckParagraphEntityResult value for this DoCheckParagraphEntityResponse.
     * 
     * @param doCheckParagraphEntityResult
     */
    public void setDoCheckParagraphEntityResult(int doCheckParagraphEntityResult) {
        this.doCheckParagraphEntityResult = doCheckParagraphEntityResult;
    }

    private java.lang.Object __equalsCalc = null;
    @SuppressWarnings("unused")
	public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoCheckParagraphEntityResponse)) return false;
        DoCheckParagraphEntityResponse other = (DoCheckParagraphEntityResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.doCheckParagraphEntityResult == other.getDoCheckParagraphEntityResult();
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
        _hashCode += getDoCheckParagraphEntityResult();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoCheckParagraphEntityResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">doCheckParagraphEntityResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doCheckParagraphEntityResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "doCheckParagraphEntityResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
