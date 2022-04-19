
package services.sabre.passengerdetails;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlightDirectionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FlightDirectionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="A"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FlightDirectionType")
@XmlEnum
public enum FlightDirectionType {


    /**
     * 
     *                         Departing flight
     *                     
     * 
     */
    D,

    /**
     * 
     *                         Arriving flight
     *                     
     * 
     */
    A;

    public String value() {
        return name();
    }

    public static FlightDirectionType fromValue(String v) {
        return valueOf(v);
    }

}
