/**
 * QUOTE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.eoddata.ws.Data;

public class QUOTE  implements java.io.Serializable {
    private java.lang.String symbol;  // attribute

    private java.lang.String description;  // attribute

    private java.lang.String name;  // attribute

    private java.util.Calendar dateTime;  // attribute

    private double open;  // attribute

    private double high;  // attribute

    private double low;  // attribute

    private double close;  // attribute

    private long volume;  // attribute

    private long openInterest;  // attribute

    private double previous;  // attribute

    private double change;  // attribute

    private double bid;  // attribute

    private double ask;  // attribute

    private double previousClose;  // attribute

    private double nextOpen;  // attribute

    private java.util.Calendar modified;  // attribute

    public QUOTE() {
    }

    public QUOTE(
           java.lang.String symbol,
           java.lang.String description,
           java.lang.String name,
           java.util.Calendar dateTime,
           double open,
           double high,
           double low,
           double close,
           long volume,
           long openInterest,
           double previous,
           double change,
           double bid,
           double ask,
           double previousClose,
           double nextOpen,
           java.util.Calendar modified) {
           this.symbol = symbol;
           this.description = description;
           this.name = name;
           this.dateTime = dateTime;
           this.open = open;
           this.high = high;
           this.low = low;
           this.close = close;
           this.volume = volume;
           this.openInterest = openInterest;
           this.previous = previous;
           this.change = change;
           this.bid = bid;
           this.ask = ask;
           this.previousClose = previousClose;
           this.nextOpen = nextOpen;
           this.modified = modified;
    }


    /**
     * Gets the symbol value for this QUOTE.
     * 
     * @return symbol
     */
    public java.lang.String getSymbol() {
        return symbol;
    }


    /**
     * Sets the symbol value for this QUOTE.
     * 
     * @param symbol
     */
    public void setSymbol(java.lang.String symbol) {
        this.symbol = symbol;
    }


    /**
     * Gets the description value for this QUOTE.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this QUOTE.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the name value for this QUOTE.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this QUOTE.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the dateTime value for this QUOTE.
     * 
     * @return dateTime
     */
    public java.util.Calendar getDateTime() {
        return dateTime;
    }


    /**
     * Sets the dateTime value for this QUOTE.
     * 
     * @param dateTime
     */
    public void setDateTime(java.util.Calendar dateTime) {
        this.dateTime = dateTime;
    }


    /**
     * Gets the open value for this QUOTE.
     * 
     * @return open
     */
    public double getOpen() {
        return open;
    }


    /**
     * Sets the open value for this QUOTE.
     * 
     * @param open
     */
    public void setOpen(double open) {
        this.open = open;
    }


    /**
     * Gets the high value for this QUOTE.
     * 
     * @return high
     */
    public double getHigh() {
        return high;
    }


    /**
     * Sets the high value for this QUOTE.
     * 
     * @param high
     */
    public void setHigh(double high) {
        this.high = high;
    }


    /**
     * Gets the low value for this QUOTE.
     * 
     * @return low
     */
    public double getLow() {
        return low;
    }


    /**
     * Sets the low value for this QUOTE.
     * 
     * @param low
     */
    public void setLow(double low) {
        this.low = low;
    }


    /**
     * Gets the close value for this QUOTE.
     * 
     * @return close
     */
    public double getClose() {
        return close;
    }


    /**
     * Sets the close value for this QUOTE.
     * 
     * @param close
     */
    public void setClose(double close) {
        this.close = close;
    }


    /**
     * Gets the volume value for this QUOTE.
     * 
     * @return volume
     */
    public long getVolume() {
        return volume;
    }


    /**
     * Sets the volume value for this QUOTE.
     * 
     * @param volume
     */
    public void setVolume(long volume) {
        this.volume = volume;
    }


    /**
     * Gets the openInterest value for this QUOTE.
     * 
     * @return openInterest
     */
    public long getOpenInterest() {
        return openInterest;
    }


    /**
     * Sets the openInterest value for this QUOTE.
     * 
     * @param openInterest
     */
    public void setOpenInterest(long openInterest) {
        this.openInterest = openInterest;
    }


    /**
     * Gets the previous value for this QUOTE.
     * 
     * @return previous
     */
    public double getPrevious() {
        return previous;
    }


    /**
     * Sets the previous value for this QUOTE.
     * 
     * @param previous
     */
    public void setPrevious(double previous) {
        this.previous = previous;
    }


    /**
     * Gets the change value for this QUOTE.
     * 
     * @return change
     */
    public double getChange() {
        return change;
    }


    /**
     * Sets the change value for this QUOTE.
     * 
     * @param change
     */
    public void setChange(double change) {
        this.change = change;
    }


    /**
     * Gets the bid value for this QUOTE.
     * 
     * @return bid
     */
    public double getBid() {
        return bid;
    }


    /**
     * Sets the bid value for this QUOTE.
     * 
     * @param bid
     */
    public void setBid(double bid) {
        this.bid = bid;
    }


    /**
     * Gets the ask value for this QUOTE.
     * 
     * @return ask
     */
    public double getAsk() {
        return ask;
    }


    /**
     * Sets the ask value for this QUOTE.
     * 
     * @param ask
     */
    public void setAsk(double ask) {
        this.ask = ask;
    }


    /**
     * Gets the previousClose value for this QUOTE.
     * 
     * @return previousClose
     */
    public double getPreviousClose() {
        return previousClose;
    }


    /**
     * Sets the previousClose value for this QUOTE.
     * 
     * @param previousClose
     */
    public void setPreviousClose(double previousClose) {
        this.previousClose = previousClose;
    }


    /**
     * Gets the nextOpen value for this QUOTE.
     * 
     * @return nextOpen
     */
    public double getNextOpen() {
        return nextOpen;
    }


    /**
     * Sets the nextOpen value for this QUOTE.
     * 
     * @param nextOpen
     */
    public void setNextOpen(double nextOpen) {
        this.nextOpen = nextOpen;
    }


    /**
     * Gets the modified value for this QUOTE.
     * 
     * @return modified
     */
    public java.util.Calendar getModified() {
        return modified;
    }


    /**
     * Sets the modified value for this QUOTE.
     * 
     * @param modified
     */
    public void setModified(java.util.Calendar modified) {
        this.modified = modified;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QUOTE)) return false;
        QUOTE other = (QUOTE) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.symbol==null && other.getSymbol()==null) || 
             (this.symbol!=null &&
              this.symbol.equals(other.getSymbol()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.dateTime==null && other.getDateTime()==null) || 
             (this.dateTime!=null &&
              this.dateTime.equals(other.getDateTime()))) &&
            this.open == other.getOpen() &&
            this.high == other.getHigh() &&
            this.low == other.getLow() &&
            this.close == other.getClose() &&
            this.volume == other.getVolume() &&
            this.openInterest == other.getOpenInterest() &&
            this.previous == other.getPrevious() &&
            this.change == other.getChange() &&
            this.bid == other.getBid() &&
            this.ask == other.getAsk() &&
            this.previousClose == other.getPreviousClose() &&
            this.nextOpen == other.getNextOpen() &&
            ((this.modified==null && other.getModified()==null) || 
             (this.modified!=null &&
              this.modified.equals(other.getModified())));
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
        if (getSymbol() != null) {
            _hashCode += getSymbol().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getDateTime() != null) {
            _hashCode += getDateTime().hashCode();
        }
        _hashCode += new Double(getOpen()).hashCode();
        _hashCode += new Double(getHigh()).hashCode();
        _hashCode += new Double(getLow()).hashCode();
        _hashCode += new Double(getClose()).hashCode();
        _hashCode += new Long(getVolume()).hashCode();
        _hashCode += new Long(getOpenInterest()).hashCode();
        _hashCode += new Double(getPrevious()).hashCode();
        _hashCode += new Double(getChange()).hashCode();
        _hashCode += new Double(getBid()).hashCode();
        _hashCode += new Double(getAsk()).hashCode();
        _hashCode += new Double(getPreviousClose()).hashCode();
        _hashCode += new Double(getNextOpen()).hashCode();
        if (getModified() != null) {
            _hashCode += getModified().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QUOTE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "QUOTE"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("symbol");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Symbol"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("description");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Description"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("name");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Name"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("dateTime");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DateTime"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("open");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Open"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("high");
        attrField.setXmlName(new javax.xml.namespace.QName("", "High"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("low");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Low"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("close");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Close"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("volume");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Volume"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("openInterest");
        attrField.setXmlName(new javax.xml.namespace.QName("", "OpenInterest"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("previous");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Previous"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("change");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Change"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("bid");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Bid"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("ask");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Ask"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("previousClose");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PreviousClose"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("nextOpen");
        attrField.setXmlName(new javax.xml.namespace.QName("", "NextOpen"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("modified");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Modified"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
