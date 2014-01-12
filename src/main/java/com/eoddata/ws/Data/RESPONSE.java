/**
 * RESPONSE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.eoddata.ws.Data;

public class RESPONSE  implements java.io.Serializable {
    private com.eoddata.ws.Data.EXCHANGE EXCHANGE;

    private com.eoddata.ws.Data.EXCHANGE[] EXCHANGES;

    private com.eoddata.ws.Data.SYMBOL SYMBOL;

    private com.eoddata.ws.Data.SYMBOL[] SYMBOLS;

    private com.eoddata.ws.Data.SYMBOL2[] SYMBOLS2;

    private com.eoddata.ws.Data.QUOTE QUOTE;

    private com.eoddata.ws.Data.QUOTE[] QUOTES;

    private com.eoddata.ws.Data.QUOTE2[] QUOTES2;

    private com.eoddata.ws.Data.SPLIT[] SPLITS;

    private com.eoddata.ws.Data.CountryBase[] COUNTRIES;

    private com.eoddata.ws.Data.FUNDAMENTAL[] FUNDAMENTALS;

    private com.eoddata.ws.Data.TECHNICAL[] TECHNICALS;

    private com.eoddata.ws.Data.SYMBOLCHANGE[] SYMBOLCHANGES;

    private java.lang.String CHART;

    private java.lang.String MEMBERSHIP;

    private java.lang.String VERSION;

    private java.lang.String MONTHS;

    private com.eoddata.ws.Data.DATAFORMAT[] DATAFORMATS;

    private java.lang.String source;  // attribute

    private java.lang.String message;  // attribute

    private java.util.Calendar date;  // attribute

    public RESPONSE() {
    }

    public RESPONSE(
           com.eoddata.ws.Data.EXCHANGE EXCHANGE,
           com.eoddata.ws.Data.EXCHANGE[] EXCHANGES,
           com.eoddata.ws.Data.SYMBOL SYMBOL,
           com.eoddata.ws.Data.SYMBOL[] SYMBOLS,
           com.eoddata.ws.Data.SYMBOL2[] SYMBOLS2,
           com.eoddata.ws.Data.QUOTE QUOTE,
           com.eoddata.ws.Data.QUOTE[] QUOTES,
           com.eoddata.ws.Data.QUOTE2[] QUOTES2,
           com.eoddata.ws.Data.SPLIT[] SPLITS,
           com.eoddata.ws.Data.CountryBase[] COUNTRIES,
           com.eoddata.ws.Data.FUNDAMENTAL[] FUNDAMENTALS,
           com.eoddata.ws.Data.TECHNICAL[] TECHNICALS,
           com.eoddata.ws.Data.SYMBOLCHANGE[] SYMBOLCHANGES,
           java.lang.String CHART,
           java.lang.String MEMBERSHIP,
           java.lang.String VERSION,
           java.lang.String MONTHS,
           com.eoddata.ws.Data.DATAFORMAT[] DATAFORMATS,
           java.lang.String source,
           java.lang.String message,
           java.util.Calendar date) {
           this.EXCHANGE = EXCHANGE;
           this.EXCHANGES = EXCHANGES;
           this.SYMBOL = SYMBOL;
           this.SYMBOLS = SYMBOLS;
           this.SYMBOLS2 = SYMBOLS2;
           this.QUOTE = QUOTE;
           this.QUOTES = QUOTES;
           this.QUOTES2 = QUOTES2;
           this.SPLITS = SPLITS;
           this.COUNTRIES = COUNTRIES;
           this.FUNDAMENTALS = FUNDAMENTALS;
           this.TECHNICALS = TECHNICALS;
           this.SYMBOLCHANGES = SYMBOLCHANGES;
           this.CHART = CHART;
           this.MEMBERSHIP = MEMBERSHIP;
           this.VERSION = VERSION;
           this.MONTHS = MONTHS;
           this.DATAFORMATS = DATAFORMATS;
           this.source = source;
           this.message = message;
           this.date = date;
    }


    /**
     * Gets the EXCHANGE value for this RESPONSE.
     * 
     * @return EXCHANGE
     */
    public com.eoddata.ws.Data.EXCHANGE getEXCHANGE() {
        return EXCHANGE;
    }


    /**
     * Sets the EXCHANGE value for this RESPONSE.
     * 
     * @param EXCHANGE
     */
    public void setEXCHANGE(com.eoddata.ws.Data.EXCHANGE EXCHANGE) {
        this.EXCHANGE = EXCHANGE;
    }


    /**
     * Gets the EXCHANGES value for this RESPONSE.
     * 
     * @return EXCHANGES
     */
    public com.eoddata.ws.Data.EXCHANGE[] getEXCHANGES() {
        return EXCHANGES;
    }


    /**
     * Sets the EXCHANGES value for this RESPONSE.
     * 
     * @param EXCHANGES
     */
    public void setEXCHANGES(com.eoddata.ws.Data.EXCHANGE[] EXCHANGES) {
        this.EXCHANGES = EXCHANGES;
    }


    /**
     * Gets the SYMBOL value for this RESPONSE.
     * 
     * @return SYMBOL
     */
    public com.eoddata.ws.Data.SYMBOL getSYMBOL() {
        return SYMBOL;
    }


    /**
     * Sets the SYMBOL value for this RESPONSE.
     * 
     * @param SYMBOL
     */
    public void setSYMBOL(com.eoddata.ws.Data.SYMBOL SYMBOL) {
        this.SYMBOL = SYMBOL;
    }


    /**
     * Gets the SYMBOLS value for this RESPONSE.
     * 
     * @return SYMBOLS
     */
    public com.eoddata.ws.Data.SYMBOL[] getSYMBOLS() {
        return SYMBOLS;
    }


    /**
     * Sets the SYMBOLS value for this RESPONSE.
     * 
     * @param SYMBOLS
     */
    public void setSYMBOLS(com.eoddata.ws.Data.SYMBOL[] SYMBOLS) {
        this.SYMBOLS = SYMBOLS;
    }


    /**
     * Gets the SYMBOLS2 value for this RESPONSE.
     * 
     * @return SYMBOLS2
     */
    public com.eoddata.ws.Data.SYMBOL2[] getSYMBOLS2() {
        return SYMBOLS2;
    }


    /**
     * Sets the SYMBOLS2 value for this RESPONSE.
     * 
     * @param SYMBOLS2
     */
    public void setSYMBOLS2(com.eoddata.ws.Data.SYMBOL2[] SYMBOLS2) {
        this.SYMBOLS2 = SYMBOLS2;
    }


    /**
     * Gets the QUOTE value for this RESPONSE.
     * 
     * @return QUOTE
     */
    public com.eoddata.ws.Data.QUOTE getQUOTE() {
        return QUOTE;
    }


    /**
     * Sets the QUOTE value for this RESPONSE.
     * 
     * @param QUOTE
     */
    public void setQUOTE(com.eoddata.ws.Data.QUOTE QUOTE) {
        this.QUOTE = QUOTE;
    }


    /**
     * Gets the QUOTES value for this RESPONSE.
     * 
     * @return QUOTES
     */
    public com.eoddata.ws.Data.QUOTE[] getQUOTES() {
        return QUOTES;
    }


    /**
     * Sets the QUOTES value for this RESPONSE.
     * 
     * @param QUOTES
     */
    public void setQUOTES(com.eoddata.ws.Data.QUOTE[] QUOTES) {
        this.QUOTES = QUOTES;
    }


    /**
     * Gets the QUOTES2 value for this RESPONSE.
     * 
     * @return QUOTES2
     */
    public com.eoddata.ws.Data.QUOTE2[] getQUOTES2() {
        return QUOTES2;
    }


    /**
     * Sets the QUOTES2 value for this RESPONSE.
     * 
     * @param QUOTES2
     */
    public void setQUOTES2(com.eoddata.ws.Data.QUOTE2[] QUOTES2) {
        this.QUOTES2 = QUOTES2;
    }


    /**
     * Gets the SPLITS value for this RESPONSE.
     * 
     * @return SPLITS
     */
    public com.eoddata.ws.Data.SPLIT[] getSPLITS() {
        return SPLITS;
    }


    /**
     * Sets the SPLITS value for this RESPONSE.
     * 
     * @param SPLITS
     */
    public void setSPLITS(com.eoddata.ws.Data.SPLIT[] SPLITS) {
        this.SPLITS = SPLITS;
    }


    /**
     * Gets the COUNTRIES value for this RESPONSE.
     * 
     * @return COUNTRIES
     */
    public com.eoddata.ws.Data.CountryBase[] getCOUNTRIES() {
        return COUNTRIES;
    }


    /**
     * Sets the COUNTRIES value for this RESPONSE.
     * 
     * @param COUNTRIES
     */
    public void setCOUNTRIES(com.eoddata.ws.Data.CountryBase[] COUNTRIES) {
        this.COUNTRIES = COUNTRIES;
    }


    /**
     * Gets the FUNDAMENTALS value for this RESPONSE.
     * 
     * @return FUNDAMENTALS
     */
    public com.eoddata.ws.Data.FUNDAMENTAL[] getFUNDAMENTALS() {
        return FUNDAMENTALS;
    }


    /**
     * Sets the FUNDAMENTALS value for this RESPONSE.
     * 
     * @param FUNDAMENTALS
     */
    public void setFUNDAMENTALS(com.eoddata.ws.Data.FUNDAMENTAL[] FUNDAMENTALS) {
        this.FUNDAMENTALS = FUNDAMENTALS;
    }


    /**
     * Gets the TECHNICALS value for this RESPONSE.
     * 
     * @return TECHNICALS
     */
    public com.eoddata.ws.Data.TECHNICAL[] getTECHNICALS() {
        return TECHNICALS;
    }


    /**
     * Sets the TECHNICALS value for this RESPONSE.
     * 
     * @param TECHNICALS
     */
    public void setTECHNICALS(com.eoddata.ws.Data.TECHNICAL[] TECHNICALS) {
        this.TECHNICALS = TECHNICALS;
    }


    /**
     * Gets the SYMBOLCHANGES value for this RESPONSE.
     * 
     * @return SYMBOLCHANGES
     */
    public com.eoddata.ws.Data.SYMBOLCHANGE[] getSYMBOLCHANGES() {
        return SYMBOLCHANGES;
    }


    /**
     * Sets the SYMBOLCHANGES value for this RESPONSE.
     * 
     * @param SYMBOLCHANGES
     */
    public void setSYMBOLCHANGES(com.eoddata.ws.Data.SYMBOLCHANGE[] SYMBOLCHANGES) {
        this.SYMBOLCHANGES = SYMBOLCHANGES;
    }


    /**
     * Gets the CHART value for this RESPONSE.
     * 
     * @return CHART
     */
    public java.lang.String getCHART() {
        return CHART;
    }


    /**
     * Sets the CHART value for this RESPONSE.
     * 
     * @param CHART
     */
    public void setCHART(java.lang.String CHART) {
        this.CHART = CHART;
    }


    /**
     * Gets the MEMBERSHIP value for this RESPONSE.
     * 
     * @return MEMBERSHIP
     */
    public java.lang.String getMEMBERSHIP() {
        return MEMBERSHIP;
    }


    /**
     * Sets the MEMBERSHIP value for this RESPONSE.
     * 
     * @param MEMBERSHIP
     */
    public void setMEMBERSHIP(java.lang.String MEMBERSHIP) {
        this.MEMBERSHIP = MEMBERSHIP;
    }


    /**
     * Gets the VERSION value for this RESPONSE.
     * 
     * @return VERSION
     */
    public java.lang.String getVERSION() {
        return VERSION;
    }


    /**
     * Sets the VERSION value for this RESPONSE.
     * 
     * @param VERSION
     */
    public void setVERSION(java.lang.String VERSION) {
        this.VERSION = VERSION;
    }


    /**
     * Gets the MONTHS value for this RESPONSE.
     * 
     * @return MONTHS
     */
    public java.lang.String getMONTHS() {
        return MONTHS;
    }


    /**
     * Sets the MONTHS value for this RESPONSE.
     * 
     * @param MONTHS
     */
    public void setMONTHS(java.lang.String MONTHS) {
        this.MONTHS = MONTHS;
    }


    /**
     * Gets the DATAFORMATS value for this RESPONSE.
     * 
     * @return DATAFORMATS
     */
    public com.eoddata.ws.Data.DATAFORMAT[] getDATAFORMATS() {
        return DATAFORMATS;
    }


    /**
     * Sets the DATAFORMATS value for this RESPONSE.
     * 
     * @param DATAFORMATS
     */
    public void setDATAFORMATS(com.eoddata.ws.Data.DATAFORMAT[] DATAFORMATS) {
        this.DATAFORMATS = DATAFORMATS;
    }


    /**
     * Gets the source value for this RESPONSE.
     * 
     * @return source
     */
    public java.lang.String getSource() {
        return source;
    }


    /**
     * Sets the source value for this RESPONSE.
     * 
     * @param source
     */
    public void setSource(java.lang.String source) {
        this.source = source;
    }


    /**
     * Gets the message value for this RESPONSE.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this RESPONSE.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the date value for this RESPONSE.
     * 
     * @return date
     */
    public java.util.Calendar getDate() {
        return date;
    }


    /**
     * Sets the date value for this RESPONSE.
     * 
     * @param date
     */
    public void setDate(java.util.Calendar date) {
        this.date = date;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RESPONSE)) return false;
        RESPONSE other = (RESPONSE) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.EXCHANGE==null && other.getEXCHANGE()==null) || 
             (this.EXCHANGE!=null &&
              this.EXCHANGE.equals(other.getEXCHANGE()))) &&
            ((this.EXCHANGES==null && other.getEXCHANGES()==null) || 
             (this.EXCHANGES!=null &&
              java.util.Arrays.equals(this.EXCHANGES, other.getEXCHANGES()))) &&
            ((this.SYMBOL==null && other.getSYMBOL()==null) || 
             (this.SYMBOL!=null &&
              this.SYMBOL.equals(other.getSYMBOL()))) &&
            ((this.SYMBOLS==null && other.getSYMBOLS()==null) || 
             (this.SYMBOLS!=null &&
              java.util.Arrays.equals(this.SYMBOLS, other.getSYMBOLS()))) &&
            ((this.SYMBOLS2==null && other.getSYMBOLS2()==null) || 
             (this.SYMBOLS2!=null &&
              java.util.Arrays.equals(this.SYMBOLS2, other.getSYMBOLS2()))) &&
            ((this.QUOTE==null && other.getQUOTE()==null) || 
             (this.QUOTE!=null &&
              this.QUOTE.equals(other.getQUOTE()))) &&
            ((this.QUOTES==null && other.getQUOTES()==null) || 
             (this.QUOTES!=null &&
              java.util.Arrays.equals(this.QUOTES, other.getQUOTES()))) &&
            ((this.QUOTES2==null && other.getQUOTES2()==null) || 
             (this.QUOTES2!=null &&
              java.util.Arrays.equals(this.QUOTES2, other.getQUOTES2()))) &&
            ((this.SPLITS==null && other.getSPLITS()==null) || 
             (this.SPLITS!=null &&
              java.util.Arrays.equals(this.SPLITS, other.getSPLITS()))) &&
            ((this.COUNTRIES==null && other.getCOUNTRIES()==null) || 
             (this.COUNTRIES!=null &&
              java.util.Arrays.equals(this.COUNTRIES, other.getCOUNTRIES()))) &&
            ((this.FUNDAMENTALS==null && other.getFUNDAMENTALS()==null) || 
             (this.FUNDAMENTALS!=null &&
              java.util.Arrays.equals(this.FUNDAMENTALS, other.getFUNDAMENTALS()))) &&
            ((this.TECHNICALS==null && other.getTECHNICALS()==null) || 
             (this.TECHNICALS!=null &&
              java.util.Arrays.equals(this.TECHNICALS, other.getTECHNICALS()))) &&
            ((this.SYMBOLCHANGES==null && other.getSYMBOLCHANGES()==null) || 
             (this.SYMBOLCHANGES!=null &&
              java.util.Arrays.equals(this.SYMBOLCHANGES, other.getSYMBOLCHANGES()))) &&
            ((this.CHART==null && other.getCHART()==null) || 
             (this.CHART!=null &&
              this.CHART.equals(other.getCHART()))) &&
            ((this.MEMBERSHIP==null && other.getMEMBERSHIP()==null) || 
             (this.MEMBERSHIP!=null &&
              this.MEMBERSHIP.equals(other.getMEMBERSHIP()))) &&
            ((this.VERSION==null && other.getVERSION()==null) || 
             (this.VERSION!=null &&
              this.VERSION.equals(other.getVERSION()))) &&
            ((this.MONTHS==null && other.getMONTHS()==null) || 
             (this.MONTHS!=null &&
              this.MONTHS.equals(other.getMONTHS()))) &&
            ((this.DATAFORMATS==null && other.getDATAFORMATS()==null) || 
             (this.DATAFORMATS!=null &&
              java.util.Arrays.equals(this.DATAFORMATS, other.getDATAFORMATS()))) &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate())));
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
        if (getEXCHANGE() != null) {
            _hashCode += getEXCHANGE().hashCode();
        }
        if (getEXCHANGES() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEXCHANGES());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEXCHANGES(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSYMBOL() != null) {
            _hashCode += getSYMBOL().hashCode();
        }
        if (getSYMBOLS() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSYMBOLS());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSYMBOLS(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSYMBOLS2() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSYMBOLS2());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSYMBOLS2(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQUOTE() != null) {
            _hashCode += getQUOTE().hashCode();
        }
        if (getQUOTES() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQUOTES());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQUOTES(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQUOTES2() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQUOTES2());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQUOTES2(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSPLITS() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSPLITS());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSPLITS(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCOUNTRIES() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCOUNTRIES());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCOUNTRIES(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFUNDAMENTALS() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFUNDAMENTALS());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFUNDAMENTALS(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTECHNICALS() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTECHNICALS());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTECHNICALS(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSYMBOLCHANGES() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSYMBOLCHANGES());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSYMBOLCHANGES(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCHART() != null) {
            _hashCode += getCHART().hashCode();
        }
        if (getMEMBERSHIP() != null) {
            _hashCode += getMEMBERSHIP().hashCode();
        }
        if (getVERSION() != null) {
            _hashCode += getVERSION().hashCode();
        }
        if (getMONTHS() != null) {
            _hashCode += getMONTHS().hashCode();
        }
        if (getDATAFORMATS() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDATAFORMATS());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDATAFORMATS(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RESPONSE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "RESPONSE"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("source");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Source"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("message");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Message"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("date");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Date"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EXCHANGE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "EXCHANGE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "EXCHANGE"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EXCHANGES");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "EXCHANGES"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "EXCHANGE"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "EXCHANGE"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SYMBOL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "SYMBOL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "SYMBOL"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SYMBOLS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "SYMBOLS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "SYMBOL"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "SYMBOL"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SYMBOLS2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "SYMBOLS2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "SYMBOL2"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "SYMBOL2"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("QUOTE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "QUOTE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "QUOTE"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("QUOTES");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "QUOTES"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "QUOTE"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "QUOTE"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("QUOTES2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "QUOTES2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "QUOTE2"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "QUOTE2"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SPLITS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "SPLITS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "SPLIT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "SPLIT"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("COUNTRIES");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "COUNTRIES"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "CountryBase"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "CountryBase"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FUNDAMENTALS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "FUNDAMENTALS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "FUNDAMENTAL"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "FUNDAMENTAL"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TECHNICALS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "TECHNICALS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "TECHNICAL"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "TECHNICAL"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SYMBOLCHANGES");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "SYMBOLCHANGES"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "SYMBOLCHANGE"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "SYMBOLCHANGE"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CHART");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "CHART"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MEMBERSHIP");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "MEMBERSHIP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VERSION");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "VERSION"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MONTHS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "MONTHS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DATAFORMATS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "DATAFORMATS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "DATAFORMAT"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "DATAFORMAT"));
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
