
package org.datacontract.schemas._2004._07.servicelibrary;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.servicelibrary package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _OrderEntryDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceLibrary", "OrderEntryDTO");
    private final static QName _OrderDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceLibrary", "OrderDTO");
    private final static QName _ArrayOfOrderEntryDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceLibrary", "ArrayOfOrderEntryDTO");
    private final static QName _ArrayOfOrderDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceLibrary", "ArrayOfOrderDTO");
    private final static QName _OrderEntryDTOProductName_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceLibrary", "ProductName");
    private final static QName _OrderDTOEntries_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceLibrary", "entries");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.servicelibrary
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfOrderDTO }
     * 
     */
    public ArrayOfOrderDTO createArrayOfOrderDTO() {
        return new ArrayOfOrderDTO();
    }

    /**
     * Create an instance of {@link ArrayOfOrderEntryDTO }
     * 
     */
    public ArrayOfOrderEntryDTO createArrayOfOrderEntryDTO() {
        return new ArrayOfOrderEntryDTO();
    }

    /**
     * Create an instance of {@link OrderEntryDTO }
     * 
     */
    public OrderEntryDTO createOrderEntryDTO() {
        return new OrderEntryDTO();
    }

    /**
     * Create an instance of {@link OrderDTO }
     * 
     */
    public OrderDTO createOrderDTO() {
        return new OrderDTO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderEntryDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceLibrary", name = "OrderEntryDTO")
    public JAXBElement<OrderEntryDTO> createOrderEntryDTO(OrderEntryDTO value) {
        return new JAXBElement<OrderEntryDTO>(_OrderEntryDTO_QNAME, OrderEntryDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceLibrary", name = "OrderDTO")
    public JAXBElement<OrderDTO> createOrderDTO(OrderDTO value) {
        return new JAXBElement<OrderDTO>(_OrderDTO_QNAME, OrderDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrderEntryDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceLibrary", name = "ArrayOfOrderEntryDTO")
    public JAXBElement<ArrayOfOrderEntryDTO> createArrayOfOrderEntryDTO(ArrayOfOrderEntryDTO value) {
        return new JAXBElement<ArrayOfOrderEntryDTO>(_ArrayOfOrderEntryDTO_QNAME, ArrayOfOrderEntryDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrderDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceLibrary", name = "ArrayOfOrderDTO")
    public JAXBElement<ArrayOfOrderDTO> createArrayOfOrderDTO(ArrayOfOrderDTO value) {
        return new JAXBElement<ArrayOfOrderDTO>(_ArrayOfOrderDTO_QNAME, ArrayOfOrderDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceLibrary", name = "ProductName", scope = OrderEntryDTO.class)
    public JAXBElement<String> createOrderEntryDTOProductName(String value) {
        return new JAXBElement<String>(_OrderEntryDTOProductName_QNAME, String.class, OrderEntryDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrderEntryDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceLibrary", name = "entries", scope = OrderDTO.class)
    public JAXBElement<ArrayOfOrderEntryDTO> createOrderDTOEntries(ArrayOfOrderEntryDTO value) {
        return new JAXBElement<ArrayOfOrderEntryDTO>(_OrderDTOEntries_QNAME, ArrayOfOrderEntryDTO.class, OrderDTO.class, value);
    }

}
