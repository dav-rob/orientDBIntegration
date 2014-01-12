/**
 * DATAFORMAT_COLUMN.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.eoddata.ws.Data;

public class DATAFORMAT_COLUMN  implements java.io.Serializable {
    private int sortOrder;  // attribute

    private java.lang.String code;  // attribute

    private java.lang.String dataFormat;  // attribute

    private java.lang.String columnCode;  // attribute

    private java.lang.String columnName;  // attribute

    private int columnTypeId;  // attribute

    private java.lang.String columnType;  // attribute

    private java.lang.String header;  // attribute

    public DATAFORMAT_COLUMN() {
    }

    public DATAFORMAT_COLUMN(
           int sortOrder,
           java.lang.String code,
           java.lang.String dataFormat,
           java.lang.String columnCode,
           java.lang.String columnName,
           int columnTypeId,
           java.lang.String columnType,
           java.lang.String header) {
           this.sortOrder = sortOrder;
           this.code = code;
           this.dataFormat = dataFormat;
           this.columnCode = columnCode;
           this.columnName = columnName;
           this.columnTypeId = columnTypeId;
           this.columnType = columnType;
           this.header = header;
    }


    /**
     * Gets the sortOrder value for this DATAFORMAT_COLUMN.
     * 
     * @return sortOrder
     */
    public int getSortOrder() {
        return sortOrder;
    }


    /**
     * Sets the sortOrder value for this DATAFORMAT_COLUMN.
     * 
     * @param sortOrder
     */
    public void setSortOrder(int sortOrder) {
        this.sortOrder = sortOrder;
    }


    /**
     * Gets the code value for this DATAFORMAT_COLUMN.
     * 
     * @return code
     */
    public java.lang.String getCode() {
        return code;
    }


    /**
     * Sets the code value for this DATAFORMAT_COLUMN.
     * 
     * @param code
     */
    public void setCode(java.lang.String code) {
        this.code = code;
    }


    /**
     * Gets the dataFormat value for this DATAFORMAT_COLUMN.
     * 
     * @return dataFormat
     */
    public java.lang.String getDataFormat() {
        return dataFormat;
    }


    /**
     * Sets the dataFormat value for this DATAFORMAT_COLUMN.
     * 
     * @param dataFormat
     */
    public void setDataFormat(java.lang.String dataFormat) {
        this.dataFormat = dataFormat;
    }


    /**
     * Gets the columnCode value for this DATAFORMAT_COLUMN.
     * 
     * @return columnCode
     */
    public java.lang.String getColumnCode() {
        return columnCode;
    }


    /**
     * Sets the columnCode value for this DATAFORMAT_COLUMN.
     * 
     * @param columnCode
     */
    public void setColumnCode(java.lang.String columnCode) {
        this.columnCode = columnCode;
    }


    /**
     * Gets the columnName value for this DATAFORMAT_COLUMN.
     * 
     * @return columnName
     */
    public java.lang.String getColumnName() {
        return columnName;
    }


    /**
     * Sets the columnName value for this DATAFORMAT_COLUMN.
     * 
     * @param columnName
     */
    public void setColumnName(java.lang.String columnName) {
        this.columnName = columnName;
    }


    /**
     * Gets the columnTypeId value for this DATAFORMAT_COLUMN.
     * 
     * @return columnTypeId
     */
    public int getColumnTypeId() {
        return columnTypeId;
    }


    /**
     * Sets the columnTypeId value for this DATAFORMAT_COLUMN.
     * 
     * @param columnTypeId
     */
    public void setColumnTypeId(int columnTypeId) {
        this.columnTypeId = columnTypeId;
    }


    /**
     * Gets the columnType value for this DATAFORMAT_COLUMN.
     * 
     * @return columnType
     */
    public java.lang.String getColumnType() {
        return columnType;
    }


    /**
     * Sets the columnType value for this DATAFORMAT_COLUMN.
     * 
     * @param columnType
     */
    public void setColumnType(java.lang.String columnType) {
        this.columnType = columnType;
    }


    /**
     * Gets the header value for this DATAFORMAT_COLUMN.
     * 
     * @return header
     */
    public java.lang.String getHeader() {
        return header;
    }


    /**
     * Sets the header value for this DATAFORMAT_COLUMN.
     * 
     * @param header
     */
    public void setHeader(java.lang.String header) {
        this.header = header;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DATAFORMAT_COLUMN)) return false;
        DATAFORMAT_COLUMN other = (DATAFORMAT_COLUMN) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.sortOrder == other.getSortOrder() &&
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
            ((this.dataFormat==null && other.getDataFormat()==null) || 
             (this.dataFormat!=null &&
              this.dataFormat.equals(other.getDataFormat()))) &&
            ((this.columnCode==null && other.getColumnCode()==null) || 
             (this.columnCode!=null &&
              this.columnCode.equals(other.getColumnCode()))) &&
            ((this.columnName==null && other.getColumnName()==null) || 
             (this.columnName!=null &&
              this.columnName.equals(other.getColumnName()))) &&
            this.columnTypeId == other.getColumnTypeId() &&
            ((this.columnType==null && other.getColumnType()==null) || 
             (this.columnType!=null &&
              this.columnType.equals(other.getColumnType()))) &&
            ((this.header==null && other.getHeader()==null) || 
             (this.header!=null &&
              this.header.equals(other.getHeader())));
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
        _hashCode += getSortOrder();
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        if (getDataFormat() != null) {
            _hashCode += getDataFormat().hashCode();
        }
        if (getColumnCode() != null) {
            _hashCode += getColumnCode().hashCode();
        }
        if (getColumnName() != null) {
            _hashCode += getColumnName().hashCode();
        }
        _hashCode += getColumnTypeId();
        if (getColumnType() != null) {
            _hashCode += getColumnType().hashCode();
        }
        if (getHeader() != null) {
            _hashCode += getHeader().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DATAFORMAT_COLUMN.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "DATAFORMAT_COLUMN"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("sortOrder");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SortOrder"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("code");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Code"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("dataFormat");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DataFormat"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("columnCode");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ColumnCode"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("columnName");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ColumnName"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("columnTypeId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ColumnTypeId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("columnType");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ColumnType"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("header");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Header"));
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
