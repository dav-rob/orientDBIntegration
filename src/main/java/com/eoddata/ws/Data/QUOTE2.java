/**
 * QUOTE2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.eoddata.ws.Data;

public class QUOTE2  implements java.io.Serializable {
    private java.lang.String s;  // attribute

    private java.util.Calendar d;  // attribute

    private double o;  // attribute

    private double h;  // attribute

    private double l;  // attribute

    private double c;  // attribute

    private long v;  // attribute

    private long i;  // attribute

    private double b;  // attribute

    private double a;  // attribute

    public QUOTE2() {
    }

    public QUOTE2(
           java.lang.String s,
           java.util.Calendar d,
           double o,
           double h,
           double l,
           double c,
           long v,
           long i,
           double b,
           double a) {
           this.s = s;
           this.d = d;
           this.o = o;
           this.h = h;
           this.l = l;
           this.c = c;
           this.v = v;
           this.i = i;
           this.b = b;
           this.a = a;
    }


    /**
     * Gets the s value for this QUOTE2.
     * 
     * @return s
     */
    public java.lang.String getS() {
        return s;
    }


    /**
     * Sets the s value for this QUOTE2.
     * 
     * @param s
     */
    public void setS(java.lang.String s) {
        this.s = s;
    }


    /**
     * Gets the d value for this QUOTE2.
     * 
     * @return d
     */
    public java.util.Calendar getD() {
        return d;
    }


    /**
     * Sets the d value for this QUOTE2.
     * 
     * @param d
     */
    public void setD(java.util.Calendar d) {
        this.d = d;
    }


    /**
     * Gets the o value for this QUOTE2.
     * 
     * @return o
     */
    public double getO() {
        return o;
    }


    /**
     * Sets the o value for this QUOTE2.
     * 
     * @param o
     */
    public void setO(double o) {
        this.o = o;
    }


    /**
     * Gets the h value for this QUOTE2.
     * 
     * @return h
     */
    public double getH() {
        return h;
    }


    /**
     * Sets the h value for this QUOTE2.
     * 
     * @param h
     */
    public void setH(double h) {
        this.h = h;
    }


    /**
     * Gets the l value for this QUOTE2.
     * 
     * @return l
     */
    public double getL() {
        return l;
    }


    /**
     * Sets the l value for this QUOTE2.
     * 
     * @param l
     */
    public void setL(double l) {
        this.l = l;
    }


    /**
     * Gets the c value for this QUOTE2.
     * 
     * @return c
     */
    public double getC() {
        return c;
    }


    /**
     * Sets the c value for this QUOTE2.
     * 
     * @param c
     */
    public void setC(double c) {
        this.c = c;
    }


    /**
     * Gets the v value for this QUOTE2.
     * 
     * @return v
     */
    public long getV() {
        return v;
    }


    /**
     * Sets the v value for this QUOTE2.
     * 
     * @param v
     */
    public void setV(long v) {
        this.v = v;
    }


    /**
     * Gets the i value for this QUOTE2.
     * 
     * @return i
     */
    public long getI() {
        return i;
    }


    /**
     * Sets the i value for this QUOTE2.
     * 
     * @param i
     */
    public void setI(long i) {
        this.i = i;
    }


    /**
     * Gets the b value for this QUOTE2.
     * 
     * @return b
     */
    public double getB() {
        return b;
    }


    /**
     * Sets the b value for this QUOTE2.
     * 
     * @param b
     */
    public void setB(double b) {
        this.b = b;
    }


    /**
     * Gets the a value for this QUOTE2.
     * 
     * @return a
     */
    public double getA() {
        return a;
    }


    /**
     * Sets the a value for this QUOTE2.
     * 
     * @param a
     */
    public void setA(double a) {
        this.a = a;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QUOTE2)) return false;
        QUOTE2 other = (QUOTE2) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.s==null && other.getS()==null) || 
             (this.s!=null &&
              this.s.equals(other.getS()))) &&
            ((this.d==null && other.getD()==null) || 
             (this.d!=null &&
              this.d.equals(other.getD()))) &&
            this.o == other.getO() &&
            this.h == other.getH() &&
            this.l == other.getL() &&
            this.c == other.getC() &&
            this.v == other.getV() &&
            this.i == other.getI() &&
            this.b == other.getB() &&
            this.a == other.getA();
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
        if (getS() != null) {
            _hashCode += getS().hashCode();
        }
        if (getD() != null) {
            _hashCode += getD().hashCode();
        }
        _hashCode += new Double(getO()).hashCode();
        _hashCode += new Double(getH()).hashCode();
        _hashCode += new Double(getL()).hashCode();
        _hashCode += new Double(getC()).hashCode();
        _hashCode += new Long(getV()).hashCode();
        _hashCode += new Long(getI()).hashCode();
        _hashCode += new Double(getB()).hashCode();
        _hashCode += new Double(getA()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QUOTE2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "QUOTE2"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("s");
        attrField.setXmlName(new javax.xml.namespace.QName("", "s"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("d");
        attrField.setXmlName(new javax.xml.namespace.QName("", "d"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("o");
        attrField.setXmlName(new javax.xml.namespace.QName("", "o"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("h");
        attrField.setXmlName(new javax.xml.namespace.QName("", "h"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("l");
        attrField.setXmlName(new javax.xml.namespace.QName("", "l"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("c");
        attrField.setXmlName(new javax.xml.namespace.QName("", "c"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("v");
        attrField.setXmlName(new javax.xml.namespace.QName("", "v"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("i");
        attrField.setXmlName(new javax.xml.namespace.QName("", "i"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("b");
        attrField.setXmlName(new javax.xml.namespace.QName("", "b"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("a");
        attrField.setXmlName(new javax.xml.namespace.QName("", "a"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
