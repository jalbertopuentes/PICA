package org.tempuri;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.11
 * 2017-05-24T23:27:00.846-05:00
 * Generated source version: 3.1.11
 * 
 */
@WebServiceClient(name = "SrvEntProducto", 
                  wsdlLocation = "http://25.13.58.186:1004/SrvEntProducto.svc?singleWsdl",
                  targetNamespace = "http://tempuri.org/") 
public class SrvEntProducto extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://tempuri.org/", "SrvEntProducto");
    public final static QName BasicHttpBindingISrvEntProducto = new QName("http://tempuri.org/", "BasicHttpBinding_ISrvEntProducto");
    static {
        URL url = null;
        try {
            url = new URL("http://25.13.58.186:1004/SrvEntProducto.svc?singleWsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(SrvEntProducto.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://25.13.58.186:1004/SrvEntProducto.svc?singleWsdl");
        }
        WSDL_LOCATION = url;
    }

    public SrvEntProducto(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SrvEntProducto(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SrvEntProducto() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public SrvEntProducto(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public SrvEntProducto(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public SrvEntProducto(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns ISrvEntProducto
     */
    @WebEndpoint(name = "BasicHttpBinding_ISrvEntProducto")
    public ISrvEntProducto getBasicHttpBindingISrvEntProducto() {
        return super.getPort(BasicHttpBindingISrvEntProducto, ISrvEntProducto.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ISrvEntProducto
     */
    @WebEndpoint(name = "BasicHttpBinding_ISrvEntProducto")
    public ISrvEntProducto getBasicHttpBindingISrvEntProducto(WebServiceFeature... features) {
        return super.getPort(BasicHttpBindingISrvEntProducto, ISrvEntProducto.class, features);
    }

}