/**
 * EXCHANGE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.eoddata.ws.Data;

public class EXCHANGE  implements java.io.Serializable {
    private java.lang.String code;  // attribute

    private java.lang.String name;  // attribute

    private java.util.Calendar lastTradeDateTime;  // attribute

    private java.lang.String country;  // attribute

    private java.lang.String currency;  // attribute

    private int advances;  // attribute

    private int declines;  // attribute

    private java.lang.String suffix;  // attribute

    private java.lang.String timeZone;  // attribute

    private boolean isIntraday;  // attribute

    private java.util.Calendar intradayStartDate;  // attribute

    private boolean hasIntradayProduct;  // attribute

    public EXCHANGE() {
    }

    public EXCHANGE(
           java.lang.String code,
           java.lang.String name,
           java.util.Calendar lastTradeDateTime,
           java.lang.String country,
           java.lang.String currency,
           int advances,
           int declines,
           java.lang.String suffix,
           java.lang.String timeZone,
           boolean isIntraday,
           java.util.Calendar intradayStartDate,
           boolean hasIntradayProduct) {
           this.code = code;
           this.name = name;
           this.lastTradeDateTime = lastTradeDateTime;
           this.country = country;
           this.currency = currency;
           this.advances = advances;
           this.declines = declines;
           this.suffix = suffix;
           this.timeZone = timeZone;
           this.isIntraday = isIntraday;
           this.intradayStartDate = intradayStartDate;
           this.hasIntradayProduct = hasIntradayProduct;
    }


    /**
     * Gets the code value for this EXCHANGE.
     * 
     * @return code
     */
    public java.lang.String getCode() {
        return code;
    }


    /**
     * Sets the code value for this EXCHANGE.
     * 
     * @param code
     */
    public void setCode(java.lang.String code) {
        this.code = code;
    }


    /**
     * Gets the name value for this EXCHANGE.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this EXCHANGE.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the lastTradeDateTime value for this EXCHANGE.
     * 
     * @return lastTradeDateTime
     */
    public java.util.Calendar getLastTradeDateTime() {
        return lastTradeDateTime;
    }


    /**
     * Sets the lastTradeDateTime value for this EXCHANGE.
     * 
     * @param lastTradeDateTime
     */
    public void setLastTradeDateTime(java.util.Calendar lastTradeDateTime) {
        this.lastTradeDateTime = lastTradeDateTime;
    }


    /**
     * Gets the country value for this EXCHANGE.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this EXCHANGE.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the currency value for this EXCHANGE.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this EXCHANGE.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the advances value for this EXCHANGE.
     * 
     * @return advances
     */
    public int getAdvances() {
        return advances;
    }


    /**
     * Sets the advances value for this EXCHANGE.
     * 
     * @param advances
     */
    public void setAdvances(int advances) {
        this.advances = advances;
    }


    /**
     * Gets the declines value for this EXCHANGE.
     * 
     * @return declines
     */
    public int getDeclines() {
        return declines;
    }


    /**
     * Sets the declines value for this EXCHANGE.
     * 
     * @param declines
     */
    public void setDeclines(int declines) {
        this.declines = declines;
    }


    /**
     * Gets the suffix value for this EXCHANGE.
     * 
     * @return suffix
     */
    public java.lang.String getSuffix() {
        return suffix;
    }


    /**
     * Sets the suffix value for this EXCHANGE.
     * 
     * @param suffix
     */
    public void setSuffix(java.lang.String suffix) {
        this.suffix = suffix;
    }


    /**
     * Gets the timeZone value for this EXCHANGE.
     * 
     * @return timeZone
     */
    public java.lang.String getTimeZone() {
        return timeZone;
    }


    /**
     * Sets the timeZone value for this EXCHANGE.
     * 
     * @param timeZone
     */
    public void setTimeZone(java.lang.String timeZone) {
        this.timeZone = timeZone;
    }


    /**
     * Gets the isIntraday value for this EXCHANGE.
     * 
     * @return isIntraday
     */
    public boolean isIsIntraday() {
        return isIntraday;
    }


    /**
     * Sets the isIntraday value for this EXCHANGE.
     * 
     * @param isIntraday
     */
    public void setIsIntraday(boolean isIntraday) {
        this.isIntraday = isIntraday;
    }


    /**
     * Gets the intradayStartDate value for this EXCHANGE.
     * 
     * @return intradayStartDate
     */
    public java.util.Calendar getIntradayStartDate() {
        return intradayStartDate;
    }


    /**
     * Sets the intradayStartDate value for this EXCHANGE.
     * 
     * @param intradayStartDate
     */
    public void setIntradayStartDate(java.util.Calendar intradayStartDate) {
        this.intradayStartDate = intradayStartDate;
    }


    /**
     * Gets the hasIntradayProduct value for this EXCHANGE.
     * 
     * @return hasIntradayProduct
     */
    public boolean isHasIntradayProduct() {
        return hasIntradayProduct;
    }


    /**
     * Sets the hasIntradayProduct value for this EXCHANGE.
     * 
     * @param hasIntradayProduct
     */
    public void setHasIntradayProduct(boolean hasIntradayProduct) {
        this.hasIntradayProduct = hasIntradayProduct;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EXCHANGE)) return false;
        EXCHANGE other = (EXCHANGE) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.lastTradeDateTime==null && other.getLastTradeDateTime()==null) || 
             (this.lastTradeDateTime!=null &&
              this.lastTradeDateTime.equals(other.getLastTradeDateTime()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            this.advances == other.getAdvances() &&
            this.declines == other.getDeclines() &&
            ((this.suffix==null && other.getSuffix()==null) || 
             (this.suffix!=null &&
              this.suffix.equals(other.getSuffix()))) &&
            ((this.timeZone==null && other.getTimeZone()==null) || 
             (this.timeZone!=null &&
              this.timeZone.equals(other.getTimeZone()))) &&
            this.isIntraday == other.isIsIntraday() &&
            ((this.intradayStartDate==null && other.getIntradayStartDate()==null) || 
             (this.intradayStartDate!=null &&
              this.intradayStartDate.equals(other.getIntradayStartDate()))) &&
            this.hasIntradayProduct == other.isHasIntradayProduct();
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
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getLastTradeDateTime() != null) {
            _hashCode += getLastTradeDateTime().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        _hashCode += getAdvances();
        _hashCode += getDeclines();
        if (getSuffix() != null) {
            _hashCode += getSuffix().hashCode();
        }
        if (getTimeZone() != null) {
            _hashCode += getTimeZone().hashCode();
        }
        _hashCode += (isIsIntraday() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getIntradayStartDate() != null) {
            _hashCode += getIntradayStartDate().hashCode();
        }
        _hashCode += (isHasIntradayProduct() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EXCHANGE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "EXCHANGE"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("code");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Code"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("name");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Name"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("lastTradeDateTime");
        attrField.setXmlName(new javax.xml.namespace.QName("", "LastTradeDateTime"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("country");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Country"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("currency");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Currency"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("advances");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Advances"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("declines");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Declines"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("suffix");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Suffix"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("timeZone");
        attrField.setXmlName(new javax.xml.namespace.QName("", "TimeZone"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("isIntraday");
        attrField.setXmlName(new javax.xml.namespace.QName("", "IsIntraday"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("intradayStartDate");
        attrField.setXmlName(new javax.xml.namespace.QName("", "IntradayStartDate"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("hasIntradayProduct");
        attrField.setXmlName(new javax.xml.namespace.QName("", "HasIntradayProduct"));
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
