
package com.myrental;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "TransaksiService", targetNamespace = "http://myrental.com/", wsdlLocation = "http://localhost:8080/HouseRentalWebservice/TransaksiService?wsdl")
public class TransaksiService_Service
    extends Service
{

    private final static URL TRANSAKSISERVICE_WSDL_LOCATION;
    private final static WebServiceException TRANSAKSISERVICE_EXCEPTION;
    private final static QName TRANSAKSISERVICE_QNAME = new QName("http://myrental.com/", "TransaksiService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/HouseRentalWebservice/TransaksiService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        TRANSAKSISERVICE_WSDL_LOCATION = url;
        TRANSAKSISERVICE_EXCEPTION = e;
    }

    public TransaksiService_Service() {
        super(__getWsdlLocation(), TRANSAKSISERVICE_QNAME);
    }

    public TransaksiService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), TRANSAKSISERVICE_QNAME, features);
    }

    public TransaksiService_Service(URL wsdlLocation) {
        super(wsdlLocation, TRANSAKSISERVICE_QNAME);
    }

    public TransaksiService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TRANSAKSISERVICE_QNAME, features);
    }

    public TransaksiService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TransaksiService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns TransaksiService
     */
    @WebEndpoint(name = "TransaksiServicePort")
    public TransaksiService getTransaksiServicePort() {
        return super.getPort(new QName("http://myrental.com/", "TransaksiServicePort"), TransaksiService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TransaksiService
     */
    @WebEndpoint(name = "TransaksiServicePort")
    public TransaksiService getTransaksiServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://myrental.com/", "TransaksiServicePort"), TransaksiService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TRANSAKSISERVICE_EXCEPTION!= null) {
            throw TRANSAKSISERVICE_EXCEPTION;
        }
        return TRANSAKSISERVICE_WSDL_LOCATION;
    }

}