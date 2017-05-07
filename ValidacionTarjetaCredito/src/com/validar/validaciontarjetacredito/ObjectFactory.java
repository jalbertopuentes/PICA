
package com.validar.validaciontarjetacredito;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.validar.validaciontarjetacredito package. 
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

    private final static QName _CreditCard_QNAME = new QName("http://www.validar.com/ValidacionTarjetaCredito/", "creditCard");
    private final static QName _Error_QNAME = new QName("http://www.validar.com/ValidacionTarjetaCredito/", "error");
    private final static QName _Valid_QNAME = new QName("http://www.validar.com/ValidacionTarjetaCredito/", "valid");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.validar.validaciontarjetacredito
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreditCard }
     * 
     */
    public CreditCard createCreditCard() {
        return new CreditCard();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.validar.com/ValidacionTarjetaCredito/", name = "creditCard")
    public JAXBElement<CreditCard> createCreditCard(CreditCard value) {
        return new JAXBElement<CreditCard>(_CreditCard_QNAME, CreditCard.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.validar.com/ValidacionTarjetaCredito/", name = "error")
    public JAXBElement<String> createError(String value) {
        return new JAXBElement<String>(_Error_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.validar.com/ValidacionTarjetaCredito/", name = "valid")
    public JAXBElement<Boolean> createValid(Boolean value) {
        return new JAXBElement<Boolean>(_Valid_QNAME, Boolean.class, null, value);
    }

}
