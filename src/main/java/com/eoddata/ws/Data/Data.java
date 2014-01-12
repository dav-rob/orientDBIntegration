/**
 * Data.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.eoddata.ws.Data;

public interface Data extends javax.xml.rpc.Service {

/**
 * EODData Financial Information Web Service
 */
    public java.lang.String getDataSoapAddress();

    public com.eoddata.ws.Data.DataSoap getDataSoap() throws javax.xml.rpc.ServiceException;

    public com.eoddata.ws.Data.DataSoap getDataSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
