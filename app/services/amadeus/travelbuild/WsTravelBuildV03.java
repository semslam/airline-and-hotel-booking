
package services.amadeus.travelbuild;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * A TripXML Web Service to Process Travel Build Request - version 03
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "wsTravelBuild_v03", targetNamespace = "http://traveltalk.com/wsTravelBuild", wsdlLocation = "http://amadeusws.tripxml.com/TripXML/wsTravelBuild_v03.asmx?WSDL")
public class WsTravelBuildV03
    extends Service
{

    private final static URL WSTRAVELBUILDV03_WSDL_LOCATION;
    private final static WebServiceException WSTRAVELBUILDV03_EXCEPTION;
    private final static QName WSTRAVELBUILDV03_QNAME = new QName("http://traveltalk.com/wsTravelBuild", "wsTravelBuild_v03");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://amadeusws.tripxml.com/TripXML/wsTravelBuild_v03.asmx?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSTRAVELBUILDV03_WSDL_LOCATION = url;
        WSTRAVELBUILDV03_EXCEPTION = e;
    }

    public WsTravelBuildV03() {
        super(__getWsdlLocation(), WSTRAVELBUILDV03_QNAME);
    }

    public WsTravelBuildV03(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSTRAVELBUILDV03_QNAME, features);
    }

    public WsTravelBuildV03(URL wsdlLocation) {
        super(wsdlLocation, WSTRAVELBUILDV03_QNAME);
    }

    public WsTravelBuildV03(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSTRAVELBUILDV03_QNAME, features);
    }

    public WsTravelBuildV03(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WsTravelBuildV03(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WsTravelBuildV03Soap
     */
    @WebEndpoint(name = "wsTravelBuild_v03Soap")
    public WsTravelBuildV03Soap getWsTravelBuildV03Soap() {
        return super.getPort(new QName("http://traveltalk.com/wsTravelBuild", "wsTravelBuild_v03Soap"), WsTravelBuildV03Soap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WsTravelBuildV03Soap
     */
    @WebEndpoint(name = "wsTravelBuild_v03Soap")
    public WsTravelBuildV03Soap getWsTravelBuildV03Soap(WebServiceFeature... features) {
        return super.getPort(new QName("http://traveltalk.com/wsTravelBuild", "wsTravelBuild_v03Soap"), WsTravelBuildV03Soap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSTRAVELBUILDV03_EXCEPTION!= null) {
            throw WSTRAVELBUILDV03_EXCEPTION;
        }
        return WSTRAVELBUILDV03_WSDL_LOCATION;
    }

}
