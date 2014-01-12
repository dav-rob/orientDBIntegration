/**
 * DataSoapStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.eoddata.ws.Data;

public class DataSoapStub extends org.apache.axis.client.Stub implements com.eoddata.ws.Data.DataSoap {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[32];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Login");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "LOGINRESPONSE"));
        oper.setReturnClass(com.eoddata.ws.Data.LOGINRESPONSE.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "LoginResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Login2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Version"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "LOGINRESPONSE"));
        oper.setReturnClass(com.eoddata.ws.Data.LOGINRESPONSE.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Login2Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Membership");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "RESPONSE"));
        oper.setReturnClass(com.eoddata.ws.Data.RESPONSE.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "MembershipResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ExchangeList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "RESPONSE"));
        oper.setReturnClass(com.eoddata.ws.Data.RESPONSE.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "ExchangeListResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ExchangeGet");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Exchange"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "RESPONSE"));
        oper.setReturnClass(com.eoddata.ws.Data.RESPONSE.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "ExchangeGetResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SymbolList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Exchange"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "RESPONSE"));
        oper.setReturnClass(com.eoddata.ws.Data.RESPONSE.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "SymbolListResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SymbolList2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Exchange"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "RESPONSE"));
        oper.setReturnClass(com.eoddata.ws.Data.RESPONSE.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "SymbolList2Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QuoteGet");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Exchange"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Symbol"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "RESPONSE"));
        oper.setReturnClass(com.eoddata.ws.Data.RESPONSE.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "QuoteGetResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QuoteList2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Exchange"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Symbols"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "RESPONSE"));
        oper.setReturnClass(com.eoddata.ws.Data.RESPONSE.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "QuoteList2Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SymbolGet");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Exchange"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Symbol"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "RESPONSE"));
        oper.setReturnClass(com.eoddata.ws.Data.RESPONSE.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "SymbolGetResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QuoteList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Exchange"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "RESPONSE"));
        oper.setReturnClass(com.eoddata.ws.Data.RESPONSE.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "QuoteListResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("FundamentalList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Exchange"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "RESPONSE"));
        oper.setReturnClass(com.eoddata.ws.Data.RESPONSE.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "FundamentalListResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TechnicalList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Exchange"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "RESPONSE"));
        oper.setReturnClass(com.eoddata.ws.Data.RESPONSE.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "TechnicalListResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QuoteListByDate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Exchange"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "QuoteDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "RESPONSE"));
        oper.setReturnClass(com.eoddata.ws.Data.RESPONSE.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "QuoteListByDateResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QuoteListByDate2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Exchange"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "QuoteDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "RESPONSE"));
        oper.setReturnClass(com.eoddata.ws.Data.RESPONSE.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "QuoteListByDate2Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SymbolHistory");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Exchange"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Symbol"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "StartDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "RESPONSE"));
        oper.setReturnClass(com.eoddata.ws.Data.RESPONSE.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "SymbolHistoryResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Top10Gains");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Exchange"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "RESPONSE"));
        oper.setReturnClass(com.eoddata.ws.Data.RESPONSE.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Top10GainsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Top10Losses");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Exchange"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "RESPONSE"));
        oper.setReturnClass(com.eoddata.ws.Data.RESPONSE.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Top10LossesResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SymbolChart");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Exchange"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Symbol"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "RESPONSE"));
        oper.setReturnClass(com.eoddata.ws.Data.RESPONSE.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "SymbolChartResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ExchangeMonths");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Exchange"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "RESPONSE"));
        oper.setReturnClass(com.eoddata.ws.Data.RESPONSE.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "ExchangeMonthsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SplitListByExchange");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Exchange"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "RESPONSE"));
        oper.setReturnClass(com.eoddata.ws.Data.RESPONSE.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "SplitListByExchangeResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SplitListBySymbol");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Exchange"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Symbol"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "RESPONSE"));
        oper.setReturnClass(com.eoddata.ws.Data.RESPONSE.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "SplitListBySymbolResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CountryList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "RESPONSE"));
        oper.setReturnClass(com.eoddata.ws.Data.RESPONSE.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "CountryListResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SymbolHistoryPeriod");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Exchange"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Symbol"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Date"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Period"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "RESPONSE"));
        oper.setReturnClass(com.eoddata.ws.Data.RESPONSE.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "SymbolHistoryPeriodResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SymbolHistoryPeriodByDateRange");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Exchange"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Symbol"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "StartDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "EndDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Period"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "RESPONSE"));
        oper.setReturnClass(com.eoddata.ws.Data.RESPONSE.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "SymbolHistoryPeriodByDateRangeResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QuoteListByDatePeriod");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Exchange"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "QuoteDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Period"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "RESPONSE"));
        oper.setReturnClass(com.eoddata.ws.Data.RESPONSE.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "QuoteListByDatePeriodResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QuoteListByDatePeriod2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Exchange"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "QuoteDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Period"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "RESPONSE"));
        oper.setReturnClass(com.eoddata.ws.Data.RESPONSE.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "QuoteListByDatePeriod2Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SymbolChangesByExchange");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Exchange"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "RESPONSE"));
        oper.setReturnClass(com.eoddata.ws.Data.RESPONSE.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "SymbolChangesByExchangeResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DataClientLatestVersion");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "RESPONSE"));
        oper.setReturnClass(com.eoddata.ws.Data.RESPONSE.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "DataClientLatestVersionResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DataFormats");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "RESPONSE"));
        oper.setReturnClass(com.eoddata.ws.Data.RESPONSE.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "DataFormatsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateDataFormat");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "DataFormat"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "IncludeHeader"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "IncludeSuffix"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "RESPONSE"));
        oper.setReturnClass(com.eoddata.ws.Data.RESPONSE.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "UpdateDataFormatResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ValidateAccess");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Exchange"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "QuoteDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Period"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "RESPONSE"));
        oper.setReturnClass(com.eoddata.ws.Data.RESPONSE.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "ValidateAccessResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[31] = oper;

    }

    public DataSoapStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public DataSoapStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public DataSoapStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "ArrayOfCountryBase");
            cachedSerQNames.add(qName);
            cls = com.eoddata.ws.Data.CountryBase[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "CountryBase");
            qName2 = new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "CountryBase");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "ArrayOfDATAFORMAT");
            cachedSerQNames.add(qName);
            cls = com.eoddata.ws.Data.DATAFORMAT[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "DATAFORMAT");
            qName2 = new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "DATAFORMAT");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "ArrayOfDATAFORMAT_COLUMN");
            cachedSerQNames.add(qName);
            cls = com.eoddata.ws.Data.DATAFORMAT_COLUMN[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "DATAFORMAT_COLUMN");
            qName2 = new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "DATAFORMAT_COLUMN");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "ArrayOfEXCHANGE");
            cachedSerQNames.add(qName);
            cls = com.eoddata.ws.Data.EXCHANGE[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "EXCHANGE");
            qName2 = new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "EXCHANGE");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "ArrayOfFUNDAMENTAL");
            cachedSerQNames.add(qName);
            cls = com.eoddata.ws.Data.FUNDAMENTAL[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "FUNDAMENTAL");
            qName2 = new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "FUNDAMENTAL");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "ArrayOfQUOTE");
            cachedSerQNames.add(qName);
            cls = com.eoddata.ws.Data.QUOTE[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "QUOTE");
            qName2 = new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "QUOTE");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "ArrayOfQUOTE2");
            cachedSerQNames.add(qName);
            cls = com.eoddata.ws.Data.QUOTE2[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "QUOTE2");
            qName2 = new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "QUOTE2");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "ArrayOfSPLIT");
            cachedSerQNames.add(qName);
            cls = com.eoddata.ws.Data.SPLIT[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "SPLIT");
            qName2 = new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "SPLIT");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "ArrayOfSYMBOL");
            cachedSerQNames.add(qName);
            cls = com.eoddata.ws.Data.SYMBOL[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "SYMBOL");
            qName2 = new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "SYMBOL");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "ArrayOfSYMBOL2");
            cachedSerQNames.add(qName);
            cls = com.eoddata.ws.Data.SYMBOL2[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "SYMBOL2");
            qName2 = new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "SYMBOL2");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "ArrayOfSYMBOLCHANGE");
            cachedSerQNames.add(qName);
            cls = com.eoddata.ws.Data.SYMBOLCHANGE[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "SYMBOLCHANGE");
            qName2 = new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "SYMBOLCHANGE");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "ArrayOfTECHNICAL");
            cachedSerQNames.add(qName);
            cls = com.eoddata.ws.Data.TECHNICAL[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "TECHNICAL");
            qName2 = new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "TECHNICAL");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "CountryBase");
            cachedSerQNames.add(qName);
            cls = com.eoddata.ws.Data.CountryBase.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "DATAFORMAT");
            cachedSerQNames.add(qName);
            cls = com.eoddata.ws.Data.DATAFORMAT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "DATAFORMAT_COLUMN");
            cachedSerQNames.add(qName);
            cls = com.eoddata.ws.Data.DATAFORMAT_COLUMN.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "EXCHANGE");
            cachedSerQNames.add(qName);
            cls = com.eoddata.ws.Data.EXCHANGE.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "FUNDAMENTAL");
            cachedSerQNames.add(qName);
            cls = com.eoddata.ws.Data.FUNDAMENTAL.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "LOGINRESPONSE");
            cachedSerQNames.add(qName);
            cls = com.eoddata.ws.Data.LOGINRESPONSE.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "QUOTE");
            cachedSerQNames.add(qName);
            cls = com.eoddata.ws.Data.QUOTE.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "QUOTE2");
            cachedSerQNames.add(qName);
            cls = com.eoddata.ws.Data.QUOTE2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "RESPONSE");
            cachedSerQNames.add(qName);
            cls = com.eoddata.ws.Data.RESPONSE.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "SPLIT");
            cachedSerQNames.add(qName);
            cls = com.eoddata.ws.Data.SPLIT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "SYMBOL");
            cachedSerQNames.add(qName);
            cls = com.eoddata.ws.Data.SYMBOL.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "SYMBOL2");
            cachedSerQNames.add(qName);
            cls = com.eoddata.ws.Data.SYMBOL2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "SYMBOLCHANGE");
            cachedSerQNames.add(qName);
            cls = com.eoddata.ws.Data.SYMBOLCHANGE.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "TECHNICAL");
            cachedSerQNames.add(qName);
            cls = com.eoddata.ws.Data.TECHNICAL.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.eoddata.ws.Data.LOGINRESPONSE login(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://ws.eoddata.com/Data/Login");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Login"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {username, password});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.eoddata.ws.Data.LOGINRESPONSE) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.eoddata.ws.Data.LOGINRESPONSE) org.apache.axis.utils.JavaUtils.convert(_resp, com.eoddata.ws.Data.LOGINRESPONSE.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.eoddata.ws.Data.LOGINRESPONSE login2(java.lang.String username, java.lang.String password, java.lang.String version) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://ws.eoddata.com/Data/Login2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Login2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {username, password, version});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.eoddata.ws.Data.LOGINRESPONSE) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.eoddata.ws.Data.LOGINRESPONSE) org.apache.axis.utils.JavaUtils.convert(_resp, com.eoddata.ws.Data.LOGINRESPONSE.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.eoddata.ws.Data.RESPONSE membership(java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://ws.eoddata.com/Data/Membership");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Membership"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.eoddata.ws.Data.RESPONSE) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.eoddata.ws.Data.RESPONSE) org.apache.axis.utils.JavaUtils.convert(_resp, com.eoddata.ws.Data.RESPONSE.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.eoddata.ws.Data.RESPONSE exchangeList(java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://ws.eoddata.com/Data/ExchangeList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "ExchangeList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.eoddata.ws.Data.RESPONSE) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.eoddata.ws.Data.RESPONSE) org.apache.axis.utils.JavaUtils.convert(_resp, com.eoddata.ws.Data.RESPONSE.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.eoddata.ws.Data.RESPONSE exchangeGet(java.lang.String token, java.lang.String exchange) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://ws.eoddata.com/Data/ExchangeGet");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "ExchangeGet"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, exchange});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.eoddata.ws.Data.RESPONSE) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.eoddata.ws.Data.RESPONSE) org.apache.axis.utils.JavaUtils.convert(_resp, com.eoddata.ws.Data.RESPONSE.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.eoddata.ws.Data.RESPONSE symbolList(java.lang.String token, java.lang.String exchange) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://ws.eoddata.com/Data/SymbolList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "SymbolList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, exchange});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.eoddata.ws.Data.RESPONSE) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.eoddata.ws.Data.RESPONSE) org.apache.axis.utils.JavaUtils.convert(_resp, com.eoddata.ws.Data.RESPONSE.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.eoddata.ws.Data.RESPONSE symbolList2(java.lang.String token, java.lang.String exchange) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://ws.eoddata.com/Data/SymbolList2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "SymbolList2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, exchange});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.eoddata.ws.Data.RESPONSE) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.eoddata.ws.Data.RESPONSE) org.apache.axis.utils.JavaUtils.convert(_resp, com.eoddata.ws.Data.RESPONSE.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.eoddata.ws.Data.RESPONSE quoteGet(java.lang.String token, java.lang.String exchange, java.lang.String symbol) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://ws.eoddata.com/Data/QuoteGet");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "QuoteGet"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, exchange, symbol});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.eoddata.ws.Data.RESPONSE) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.eoddata.ws.Data.RESPONSE) org.apache.axis.utils.JavaUtils.convert(_resp, com.eoddata.ws.Data.RESPONSE.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.eoddata.ws.Data.RESPONSE quoteList2(java.lang.String token, java.lang.String exchange, java.lang.String symbols) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://ws.eoddata.com/Data/QuoteList2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "QuoteList2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, exchange, symbols});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.eoddata.ws.Data.RESPONSE) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.eoddata.ws.Data.RESPONSE) org.apache.axis.utils.JavaUtils.convert(_resp, com.eoddata.ws.Data.RESPONSE.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.eoddata.ws.Data.RESPONSE symbolGet(java.lang.String token, java.lang.String exchange, java.lang.String symbol) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://ws.eoddata.com/Data/SymbolGet");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "SymbolGet"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, exchange, symbol});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.eoddata.ws.Data.RESPONSE) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.eoddata.ws.Data.RESPONSE) org.apache.axis.utils.JavaUtils.convert(_resp, com.eoddata.ws.Data.RESPONSE.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.eoddata.ws.Data.RESPONSE quoteList(java.lang.String token, java.lang.String exchange) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://ws.eoddata.com/Data/QuoteList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "QuoteList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, exchange});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.eoddata.ws.Data.RESPONSE) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.eoddata.ws.Data.RESPONSE) org.apache.axis.utils.JavaUtils.convert(_resp, com.eoddata.ws.Data.RESPONSE.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.eoddata.ws.Data.RESPONSE fundamentalList(java.lang.String token, java.lang.String exchange) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://ws.eoddata.com/Data/FundamentalList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "FundamentalList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, exchange});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.eoddata.ws.Data.RESPONSE) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.eoddata.ws.Data.RESPONSE) org.apache.axis.utils.JavaUtils.convert(_resp, com.eoddata.ws.Data.RESPONSE.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.eoddata.ws.Data.RESPONSE technicalList(java.lang.String token, java.lang.String exchange) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://ws.eoddata.com/Data/TechnicalList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "TechnicalList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, exchange});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.eoddata.ws.Data.RESPONSE) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.eoddata.ws.Data.RESPONSE) org.apache.axis.utils.JavaUtils.convert(_resp, com.eoddata.ws.Data.RESPONSE.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.eoddata.ws.Data.RESPONSE quoteListByDate(java.lang.String token, java.lang.String exchange, java.lang.String quoteDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://ws.eoddata.com/Data/QuoteListByDate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "QuoteListByDate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, exchange, quoteDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.eoddata.ws.Data.RESPONSE) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.eoddata.ws.Data.RESPONSE) org.apache.axis.utils.JavaUtils.convert(_resp, com.eoddata.ws.Data.RESPONSE.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.eoddata.ws.Data.RESPONSE quoteListByDate2(java.lang.String token, java.lang.String exchange, java.lang.String quoteDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://ws.eoddata.com/Data/QuoteListByDate2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "QuoteListByDate2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, exchange, quoteDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.eoddata.ws.Data.RESPONSE) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.eoddata.ws.Data.RESPONSE) org.apache.axis.utils.JavaUtils.convert(_resp, com.eoddata.ws.Data.RESPONSE.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.eoddata.ws.Data.RESPONSE symbolHistory(java.lang.String token, java.lang.String exchange, java.lang.String symbol, java.lang.String startDate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://ws.eoddata.com/Data/SymbolHistory");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "SymbolHistory"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, exchange, symbol, startDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.eoddata.ws.Data.RESPONSE) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.eoddata.ws.Data.RESPONSE) org.apache.axis.utils.JavaUtils.convert(_resp, com.eoddata.ws.Data.RESPONSE.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.eoddata.ws.Data.RESPONSE top10Gains(java.lang.String token, java.lang.String exchange) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://ws.eoddata.com/Data/Top10Gains");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Top10Gains"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, exchange});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.eoddata.ws.Data.RESPONSE) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.eoddata.ws.Data.RESPONSE) org.apache.axis.utils.JavaUtils.convert(_resp, com.eoddata.ws.Data.RESPONSE.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.eoddata.ws.Data.RESPONSE top10Losses(java.lang.String token, java.lang.String exchange) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://ws.eoddata.com/Data/Top10Losses");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Top10Losses"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, exchange});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.eoddata.ws.Data.RESPONSE) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.eoddata.ws.Data.RESPONSE) org.apache.axis.utils.JavaUtils.convert(_resp, com.eoddata.ws.Data.RESPONSE.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.eoddata.ws.Data.RESPONSE symbolChart(java.lang.String token, java.lang.String exchange, java.lang.String symbol) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://ws.eoddata.com/Data/SymbolChart");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "SymbolChart"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, exchange, symbol});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.eoddata.ws.Data.RESPONSE) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.eoddata.ws.Data.RESPONSE) org.apache.axis.utils.JavaUtils.convert(_resp, com.eoddata.ws.Data.RESPONSE.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.eoddata.ws.Data.RESPONSE exchangeMonths(java.lang.String token, java.lang.String exchange) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://ws.eoddata.com/Data/ExchangeMonths");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "ExchangeMonths"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, exchange});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.eoddata.ws.Data.RESPONSE) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.eoddata.ws.Data.RESPONSE) org.apache.axis.utils.JavaUtils.convert(_resp, com.eoddata.ws.Data.RESPONSE.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.eoddata.ws.Data.RESPONSE splitListByExchange(java.lang.String token, java.lang.String exchange) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://ws.eoddata.com/Data/SplitListByExchange");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "SplitListByExchange"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, exchange});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.eoddata.ws.Data.RESPONSE) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.eoddata.ws.Data.RESPONSE) org.apache.axis.utils.JavaUtils.convert(_resp, com.eoddata.ws.Data.RESPONSE.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.eoddata.ws.Data.RESPONSE splitListBySymbol(java.lang.String token, java.lang.String exchange, java.lang.String symbol) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://ws.eoddata.com/Data/SplitListBySymbol");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "SplitListBySymbol"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, exchange, symbol});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.eoddata.ws.Data.RESPONSE) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.eoddata.ws.Data.RESPONSE) org.apache.axis.utils.JavaUtils.convert(_resp, com.eoddata.ws.Data.RESPONSE.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.eoddata.ws.Data.RESPONSE countryList(java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://ws.eoddata.com/Data/CountryList");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "CountryList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.eoddata.ws.Data.RESPONSE) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.eoddata.ws.Data.RESPONSE) org.apache.axis.utils.JavaUtils.convert(_resp, com.eoddata.ws.Data.RESPONSE.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.eoddata.ws.Data.RESPONSE symbolHistoryPeriod(java.lang.String token, java.lang.String exchange, java.lang.String symbol, java.lang.String date, java.lang.String period) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://ws.eoddata.com/Data/SymbolHistoryPeriod");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "SymbolHistoryPeriod"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, exchange, symbol, date, period});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.eoddata.ws.Data.RESPONSE) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.eoddata.ws.Data.RESPONSE) org.apache.axis.utils.JavaUtils.convert(_resp, com.eoddata.ws.Data.RESPONSE.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.eoddata.ws.Data.RESPONSE symbolHistoryPeriodByDateRange(java.lang.String token, java.lang.String exchange, java.lang.String symbol, java.lang.String startDate, java.lang.String endDate, java.lang.String period) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://ws.eoddata.com/Data/SymbolHistoryPeriodByDateRange");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "SymbolHistoryPeriodByDateRange"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, exchange, symbol, startDate, endDate, period});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.eoddata.ws.Data.RESPONSE) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.eoddata.ws.Data.RESPONSE) org.apache.axis.utils.JavaUtils.convert(_resp, com.eoddata.ws.Data.RESPONSE.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.eoddata.ws.Data.RESPONSE quoteListByDatePeriod(java.lang.String token, java.lang.String exchange, java.lang.String quoteDate, java.lang.String period) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://ws.eoddata.com/Data/QuoteListByDatePeriod");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "QuoteListByDatePeriod"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, exchange, quoteDate, period});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.eoddata.ws.Data.RESPONSE) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.eoddata.ws.Data.RESPONSE) org.apache.axis.utils.JavaUtils.convert(_resp, com.eoddata.ws.Data.RESPONSE.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.eoddata.ws.Data.RESPONSE quoteListByDatePeriod2(java.lang.String token, java.lang.String exchange, java.lang.String quoteDate, java.lang.String period) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://ws.eoddata.com/Data/QuoteListByDatePeriod2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "QuoteListByDatePeriod2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, exchange, quoteDate, period});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.eoddata.ws.Data.RESPONSE) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.eoddata.ws.Data.RESPONSE) org.apache.axis.utils.JavaUtils.convert(_resp, com.eoddata.ws.Data.RESPONSE.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.eoddata.ws.Data.RESPONSE symbolChangesByExchange(java.lang.String token, java.lang.String exchange) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://ws.eoddata.com/Data/SymbolChangesByExchange");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "SymbolChangesByExchange"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, exchange});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.eoddata.ws.Data.RESPONSE) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.eoddata.ws.Data.RESPONSE) org.apache.axis.utils.JavaUtils.convert(_resp, com.eoddata.ws.Data.RESPONSE.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.eoddata.ws.Data.RESPONSE dataClientLatestVersion(java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://ws.eoddata.com/Data/DataClientLatestVersion");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "DataClientLatestVersion"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.eoddata.ws.Data.RESPONSE) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.eoddata.ws.Data.RESPONSE) org.apache.axis.utils.JavaUtils.convert(_resp, com.eoddata.ws.Data.RESPONSE.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.eoddata.ws.Data.RESPONSE dataFormats(java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://ws.eoddata.com/Data/DataFormats");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "DataFormats"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.eoddata.ws.Data.RESPONSE) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.eoddata.ws.Data.RESPONSE) org.apache.axis.utils.JavaUtils.convert(_resp, com.eoddata.ws.Data.RESPONSE.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.eoddata.ws.Data.RESPONSE updateDataFormat(java.lang.String token, java.lang.String dataFormat, boolean includeHeader, boolean includeSuffix) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://ws.eoddata.com/Data/UpdateDataFormat");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "UpdateDataFormat"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, dataFormat, new java.lang.Boolean(includeHeader), new java.lang.Boolean(includeSuffix)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.eoddata.ws.Data.RESPONSE) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.eoddata.ws.Data.RESPONSE) org.apache.axis.utils.JavaUtils.convert(_resp, com.eoddata.ws.Data.RESPONSE.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.eoddata.ws.Data.RESPONSE validateAccess(java.lang.String token, java.lang.String exchange, java.lang.String quoteDate, java.lang.String period) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://ws.eoddata.com/Data/ValidateAccess");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "ValidateAccess"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, exchange, quoteDate, period});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.eoddata.ws.Data.RESPONSE) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.eoddata.ws.Data.RESPONSE) org.apache.axis.utils.JavaUtils.convert(_resp, com.eoddata.ws.Data.RESPONSE.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
