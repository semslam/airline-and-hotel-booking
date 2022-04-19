
package services.amadeus.travelbuild;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DirectBill complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DirectBill">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Address" type="{http://traveltalk.com/wsTravelBuild}Address" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ShareSynchInd" type="{http://traveltalk.com/wsTravelBuild}DirectBillShareSynchInd" />
 *       &lt;attribute name="ShareMarketInd" type="{http://traveltalk.com/wsTravelBuild}DirectBillShareMarketInd" />
 *       &lt;attribute name="DirectBill_ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectBill", propOrder = {
    "address"
})
public class DirectBill {

    @XmlElement(name = "Address")
    protected Address address;
    @XmlAttribute(name = "ShareSynchInd")
    protected DirectBillShareSynchInd shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    protected DirectBillShareMarketInd shareMarketInd;
    @XmlAttribute(name = "DirectBill_ID")
    protected String directBillID;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the shareSynchInd property.
     * 
     * @return
     *     possible object is
     *     {@link DirectBillShareSynchInd }
     *     
     */
    public DirectBillShareSynchInd getShareSynchInd() {
        return shareSynchInd;
    }

    /**
     * Sets the value of the shareSynchInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectBillShareSynchInd }
     *     
     */
    public void setShareSynchInd(DirectBillShareSynchInd value) {
        this.shareSynchInd = value;
    }

    /**
     * Gets the value of the shareMarketInd property.
     * 
     * @return
     *     possible object is
     *     {@link DirectBillShareMarketInd }
     *     
     */
    public DirectBillShareMarketInd getShareMarketInd() {
        return shareMarketInd;
    }

    /**
     * Sets the value of the shareMarketInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectBillShareMarketInd }
     *     
     */
    public void setShareMarketInd(DirectBillShareMarketInd value) {
        this.shareMarketInd = value;
    }

    /**
     * Gets the value of the directBillID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectBillID() {
        return directBillID;
    }

    /**
     * Sets the value of the directBillID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectBillID(String value) {
        this.directBillID = value;
    }

}
