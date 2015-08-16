
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.servicelibrary.CustomerDTO;


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

    private final static QName _RegisterName_QNAME = new QName("http://tempuri.org/", "name");
    private final static QName _AuthenticatePassword_QNAME = new QName("http://tempuri.org/", "password");
    private final static QName _AuthenticateUsername_QNAME = new QName("http://tempuri.org/", "username");
    private final static QName _RegisterResponseRegisterResult_QNAME = new QName("http://tempuri.org/", "RegisterResult");
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
     * Create an instance of {@link RegisterResponse }
     * 
     */
    public RegisterResponse createRegisterResponse() {
        return new RegisterResponse();
    }

    /**
     * Create an instance of {@link Authenticate }
     * 
     */
    public Authenticate createAuthenticate() {
        return new Authenticate();
    }

    /**
     * Create an instance of {@link Register }
     * 
     */
    public Register createRegister() {
        return new Register();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "name", scope = Register.class)
    public JAXBElement<String> createRegisterName(String value) {
        return new JAXBElement<String>(_RegisterName_QNAME, String.class, Register.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerDTO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "AuthenticateResult", scope = AuthenticateResponse.class)
    public JAXBElement<CustomerDTO> createAuthenticateResponseAuthenticateResult(CustomerDTO value) {
        return new JAXBElement<CustomerDTO>(_AuthenticateResponseAuthenticateResult_QNAME, CustomerDTO.class, AuthenticateResponse.class, value);
    }

}
