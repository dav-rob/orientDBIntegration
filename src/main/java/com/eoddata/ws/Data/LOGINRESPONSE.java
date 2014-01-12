/**
 * LOGINRESPONSE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.eoddata.ws.Data;

public class LOGINRESPONSE  implements java.io.Serializable {
    private java.lang.String message;  // attribute

    private java.lang.String token;  // attribute

    private java.lang.String dataFormat;  // attribute

    private boolean header;  // attribute

    private boolean suffix;  // attribute

    public LOGINRESPONSE() {
    }

    public LOGINRESPONSE(
           java.lang.String message,
           java.lang.String token,
           java.lang.String dataFormat,
           boolean header,
           boolean suffix) {
           this.message = message;
           this.token = token;
           this.dataFormat = dataFormat;
           this.header = header;
           this.suffix = suffix;
    }


    /**
     * Gets the message value for this LOGINRESPONSE.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this LOGINRESPONSE.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the token value for this LOGINRESPONSE.
     * 
     * @return token
     */
    public java.lang.String getToken() {
        return token;
    }


    /**
     * Sets the token value for this LOGINRESPONSE.
     * 
     * @param token
     */
    public void setToken(java.lang.String token) {
        this.token = token;
    }


    /**
     * Gets the dataFormat value for this LOGINRESPONSE.
     * 
     * @return dataFormat
     */
    public java.lang.String getDataFormat() {
        return dataFormat;
    }


    /**
     * Sets the dataFormat value for this LOGINRESPONSE.
     * 
     * @param dataFormat
     */
    public void setDataFormat(java.lang.String dataFormat) {
        this.dataFormat = dataFormat;
    }


    /**
     * Gets the header value for this LOGINRESPONSE.
     * 
     * @return header
     */
    public boolean isHeader() {
        return header;
    }


    /**
     * Sets the header value for this LOGINRESPONSE.
     * 
     * @param header
     */
    public void setHeader(boolean header) {
        this.header = header;
    }


    /**
     * Gets the suffix value for this LOGINRESPONSE.
     * 
     * @return suffix
     */
    public boolean isSuffix() {
        return suffix;
    }


    /**
     * Sets the suffix value for this LOGINRESPONSE.
     * 
     * @param suffix
     */
    public void setSuffix(boolean suffix) {
        this.suffix = suffix;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LOGINRESPONSE)) return false;
        LOGINRESPONSE other = (LOGINRESPONSE) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.token==null && other.getToken()==null) || 
             (this.token!=null &&
              this.token.equals(other.getToken()))) &&
            ((this.dataFormat==null && other.getDataFormat()==null) || 
             (this.dataFormat!=null &&
              this.dataFormat.equals(other.getDataFormat()))) &&
            this.header == other.isHeader() &&
            this.suffix == other.isSuffix();
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
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getToken() != null) {
            _hashCode += getToken().hashCode();
        }
        if (getDataFormat() != null) {
            _hashCode += getDataFormat().hashCode();
        }
        _hashCode += (isHeader() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSuffix() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LOGINRESPONSE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "LOGINRESPONSE"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("message");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Message"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("token");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Token"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("dataFormat");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DataFormat"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("header");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Header"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("suffix");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Suffix"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
