
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfstringint;
import org.datacontract.schemas._2004._07.servicelibrary.ArrayOfOrderDTO;
import org.datacontract.schemas._2004._07.servicelibrary.ArrayOfProductDTO;
import org.datacontract.schemas._2004._07.servicelibrary.CustomerDTO;
import org.datacontract.schemas._2004._07.servicelibrary.Product;


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

    private final static QName _GetProductsInStockResponseGetProductsInStockResult_QNAME = new QName("http://tempuri.org/", "GetProductsInStockResult");
    private final static QName _AuthenticatePassword_QNAME = new QName("http://tempuri.org/", "password");
    private final static QName _AuthenticateUsername_QNAME = new QName("http://tempuri.org/", "username");
    private final static QName _RegisterResponseRegisterResult_QNAME = new QName("http://tempuri.org/", "RegisterResult");
    private final static QName _GetCustomerOrdersResponseGetCustomerOrdersResult_QNAME = new QName("http://tempuri.org/", "GetCustomerOrdersResult");
    private final static QName _AddProductName_QNAME = new QName("http://tempuri.org/", "name");
    private final static QName _PlaceOrderOrderRows_QNAME = new QName("http://tempuri.org/", "orderRows");
    private final static QName _PlaceOrderCustomerName_QNAME = new QName("http://tempuri.org/", "customerName");
    private final static QName _ChangeProductStockProduct_QNAME = new QName("http://tempuri.org/", "product");
    private final static QName _AuthenticateResponseAuthenticateResult_QNAME = new QName("http://tempuri.org/", "AuthenticateResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AuthenticateResponse }
     * 
     */
    public AuthenticateResponse createAuthenticateResponse() {
        return new AuthenticateResponse();
    }

    /**
     * Create an instance of {@link GetProductsInStock }
     * 
     */
    public GetProductsInStock createGetProductsInStock() {
        return new GetProductsInStock();
    }

    /**
     * Create an instance of {@link GetProductsInStockResponse }
     * 
     */
    public GetProductsInStockResponse createGetProductsInStockResponse() {
        return new GetProductsInStockResponse();
    }

    /**
     * Create an instance of {@link AddProduct }
     * 
     */
    public AddProduct createAddProduct() {
        return new AddProduct();
    }

    /**
     * Create an instance of {@link AddProductResponse }
     * 
     */
    public AddProductResponse createAddProductResponse() {
        return new AddProductResponse();
    }

    /**
     * Create an instance of {@link PlaceOrderResponse }
     * 
     */
    public PlaceOrderResponse createPlaceOrderResponse() {
        return new PlaceOrderResponse();
    }

    /**
     * Create an instance of {@link ChangeProductStockResponse }
     * 
     */
    public ChangeProductStockResponse createChangeProductStockResponse() {
        return new ChangeProductStockResponse();
    }

    /**
     * Create an instance of {@link ChangeProductStock }
     * 
     */
    public ChangeProductStock createChangeProductStock() {
        return new ChangeProductStock();
    }

    /**
     * Create an instance of {@link RegisterResponse }
     * 
     */
    public RegisterResponse createRegisterResponse() {
        return new RegisterResponse();
    }

    /**
     * Create an instance of {@link PlaceOrder }
     * 
     */
    public PlaceOrder createPlaceOrder() {
        return new PlaceOrder();
    }

    /**
     * Create an instance of {@link Authenticate }
     * 
     */
    public Authenticate createAuthenticate() {
        return new Authenticate();
    }

    /**
     * Create an instance of {@link GetCustomerOrders }
     * 
     */
    public GetCustomerOrders createGetCustomerOrders() {
        return new GetCustomerOrders();
    }

    /**
     * Create an instance of {@link Register }
     * 
     */
    public Register createRegister() {
        return new Register();
    }

    /**
     * Create an instance of {@link GetCustomerOrdersResponse }
     * 
     */
    public GetCustomerOrdersResponse createGetCustomerOrdersResponse() {
        return new GetCustomerOrdersResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetProductsInStockResult", scope = GetProductsInStockResponse.class)
    public JAXBElement<ArrayOfProductDTO> createGetProductsInStockResponseGetProductsInStockResult(ArrayOfProductDTO value) {
        return new JAXBElement<ArrayOfProductDTO>(_GetProductsInStockResponseGetProductsInStockResult_QNAME, ArrayOfProductDTO.class, GetProductsInStockResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "password", scope = Authenticate.class)
    public JAXBElement<String> createAuthenticatePassword(String value) {
        return new JAXBElement<String>(_AuthenticatePassword_QNAME, String.class, Authenticate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "username", scope = Authenticate.class)
    public JAXBElement<String> createAuthenticateUsername(String value) {
        return new JAXBElement<String>(_AuthenticateUsername_QNAME, String.class, Authenticate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RegisterResult", scope = RegisterResponse.class)
    public JAXBElement<String> createRegisterResponseRegisterResult(String value) {
        return new JAXBElement<String>(_RegisterResponseRegisterResult_QNAME, String.class, RegisterResponse.class, value);
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
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "name", scope = AddProduct.class)
    public JAXBElement<String> createAddProductName(String value) {
        return new JAXBElement<String>(_AddProductName_QNAME, String.class, AddProduct.class, value);
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
        return new JAXBElement<String>(_PlaceOrderCustomerName_QNAME, String.class, PlaceOrder.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "product", scope = ChangeProductStock.class)
    public JAXBElement<Product> createChangeProductStockProduct(Product value) {
        return new JAXBElement<Product>(_ChangeProductStockProduct_QNAME, Product.class, ChangeProductStock.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "customerName", scope = GetCustomerOrders.class)
    public JAXBElement<String> createGetCustomerOrdersCustomerName(String value) {
        return new JAXBElement<String>(_PlaceOrderCustomerName_QNAME, String.class, GetCustomerOrders.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "AuthenticateResult", scope = AuthenticateResponse.class)
    public JAXBElement<CustomerDTO> createAuthenticateResponseAuthenticateResult(CustomerDTO value) {
        return new JAXBElement<CustomerDTO>(_AuthenticateResponseAuthenticateResult_QNAME, CustomerDTO.class, AuthenticateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "name", scope = Register.class)
    public JAXBElement<String> createRegisterName(String value) {
        return new JAXBElement<String>(_AddProductName_QNAME, String.class, Register.class, value);
    }

}
