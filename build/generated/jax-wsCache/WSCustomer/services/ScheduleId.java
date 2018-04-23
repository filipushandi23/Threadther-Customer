
package services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for scheduleId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="scheduleId"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="movieStart" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="studioNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "scheduleId", propOrder = {
    "movieStart",
    "studioNumber"
})
public class ScheduleId {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar movieStart;
    protected int studioNumber;

    /**
     * Gets the value of the movieStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMovieStart() {
        return movieStart;
    }

    /**
     * Sets the value of the movieStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMovieStart(XMLGregorianCalendar value) {
        this.movieStart = value;
    }

    /**
     * Gets the value of the studioNumber property.
     * 
     */
    public int getStudioNumber() {
        return studioNumber;
    }

    /**
     * Sets the value of the studioNumber property.
     * 
     */
    public void setStudioNumber(int value) {
        this.studioNumber = value;
    }

}
