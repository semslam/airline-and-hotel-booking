
package services.amadeus.lowfareplus;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TPA_ExtensionsRS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TPA_ExtensionsRS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CabinType" type="{http://traveltalk.com/wsLowFarePlus}CabinType" minOccurs="0"/>
 *         &lt;element name="JourneyTotalDuration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JourneyDuration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PricedCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FlightContext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StopInfo" type="{http://traveltalk.com/wsLowFarePlus}StopInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TPA_ExtensionsRS", propOrder = {
    "content"
})
public class TPAExtensionsRS {

    @XmlElementRefs({
        @XmlElementRef(name = "PricedCode", namespace = "http://traveltalk.com/wsLowFarePlus", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "StopInfo", namespace = "http://traveltalk.com/wsLowFarePlus", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Text", namespace = "http://traveltalk.com/wsLowFarePlus", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CabinType", namespace = "http://traveltalk.com/wsLowFarePlus", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "JourneyDuration", namespace = "http://traveltalk.com/wsLowFarePlus", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "FlightContext", namespace = "http://traveltalk.com/wsLowFarePlus", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "JourneyTotalDuration", namespace = "http://traveltalk.com/wsLowFarePlus", type = JAXBElement.class, required = false)
    })
    @XmlMixed
    protected List<Serializable> content;

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link StopInfo }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link CabinType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link String }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<Serializable> getContent() {
        if (content == null) {
            content = new ArrayList<Serializable>();
        }
        return this.content;
    }

}
