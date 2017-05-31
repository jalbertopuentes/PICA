
package org.datacontract.schemas._2004._07.clienteentities;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.clienteentities package. 
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

    private final static QName _ClienteFullEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/ClienteEntities", "ClienteFullEntity");
    private final static QName _ClienteEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/ClienteEntities", "ClienteEntity");
    private final static QName _TarjetaEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/ClienteEntities", "TarjetaEntity");
    private final static QName _ClienteVTOrdenEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/ClienteEntities", "ClienteVTOrdenEntity");
    private final static QName _ArrayOfClienteOrdenMasVendidasEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/ClienteEntities", "ArrayOfClienteOrdenMasVendidasEntity");
    private final static QName _ClienteOrdenMasVendidasEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/ClienteEntities", "ClienteOrdenMasVendidasEntity");
    private final static QName _ArrayOfClienteEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/ClienteEntities", "ArrayOfClienteEntity");
    private final static QName _ClienteRequestEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/ClienteEntities", "ClienteRequestEntity");
    private final static QName _TarjetaAddRequestEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/ClienteEntities", "TarjetaAddRequestEntity");
    private final static QName _ClienteModRequestEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/ClienteEntities", "ClienteModRequestEntity");
    private final static QName _TarjetaModRequestEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/ClienteEntities", "TarjetaModRequestEntity");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.clienteentities
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ClienteFullEntity }
     * 
     */
    public ClienteFullEntity createClienteFullEntity() {
        return new ClienteFullEntity();
    }

    /**
     * Create an instance of {@link ClienteVTOrdenEntity }
     * 
     */
    public ClienteVTOrdenEntity createClienteVTOrdenEntity() {
        return new ClienteVTOrdenEntity();
    }

    /**
     * Create an instance of {@link ClienteEntity }
     * 
     */
    public ClienteEntity createClienteEntity() {
        return new ClienteEntity();
    }

    /**
     * Create an instance of {@link ArrayOfClienteOrdenMasVendidasEntity }
     * 
     */
    public ArrayOfClienteOrdenMasVendidasEntity createArrayOfClienteOrdenMasVendidasEntity() {
        return new ArrayOfClienteOrdenMasVendidasEntity();
    }

    /**
     * Create an instance of {@link ArrayOfClienteEntity }
     * 
     */
    public ArrayOfClienteEntity createArrayOfClienteEntity() {
        return new ArrayOfClienteEntity();
    }

    /**
     * Create an instance of {@link ClienteRequestEntity }
     * 
     */
    public ClienteRequestEntity createClienteRequestEntity() {
        return new ClienteRequestEntity();
    }

    /**
     * Create an instance of {@link TarjetaAddRequestEntity }
     * 
     */
    public TarjetaAddRequestEntity createTarjetaAddRequestEntity() {
        return new TarjetaAddRequestEntity();
    }

    /**
     * Create an instance of {@link ClienteModRequestEntity }
     * 
     */
    public ClienteModRequestEntity createClienteModRequestEntity() {
        return new ClienteModRequestEntity();
    }

    /**
     * Create an instance of {@link TarjetaModRequestEntity }
     * 
     */
    public TarjetaModRequestEntity createTarjetaModRequestEntity() {
        return new TarjetaModRequestEntity();
    }

    /**
     * Create an instance of {@link TarjetaEntity }
     * 
     */
    public TarjetaEntity createTarjetaEntity() {
        return new TarjetaEntity();
    }

    /**
     * Create an instance of {@link ClienteOrdenMasVendidasEntity }
     * 
     */
    public ClienteOrdenMasVendidasEntity createClienteOrdenMasVendidasEntity() {
        return new ClienteOrdenMasVendidasEntity();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClienteFullEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ClienteEntities", name = "ClienteFullEntity")
    public JAXBElement<ClienteFullEntity> createClienteFullEntity(ClienteFullEntity value) {
        return new JAXBElement<ClienteFullEntity>(_ClienteFullEntity_QNAME, ClienteFullEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClienteEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ClienteEntities", name = "ClienteEntity")
    public JAXBElement<ClienteEntity> createClienteEntity(ClienteEntity value) {
        return new JAXBElement<ClienteEntity>(_ClienteEntity_QNAME, ClienteEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TarjetaEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ClienteEntities", name = "TarjetaEntity")
    public JAXBElement<TarjetaEntity> createTarjetaEntity(TarjetaEntity value) {
        return new JAXBElement<TarjetaEntity>(_TarjetaEntity_QNAME, TarjetaEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClienteVTOrdenEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ClienteEntities", name = "ClienteVTOrdenEntity")
    public JAXBElement<ClienteVTOrdenEntity> createClienteVTOrdenEntity(ClienteVTOrdenEntity value) {
        return new JAXBElement<ClienteVTOrdenEntity>(_ClienteVTOrdenEntity_QNAME, ClienteVTOrdenEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfClienteOrdenMasVendidasEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ClienteEntities", name = "ArrayOfClienteOrdenMasVendidasEntity")
    public JAXBElement<ArrayOfClienteOrdenMasVendidasEntity> createArrayOfClienteOrdenMasVendidasEntity(ArrayOfClienteOrdenMasVendidasEntity value) {
        return new JAXBElement<ArrayOfClienteOrdenMasVendidasEntity>(_ArrayOfClienteOrdenMasVendidasEntity_QNAME, ArrayOfClienteOrdenMasVendidasEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClienteOrdenMasVendidasEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ClienteEntities", name = "ClienteOrdenMasVendidasEntity")
    public JAXBElement<ClienteOrdenMasVendidasEntity> createClienteOrdenMasVendidasEntity(ClienteOrdenMasVendidasEntity value) {
        return new JAXBElement<ClienteOrdenMasVendidasEntity>(_ClienteOrdenMasVendidasEntity_QNAME, ClienteOrdenMasVendidasEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfClienteEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ClienteEntities", name = "ArrayOfClienteEntity")
    public JAXBElement<ArrayOfClienteEntity> createArrayOfClienteEntity(ArrayOfClienteEntity value) {
        return new JAXBElement<ArrayOfClienteEntity>(_ArrayOfClienteEntity_QNAME, ArrayOfClienteEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClienteRequestEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ClienteEntities", name = "ClienteRequestEntity")
    public JAXBElement<ClienteRequestEntity> createClienteRequestEntity(ClienteRequestEntity value) {
        return new JAXBElement<ClienteRequestEntity>(_ClienteRequestEntity_QNAME, ClienteRequestEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TarjetaAddRequestEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ClienteEntities", name = "TarjetaAddRequestEntity")
    public JAXBElement<TarjetaAddRequestEntity> createTarjetaAddRequestEntity(TarjetaAddRequestEntity value) {
        return new JAXBElement<TarjetaAddRequestEntity>(_TarjetaAddRequestEntity_QNAME, TarjetaAddRequestEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClienteModRequestEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ClienteEntities", name = "ClienteModRequestEntity")
    public JAXBElement<ClienteModRequestEntity> createClienteModRequestEntity(ClienteModRequestEntity value) {
        return new JAXBElement<ClienteModRequestEntity>(_ClienteModRequestEntity_QNAME, ClienteModRequestEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TarjetaModRequestEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ClienteEntities", name = "TarjetaModRequestEntity")
    public JAXBElement<TarjetaModRequestEntity> createTarjetaModRequestEntity(TarjetaModRequestEntity value) {
        return new JAXBElement<TarjetaModRequestEntity>(_TarjetaModRequestEntity_QNAME, TarjetaModRequestEntity.class, null, value);
    }

}
