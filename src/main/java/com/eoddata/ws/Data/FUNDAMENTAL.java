/**
 * FUNDAMENTAL.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.eoddata.ws.Data;

public class FUNDAMENTAL  implements java.io.Serializable {
    private java.lang.String symbol;  // attribute

    private java.lang.String name;  // attribute

    private java.lang.String description;  // attribute

    private java.util.Calendar dateTime;  // attribute

    private java.lang.String industry;  // attribute

    private java.lang.String sector;  // attribute

    private long shares;  // attribute

    private long marketCap;  // attribute

    private double PE;  // attribute

    private double EPS;  // attribute

    private double NTA;  // attribute

    private double divYield;  // attribute

    private double dividend;  // attribute

    private java.util.Calendar dividendDate;  // attribute

    private double DPS;  // attribute

    private double imputationCredits;  // attribute

    private double EBITDA;  // attribute

    private double PEG;  // attribute

    private double ptS;  // attribute

    private double ptB;  // attribute

    private double yield;  // attribute

    public FUNDAMENTAL() {
    }

    public FUNDAMENTAL(
           java.lang.String symbol,
           java.lang.String name,
           java.lang.String description,
           java.util.Calendar dateTime,
           java.lang.String industry,
           java.lang.String sector,
           long shares,
           long marketCap,
           double PE,
           double EPS,
           double NTA,
           double divYield,
           double dividend,
           java.util.Calendar dividendDate,
           double DPS,
           double imputationCredits,
           double EBITDA,
           double PEG,
           double ptS,
           double ptB,
           double yield) {
           this.symbol = symbol;
           this.name = name;
           this.description = description;
           this.dateTime = dateTime;
           this.industry = industry;
           this.sector = sector;
           this.shares = shares;
           this.marketCap = marketCap;
           this.PE = PE;
           this.EPS = EPS;
           this.NTA = NTA;
           this.divYield = divYield;
           this.dividend = dividend;
           this.dividendDate = dividendDate;
           this.DPS = DPS;
           this.imputationCredits = imputationCredits;
           this.EBITDA = EBITDA;
           this.PEG = PEG;
           this.ptS = ptS;
           this.ptB = ptB;
           this.yield = yield;
    }


    /**
     * Gets the symbol value for this FUNDAMENTAL.
     * 
     * @return symbol
     */
    public java.lang.String getSymbol() {
        return symbol;
    }


    /**
     * Sets the symbol value for this FUNDAMENTAL.
     * 
     * @param symbol
     */
    public void setSymbol(java.lang.String symbol) {
        this.symbol = symbol;
    }


    /**
     * Gets the name value for this FUNDAMENTAL.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this FUNDAMENTAL.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the description value for this FUNDAMENTAL.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this FUNDAMENTAL.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the dateTime value for this FUNDAMENTAL.
     * 
     * @return dateTime
     */
    public java.util.Calendar getDateTime() {
        return dateTime;
    }


    /**
     * Sets the dateTime value for this FUNDAMENTAL.
     * 
     * @param dateTime
     */
    public void setDateTime(java.util.Calendar dateTime) {
        this.dateTime = dateTime;
    }


    /**
     * Gets the industry value for this FUNDAMENTAL.
     * 
     * @return industry
     */
    public java.lang.String getIndustry() {
        return industry;
    }


    /**
     * Sets the industry value for this FUNDAMENTAL.
     * 
     * @param industry
     */
    public void setIndustry(java.lang.String industry) {
        this.industry = industry;
    }


    /**
     * Gets the sector value for this FUNDAMENTAL.
     * 
     * @return sector
     */
    public java.lang.String getSector() {
        return sector;
    }


    /**
     * Sets the sector value for this FUNDAMENTAL.
     * 
     * @param sector
     */
    public void setSector(java.lang.String sector) {
        this.sector = sector;
    }


    /**
     * Gets the shares value for this FUNDAMENTAL.
     * 
     * @return shares
     */
    public long getShares() {
        return shares;
    }


    /**
     * Sets the shares value for this FUNDAMENTAL.
     * 
     * @param shares
     */
    public void setShares(long shares) {
        this.shares = shares;
    }


    /**
     * Gets the marketCap value for this FUNDAMENTAL.
     * 
     * @return marketCap
     */
    public long getMarketCap() {
        return marketCap;
    }


    /**
     * Sets the marketCap value for this FUNDAMENTAL.
     * 
     * @param marketCap
     */
    public void setMarketCap(long marketCap) {
        this.marketCap = marketCap;
    }


    /**
     * Gets the PE value for this FUNDAMENTAL.
     * 
     * @return PE
     */
    public double getPE() {
        return PE;
    }


    /**
     * Sets the PE value for this FUNDAMENTAL.
     * 
     * @param PE
     */
    public void setPE(double PE) {
        this.PE = PE;
    }


    /**
     * Gets the EPS value for this FUNDAMENTAL.
     * 
     * @return EPS
     */
    public double getEPS() {
        return EPS;
    }


    /**
     * Sets the EPS value for this FUNDAMENTAL.
     * 
     * @param EPS
     */
    public void setEPS(double EPS) {
        this.EPS = EPS;
    }


    /**
     * Gets the NTA value for this FUNDAMENTAL.
     * 
     * @return NTA
     */
    public double getNTA() {
        return NTA;
    }


    /**
     * Sets the NTA value for this FUNDAMENTAL.
     * 
     * @param NTA
     */
    public void setNTA(double NTA) {
        this.NTA = NTA;
    }


    /**
     * Gets the divYield value for this FUNDAMENTAL.
     * 
     * @return divYield
     */
    public double getDivYield() {
        return divYield;
    }


    /**
     * Sets the divYield value for this FUNDAMENTAL.
     * 
     * @param divYield
     */
    public void setDivYield(double divYield) {
        this.divYield = divYield;
    }


    /**
     * Gets the dividend value for this FUNDAMENTAL.
     * 
     * @return dividend
     */
    public double getDividend() {
        return dividend;
    }


    /**
     * Sets the dividend value for this FUNDAMENTAL.
     * 
     * @param dividend
     */
    public void setDividend(double dividend) {
        this.dividend = dividend;
    }


    /**
     * Gets the dividendDate value for this FUNDAMENTAL.
     * 
     * @return dividendDate
     */
    public java.util.Calendar getDividendDate() {
        return dividendDate;
    }


    /**
     * Sets the dividendDate value for this FUNDAMENTAL.
     * 
     * @param dividendDate
     */
    public void setDividendDate(java.util.Calendar dividendDate) {
        this.dividendDate = dividendDate;
    }


    /**
     * Gets the DPS value for this FUNDAMENTAL.
     * 
     * @return DPS
     */
    public double getDPS() {
        return DPS;
    }


    /**
     * Sets the DPS value for this FUNDAMENTAL.
     * 
     * @param DPS
     */
    public void setDPS(double DPS) {
        this.DPS = DPS;
    }


    /**
     * Gets the imputationCredits value for this FUNDAMENTAL.
     * 
     * @return imputationCredits
     */
    public double getImputationCredits() {
        return imputationCredits;
    }


    /**
     * Sets the imputationCredits value for this FUNDAMENTAL.
     * 
     * @param imputationCredits
     */
    public void setImputationCredits(double imputationCredits) {
        this.imputationCredits = imputationCredits;
    }


    /**
     * Gets the EBITDA value for this FUNDAMENTAL.
     * 
     * @return EBITDA
     */
    public double getEBITDA() {
        return EBITDA;
    }


    /**
     * Sets the EBITDA value for this FUNDAMENTAL.
     * 
     * @param EBITDA
     */
    public void setEBITDA(double EBITDA) {
        this.EBITDA = EBITDA;
    }


    /**
     * Gets the PEG value for this FUNDAMENTAL.
     * 
     * @return PEG
     */
    public double getPEG() {
        return PEG;
    }


    /**
     * Sets the PEG value for this FUNDAMENTAL.
     * 
     * @param PEG
     */
    public void setPEG(double PEG) {
        this.PEG = PEG;
    }


    /**
     * Gets the ptS value for this FUNDAMENTAL.
     * 
     * @return ptS
     */
    public double getPtS() {
        return ptS;
    }


    /**
     * Sets the ptS value for this FUNDAMENTAL.
     * 
     * @param ptS
     */
    public void setPtS(double ptS) {
        this.ptS = ptS;
    }


    /**
     * Gets the ptB value for this FUNDAMENTAL.
     * 
     * @return ptB
     */
    public double getPtB() {
        return ptB;
    }


    /**
     * Sets the ptB value for this FUNDAMENTAL.
     * 
     * @param ptB
     */
    public void setPtB(double ptB) {
        this.ptB = ptB;
    }


    /**
     * Gets the yield value for this FUNDAMENTAL.
     * 
     * @return yield
     */
    public double getYield() {
        return yield;
    }


    /**
     * Sets the yield value for this FUNDAMENTAL.
     * 
     * @param yield
     */
    public void setYield(double yield) {
        this.yield = yield;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FUNDAMENTAL)) return false;
        FUNDAMENTAL other = (FUNDAMENTAL) obj;
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
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.dateTime==null && other.getDateTime()==null) || 
             (this.dateTime!=null &&
              this.dateTime.equals(other.getDateTime()))) &&
            ((this.industry==null && other.getIndustry()==null) || 
             (this.industry!=null &&
              this.industry.equals(other.getIndustry()))) &&
            ((this.sector==null && other.getSector()==null) || 
             (this.sector!=null &&
              this.sector.equals(other.getSector()))) &&
            this.shares == other.getShares() &&
            this.marketCap == other.getMarketCap() &&
            this.PE == other.getPE() &&
            this.EPS == other.getEPS() &&
            this.NTA == other.getNTA() &&
            this.divYield == other.getDivYield() &&
            this.dividend == other.getDividend() &&
            ((this.dividendDate==null && other.getDividendDate()==null) || 
             (this.dividendDate!=null &&
              this.dividendDate.equals(other.getDividendDate()))) &&
            this.DPS == other.getDPS() &&
            this.imputationCredits == other.getImputationCredits() &&
            this.EBITDA == other.getEBITDA() &&
            this.PEG == other.getPEG() &&
            this.ptS == other.getPtS() &&
            this.ptB == other.getPtB() &&
            this.yield == other.getYield();
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDateTime() != null) {
            _hashCode += getDateTime().hashCode();
        }
        if (getIndustry() != null) {
            _hashCode += getIndustry().hashCode();
        }
        if (getSector() != null) {
            _hashCode += getSector().hashCode();
        }
        _hashCode += new Long(getShares()).hashCode();
        _hashCode += new Long(getMarketCap()).hashCode();
        _hashCode += new Double(getPE()).hashCode();
        _hashCode += new Double(getEPS()).hashCode();
        _hashCode += new Double(getNTA()).hashCode();
        _hashCode += new Double(getDivYield()).hashCode();
        _hashCode += new Double(getDividend()).hashCode();
        if (getDividendDate() != null) {
            _hashCode += getDividendDate().hashCode();
        }
        _hashCode += new Double(getDPS()).hashCode();
        _hashCode += new Double(getImputationCredits()).hashCode();
        _hashCode += new Double(getEBITDA()).hashCode();
        _hashCode += new Double(getPEG()).hashCode();
        _hashCode += new Double(getPtS()).hashCode();
        _hashCode += new Double(getPtB()).hashCode();
        _hashCode += new Double(getYield()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FUNDAMENTAL.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "FUNDAMENTAL"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("symbol");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Symbol"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("name");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Name"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("description");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Description"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("dateTime");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DateTime"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("industry");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Industry"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("sector");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Sector"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("shares");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Shares"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("marketCap");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MarketCap"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("PE");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PE"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("EPS");
        attrField.setXmlName(new javax.xml.namespace.QName("", "EPS"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("NTA");
        attrField.setXmlName(new javax.xml.namespace.QName("", "NTA"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("divYield");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DivYield"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("dividend");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Dividend"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("dividendDate");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DividendDate"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("DPS");
        attrField.setXmlName(new javax.xml.namespace.QName("", "DPS"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("imputationCredits");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ImputationCredits"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("EBITDA");
        attrField.setXmlName(new javax.xml.namespace.QName("", "EBITDA"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("PEG");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PEG"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("ptS");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PtS"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("ptB");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PtB"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("yield");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Yield"));
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
