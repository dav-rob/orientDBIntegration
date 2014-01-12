/**
 * SYMBOL2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.eoddata.ws.Data;

public class SYMBOL2  implements java.io.Serializable {
    private java.lang.String c;  // attribute

    private java.lang.String n;  // attribute

    public SYMBOL2() {
    }

    public SYMBOL2(
           java.lang.String c,
           java.lang.String n) {
           this.c = c;
           this.n = n;
    }


    /**
     * Gets the c value for this SYMBOL2.
     * 
     * @return c
     */
    public java.lang.String getC() {
        return c;
    }


    /**
     * Sets the c value for this SYMBOL2.
     * 
     * @param c
     */
    public void setC(java.lang.String c) {
        this.c = c;
    }


    /**
     * Gets the n value for this SYMBOL2.
     * 
     * @return n
     */
    public java.lang.String getN() {
        return n;
    }


    /**
     * Sets the n value for this SYMBOL2.
     * 
     * @param n
     */
    public void setN(java.lang.String n) {
        this.n = n;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SYMBOL2)) return false;
        SYMBOL2 other = (SYMBOL2) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.c==null && other.getC()==null) || 
             (this.c!=null &&
              this.c.equals(other.getC()))) &&
            ((this.n==null && other.getN()==null) || 
             (this.n!=null &&
              this.n.equals(other.getN())));
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
        if (getC() != null) {
            _hashCode += getC().hashCode();
        }
        if (getN() != null) {
            _hashCode += getN().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SYMBOL2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "SYMBOL2"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("c");
        attrField.setXmlName(new javax.xml.namespace.QName("", "c"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("n");
        attrField.setXmlName(new javax.xml.namespace.QName("", "n"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
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
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
