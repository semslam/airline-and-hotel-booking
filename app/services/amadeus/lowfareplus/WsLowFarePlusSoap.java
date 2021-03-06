
package services.amadeus.lowfareplus;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "wsLowFarePlusSoap", targetNamespace = "http://traveltalk.com/wsLowFarePlus")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WsLowFarePlusSoap {


    /**
     * Process Low Fare Messages Request.
     * 
     * @param otaAirLowFareSearchPlusRQ
     * @return
     *     returns soap.client.lowfareplus.OTAAirLowFareSearchPlusRS
     */
    @WebMethod(action = "http://traveltalk.com/wsLowFarePlus/wmLowFarePlus")
    @WebResult(name = "OTA_AirLowFareSearchPlusRS", targetNamespace = "http://traveltalk.com/wsLowFarePlus")
    @RequestWrapper(localName = "wmLowFarePlus", targetNamespace = "http://traveltalk.com/wsLowFarePlus", className = "soap.client.lowfareplus.WmLowFarePlus")
    @ResponseWrapper(localName = "wmLowFarePlusResponse", targetNamespace = "http://traveltalk.com/wsLowFarePlus", className = "soap.client.lowfareplus.WmLowFarePlusResponse")
    public OTAAirLowFareSearchPlusRS wmLowFarePlus(
        @WebParam(name = "OTA_AirLowFareSearchPlusRQ", targetNamespace = "http://traveltalk.com/wsLowFarePlus")
        OTAAirLowFareSearchPlusRQ otaAirLowFareSearchPlusRQ);

    /**
     * Process Low Fare Plus Xml Messages Request.
     * 
     * @param xmlRequest
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "http://traveltalk.com/wsLowFarePlus/wmLowFarePlusXml")
    @WebResult(name = "wmLowFarePlusXmlResult", targetNamespace = "http://traveltalk.com/wsLowFarePlus")
    @RequestWrapper(localName = "wmLowFarePlusXml", targetNamespace = "http://traveltalk.com/wsLowFarePlus", className = "soap.client.lowfareplus.WmLowFarePlusXml")
    @ResponseWrapper(localName = "wmLowFarePlusXmlResponse", targetNamespace = "http://traveltalk.com/wsLowFarePlus", className = "soap.client.lowfareplus.WmLowFarePlusXmlResponse")
    public String wmLowFarePlusXml(
        @WebParam(name = "xmlRequest", targetNamespace = "http://traveltalk.com/wsLowFarePlus")
        String xmlRequest);

}
