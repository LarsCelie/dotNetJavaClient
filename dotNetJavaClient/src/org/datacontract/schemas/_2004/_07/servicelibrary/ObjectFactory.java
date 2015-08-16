
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

    private final static QName _ErrorMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceLibrary", "ErrorMessage");
    private final static QName _CustomerDTO_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceLibrary", "CustomerDTO");
    private final static QName _ErrorMessageDetails_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceLibrary", "Details");
    private final static QName _ErrorMessageMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceLibrary", "Message");
    private final static QName _CustomerDTOName_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceLibrary", "Name");
    private final static QName _CustomerDTOPassword_QNAME = new QName("http://schemas.datacontract.org/2004/07/ServiceLibrary", "Password");

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
     * Create an instance of {@link ErrorMessage }
     * 
     */
    public ErrorMessage createErrorMessage() {
        return new ErrorMessage();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrorMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceLibrary", name = "ErrorMessage")
    public JAXBElement<ErrorMessage> createErrorMessage(ErrorMessage value) {
        return new JAXBElement<ErrorMessage>(_ErrorMessage_QNAME, ErrorMessage.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceLibrary", name = "Details", scope = ErrorMessage.class)
    public JAXBElement<String> createErrorMessageDetails(String value) {
        return new JAXBElement<String>(_ErrorMessageDetails_QNAME, String.class, ErrorMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceLibrary", name = "Message", scope = ErrorMessage.class)
    public JAXBElement<String> createErrorMessageMessage(String value) {
        return new JAXBElement<String>(_ErrorMessageMessage_QNAME, String.class, ErrorMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceLibrary", name = "Name", scope = CustomerDTO.class)
    public JAXBElement<String> createCustomerDTOName(String value) {
        return new JAXBElement<String>(_CustomerDTOName_QNAME, String.class, CustomerDTO.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ServiceLibrary", name = "Password", scope = CustomerDTO.class)
    public JAXBElement<String> createCustomerDTOPassword(String value) {
        return new JAXBElement<String>(_CustomerDTOPassword_QNAME, String.class, CustomerDTO.class, value);
    }

}
