
package services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for studio complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="studio"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cinema" type="{http://WS/}cinema" minOccurs="0"/&gt;
 *         &lt;element name="colCapacity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="rowCapacity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="schedules" type="{http://WS/}schedule" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="seats" type="{http://WS/}seat" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="studioName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="studioNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "studio", propOrder = {
    "cinema",
    "colCapacity",
    "rowCapacity",
    "schedules",
    "seats",
    "studioName",
    "studioNumber"
})
public class Studio {

    protected Cinema cinema;
    protected Integer colCapacity;
    protected Integer rowCapacity;
    @XmlElement(nillable = true)
    protected List<Schedule> schedules;
    @XmlElement(nillable = true)
    protected List<Seat> seats;
    protected String studioName;
    protected Integer studioNumber;

    /**
     * Gets the value of the cinema property.
     * 
     * @return
     *     possible object is
     *     {@link Cinema }
     *     
     */
    public Cinema getCinema() {
        return cinema;
    }

    /**
     * Sets the value of the cinema property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cinema }
     *     
     */
    public void setCinema(Cinema value) {
        this.cinema = value;
    }

    /**
     * Gets the value of the colCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getColCapacity() {
        return colCapacity;
    }

    /**
     * Sets the value of the colCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setColCapacity(Integer value) {
        this.colCapacity = value;
    }

    /**
     * Gets the value of the rowCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRowCapacity() {
        return rowCapacity;
    }

    /**
     * Sets the value of the rowCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRowCapacity(Integer value) {
        this.rowCapacity = value;
    }

    /**
     * Gets the value of the schedules property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the schedules property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSchedules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Schedule }
     * 
     * 
     */
    public List<Schedule> getSchedules() {
        if (schedules == null) {
            schedules = new ArrayList<Schedule>();
        }
        return this.schedules;
    }

    /**
     * Gets the value of the seats property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seats property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeats().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Seat }
     * 
     * 
     */
    public List<Seat> getSeats() {
        if (seats == null) {
            seats = new ArrayList<Seat>();
        }
        return this.seats;
    }

    /**
     * Gets the value of the studioName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudioName() {
        return studioName;
    }

    /**
     * Sets the value of the studioName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudioName(String value) {
        this.studioName = value;
    }

    /**
     * Gets the value of the studioNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStudioNumber() {
        return studioNumber;
    }

    /**
     * Sets the value of the studioNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStudioNumber(Integer value) {
        this.studioNumber = value;
    }

}
