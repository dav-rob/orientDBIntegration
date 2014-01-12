/**
 * SPLIT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.eoddata.ws.Data;

public class SPLIT  implements java.io.Serializable {
    private java.lang.String exchange;  // attribute

    private java.lang.String symbol;  // attribute

    private java.util.Calendar dateTime;  // attribute

    private java.lang.String ratio;  // attribute

    public SPLIT() {
    }

    public SPLIT(
           java.lang.String exchange,
           java.lang.String symbol,
           java.util.Calendar dateTime,
           java.lang.String ratio) {
           this.exchange = exchange;
           this.symbol = symbol;
           this.dateTime = dateTime;
           this.ratio = ratio;
    }


    /**
     * Gets the exchange value for this SPLIT.
     * 
     * @return exchange
     */
    public java.lang.String getExchange() {
        return exchange;
    }


    /**
     * Sets the exchange value for this SPLIT.
     * 
     * @param exchange
     */
    public void setExchange(java.lang.String exchange) {
        this.exchange = exchange;
    }


    /**
     * Gets the symbol value for this SPLIT.
     * 
     * @return symbol
     */
    public java.lang.String getSymbol() {
        return symbol;
    }


    /**
     * Sets the symbol value for this SPLIT.
     * 
     * @param symbol
     */
    public void setSymbol(java.lang.String symbol) {
        this.symbol = symbol;
    }


    /**
     * Gets the dateTime value for this SPLIT.
     * 
     * @return dateTime
     */
    public java.util.Calendar getDateTime() {
        return dateTime;
    }


    /**
     * Sets the dateTime value for this SPLIT.
     * 
     * @param dateTime
     */
    public void setDateTime(java.util.Calendar dateTime) {
        this.dateTime = dateTime;
    }


    /**
     * Gets the ratio value for this SPLIT.
     * 
     * @return ratio
     */
    public java.lang.String getRatio() {
        return ratio;
    }


    /**
     * Sets the ratio value for this SPLIT.
     * 
     * @param ratio
     */
    public void setRatio(java.lang.String ratio) {
        this.ratio = ratio;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SPLIT)) return false;
        SPLIT other = (SPLIT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.exchange==null && other.getExchange()==null) || 
             (this.exchange!=null &&
              this.exchange.equals(other.getExchange()))) &&
            ((this.symbol==null && other.getSymbol()==null) || 
             (this.symbol!=null &&
              this.symbol.equals(other.getSymbol()))) &&
            ((this.dateTime==null && other.getDateTime()==null) || 
             (this.dateTime!=null &&
              this.dateTime.equals(other.getDateTime()))) &&
            ((this.ratio==null && other.getRatio()==null) || 
             (this.ratio!=null &&
              this.ratio.equals(other.getRatio())));
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
        if (getExchange() != null) {
            _hashCode += getExchange().hashCode();
        }
        if (getSymbol() != null) {
            _hashCode += getSymbol().hashCode();
        }
        if (getDateTime() != null) {
            _hashCode += getDateTime().hashCode();
        }
        if (getRatio() != null) {
            _hashCode += getRatio().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SPLIT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "SPLIT"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("exchange");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Exchange"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("symbol");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Symbol"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("dateTime");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DateTime"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("ratio");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Ratio"));
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
