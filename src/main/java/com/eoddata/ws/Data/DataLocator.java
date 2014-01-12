/**
 * DataLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.eoddata.ws.Data;

public class DataLocator extends org.apache.axis.client.Service implements com.eoddata.ws.Data.Data {

/**
 * EODData Financial Information Web Service
 */

    public DataLocator() {
    }


    public DataLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public DataLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for DataSoap
    private java.lang.String DataSoap_address = "http://ws.eoddata.com/data.asmx";

    public java.lang.String getDataSoapAddress() {
        return DataSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String DataSoapWSDDServiceName = "DataSoap";

    public java.lang.String getDataSoapWSDDServiceName() {
        return DataSoapWSDDServiceName;
    }

    public void setDataSoapWSDDServiceName(java.lang.String name) {
        DataSoapWSDDServiceName = name;
    }

    public com.eoddata.ws.Data.DataSoap getDataSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(DataSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getDataSoap(endpoint);
    }

    public com.eoddata.ws.Data.DataSoap getDataSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.eoddata.ws.Data.DataSoapStub _stub = new com.eoddata.ws.Data.DataSoapStub(portAddress, this);
            _stub.setPortName(getDataSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setDataSoapEndpointAddress(java.lang.String address) {
        DataSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.eoddata.ws.Data.DataSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.eoddata.ws.Data.DataSoapStub _stub = new com.eoddata.ws.Data.DataSoapStub(new java.net.URL(DataSoap_address), this);
                _stub.setPortName(getDataSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("DataSoap".equals(inputPortName)) {
            return getDataSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "Data");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.eoddata.com/Data", "DataSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("DataSoap".equals(portName)) {
            setDataSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
