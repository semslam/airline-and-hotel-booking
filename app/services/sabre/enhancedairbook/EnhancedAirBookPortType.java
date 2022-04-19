
package services.sabre.enhancedairbook;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Holder;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "EnhancedAirBookPortType", targetNamespace = "https://webservices.sabre.com/websvc")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface EnhancedAirBookPortType {


    /**
     * 
     * @param header2
     * @param header
     * @param body
     * @return
     *     returns enhancedairbook.EnhancedAirBookRS
     */
    @WebMethod(operationName = "EnhancedAirBookRQ", action = "EnhancedAirBookRQ")
    @WebResult(name = "EnhancedAirBookRS", targetNamespace = "http://services.sabre.com/sp/eab/v3_2", partName = "body")
    public EnhancedAirBookRS enhancedAirBookRQ(
            @WebParam(name = "MessageHeader", targetNamespace = "http://www.ebxml.org/namespaces/messageHeader", header = true, mode = WebParam.Mode.INOUT, partName = "header")
                    Holder<MessageHeader> header,
            @WebParam(name = "Security", targetNamespace = "http://schemas.xmlsoap.org/ws/2002/12/secext", header = true, mode = WebParam.Mode.INOUT, partName = "header2")
                    Holder<Security> header2,
            @WebParam(name = "EnhancedAirBookRQ", targetNamespace = "http://services.sabre.com/sp/eab/v3_2", partName = "body")
                    EnhancedAirBookRQ body);

}
