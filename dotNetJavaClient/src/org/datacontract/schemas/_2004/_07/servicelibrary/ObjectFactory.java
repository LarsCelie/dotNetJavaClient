
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
    private final static QName _CustomerErrorMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceLibrary", "CustomerErrorMessage");
    private final static QName _ArrayOfOrderEntryDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceLibrary", "ArrayOfOrderEntryDTO");
    private final static QName _ProductDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceLibrary", "ProductDTO");
    private final static QName _ArrayOfOrderDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceLibrary", "ArrayOfOrderDTO");
    private final static QName _Product_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceLibrary", "Product");
    private final static QName _CustomerDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceLibrary", "CustomerDTO");
    private final static QName _ArrayOfProductDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceLibrary", "ArrayOfProductDTO");
    private final static QName _ProductDTOName_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceLibrary", "Name");
    private final static QName _CustomerDTOPassword_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceLibrary", "Password");
    private final static QName _OrderDTOEntries_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceLibrary", "entries");
    private final static QName _CustomerErrorMessageDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceLibrary", "Details");
    private final static QName _CustomerErrorMessageMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceLibrary", "Message");
    private final static QName _OrderEntryDTOProductName_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceLibrary", "ProductName");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.servicelibrary
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CustomerDTO }
     * 
     */
    public CustomerDTO createCustomerDTO() {
        return new CustomerDTO();
    }

    /**
     * Create an instance of {@link ArrayOfProductDTO }
     * 
     */
    public ArrayOfProductDTO createArrayOfProductDTO() {
        return new ArrayOfProductDTO();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
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
     * Create an instance of {@link CustomerErrorMessage }
     * 
     */
    public CustomerErrorMessage createCustomerErrorMessage() {
        return new CustomerErrorMessage();
    }

    /**
     * Create an instance of {@link ProductDTO }
     * 
     */
    public ProductDTO createProductDTO() {
        return new ProductDTO();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerErrorMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceLibrary", name = "CustomerErrorMessage")
    public JAXBElement<CustomerErrorMessage> createCustomerErrorMessage(CustomerErrorMessage value) {
        return new JAXBElement<CustomerErrorMessage>(_CustomerErrorMessage_QNAME, CustomerErrorMessage.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceLibrary", name = "ProductDTO")
    public JAXBElement<ProductDTO> createProductDTO(ProductDTO value) {
        return new JAXBElement<ProductDTO>(_ProductDTO_QNAME, ProductDTO.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceLibrary", name = "Product")
    public JAXBElement<Product> createProduct(Product value) {
        return new JAXBElement<Product>(_Product_QNAME, Product.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceLibrary", name = "CustomerDTO")
    public JAXBElement<CustomerDTO> createCustomerDTO(CustomerDTO value) {
        return new JAXBElement<CustomerDTO>(_CustomerDTO_QNAME, CustomerDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceLibrary", name = "ArrayOfProductDTO")
    public JAXBElement<ArrayOfProductDTO> createArrayOfProductDTO(ArrayOfProductDTO value) {
        return new JAXBElement<ArrayOfProductDTO>(_ArrayOfProductDTO_QNAME, ArrayOfProductDTO.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceLibrary", name = "Name", scope = ProductDTO.class)
    public JAXBElement<String> createProductDTOName(String value) {
        return new JAXBElement<String>(_ProductDTOName_QNAME, String.class, ProductDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceLibrary", name = "Name", scope = Product.class)
    public JAXBElement<String> createProductName(String value) {
        return new JAXBElement<String>(_ProductDTOName_QNAME, String.class, Product.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceLibrary", name = "Name", scope = CustomerDTO.class)
    public JAXBElement<String> createCustomerDTOName(String value) {
        return new JAXBElement<String>(_ProductDTOName_QNAME, String.class, CustomerDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceLibrary", name = "Password", scope = CustomerDTO.class)
    public JAXBElement<String> createCustomerDTOPassword(String value) {
        return new JAXBElement<String>(_CustomerDTOPassword_QNAME, String.class, CustomerDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrderEntryDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceLibrary", name = "entries", scope = OrderDTO.class)
    public JAXBElement<ArrayOfOrderEntryDTO> createOrderDTOEntries(ArrayOfOrderEntryDTO value) {
        return new JAXBElement<ArrayOfOrderEntryDTO>(_OrderDTOEntries_QNAME, ArrayOfOrderEntryDTO.class, OrderDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceLibrary", name = "Details", scope = CustomerErrorMessage.class)
    public JAXBElement<String> createCustomerErrorMessageDetails(String value) {
        return new JAXBElement<String>(_CustomerErrorMessageDetails_QNAME, String.class, CustomerErrorMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceLibrary", name = "Message", scope = CustomerErrorMessage.class)
    public JAXBElement<String> createCustomerErrorMessageMessage(String value) {
        return new JAXBElement<String>(_CustomerErrorMessageMessage_QNAME, String.class, CustomerErrorMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceLibrary", name = "ProductName", scope = OrderEntryDTO.class)
    public JAXBElement<String> createOrderEntryDTOProductName(String value) {
        return new JAXBElement<String>(_OrderEntryDTOProductName_QNAME, String.class, OrderEntryDTO.class, value);
    }

}
