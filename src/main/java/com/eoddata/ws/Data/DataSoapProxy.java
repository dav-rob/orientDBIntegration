package com.eoddata.ws.Data;

public class DataSoapProxy implements com.eoddata.ws.Data.DataSoap {
  private String _endpoint = null;
  private com.eoddata.ws.Data.DataSoap dataSoap = null;
  
  public DataSoapProxy() {
    _initDataSoapProxy();
  }
  
  public DataSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initDataSoapProxy();
  }
  
  private void _initDataSoapProxy() {
    try {
      dataSoap = (new com.eoddata.ws.Data.DataLocator()).getDataSoap();
      if (dataSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)dataSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)dataSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (dataSoap != null)
      ((javax.xml.rpc.Stub)dataSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.eoddata.ws.Data.DataSoap getDataSoap() {
    if (dataSoap == null)
      _initDataSoapProxy();
    return dataSoap;
  }
  
  public com.eoddata.ws.Data.LOGINRESPONSE login(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException{
    if (dataSoap == null)
      _initDataSoapProxy();
    return dataSoap.login(username, password);
  }
  
  public com.eoddata.ws.Data.LOGINRESPONSE login2(java.lang.String username, java.lang.String password, java.lang.String version) throws java.rmi.RemoteException{
    if (dataSoap == null)
      _initDataSoapProxy();
    return dataSoap.login2(username, password, version);
  }
  
  public com.eoddata.ws.Data.RESPONSE membership(java.lang.String token) throws java.rmi.RemoteException{
    if (dataSoap == null)
      _initDataSoapProxy();
    return dataSoap.membership(token);
  }
  
  public com.eoddata.ws.Data.RESPONSE exchangeList(java.lang.String token) throws java.rmi.RemoteException{
    if (dataSoap == null)
      _initDataSoapProxy();
    return dataSoap.exchangeList(token);
  }
  
  public com.eoddata.ws.Data.RESPONSE exchangeGet(java.lang.String token, java.lang.String exchange) throws java.rmi.RemoteException{
    if (dataSoap == null)
      _initDataSoapProxy();
    return dataSoap.exchangeGet(token, exchange);
  }
  
  public com.eoddata.ws.Data.RESPONSE symbolList(java.lang.String token, java.lang.String exchange) throws java.rmi.RemoteException{
    if (dataSoap == null)
      _initDataSoapProxy();
    return dataSoap.symbolList(token, exchange);
  }
  
  public com.eoddata.ws.Data.RESPONSE symbolList2(java.lang.String token, java.lang.String exchange) throws java.rmi.RemoteException{
    if (dataSoap == null)
      _initDataSoapProxy();
    return dataSoap.symbolList2(token, exchange);
  }
  
  public com.eoddata.ws.Data.RESPONSE quoteGet(java.lang.String token, java.lang.String exchange, java.lang.String symbol) throws java.rmi.RemoteException{
    if (dataSoap == null)
      _initDataSoapProxy();
    return dataSoap.quoteGet(token, exchange, symbol);
  }
  
  public com.eoddata.ws.Data.RESPONSE quoteList2(java.lang.String token, java.lang.String exchange, java.lang.String symbols) throws java.rmi.RemoteException{
    if (dataSoap == null)
      _initDataSoapProxy();
    return dataSoap.quoteList2(token, exchange, symbols);
  }
  
  public com.eoddata.ws.Data.RESPONSE symbolGet(java.lang.String token, java.lang.String exchange, java.lang.String symbol) throws java.rmi.RemoteException{
    if (dataSoap == null)
      _initDataSoapProxy();
    return dataSoap.symbolGet(token, exchange, symbol);
  }
  
  public com.eoddata.ws.Data.RESPONSE quoteList(java.lang.String token, java.lang.String exchange) throws java.rmi.RemoteException{
    if (dataSoap == null)
      _initDataSoapProxy();
    return dataSoap.quoteList(token, exchange);
  }
  
  public com.eoddata.ws.Data.RESPONSE fundamentalList(java.lang.String token, java.lang.String exchange) throws java.rmi.RemoteException{
    if (dataSoap == null)
      _initDataSoapProxy();
    return dataSoap.fundamentalList(token, exchange);
  }
  
  public com.eoddata.ws.Data.RESPONSE technicalList(java.lang.String token, java.lang.String exchange) throws java.rmi.RemoteException{
    if (dataSoap == null)
      _initDataSoapProxy();
    return dataSoap.technicalList(token, exchange);
  }
  
  public com.eoddata.ws.Data.RESPONSE quoteListByDate(java.lang.String token, java.lang.String exchange, java.lang.String quoteDate) throws java.rmi.RemoteException{
    if (dataSoap == null)
      _initDataSoapProxy();
    return dataSoap.quoteListByDate(token, exchange, quoteDate);
  }
  
  public com.eoddata.ws.Data.RESPONSE quoteListByDate2(java.lang.String token, java.lang.String exchange, java.lang.String quoteDate) throws java.rmi.RemoteException{
    if (dataSoap == null)
      _initDataSoapProxy();
    return dataSoap.quoteListByDate2(token, exchange, quoteDate);
  }
  
  public com.eoddata.ws.Data.RESPONSE symbolHistory(java.lang.String token, java.lang.String exchange, java.lang.String symbol, java.lang.String startDate) throws java.rmi.RemoteException{
    if (dataSoap == null)
      _initDataSoapProxy();
    return dataSoap.symbolHistory(token, exchange, symbol, startDate);
  }
  
  public com.eoddata.ws.Data.RESPONSE top10Gains(java.lang.String token, java.lang.String exchange) throws java.rmi.RemoteException{
    if (dataSoap == null)
      _initDataSoapProxy();
    return dataSoap.top10Gains(token, exchange);
  }
  
  public com.eoddata.ws.Data.RESPONSE top10Losses(java.lang.String token, java.lang.String exchange) throws java.rmi.RemoteException{
    if (dataSoap == null)
      _initDataSoapProxy();
    return dataSoap.top10Losses(token, exchange);
  }
  
  public com.eoddata.ws.Data.RESPONSE symbolChart(java.lang.String token, java.lang.String exchange, java.lang.String symbol) throws java.rmi.RemoteException{
    if (dataSoap == null)
      _initDataSoapProxy();
    return dataSoap.symbolChart(token, exchange, symbol);
  }
  
  public com.eoddata.ws.Data.RESPONSE exchangeMonths(java.lang.String token, java.lang.String exchange) throws java.rmi.RemoteException{
    if (dataSoap == null)
      _initDataSoapProxy();
    return dataSoap.exchangeMonths(token, exchange);
  }
  
  public com.eoddata.ws.Data.RESPONSE splitListByExchange(java.lang.String token, java.lang.String exchange) throws java.rmi.RemoteException{
    if (dataSoap == null)
      _initDataSoapProxy();
    return dataSoap.splitListByExchange(token, exchange);
  }
  
  public com.eoddata.ws.Data.RESPONSE splitListBySymbol(java.lang.String token, java.lang.String exchange, java.lang.String symbol) throws java.rmi.RemoteException{
    if (dataSoap == null)
      _initDataSoapProxy();
    return dataSoap.splitListBySymbol(token, exchange, symbol);
  }
  
  public com.eoddata.ws.Data.RESPONSE countryList(java.lang.String token) throws java.rmi.RemoteException{
    if (dataSoap == null)
      _initDataSoapProxy();
    return dataSoap.countryList(token);
  }
  
  public com.eoddata.ws.Data.RESPONSE symbolHistoryPeriod(java.lang.String token, java.lang.String exchange, java.lang.String symbol, java.lang.String date, java.lang.String period) throws java.rmi.RemoteException{
    if (dataSoap == null)
      _initDataSoapProxy();
    return dataSoap.symbolHistoryPeriod(token, exchange, symbol, date, period);
  }
  
  public com.eoddata.ws.Data.RESPONSE symbolHistoryPeriodByDateRange(java.lang.String token, java.lang.String exchange, java.lang.String symbol, java.lang.String startDate, java.lang.String endDate, java.lang.String period) throws java.rmi.RemoteException{
    if (dataSoap == null)
      _initDataSoapProxy();
    return dataSoap.symbolHistoryPeriodByDateRange(token, exchange, symbol, startDate, endDate, period);
  }
  
  public com.eoddata.ws.Data.RESPONSE quoteListByDatePeriod(java.lang.String token, java.lang.String exchange, java.lang.String quoteDate, java.lang.String period) throws java.rmi.RemoteException{
    if (dataSoap == null)
      _initDataSoapProxy();
    return dataSoap.quoteListByDatePeriod(token, exchange, quoteDate, period);
  }
  
  public com.eoddata.ws.Data.RESPONSE quoteListByDatePeriod2(java.lang.String token, java.lang.String exchange, java.lang.String quoteDate, java.lang.String period) throws java.rmi.RemoteException{
    if (dataSoap == null)
      _initDataSoapProxy();
    return dataSoap.quoteListByDatePeriod2(token, exchange, quoteDate, period);
  }
  
  public com.eoddata.ws.Data.RESPONSE symbolChangesByExchange(java.lang.String token, java.lang.String exchange) throws java.rmi.RemoteException{
    if (dataSoap == null)
      _initDataSoapProxy();
    return dataSoap.symbolChangesByExchange(token, exchange);
  }
  
  public com.eoddata.ws.Data.RESPONSE dataClientLatestVersion(java.lang.String token) throws java.rmi.RemoteException{
    if (dataSoap == null)
      _initDataSoapProxy();
    return dataSoap.dataClientLatestVersion(token);
  }
  
  public com.eoddata.ws.Data.RESPONSE dataFormats(java.lang.String token) throws java.rmi.RemoteException{
    if (dataSoap == null)
      _initDataSoapProxy();
    return dataSoap.dataFormats(token);
  }
  
  public com.eoddata.ws.Data.RESPONSE updateDataFormat(java.lang.String token, java.lang.String dataFormat, boolean includeHeader, boolean includeSuffix) throws java.rmi.RemoteException{
    if (dataSoap == null)
      _initDataSoapProxy();
    return dataSoap.updateDataFormat(token, dataFormat, includeHeader, includeSuffix);
  }
  
  public com.eoddata.ws.Data.RESPONSE validateAccess(java.lang.String token, java.lang.String exchange, java.lang.String quoteDate, java.lang.String period) throws java.rmi.RemoteException{
    if (dataSoap == null)
      _initDataSoapProxy();
    return dataSoap.validateAccess(token, exchange, quoteDate, period);
  }
  
  
}