/**
 * DATAFORMAT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.eoddata.ws.Data;

public class DATAFORMAT  implements java.io.Serializable {
    private com.eoddata.ws.Data.DATAFORMAT_COLUMN[] COLUMNS;

    private java.lang.String code;  // attribute

    private java.lang.String name;  // attribute

    private java.lang.String header;  // attribute

    private java.lang.String dateFormat;  // attribute

    private java.lang.String extension;  // attribute

    private boolean includeSuffix;  // attribute

    private boolean tabColumnSeperator;  // attribute

    private java.lang.String columnSeperator;  // attribute

    private java.lang.String textQualifier;  // attribute

    private java.lang.String filenamePrefix;  // attribute

    private boolean filenameExchangeCode;  // attribute

    private boolean filenameDate;  // attribute

    private boolean includeHeaderRow;  // attribute

    private java.lang.String hourFormat;  // attribute

    private java.lang.String dateTimeSeperator;  // attribute

    private java.lang.String exchangeFilenameFormatDate;  // attribute

    private java.lang.String exchangeFilenameFormatDateRange;  // attribute

    private java.lang.String symbolFilenameFormatDate;  // attribute

    private java.lang.String symbolFilenameFormatDateRange;  // attribute

    public DATAFORMAT() {
    }

    public DATAFORMAT(
           com.eoddata.ws.Data.DATAFORMAT_COLUMN[] COLUMNS,
           java.lang.String code,
           java.lang.String name,
           java.lang.String header,
           java.lang.String dateFormat,
           java.lang.String extension,
           boolean includeSuffix,
           boolean tabColumnSeperator,
           java.lang.String columnSeperator,
           java.lang.String textQualifier,
           java.lang.String filenamePrefix,
           boolean filenameExchangeCode,
           boolean filenameDate,
           boolean includeHeaderRow,
           java.lang.String hourFormat,
           java.lang.String dateTimeSeperator,
           java.lang.String exchangeFilenameFormatDate,
           java.lang.String exchangeFilenameFormatDateRange,
           java.lang.String symbolFilenameFormatDate,
           java.lang.String symbolFilenameFormatDateRange) {
           this.COLUMNS = COLUMNS;
           this.code = code;
           this.name = name;
           this.header = header;
           this.dateFormat = dateFormat;
           this.extension = extension;
           this.includeSuffix = includeSuffix;
           this.tabColumnSeperator = tabColumnSeperator;
           this.columnSeperator = columnSeperator;
           this.textQualifier = textQualifier;
           this.filenamePrefix = filenamePrefix;
           this.filenameExchangeCode = filenameExchangeCode;
           this.filenameDate = filenameDate;
           this.includeHeaderRow = includeHeaderRow;
           this.hourFormat = hourFormat;
           this.dateTimeSeperator = dateTimeSeperator;
           this.exchangeFilenameFormatDate = exchangeFilenameFormatDate;
           this.exchangeFilenameFormatDateRange = exchangeFilenameFormatDateRange;
           this.symbolFilenameFormatDate = symbolFilenameFormatDate;
           this.symbolFilenameFormatDateRange = symbolFilenameFormatDateRange;
    }


    /**
     * Gets the COLUMNS value for this DATAFORMAT.
     * 
     * @return COLUMNS
     */
    public com.eoddata.ws.Data.DATAFORMAT_COLUMN[] getCOLUMNS() {
        return COLUMNS;
    }


    /**
     * Sets the COLUMNS value for this DATAFORMAT.
     * 
     * @param COLUMNS
     */
    public void setCOLUMNS(com.eoddata.ws.Data.DATAFORMAT_COLUMN[] COLUMNS) {
        this.COLUMNS = COLUMNS;
    }


    /**
     * Gets the code value for this DATAFORMAT.
     * 
     * @return code
     */
    public java.lang.String getCode() {
        return code;
    }


    /**
     * Sets the code value for this DATAFORMAT.
     * 
     * @param code
     */
    public void setCode(java.lang.String code) {
        this.code = code;
    }


    /**
     * Gets the name value for this DATAFORMAT.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this DATAFORMAT.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the header value for this DATAFORMAT.
     * 
     * @return header
     */
    public java.lang.String getHeader() {
        return header;
    }


    /**
     * Sets the header value for this DATAFORMAT.
     * 
     * @param header
     */
    public void setHeader(java.lang.String header) {
        this.header = header;
    }


    /**
     * Gets the dateFormat value for this DATAFORMAT.
     * 
     * @return dateFormat
     */
    public java.lang.String getDateFormat() {
        return dateFormat;
    }


    /**
     * Sets the dateFormat value for this DATAFORMAT.
     * 
     * @param dateFormat
     */
    public void setDateFormat(java.lang.String dateFormat) {
        this.dateFormat = dateFormat;
    }


    /**
     * Gets the extension value for this DATAFORMAT.
     * 
     * @return extension
     */
    public java.lang.String getExtension() {
        return extension;
    }


    /**
     * Sets the extension value for this DATAFORMAT.
     * 
     * @param extension
     */
    public void setExtension(java.lang.String extension) {
        this.extension = extension;
    }


    /**
     * Gets the includeSuffix value for this DATAFORMAT.
     * 
     * @return includeSuffix
     */
    public boolean isIncludeSuffix() {
        return includeSuffix;
    }


    /**
     * Sets the includeSuffix value for this DATAFORMAT.
     * 
     * @param includeSuffix
     */
    public void setIncludeSuffix(boolean includeSuffix) {
        this.includeSuffix = includeSuffix;
    }


    /**
     * Gets the tabColumnSeperator value for this DATAFORMAT.
     * 
     * @return tabColumnSeperator
     */
    public boolean isTabColumnSeperator() {
        return tabColumnSeperator;
    }


    /**
     * Sets the tabColumnSeperator value for this DATAFORMAT.
     * 
     * @param tabColumnSeperator
     */
    public void setTabColumnSeperator(boolean tabColumnSeperator) {
        this.tabColumnSeperator = tabColumnSeperator;
    }


    /**
     * Gets the columnSeperator value for this DATAFORMAT.
     * 
     * @return columnSeperator
     */
    public java.lang.String getColumnSeperator() {
        return columnSeperator;
    }


    /**
     * Sets the columnSeperator value for this DATAFORMAT.
     * 
     * @param columnSeperator
     */
    public void setColumnSeperator(java.lang.String columnSeperator) {
        this.columnSeperator = columnSeperator;
    }


    /**
     * Gets the textQualifier value for this DATAFORMAT.
     * 
     * @return textQualifier
     */
    public java.lang.String getTextQualifier() {
        return textQualifier;
    }


    /**
     * Sets the textQualifier value for this DATAFORMAT.
     * 
     * @param textQualifier
     */
    public void setTextQualifier(java.lang.String textQualifier) {
        this.textQualifier = textQualifier;
    }


    /**
     * Gets the filenamePrefix value for this DATAFORMAT.
     * 
     * @return filenamePrefix
     */
    public java.lang.String getFilenamePrefix() {
        return filenamePrefix;
    }


    /**
     * Sets the filenamePrefix value for this DATAFORMAT.
     * 
     * @param filenamePrefix
     */
    public void setFilenamePrefix(java.lang.String filenamePrefix) {
        this.filenamePrefix = filenamePrefix;
    }


    /**
     * Gets the filenameExchangeCode value for this DATAFORMAT.
     * 
     * @return filenameExchangeCode
     */
    public boolean isFilenameExchangeCode() {
        return filenameExchangeCode;
    }


    /**
     * Sets the filenameExchangeCode value for this DATAFORMAT.
     * 
     * @param filenameExchangeCode
     */
    public void setFilenameExchangeCode(boolean filenameExchangeCode) {
        this.filenameExchangeCode = filenameExchangeCode;
    }


    /**
     * Gets the filenameDate value for this DATAFORMAT.
     * 
     * @return filenameDate
     */
    public boolean isFilenameDate() {
        return filenameDate;
    }


    /**
     * Sets the filenameDate value for this DATAFORMAT.
     * 
     * @param filenameDate
     */
    public void setFilenameDate(boolean filenameDate) {
        this.filenameDate = filenameDate;
    }


    /**
     * Gets the includeHeaderRow value for this DATAFORMAT.
     * 
     * @return includeHeaderRow
     */
    public boolean isIncludeHeaderRow() {
        return includeHeaderRow;
    }


    /**
     * Sets the includeHeaderRow value for this DATAFORMAT.
     * 
     * @param includeHeaderRow
     */
    public void setIncludeHeaderRow(boolean includeHeaderRow) {
        this.includeHeaderRow = includeHeaderRow;
    }


    /**
     * Gets the hourFormat value for this DATAFORMAT.
     * 
     * @return hourFormat
     */
    public java.lang.String getHourFormat() {
        return hourFormat;
    }


    /**
     * Sets the hourFormat value for this DATAFORMAT.
     * 
     * @param hourFormat
     */
    public void setHourFormat(java.lang.String hourFormat) {
        this.hourFormat = hourFormat;
    }


    /**
     * Gets the dateTimeSeperator value for this DATAFORMAT.
     * 
     * @return dateTimeSeperator
     */
    public java.lang.String getDateTimeSeperator() {
        return dateTimeSeperator;
    }


    /**
     * Sets the dateTimeSeperator value for this DATAFORMAT.
     * 
     * @param dateTimeSeperator
     */
    public void setDateTimeSeperator(java.lang.String dateTimeSeperator) {
        this.dateTimeSeperator = dateTimeSeperator;
    }


    /**
     * Gets the exchangeFilenameFormatDate value for this DATAFORMAT.
     * 
     * @return exchangeFilenameFormatDate
     */
    public java.lang.String getExchangeFilenameFormatDate() {
        return exchangeFilenameFormatDate;
    }


    /**
     * Sets the exchangeFilenameFormatDate value for this DATAFORMAT.
     * 
     * @param exchangeFilenameFormatDate
     */
    public void setExchangeFilenameFormatDate(java.lang.String exchangeFilenameFormatDate) {
        this.exchangeFilenameFormatDate = exchangeFilenameFormatDate;
    }


    /**
     * Gets the exchangeFilenameFormatDateRange value for this DATAFORMAT.
     * 
     * @return exchangeFilenameFormatDateRange
     */
    public java.lang.String getExchangeFilenameFormatDateRange() {
        return exchangeFilenameFormatDateRange;
    }


    /**
     * Sets the exchangeFilenameFormatDateRange value for this DATAFORMAT.
     * 
     * @param exchangeFilenameFormatDateRange
     */
    public void setExchangeFilenameFormatDateRange(java.lang.String exchangeFilenameFormatDateRange) {
        this.exchangeFilenameFormatDateRange = exchangeFilenameFormatDateRange;
    }


    /**
     * Gets the symbolFilenameFormatDate value for this DATAFORMAT.
     * 
     * @return symbolFilenameFormatDate
     */
    public java.lang.String getSymbolFilenameFormatDate() {
        return symbolFilenameFormatDate;
    }


    /**
     * Sets the symbolFilenameFormatDate value for this DATAFORMAT.
     * 
     * @param symbolFilenameFormatDate
     */
    public void setSymbolFilenameFormatDate(java.lang.String symbolFilenameFormatDate) {
        this.symbolFilenameFormatDate = symbolFilenameFormatDate;
    }


    /**
     * Gets the symbolFilenameFormatDateRange value for this DATAFORMAT.
     * 
     * @return symbolFilenameFormatDateRange
     */
    public java.lang.String getSymbolFilenameFormatDateRange() {
        return symbolFilenameFormatDateRange;
    }


    /**
     * Sets the symbolFilenameFormatDateRange value for this DATAFORMAT.
     * 
     * @param symbolFilenameFormatDateRange
     */
    public void setSymbolFilenameFormatDateRange(java.lang.String symbolFilenameFormatDateRange) {
        this.symbolFilenameFormatDateRange = symbolFilenameFormatDateRange;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DATAFORMAT)) return false;
        DATAFORMAT other = (DATAFORMAT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.COLUMNS==null && other.getCOLUMNS()==null) || 
             (this.COLUMNS!=null &&
              java.util.Arrays.equals(this.COLUMNS, other.getCOLUMNS()))) &&
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.header==null && other.getHeader()==null) || 
             (this.header!=null &&
              this.header.equals(other.getHeader()))) &&
            ((this.dateFormat==null && other.getDateFormat()==null) || 
             (this.dateFormat!=null &&
              this.dateFormat.equals(other.getDateFormat()))) &&
            ((this.extension==null && other.getExtension()==null) || 
             (this.extension!=null &&
              this.extension.equals(other.getExtension()))) &&
            this.includeSuffix == other.isIncludeSuffix() &&
            this.tabColumnSeperator == other.isTabColumnSeperator() &&
            ((this.columnSeperator==null && other.getColumnSeperator()==null) || 
             (this.columnSeperator!=null &&
              this.columnSeperator.equals(other.getColumnSeperator()))) &&
            ((this.textQualifier==null && other.getTextQualifier()==null) || 
             (this.textQualifier!=null &&
              this.textQualifier.equals(other.getTextQualifier()))) &&
            ((this.filenamePrefix==null && other.getFilenamePrefix()==null) || 
             (this.filenamePrefix!=null &&
              this.filenamePrefix.equals(other.getFilenamePrefix()))) &&
            this.filenameExchangeCode == other.isFilenameExchangeCode() &&
            this.filenameDate == other.isFilenameDate() &&
            this.includeHeaderRow == other.isIncludeHeaderRow() &&
            ((this.hourFormat==null && other.getHourFormat()==null) || 
             (this.hourFormat!=null &&
              this.hourFormat.equals(other.getHourFormat()))) &&
            ((this.dateTimeSeperator==null && other.getDateTimeSeperator()==null) || 
             (this.dateTimeSeperator!=null &&
              this.dateTimeSeperator.equals(other.getDateTimeSeperator()))) &&
            ((this.exchangeFilenameFormatDate==null && other.getExchangeFilenameFormatDate()==null) || 
             (this.exchangeFilenameFormatDate!=null &&
              this.exchangeFilenameFormatDate.equals(other.getExchangeFilenameFormatDate()))) &&
            ((this.exchangeFilenameFormatDateRange==null && other.getExchangeFilenameFormatDateRange()==null) || 
             (this.exchangeFilenameFormatDateRange!=null &&
              this.exchangeFilenameFormatDateRange.equals(other.getExchangeFilenameFormatDateRange()))) &&
            ((this.symbolFilenameFormatDate==null && other.getSymbolFilenameFormatDate()==null) || 
             (this.symbolFilenameFormatDate!=null &&
              this.symbolFilenameFormatDate.equals(other.getSymbolFilenameFormatDate()))) &&
            ((this.symbolFilenameFormatDateRange==null && other.getSymbolFilenameFormatDateRange()==null) || 
             (this.symbolFilenameFormatDateRange!=null &&
              this.symbolFilenameFormatDateRange.equals(other.getSymbolFilenameFormatDateRange())));
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
        if (getCOLUMNS() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCOLUMNS());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCOLUMNS(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getHeader() != null) {
            _hashCode += getHeader().hashCode();
        }
        if (getDateFormat() != null) {
            _hashCode += getDateFormat().hashCode();
        }
        if (getExtension() != null) {
            _hashCode += getExtension().hashCode();
        }
        _hashCode += (isIncludeSuffix() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isTabColumnSeperator() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getColumnSeperator() != null) {
            _hashCode += getColumnSeperator().hashCode();
        }
        if (getTextQualifier() != null) {
            _hashCode += getTextQualifier().hashCode();
        }
        if (getFilenamePrefix() != null) {
            _hashCode += getFilenamePrefix().hashCode();
        }
        _hashCode += (isFilenameExchangeCode() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isFilenameDate() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIncludeHeaderRow() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getHourFormat() != null) {
            _hashCode += getHourFormat().hashCode();
        }
        if (getDateTimeSeperator() != null) {
            _hashCode += getDateTimeSeperator().hashCode();
        }
        if (getExchangeFilenameFormatDate() != null) {
            _hashCode += getExchangeFilenameFormatDate().hashCode();
        }
        if (getExchangeFilenameFormatDateRange() != null) {
            _hashCode += getExchangeFilenameFormatDateRange().hashCode();
        }
        if (getSymbolFilenameFormatDate() != null) {
            _hashCode += getSymbolFilenameFormatDate().hashCode();
        }
        if (getSymbolFilenameFormatDateRange() != null) {
            _hashCode += getSymbolFilenameFormatDateRange().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DATAFORMAT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "DATAFORMAT"));
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
        attrField.setFieldName("header");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Header"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("dateFormat");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DateFormat"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("extension");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Extension"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("includeSuffix");
        attrField.setXmlName(new javax.xml.namespace.QName("", "IncludeSuffix"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("tabColumnSeperator");
        attrField.setXmlName(new javax.xml.namespace.QName("", "TabColumnSeperator"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("columnSeperator");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ColumnSeperator"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("textQualifier");
        attrField.setXmlName(new javax.xml.namespace.QName("", "TextQualifier"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("filenamePrefix");
        attrField.setXmlName(new javax.xml.namespace.QName("", "FilenamePrefix"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("filenameExchangeCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "FilenameExchangeCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("filenameDate");
        attrField.setXmlName(new javax.xml.namespace.QName("", "FilenameDate"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("includeHeaderRow");
        attrField.setXmlName(new javax.xml.namespace.QName("", "IncludeHeaderRow"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("hourFormat");
        attrField.setXmlName(new javax.xml.namespace.QName("", "HourFormat"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("dateTimeSeperator");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DateTimeSeperator"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("exchangeFilenameFormatDate");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ExchangeFilenameFormatDate"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("exchangeFilenameFormatDateRange");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ExchangeFilenameFormatDateRange"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("symbolFilenameFormatDate");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SymbolFilenameFormatDate"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("symbolFilenameFormatDateRange");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SymbolFilenameFormatDateRange"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("COLUMNS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "COLUMNS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "DATAFORMAT_COLUMN"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "DATAFORMAT_COLUMN"));
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
