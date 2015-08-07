
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringint;
import org.datacontract.schemas._2004._07.servicelibrary.ArrayOfOrderDTO;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
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

    private final static QName _GetCustomerOrdersResponseGetCustomerOrdersResult_QNAME = new QName("http://tempuri.org/", "GetCustomerOrdersResult");
    private final static QName _GetCustomerOrdersCustomerName_QNAME = new QName("http://tempuri.org/", "customerName");
    private final static QName _PlaceOrderOrderRows_QNAME = new QName("http://tempuri.org/", "orderRows");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PlaceOrder }
     * 
     */
    public PlaceOrder createPlaceOrder() {
        return new PlaceOrder();
    }

    /**
     * Create an instance of {@link GetCustomerOrders }
     * 
     */
    public GetCustomerOrders createGetCustomerOrders() {
        return new GetCustomerOrders();
    }

    /**
     * Create an instance of {@link GetCustomerOrdersResponse }
     * 
     */
    public GetCustomerOrdersResponse createGetCustomerOrdersResponse() {
        return new GetCustomerOrdersResponse();
    }

    /**
     * Create an instance of {@link PlaceOrderResponse }
     * 
     */
    public PlaceOrderResponse createPlaceOrderResponse() {
        return new PlaceOrderResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrderDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetCustomerOrdersResult", scope = GetCustomerOrdersResponse.class)
    public JAXBElement<ArrayOfOrderDTO> createGetCustomerOrdersResponseGetCustomerOrdersResult(ArrayOfOrderDTO value) {
        return new JAXBElement<ArrayOfOrderDTO>(_GetCustomerOrdersResponseGetCustomerOrdersResult_QNAME, ArrayOfOrderDTO.class, GetCustomerOrdersResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "customerName", scope = GetCustomerOrders.class)
    public JAXBElement<String> createGetCustomerOrdersCustomerName(String value) {
        return new JAXBElement<String>(_GetCustomerOrdersCustomerName_QNAME, String.class, GetCustomerOrders.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfstringint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "orderRows", scope = PlaceOrder.class)
    public JAXBElement<ArrayOfKeyValueOfstringint> createPlaceOrderOrderRows(ArrayOfKeyValueOfstringint value) {
        return new JAXBElement<ArrayOfKeyValueOfstringint>(_PlaceOrderOrderRows_QNAME, ArrayOfKeyValueOfstringint.class, PlaceOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "customerName", scope = PlaceOrder.class)
    public JAXBElement<String> createPlaceOrderCustomerName(String value) {
        return new JAXBElement<String>(_GetCustomerOrdersCustomerName_QNAME, String.class, PlaceOrder.class, value);
    }

}
