/**
 * TECHNICAL.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.eoddata.ws.Data;

public class TECHNICAL  implements java.io.Serializable {
    private java.lang.String symbol;  // attribute

    private java.lang.String name;  // attribute

    private java.lang.String description;  // attribute

    private java.util.Calendar dateTime;  // attribute

    private double previous;  // attribute

    private double change;  // attribute

    private int MA1;  // attribute

    private int MA2;  // attribute

    private int MA5;  // attribute

    private int MA20;  // attribute

    private int MA50;  // attribute

    private int MA100;  // attribute

    private int MA200;  // attribute

    private double MAPercent;  // attribute

    private double MAReturn;  // attribute

    private long volumeChange;  // attribute

    private double threeMonthChange;  // attribute

    private double sixMonthChange;  // attribute

    private double weekHigh;  // attribute

    private double weekLow;  // attribute

    private double weekChange;  // attribute

    private double avgWeekChange;  // attribute

    private double avgWeekVolume;  // attribute

    private double weekVolume;  // attribute

    private double monthHigh;  // attribute

    private double monthLow;  // attribute

    private double monthChange;  // attribute

    private double avgMonthChange;  // attribute

    private double avgMonthVolume;  // attribute

    private double monthVolume;  // attribute

    private double yearHigh;  // attribute

    private double yearLow;  // attribute

    private double yearChange;  // attribute

    private double avgYearChange;  // attribute

    private double avgYearVolume;  // attribute

    private double YTDChange;  // attribute

    private double RSI14;  // attribute

    private double STO9;  // attribute

    private double WPR14;  // attribute

    private double MTM14;  // attribute

    private double ROC14;  // attribute

    private long PTC;  // attribute

    private double SAR;  // attribute

    private double volatility;  // attribute

    private double liquidity;  // attribute

    public TECHNICAL() {
    }

    public TECHNICAL(
           java.lang.String symbol,
           java.lang.String name,
           java.lang.String description,
           java.util.Calendar dateTime,
           double previous,
           double change,
           int MA1,
           int MA2,
           int MA5,
           int MA20,
           int MA50,
           int MA100,
           int MA200,
           double MAPercent,
           double MAReturn,
           long volumeChange,
           double threeMonthChange,
           double sixMonthChange,
           double weekHigh,
           double weekLow,
           double weekChange,
           double avgWeekChange,
           double avgWeekVolume,
           double weekVolume,
           double monthHigh,
           double monthLow,
           double monthChange,
           double avgMonthChange,
           double avgMonthVolume,
           double monthVolume,
           double yearHigh,
           double yearLow,
           double yearChange,
           double avgYearChange,
           double avgYearVolume,
           double YTDChange,
           double RSI14,
           double STO9,
           double WPR14,
           double MTM14,
           double ROC14,
           long PTC,
           double SAR,
           double volatility,
           double liquidity) {
           this.symbol = symbol;
           this.name = name;
           this.description = description;
           this.dateTime = dateTime;
           this.previous = previous;
           this.change = change;
           this.MA1 = MA1;
           this.MA2 = MA2;
           this.MA5 = MA5;
           this.MA20 = MA20;
           this.MA50 = MA50;
           this.MA100 = MA100;
           this.MA200 = MA200;
           this.MAPercent = MAPercent;
           this.MAReturn = MAReturn;
           this.volumeChange = volumeChange;
           this.threeMonthChange = threeMonthChange;
           this.sixMonthChange = sixMonthChange;
           this.weekHigh = weekHigh;
           this.weekLow = weekLow;
           this.weekChange = weekChange;
           this.avgWeekChange = avgWeekChange;
           this.avgWeekVolume = avgWeekVolume;
           this.weekVolume = weekVolume;
           this.monthHigh = monthHigh;
           this.monthLow = monthLow;
           this.monthChange = monthChange;
           this.avgMonthChange = avgMonthChange;
           this.avgMonthVolume = avgMonthVolume;
           this.monthVolume = monthVolume;
           this.yearHigh = yearHigh;
           this.yearLow = yearLow;
           this.yearChange = yearChange;
           this.avgYearChange = avgYearChange;
           this.avgYearVolume = avgYearVolume;
           this.YTDChange = YTDChange;
           this.RSI14 = RSI14;
           this.STO9 = STO9;
           this.WPR14 = WPR14;
           this.MTM14 = MTM14;
           this.ROC14 = ROC14;
           this.PTC = PTC;
           this.SAR = SAR;
           this.volatility = volatility;
           this.liquidity = liquidity;
    }


    /**
     * Gets the symbol value for this TECHNICAL.
     * 
     * @return symbol
     */
    public java.lang.String getSymbol() {
        return symbol;
    }


    /**
     * Sets the symbol value for this TECHNICAL.
     * 
     * @param symbol
     */
    public void setSymbol(java.lang.String symbol) {
        this.symbol = symbol;
    }


    /**
     * Gets the name value for this TECHNICAL.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this TECHNICAL.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the description value for this TECHNICAL.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this TECHNICAL.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the dateTime value for this TECHNICAL.
     * 
     * @return dateTime
     */
    public java.util.Calendar getDateTime() {
        return dateTime;
    }


    /**
     * Sets the dateTime value for this TECHNICAL.
     * 
     * @param dateTime
     */
    public void setDateTime(java.util.Calendar dateTime) {
        this.dateTime = dateTime;
    }


    /**
     * Gets the previous value for this TECHNICAL.
     * 
     * @return previous
     */
    public double getPrevious() {
        return previous;
    }


    /**
     * Sets the previous value for this TECHNICAL.
     * 
     * @param previous
     */
    public void setPrevious(double previous) {
        this.previous = previous;
    }


    /**
     * Gets the change value for this TECHNICAL.
     * 
     * @return change
     */
    public double getChange() {
        return change;
    }


    /**
     * Sets the change value for this TECHNICAL.
     * 
     * @param change
     */
    public void setChange(double change) {
        this.change = change;
    }


    /**
     * Gets the MA1 value for this TECHNICAL.
     * 
     * @return MA1
     */
    public int getMA1() {
        return MA1;
    }


    /**
     * Sets the MA1 value for this TECHNICAL.
     * 
     * @param MA1
     */
    public void setMA1(int MA1) {
        this.MA1 = MA1;
    }


    /**
     * Gets the MA2 value for this TECHNICAL.
     * 
     * @return MA2
     */
    public int getMA2() {
        return MA2;
    }


    /**
     * Sets the MA2 value for this TECHNICAL.
     * 
     * @param MA2
     */
    public void setMA2(int MA2) {
        this.MA2 = MA2;
    }


    /**
     * Gets the MA5 value for this TECHNICAL.
     * 
     * @return MA5
     */
    public int getMA5() {
        return MA5;
    }


    /**
     * Sets the MA5 value for this TECHNICAL.
     * 
     * @param MA5
     */
    public void setMA5(int MA5) {
        this.MA5 = MA5;
    }


    /**
     * Gets the MA20 value for this TECHNICAL.
     * 
     * @return MA20
     */
    public int getMA20() {
        return MA20;
    }


    /**
     * Sets the MA20 value for this TECHNICAL.
     * 
     * @param MA20
     */
    public void setMA20(int MA20) {
        this.MA20 = MA20;
    }


    /**
     * Gets the MA50 value for this TECHNICAL.
     * 
     * @return MA50
     */
    public int getMA50() {
        return MA50;
    }


    /**
     * Sets the MA50 value for this TECHNICAL.
     * 
     * @param MA50
     */
    public void setMA50(int MA50) {
        this.MA50 = MA50;
    }


    /**
     * Gets the MA100 value for this TECHNICAL.
     * 
     * @return MA100
     */
    public int getMA100() {
        return MA100;
    }


    /**
     * Sets the MA100 value for this TECHNICAL.
     * 
     * @param MA100
     */
    public void setMA100(int MA100) {
        this.MA100 = MA100;
    }


    /**
     * Gets the MA200 value for this TECHNICAL.
     * 
     * @return MA200
     */
    public int getMA200() {
        return MA200;
    }


    /**
     * Sets the MA200 value for this TECHNICAL.
     * 
     * @param MA200
     */
    public void setMA200(int MA200) {
        this.MA200 = MA200;
    }


    /**
     * Gets the MAPercent value for this TECHNICAL.
     * 
     * @return MAPercent
     */
    public double getMAPercent() {
        return MAPercent;
    }


    /**
     * Sets the MAPercent value for this TECHNICAL.
     * 
     * @param MAPercent
     */
    public void setMAPercent(double MAPercent) {
        this.MAPercent = MAPercent;
    }


    /**
     * Gets the MAReturn value for this TECHNICAL.
     * 
     * @return MAReturn
     */
    public double getMAReturn() {
        return MAReturn;
    }


    /**
     * Sets the MAReturn value for this TECHNICAL.
     * 
     * @param MAReturn
     */
    public void setMAReturn(double MAReturn) {
        this.MAReturn = MAReturn;
    }


    /**
     * Gets the volumeChange value for this TECHNICAL.
     * 
     * @return volumeChange
     */
    public long getVolumeChange() {
        return volumeChange;
    }


    /**
     * Sets the volumeChange value for this TECHNICAL.
     * 
     * @param volumeChange
     */
    public void setVolumeChange(long volumeChange) {
        this.volumeChange = volumeChange;
    }


    /**
     * Gets the threeMonthChange value for this TECHNICAL.
     * 
     * @return threeMonthChange
     */
    public double getThreeMonthChange() {
        return threeMonthChange;
    }


    /**
     * Sets the threeMonthChange value for this TECHNICAL.
     * 
     * @param threeMonthChange
     */
    public void setThreeMonthChange(double threeMonthChange) {
        this.threeMonthChange = threeMonthChange;
    }


    /**
     * Gets the sixMonthChange value for this TECHNICAL.
     * 
     * @return sixMonthChange
     */
    public double getSixMonthChange() {
        return sixMonthChange;
    }


    /**
     * Sets the sixMonthChange value for this TECHNICAL.
     * 
     * @param sixMonthChange
     */
    public void setSixMonthChange(double sixMonthChange) {
        this.sixMonthChange = sixMonthChange;
    }


    /**
     * Gets the weekHigh value for this TECHNICAL.
     * 
     * @return weekHigh
     */
    public double getWeekHigh() {
        return weekHigh;
    }


    /**
     * Sets the weekHigh value for this TECHNICAL.
     * 
     * @param weekHigh
     */
    public void setWeekHigh(double weekHigh) {
        this.weekHigh = weekHigh;
    }


    /**
     * Gets the weekLow value for this TECHNICAL.
     * 
     * @return weekLow
     */
    public double getWeekLow() {
        return weekLow;
    }


    /**
     * Sets the weekLow value for this TECHNICAL.
     * 
     * @param weekLow
     */
    public void setWeekLow(double weekLow) {
        this.weekLow = weekLow;
    }


    /**
     * Gets the weekChange value for this TECHNICAL.
     * 
     * @return weekChange
     */
    public double getWeekChange() {
        return weekChange;
    }


    /**
     * Sets the weekChange value for this TECHNICAL.
     * 
     * @param weekChange
     */
    public void setWeekChange(double weekChange) {
        this.weekChange = weekChange;
    }


    /**
     * Gets the avgWeekChange value for this TECHNICAL.
     * 
     * @return avgWeekChange
     */
    public double getAvgWeekChange() {
        return avgWeekChange;
    }


    /**
     * Sets the avgWeekChange value for this TECHNICAL.
     * 
     * @param avgWeekChange
     */
    public void setAvgWeekChange(double avgWeekChange) {
        this.avgWeekChange = avgWeekChange;
    }


    /**
     * Gets the avgWeekVolume value for this TECHNICAL.
     * 
     * @return avgWeekVolume
     */
    public double getAvgWeekVolume() {
        return avgWeekVolume;
    }


    /**
     * Sets the avgWeekVolume value for this TECHNICAL.
     * 
     * @param avgWeekVolume
     */
    public void setAvgWeekVolume(double avgWeekVolume) {
        this.avgWeekVolume = avgWeekVolume;
    }


    /**
     * Gets the weekVolume value for this TECHNICAL.
     * 
     * @return weekVolume
     */
    public double getWeekVolume() {
        return weekVolume;
    }


    /**
     * Sets the weekVolume value for this TECHNICAL.
     * 
     * @param weekVolume
     */
    public void setWeekVolume(double weekVolume) {
        this.weekVolume = weekVolume;
    }


    /**
     * Gets the monthHigh value for this TECHNICAL.
     * 
     * @return monthHigh
     */
    public double getMonthHigh() {
        return monthHigh;
    }


    /**
     * Sets the monthHigh value for this TECHNICAL.
     * 
     * @param monthHigh
     */
    public void setMonthHigh(double monthHigh) {
        this.monthHigh = monthHigh;
    }


    /**
     * Gets the monthLow value for this TECHNICAL.
     * 
     * @return monthLow
     */
    public double getMonthLow() {
        return monthLow;
    }


    /**
     * Sets the monthLow value for this TECHNICAL.
     * 
     * @param monthLow
     */
    public void setMonthLow(double monthLow) {
        this.monthLow = monthLow;
    }


    /**
     * Gets the monthChange value for this TECHNICAL.
     * 
     * @return monthChange
     */
    public double getMonthChange() {
        return monthChange;
    }


    /**
     * Sets the monthChange value for this TECHNICAL.
     * 
     * @param monthChange
     */
    public void setMonthChange(double monthChange) {
        this.monthChange = monthChange;
    }


    /**
     * Gets the avgMonthChange value for this TECHNICAL.
     * 
     * @return avgMonthChange
     */
    public double getAvgMonthChange() {
        return avgMonthChange;
    }


    /**
     * Sets the avgMonthChange value for this TECHNICAL.
     * 
     * @param avgMonthChange
     */
    public void setAvgMonthChange(double avgMonthChange) {
        this.avgMonthChange = avgMonthChange;
    }


    /**
     * Gets the avgMonthVolume value for this TECHNICAL.
     * 
     * @return avgMonthVolume
     */
    public double getAvgMonthVolume() {
        return avgMonthVolume;
    }


    /**
     * Sets the avgMonthVolume value for this TECHNICAL.
     * 
     * @param avgMonthVolume
     */
    public void setAvgMonthVolume(double avgMonthVolume) {
        this.avgMonthVolume = avgMonthVolume;
    }


    /**
     * Gets the monthVolume value for this TECHNICAL.
     * 
     * @return monthVolume
     */
    public double getMonthVolume() {
        return monthVolume;
    }


    /**
     * Sets the monthVolume value for this TECHNICAL.
     * 
     * @param monthVolume
     */
    public void setMonthVolume(double monthVolume) {
        this.monthVolume = monthVolume;
    }


    /**
     * Gets the yearHigh value for this TECHNICAL.
     * 
     * @return yearHigh
     */
    public double getYearHigh() {
        return yearHigh;
    }


    /**
     * Sets the yearHigh value for this TECHNICAL.
     * 
     * @param yearHigh
     */
    public void setYearHigh(double yearHigh) {
        this.yearHigh = yearHigh;
    }


    /**
     * Gets the yearLow value for this TECHNICAL.
     * 
     * @return yearLow
     */
    public double getYearLow() {
        return yearLow;
    }


    /**
     * Sets the yearLow value for this TECHNICAL.
     * 
     * @param yearLow
     */
    public void setYearLow(double yearLow) {
        this.yearLow = yearLow;
    }


    /**
     * Gets the yearChange value for this TECHNICAL.
     * 
     * @return yearChange
     */
    public double getYearChange() {
        return yearChange;
    }


    /**
     * Sets the yearChange value for this TECHNICAL.
     * 
     * @param yearChange
     */
    public void setYearChange(double yearChange) {
        this.yearChange = yearChange;
    }


    /**
     * Gets the avgYearChange value for this TECHNICAL.
     * 
     * @return avgYearChange
     */
    public double getAvgYearChange() {
        return avgYearChange;
    }


    /**
     * Sets the avgYearChange value for this TECHNICAL.
     * 
     * @param avgYearChange
     */
    public void setAvgYearChange(double avgYearChange) {
        this.avgYearChange = avgYearChange;
    }


    /**
     * Gets the avgYearVolume value for this TECHNICAL.
     * 
     * @return avgYearVolume
     */
    public double getAvgYearVolume() {
        return avgYearVolume;
    }


    /**
     * Sets the avgYearVolume value for this TECHNICAL.
     * 
     * @param avgYearVolume
     */
    public void setAvgYearVolume(double avgYearVolume) {
        this.avgYearVolume = avgYearVolume;
    }


    /**
     * Gets the YTDChange value for this TECHNICAL.
     * 
     * @return YTDChange
     */
    public double getYTDChange() {
        return YTDChange;
    }


    /**
     * Sets the YTDChange value for this TECHNICAL.
     * 
     * @param YTDChange
     */
    public void setYTDChange(double YTDChange) {
        this.YTDChange = YTDChange;
    }


    /**
     * Gets the RSI14 value for this TECHNICAL.
     * 
     * @return RSI14
     */
    public double getRSI14() {
        return RSI14;
    }


    /**
     * Sets the RSI14 value for this TECHNICAL.
     * 
     * @param RSI14
     */
    public void setRSI14(double RSI14) {
        this.RSI14 = RSI14;
    }


    /**
     * Gets the STO9 value for this TECHNICAL.
     * 
     * @return STO9
     */
    public double getSTO9() {
        return STO9;
    }


    /**
     * Sets the STO9 value for this TECHNICAL.
     * 
     * @param STO9
     */
    public void setSTO9(double STO9) {
        this.STO9 = STO9;
    }


    /**
     * Gets the WPR14 value for this TECHNICAL.
     * 
     * @return WPR14
     */
    public double getWPR14() {
        return WPR14;
    }


    /**
     * Sets the WPR14 value for this TECHNICAL.
     * 
     * @param WPR14
     */
    public void setWPR14(double WPR14) {
        this.WPR14 = WPR14;
    }


    /**
     * Gets the MTM14 value for this TECHNICAL.
     * 
     * @return MTM14
     */
    public double getMTM14() {
        return MTM14;
    }


    /**
     * Sets the MTM14 value for this TECHNICAL.
     * 
     * @param MTM14
     */
    public void setMTM14(double MTM14) {
        this.MTM14 = MTM14;
    }


    /**
     * Gets the ROC14 value for this TECHNICAL.
     * 
     * @return ROC14
     */
    public double getROC14() {
        return ROC14;
    }


    /**
     * Sets the ROC14 value for this TECHNICAL.
     * 
     * @param ROC14
     */
    public void setROC14(double ROC14) {
        this.ROC14 = ROC14;
    }


    /**
     * Gets the PTC value for this TECHNICAL.
     * 
     * @return PTC
     */
    public long getPTC() {
        return PTC;
    }


    /**
     * Sets the PTC value for this TECHNICAL.
     * 
     * @param PTC
     */
    public void setPTC(long PTC) {
        this.PTC = PTC;
    }


    /**
     * Gets the SAR value for this TECHNICAL.
     * 
     * @return SAR
     */
    public double getSAR() {
        return SAR;
    }


    /**
     * Sets the SAR value for this TECHNICAL.
     * 
     * @param SAR
     */
    public void setSAR(double SAR) {
        this.SAR = SAR;
    }


    /**
     * Gets the volatility value for this TECHNICAL.
     * 
     * @return volatility
     */
    public double getVolatility() {
        return volatility;
    }


    /**
     * Sets the volatility value for this TECHNICAL.
     * 
     * @param volatility
     */
    public void setVolatility(double volatility) {
        this.volatility = volatility;
    }


    /**
     * Gets the liquidity value for this TECHNICAL.
     * 
     * @return liquidity
     */
    public double getLiquidity() {
        return liquidity;
    }


    /**
     * Sets the liquidity value for this TECHNICAL.
     * 
     * @param liquidity
     */
    public void setLiquidity(double liquidity) {
        this.liquidity = liquidity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TECHNICAL)) return false;
        TECHNICAL other = (TECHNICAL) obj;
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
            this.previous == other.getPrevious() &&
            this.change == other.getChange() &&
            this.MA1 == other.getMA1() &&
            this.MA2 == other.getMA2() &&
            this.MA5 == other.getMA5() &&
            this.MA20 == other.getMA20() &&
            this.MA50 == other.getMA50() &&
            this.MA100 == other.getMA100() &&
            this.MA200 == other.getMA200() &&
            this.MAPercent == other.getMAPercent() &&
            this.MAReturn == other.getMAReturn() &&
            this.volumeChange == other.getVolumeChange() &&
            this.threeMonthChange == other.getThreeMonthChange() &&
            this.sixMonthChange == other.getSixMonthChange() &&
            this.weekHigh == other.getWeekHigh() &&
            this.weekLow == other.getWeekLow() &&
            this.weekChange == other.getWeekChange() &&
            this.avgWeekChange == other.getAvgWeekChange() &&
            this.avgWeekVolume == other.getAvgWeekVolume() &&
            this.weekVolume == other.getWeekVolume() &&
            this.monthHigh == other.getMonthHigh() &&
            this.monthLow == other.getMonthLow() &&
            this.monthChange == other.getMonthChange() &&
            this.avgMonthChange == other.getAvgMonthChange() &&
            this.avgMonthVolume == other.getAvgMonthVolume() &&
            this.monthVolume == other.getMonthVolume() &&
            this.yearHigh == other.getYearHigh() &&
            this.yearLow == other.getYearLow() &&
            this.yearChange == other.getYearChange() &&
            this.avgYearChange == other.getAvgYearChange() &&
            this.avgYearVolume == other.getAvgYearVolume() &&
            this.YTDChange == other.getYTDChange() &&
            this.RSI14 == other.getRSI14() &&
            this.STO9 == other.getSTO9() &&
            this.WPR14 == other.getWPR14() &&
            this.MTM14 == other.getMTM14() &&
            this.ROC14 == other.getROC14() &&
            this.PTC == other.getPTC() &&
            this.SAR == other.getSAR() &&
            this.volatility == other.getVolatility() &&
            this.liquidity == other.getLiquidity();
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
        _hashCode += new Double(getPrevious()).hashCode();
        _hashCode += new Double(getChange()).hashCode();
        _hashCode += getMA1();
        _hashCode += getMA2();
        _hashCode += getMA5();
        _hashCode += getMA20();
        _hashCode += getMA50();
        _hashCode += getMA100();
        _hashCode += getMA200();
        _hashCode += new Double(getMAPercent()).hashCode();
        _hashCode += new Double(getMAReturn()).hashCode();
        _hashCode += new Long(getVolumeChange()).hashCode();
        _hashCode += new Double(getThreeMonthChange()).hashCode();
        _hashCode += new Double(getSixMonthChange()).hashCode();
        _hashCode += new Double(getWeekHigh()).hashCode();
        _hashCode += new Double(getWeekLow()).hashCode();
        _hashCode += new Double(getWeekChange()).hashCode();
        _hashCode += new Double(getAvgWeekChange()).hashCode();
        _hashCode += new Double(getAvgWeekVolume()).hashCode();
        _hashCode += new Double(getWeekVolume()).hashCode();
        _hashCode += new Double(getMonthHigh()).hashCode();
        _hashCode += new Double(getMonthLow()).hashCode();
        _hashCode += new Double(getMonthChange()).hashCode();
        _hashCode += new Double(getAvgMonthChange()).hashCode();
        _hashCode += new Double(getAvgMonthVolume()).hashCode();
        _hashCode += new Double(getMonthVolume()).hashCode();
        _hashCode += new Double(getYearHigh()).hashCode();
        _hashCode += new Double(getYearLow()).hashCode();
        _hashCode += new Double(getYearChange()).hashCode();
        _hashCode += new Double(getAvgYearChange()).hashCode();
        _hashCode += new Double(getAvgYearVolume()).hashCode();
        _hashCode += new Double(getYTDChange()).hashCode();
        _hashCode += new Double(getRSI14()).hashCode();
        _hashCode += new Double(getSTO9()).hashCode();
        _hashCode += new Double(getWPR14()).hashCode();
        _hashCode += new Double(getMTM14()).hashCode();
        _hashCode += new Double(getROC14()).hashCode();
        _hashCode += new Long(getPTC()).hashCode();
        _hashCode += new Double(getSAR()).hashCode();
        _hashCode += new Double(getVolatility()).hashCode();
        _hashCode += new Double(getLiquidity()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TECHNICAL.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "TECHNICAL"));
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
        attrField.setFieldName("MA1");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MA1"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("MA2");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MA2"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("MA5");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MA5"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("MA20");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MA20"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("MA50");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MA50"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("MA100");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MA100"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("MA200");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MA200"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("MAPercent");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MAPercent"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("MAReturn");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MAReturn"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("volumeChange");
        attrField.setXmlName(new javax.xml.namespace.QName("", "VolumeChange"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("threeMonthChange");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ThreeMonthChange"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("sixMonthChange");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SixMonthChange"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("weekHigh");
        attrField.setXmlName(new javax.xml.namespace.QName("", "WeekHigh"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("weekLow");
        attrField.setXmlName(new javax.xml.namespace.QName("", "WeekLow"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("weekChange");
        attrField.setXmlName(new javax.xml.namespace.QName("", "WeekChange"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("avgWeekChange");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AvgWeekChange"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("avgWeekVolume");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AvgWeekVolume"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("weekVolume");
        attrField.setXmlName(new javax.xml.namespace.QName("", "WeekVolume"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("monthHigh");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MonthHigh"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("monthLow");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MonthLow"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("monthChange");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MonthChange"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("avgMonthChange");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AvgMonthChange"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("avgMonthVolume");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AvgMonthVolume"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("monthVolume");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MonthVolume"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("yearHigh");
        attrField.setXmlName(new javax.xml.namespace.QName("", "YearHigh"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("yearLow");
        attrField.setXmlName(new javax.xml.namespace.QName("", "YearLow"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("yearChange");
        attrField.setXmlName(new javax.xml.namespace.QName("", "YearChange"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("avgYearChange");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AvgYearChange"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("avgYearVolume");
        attrField.setXmlName(new javax.xml.namespace.QName("", "AvgYearVolume"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("YTDChange");
        attrField.setXmlName(new javax.xml.namespace.QName("", "YTDChange"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("RSI14");
        attrField.setXmlName(new javax.xml.namespace.QName("", "RSI14"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("STO9");
        attrField.setXmlName(new javax.xml.namespace.QName("", "STO9"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("WPR14");
        attrField.setXmlName(new javax.xml.namespace.QName("", "WPR14"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("MTM14");
        attrField.setXmlName(new javax.xml.namespace.QName("", "MTM14"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("ROC14");
        attrField.setXmlName(new javax.xml.namespace.QName("", "ROC14"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("PTC");
        attrField.setXmlName(new javax.xml.namespace.QName("", "PTC"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("SAR");
        attrField.setXmlName(new javax.xml.namespace.QName("", "SAR"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("volatility");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Volatility"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("liquidity");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Liquidity"));
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
