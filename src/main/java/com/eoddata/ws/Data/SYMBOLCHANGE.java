/**
 * SYMBOLCHANGE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.eoddata.ws.Data;

public class SYMBOLCHANGE  implements java.io.Serializable {
    private java.util.Calendar dateTime;  // attribute

    private java.lang.String oldSymbol;  // attribute

    private java.lang.String newSymbol;  // attribute

    private java.lang.String exchangeCode;  // attribute

    private java.lang.String newExchangeCode;  // attribute

    public SYMBOLCHANGE() {
    }

    public SYMBOLCHANGE(
           java.util.Calendar dateTime,
           java.lang.String oldSymbol,
           java.lang.String newSymbol,
           java.lang.String exchangeCode,
           java.lang.String newExchangeCode) {
           this.dateTime = dateTime;
           this.oldSymbol = oldSymbol;
           this.newSymbol = newSymbol;
           this.exchangeCode = exchangeCode;
           this.newExchangeCode = newExchangeCode;
    }


    /**
     * Gets the dateTime value for this SYMBOLCHANGE.
     * 
     * @return dateTime
     */
    public java.util.Calendar getDateTime() {
        return dateTime;
    }


    /**
     * Sets the dateTime value for this SYMBOLCHANGE.
     * 
     * @param dateTime
     */
    public void setDateTime(java.util.Calendar dateTime) {
        this.dateTime = dateTime;
    }


    /**
     * Gets the oldSymbol value for this SYMBOLCHANGE.
     * 
     * @return oldSymbol
     */
    public java.lang.String getOldSymbol() {
        return oldSymbol;
    }


    /**
     * Sets the oldSymbol value for this SYMBOLCHANGE.
     * 
     * @param oldSymbol
     */
    public void setOldSymbol(java.lang.String oldSymbol) {
        this.oldSymbol = oldSymbol;
    }


    /**
     * Gets the newSymbol value for this SYMBOLCHANGE.
     * 
     * @return newSymbol
     */
    public java.lang.String getNewSymbol() {
        return newSymbol;
    }


    /**
     * Sets the newSymbol value for this SYMBOLCHANGE.
     * 
     * @param newSymbol
     */
    public void setNewSymbol(java.lang.String newSymbol) {
        this.newSymbol = newSymbol;
    }


    /**
     * Gets the exchangeCode value for this SYMBOLCHANGE.
     * 
     * @return exchangeCode
     */
    public java.lang.String getExchangeCode() {
        return exchangeCode;
    }


    /**
     * Sets the exchangeCode value for this SYMBOLCHANGE.
     * 
     * @param exchangeCode
     */
    public void setExchangeCode(java.lang.String exchangeCode) {
        this.exchangeCode = exchangeCode;
    }


    /**
     * Gets the newExchangeCode value for this SYMBOLCHANGE.
     * 
     * @return newExchangeCode
     */
    public java.lang.String getNewExchangeCode() {
        return newExchangeCode;
    }


    /**
     * Sets the newExchangeCode value for this SYMBOLCHANGE.
     * 
     * @param newExchangeCode
     */
    public void setNewExchangeCode(java.lang.String newExchangeCode) {
        this.newExchangeCode = newExchangeCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SYMBOLCHANGE)) return false;
        SYMBOLCHANGE other = (SYMBOLCHANGE) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dateTime==null && other.getDateTime()==null) || 
             (this.dateTime!=null &&
              this.dateTime.equals(other.getDateTime()))) &&
            ((this.oldSymbol==null && other.getOldSymbol()==null) || 
             (this.oldSymbol!=null &&
              this.oldSymbol.equals(other.getOldSymbol()))) &&
            ((this.newSymbol==null && other.getNewSymbol()==null) || 
             (this.newSymbol!=null &&
              this.newSymbol.equals(other.getNewSymbol()))) &&
            ((this.exchangeCode==null && other.getExchangeCode()==null) || 
             (this.exchangeCode!=null &&
              this.exchangeCode.equals(other.getExchangeCode()))) &&
            ((this.newExchangeCode==null && other.getNewExchangeCode()==null) || 
             (this.newExchangeCode!=null &&
              this.newExchangeCode.equals(other.getNewExchangeCode())));
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
        if (getDateTime() != null) {
            _hashCode += getDateTime().hashCode();
        }
        if (getOldSymbol() != null) {
            _hashCode += getOldSymbol().hashCode();
        }
        if (getNewSymbol() != null) {
            _hashCode += getNewSymbol().hashCode();
        }
        if (getExchangeCode() != null) {
            _hashCode += getExchangeCode().hashCode();
        }
        if (getNewExchangeCode() != null) {
            _hashCode += getNewExchangeCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SYMBOLCHANGE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "SYMBOLCHANGE"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("dateTime");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DateTime"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("oldSymbol");
        attrField.setXmlName(new javax.xml.namespace.QName("", "OldSymbol"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("newSymbol");
        attrField.setXmlName(new javax.xml.namespace.QName("", "NewSymbol"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("exchangeCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ExchangeCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("newExchangeCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "NewExchangeCode"));
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
