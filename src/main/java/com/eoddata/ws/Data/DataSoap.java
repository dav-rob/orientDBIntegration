/**
 * DataSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.eoddata.ws.Data;

public interface DataSoap extends java.rmi.Remote {

    /**
     * Login to EODData Financial Information Web Service. Used for
     * Web Authentication.<br/>INPUT: Username, Password<br/>OUTPUT: Login
     * Token
     */
    public com.eoddata.ws.Data.LOGINRESPONSE login(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException;

    /**
     * Login to EODData Financial Information Web Service. Used for
     * Application Authentication.<br/>INPUT: Username, Password, Version
     * (Application Version)<br/>OUTPUT: Login Token
     */
    public com.eoddata.ws.Data.LOGINRESPONSE login2(java.lang.String username, java.lang.String password, java.lang.String version) throws java.rmi.RemoteException;

    /**
     * Returns membership of user.<br/>INPUT: Token (Login Token)<br/>OUTPUT:
     * Membership
     */
    public com.eoddata.ws.Data.RESPONSE membership(java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Returns a list of available exchanges.<br/>INPUT: Token (Login
     * Token)<br/>OUTPUT: List of exchanges
     */
    public com.eoddata.ws.Data.RESPONSE exchangeList(java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Returns detailed information of a specific exchange.<br/>INPUT:
     * Token (Login Token), Exchange (eg: NASDAQ)<br/>OUTPUT: Exchange
     */
    public com.eoddata.ws.Data.RESPONSE exchangeGet(java.lang.String token, java.lang.String exchange) throws java.rmi.RemoteException;

    /**
     * Returns a list of symbols of a specified exchange. <br/>INPUT:
     * Token (Login Token), Exchange (eg: NASDAQ)<br/>OUTPUT: List of symbols
     */
    public com.eoddata.ws.Data.RESPONSE symbolList(java.lang.String token, java.lang.String exchange) throws java.rmi.RemoteException;

    /**
     * Returns a list of symbols of a specified exchange. <br/>INPUT:
     * Token (Login Token), Exchange (eg: NASDAQ)<br/>OUTPUT: List of symbols
     */
    public com.eoddata.ws.Data.RESPONSE symbolList2(java.lang.String token, java.lang.String exchange) throws java.rmi.RemoteException;

    /**
     * Returns an end of day quote for a specific symbol.<br/>INPUT:
     * Token (Login Token), Exchange (eg: NASDAQ), Symbol (eg:MSFT)<br/>OUTPUT:
     * End of day quote
     */
    public com.eoddata.ws.Data.RESPONSE quoteGet(java.lang.String token, java.lang.String exchange, java.lang.String symbol) throws java.rmi.RemoteException;

    /**
     * Returns end of day quotes for a list of symbols of a specific
     * exchange.<br/>INPUT: Token (Login Token), Exchange (eg: NASDAQ), Symbols
     * (eg:MSFT,INTC)<br/>OUTPUT: List of end of day quotes
     */
    public com.eoddata.ws.Data.RESPONSE quoteList2(java.lang.String token, java.lang.String exchange, java.lang.String symbols) throws java.rmi.RemoteException;

    /**
     * Returns detailed information of a specific symbol.<br/>INPUT:
     * Token (Login Token), Exchange (eg: NASDAQ), Symbol (eg:MSFT)<br/>OUTPUT:
     * Symbol
     */
    public com.eoddata.ws.Data.RESPONSE symbolGet(java.lang.String token, java.lang.String exchange, java.lang.String symbol) throws java.rmi.RemoteException;

    /**
     * Returns a complete list of end of day quotes for an entire
     * exchange.<br/>INPUT: Token (Login Token), Exchange (eg: NASDAQ)<br/>OUTPUT:
     * List of end of day quotes
     */
    public com.eoddata.ws.Data.RESPONSE quoteList(java.lang.String token, java.lang.String exchange) throws java.rmi.RemoteException;

    /**
     * Returns a complete list of fundamental data for an entire exchange.<br/>INPUT:
     * Token (Login Token), Exchange (eg: NASDAQ)<br/>OUTPUT: List of fundamentals
     */
    public com.eoddata.ws.Data.RESPONSE fundamentalList(java.lang.String token, java.lang.String exchange) throws java.rmi.RemoteException;

    /**
     * Returns a complete list of technical data for an entire exchange.
     * <br/>INPUT: Token (Login Token), Exchange (eg: NASDAQ)<br/>OUTPUT:
     * List of quotes
     */
    public com.eoddata.ws.Data.RESPONSE technicalList(java.lang.String token, java.lang.String exchange) throws java.rmi.RemoteException;

    /**
     * Returns a complete list of end of day quotes for an entire
     * exchange and a specific date.<br/>INPUT: Token (Login Token), Exchange
     * (eg: NASDAQ), QuoteDate (format:yyyyMMdd eg:20080225)<br/>OUTPUT:
     * List of end of day quotes
     */
    public com.eoddata.ws.Data.RESPONSE quoteListByDate(java.lang.String token, java.lang.String exchange, java.lang.String quoteDate) throws java.rmi.RemoteException;

    /**
     * Returns a complete list of end of day quotes for an entire
     * exchange and a specific date.<br/>INPUT: Token (Login Token), Exchange
     * (eg: NASDAQ), QuoteDate (format:yyyyMMdd eg:20080225)<br/>OUTPUT:
     * List of end of day quotes
     */
    public com.eoddata.ws.Data.RESPONSE quoteListByDate2(java.lang.String token, java.lang.String exchange, java.lang.String quoteDate) throws java.rmi.RemoteException;

    /**
     * Returns a list of historical end of day data of a specified
     * symbol and specified start date up to today's date.<br/>INPUT: Token
     * (Login Token), Exchange (eg: NASDAQ), Symbol (eg:MSFT), StartDate
     * (format:yyyyMMdd eg:20080225)<br/>OUTPUT: List of historical end of
     * day quotes
     */
    public com.eoddata.ws.Data.RESPONSE symbolHistory(java.lang.String token, java.lang.String exchange, java.lang.String symbol, java.lang.String startDate) throws java.rmi.RemoteException;

    /**
     * Returns a list of the Top 10 Gains of a specified exchange.
     * <br/>INPUT: Token (Login Token), Exchange (eg: NASDAQ)<br/>OUTPUT:
     * List of quotes
     */
    public com.eoddata.ws.Data.RESPONSE top10Gains(java.lang.String token, java.lang.String exchange) throws java.rmi.RemoteException;

    /**
     * Returns a list of the Top 10 Losses of a specified exchange.
     * <br/>INPUT: Token (Login Token), Exchange (eg: NASDAQ)<br/>OUTPUT:
     * List of quotes
     */
    public com.eoddata.ws.Data.RESPONSE top10Losses(java.lang.String token, java.lang.String exchange) throws java.rmi.RemoteException;

    /**
     * Returns a URL to a chart image of a specific symbol.<br/>INPUT:
     * Token (Login Token), Exchange (eg: NASDAQ), Symbol (eg:MSFT)<br/>OUTPUT:
     * Chart URL
     */
    public com.eoddata.ws.Data.RESPONSE symbolChart(java.lang.String token, java.lang.String exchange, java.lang.String symbol) throws java.rmi.RemoteException;

    /**
     * Returns the number of Months history a user is allowed to download.<br/>INPUT:
     * Token (Login Token), Exchange (eg: NASDAQ)<br/>OUTPUT: Number of Months
     */
    public com.eoddata.ws.Data.RESPONSE exchangeMonths(java.lang.String token, java.lang.String exchange) throws java.rmi.RemoteException;

    /**
     * Returns a list of Splits of a specific exchange.<br/>INPUT:
     * Token (Login Token), Exchange (eg: NASDAQ)<br/>OUTPUT: List of splits
     */
    public com.eoddata.ws.Data.RESPONSE splitListByExchange(java.lang.String token, java.lang.String exchange) throws java.rmi.RemoteException;

    /**
     * Returns a list of Splits of a specific symbol.<br/>INPUT: Token
     * (Login Token), Exchange (eg: NASDAQ), Symbol (eg:MSFT)<br/>OUTPUT:
     * List of splits
     */
    public com.eoddata.ws.Data.RESPONSE splitListBySymbol(java.lang.String token, java.lang.String exchange, java.lang.String symbol) throws java.rmi.RemoteException;

    /**
     * Returns a list of available countries.<br/>INPUT: Token (Login
     * Token)<br/>OUTPUT: List of countries
     */
    public com.eoddata.ws.Data.RESPONSE countryList(java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Returns a list of historical data of a specified symbol, specified
     * date and specified period.<br/>INPUT: Token (Login Token), Exchange
     * (eg: NASDAQ), Symbol (eg:MSFT), Date (format:yyyyMMdd eg:20080225),
     * Period (1, 5, 10, 15, 30, h, d, w, m)<br/>OUTPUT: List of historical
     * quotes
     */
    public com.eoddata.ws.Data.RESPONSE symbolHistoryPeriod(java.lang.String token, java.lang.String exchange, java.lang.String symbol, java.lang.String date, java.lang.String period) throws java.rmi.RemoteException;

    /**
     * Returns a list of historical data of a specified symbol, specified
     * date range and specified period.<br/>INPUT: Token (Login Token), Exchange
     * (eg: NASDAQ), Symbol (eg:MSFT), StartDate (format:yyyyMMdd eg:20080225),
     * EndDate (format:yyyyMMdd eg:20080225), Period (1, 5, 10, 15, 30, h,
     * d, w, m)<br/>OUTPUT: List of historical quotes
     */
    public com.eoddata.ws.Data.RESPONSE symbolHistoryPeriodByDateRange(java.lang.String token, java.lang.String exchange, java.lang.String symbol, java.lang.String startDate, java.lang.String endDate, java.lang.String period) throws java.rmi.RemoteException;

    /**
     * Returns a complete list of end of day quotes for an entire
     * exchange, specific date, and specific period.<br/>INPUT: Token (Login
     * Token), Exchange (eg: NASDAQ), QuoteDate (format:yyyyMMdd eg:20080225),
     * Period (1, 5, 10, 15, 30, h, d, w, m)<br/>OUTPUT: List of quotes
     */
    public com.eoddata.ws.Data.RESPONSE quoteListByDatePeriod(java.lang.String token, java.lang.String exchange, java.lang.String quoteDate, java.lang.String period) throws java.rmi.RemoteException;

    /**
     * Returns a complete list of end of day quotes for an entire
     * exchange, specific date, and specific period.<br/>INPUT: Token (Login
     * Token), Exchange (eg: NASDAQ), QuoteDate (format:yyyyMMdd eg:20080225),
     * Period (1, 5, 10, 15, 30, h, d, w, m)<br/>OUTPUT: List of quotes
     */
    public com.eoddata.ws.Data.RESPONSE quoteListByDatePeriod2(java.lang.String token, java.lang.String exchange, java.lang.String quoteDate, java.lang.String period) throws java.rmi.RemoteException;

    /**
     * Returns a list of symbol changes of a given exchange. <br/>INPUT:
     * Token (Login Token), Exchange (eg: NASDAQ)<br/>OUTPUT: List of symbol
     * changes
     */
    public com.eoddata.ws.Data.RESPONSE symbolChangesByExchange(java.lang.String token, java.lang.String exchange) throws java.rmi.RemoteException;

    /**
     * Returns the latest version information of Data Client.<br/>INPUT:
     * Token (Login Token)<br/>OUTPUT: Date Client Version
     */
    public com.eoddata.ws.Data.RESPONSE dataClientLatestVersion(java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Returns the list of data formats.<br/>INPUT: Token (Login Token)<br/>OUTPUT:
     * List of DataFormats
     */
    public com.eoddata.ws.Data.RESPONSE dataFormats(java.lang.String token) throws java.rmi.RemoteException;

    /**
     * Update preferred Data Format<br/>INPUT: Token (Login Token),
     * IncludeHeader, IncludeSuffix<br/>OUTPUT: List of DataFormats
     */
    public com.eoddata.ws.Data.RESPONSE updateDataFormat(java.lang.String token, java.lang.String dataFormat, boolean includeHeader, boolean includeSuffix) throws java.rmi.RemoteException;

    /**
     * Validate access for an entire exchange, specific date, and
     * specific period.<br/>INPUT: Token (Login Token), Exchange (eg: NASDAQ),
     * QuoteDate (format:yyyyMMdd eg:20080225), Period (1, 5, 10, 15, 30,
     * h, d, w, m)<br/>OUTPUT: RESPONSE
     */
    public com.eoddata.ws.Data.RESPONSE validateAccess(java.lang.String token, java.lang.String exchange, java.lang.String quoteDate, java.lang.String period) throws java.rmi.RemoteException;
}
