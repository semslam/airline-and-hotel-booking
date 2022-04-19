
package services.sabre.bfm.sapt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Specifies the aircraft equipment type.
 * 
 * <p>Java class for EquipmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EquipmentType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="AirEquipType" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength3" />
 *       &lt;attribute name="ChangeofGauge" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentType", propOrder = {
    "value"
})
@XmlSeeAlso({
    EquipmentTypePref.class
})
public class EquipmentType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "AirEquipType", required = true)
    protected String airEquipType;
    @XmlAttribute(name = "ChangeofGauge")
    protected Boolean changeofGauge;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the airEquipType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirEquipType() {
        return airEquipType;
    }

    /**
     * Sets the value of the airEquipType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirEquipType(String value) {
        this.airEquipType = value;
    }

    /**
     * Gets the value of the changeofGauge property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isChangeofGauge() {
        if (changeofGauge == null) {
            return false;
        } else {
            return changeofGauge;
        }
    }

    /**
     * Sets the value of the changeofGauge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChangeofGauge(Boolean value) {
        this.changeofGauge = value;
    }

}
