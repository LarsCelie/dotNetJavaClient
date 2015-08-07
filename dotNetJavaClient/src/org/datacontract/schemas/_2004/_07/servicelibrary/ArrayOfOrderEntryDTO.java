
package org.datacontract.schemas._2004._07.servicelibrary;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfOrderEntryDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOrderEntryDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderEntryDTO" type="{http://schemas.datacontract.org/2004/07/ServiceLibrary}OrderEntryDTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOrderEntryDTO", propOrder = {
    "orderEntryDTO"
})
public class ArrayOfOrderEntryDTO {

    @XmlElement(name = "OrderEntryDTO", nillable = true)
    protected List<OrderEntryDTO> orderEntryDTO;

    /**
     * Gets the value of the orderEntryDTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderEntryDTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderEntryDTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderEntryDTO }
     * 
     * 
     */
    public List<OrderEntryDTO> getOrderEntryDTO() {
        if (orderEntryDTO == null) {
            orderEntryDTO = new ArrayList<OrderEntryDTO>();
        }
        return this.orderEntryDTO;
    }

}
