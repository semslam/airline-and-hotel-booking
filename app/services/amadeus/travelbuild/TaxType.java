
package services.amadeus.travelbuild;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TaxType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Inclusive"/>
 *     &lt;enumeration value="Exclusive"/>
 *     &lt;enumeration value="Cumulative"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TaxType")
@XmlEnum
public enum TaxType {

    @XmlEnumValue("Inclusive")
    INCLUSIVE("Inclusive"),
    @XmlEnumValue("Exclusive")
    EXCLUSIVE("Exclusive"),
    @XmlEnumValue("Cumulative")
    CUMULATIVE("Cumulative");
    private final String value;

    TaxType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaxType fromValue(String v) {
        for (TaxType c: TaxType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
