
package org.datacontract.schemas._2004._07.ordenentities;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.ordenentities package. 
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

    private final static QName _OrdenRequestEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/OrdenEntities", "OrdenRequestEntity");
    private final static QName _ArrayOfOrdenDetalleRequestEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/OrdenEntities", "ArrayOfOrdenDetalleRequestEntity");
    private final static QName _OrdenDetalleRequestEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/OrdenEntities", "OrdenDetalleRequestEntity");
    private final static QName _ArrayOfOrdenEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/OrdenEntities", "ArrayOfOrdenEntity");
    private final static QName _OrdenEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/OrdenEntities", "OrdenEntity");
    private final static QName _ArrayOfOrdenesAbiertasEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/OrdenEntities", "ArrayOfOrdenesAbiertasEntity");
    private final static QName _OrdenesAbiertasEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/OrdenEntities", "OrdenesAbiertasEntity");
    private final static QName _ArrayOfOrdenesCerradasXMesEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/OrdenEntities", "ArrayOfOrdenesCerradasXMesEntity");
    private final static QName _OrdenesCerradasXMesEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/OrdenEntities", "OrdenesCerradasXMesEntity");
    private final static QName _ArrayOfOrdenesCerradasEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/OrdenEntities", "ArrayOfOrdenesCerradasEntity");
    private final static QName _OrdenesCerradasEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/OrdenEntities", "OrdenesCerradasEntity");
    private final static QName _ArrayOfOrdenDetalleEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/OrdenEntities", "ArrayOfOrdenDetalleEntity");
    private final static QName _OrdenDetalleEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/OrdenEntities", "OrdenDetalleEntity");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.ordenentities
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OrdenRequestEntity }
     * 
     */
    public OrdenRequestEntity createOrdenRequestEntity() {
        return new OrdenRequestEntity();
    }

    /**
     * Create an instance of {@link ArrayOfOrdenDetalleRequestEntity }
     * 
     */
    public ArrayOfOrdenDetalleRequestEntity createArrayOfOrdenDetalleRequestEntity() {
        return new ArrayOfOrdenDetalleRequestEntity();
    }

    /**
     * Create an instance of {@link ArrayOfOrdenEntity }
     * 
     */
    public ArrayOfOrdenEntity createArrayOfOrdenEntity() {
        return new ArrayOfOrdenEntity();
    }

    /**
     * Create an instance of {@link ArrayOfOrdenesAbiertasEntity }
     * 
     */
    public ArrayOfOrdenesAbiertasEntity createArrayOfOrdenesAbiertasEntity() {
        return new ArrayOfOrdenesAbiertasEntity();
    }

    /**
     * Create an instance of {@link ArrayOfOrdenesCerradasXMesEntity }
     * 
     */
    public ArrayOfOrdenesCerradasXMesEntity createArrayOfOrdenesCerradasXMesEntity() {
        return new ArrayOfOrdenesCerradasXMesEntity();
    }

    /**
     * Create an instance of {@link ArrayOfOrdenesCerradasEntity }
     * 
     */
    public ArrayOfOrdenesCerradasEntity createArrayOfOrdenesCerradasEntity() {
        return new ArrayOfOrdenesCerradasEntity();
    }

    /**
     * Create an instance of {@link ArrayOfOrdenDetalleEntity }
     * 
     */
    public ArrayOfOrdenDetalleEntity createArrayOfOrdenDetalleEntity() {
        return new ArrayOfOrdenDetalleEntity();
    }

    /**
     * Create an instance of {@link OrdenDetalleRequestEntity }
     * 
     */
    public OrdenDetalleRequestEntity createOrdenDetalleRequestEntity() {
        return new OrdenDetalleRequestEntity();
    }

    /**
     * Create an instance of {@link OrdenEntity }
     * 
     */
    public OrdenEntity createOrdenEntity() {
        return new OrdenEntity();
    }

    /**
     * Create an instance of {@link OrdenesAbiertasEntity }
     * 
     */
    public OrdenesAbiertasEntity createOrdenesAbiertasEntity() {
        return new OrdenesAbiertasEntity();
    }

    /**
     * Create an instance of {@link OrdenesCerradasXMesEntity }
     * 
     */
    public OrdenesCerradasXMesEntity createOrdenesCerradasXMesEntity() {
        return new OrdenesCerradasXMesEntity();
    }

    /**
     * Create an instance of {@link OrdenesCerradasEntity }
     * 
     */
    public OrdenesCerradasEntity createOrdenesCerradasEntity() {
        return new OrdenesCerradasEntity();
    }

    /**
     * Create an instance of {@link OrdenDetalleEntity }
     * 
     */
    public OrdenDetalleEntity createOrdenDetalleEntity() {
        return new OrdenDetalleEntity();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrdenRequestEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OrdenEntities", name = "OrdenRequestEntity")
    public JAXBElement<OrdenRequestEntity> createOrdenRequestEntity(OrdenRequestEntity value) {
        return new JAXBElement<OrdenRequestEntity>(_OrdenRequestEntity_QNAME, OrdenRequestEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrdenDetalleRequestEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OrdenEntities", name = "ArrayOfOrdenDetalleRequestEntity")
    public JAXBElement<ArrayOfOrdenDetalleRequestEntity> createArrayOfOrdenDetalleRequestEntity(ArrayOfOrdenDetalleRequestEntity value) {
        return new JAXBElement<ArrayOfOrdenDetalleRequestEntity>(_ArrayOfOrdenDetalleRequestEntity_QNAME, ArrayOfOrdenDetalleRequestEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrdenDetalleRequestEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OrdenEntities", name = "OrdenDetalleRequestEntity")
    public JAXBElement<OrdenDetalleRequestEntity> createOrdenDetalleRequestEntity(OrdenDetalleRequestEntity value) {
        return new JAXBElement<OrdenDetalleRequestEntity>(_OrdenDetalleRequestEntity_QNAME, OrdenDetalleRequestEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrdenEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OrdenEntities", name = "ArrayOfOrdenEntity")
    public JAXBElement<ArrayOfOrdenEntity> createArrayOfOrdenEntity(ArrayOfOrdenEntity value) {
        return new JAXBElement<ArrayOfOrdenEntity>(_ArrayOfOrdenEntity_QNAME, ArrayOfOrdenEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrdenEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OrdenEntities", name = "OrdenEntity")
    public JAXBElement<OrdenEntity> createOrdenEntity(OrdenEntity value) {
        return new JAXBElement<OrdenEntity>(_OrdenEntity_QNAME, OrdenEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrdenesAbiertasEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OrdenEntities", name = "ArrayOfOrdenesAbiertasEntity")
    public JAXBElement<ArrayOfOrdenesAbiertasEntity> createArrayOfOrdenesAbiertasEntity(ArrayOfOrdenesAbiertasEntity value) {
        return new JAXBElement<ArrayOfOrdenesAbiertasEntity>(_ArrayOfOrdenesAbiertasEntity_QNAME, ArrayOfOrdenesAbiertasEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrdenesAbiertasEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OrdenEntities", name = "OrdenesAbiertasEntity")
    public JAXBElement<OrdenesAbiertasEntity> createOrdenesAbiertasEntity(OrdenesAbiertasEntity value) {
        return new JAXBElement<OrdenesAbiertasEntity>(_OrdenesAbiertasEntity_QNAME, OrdenesAbiertasEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrdenesCerradasXMesEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OrdenEntities", name = "ArrayOfOrdenesCerradasXMesEntity")
    public JAXBElement<ArrayOfOrdenesCerradasXMesEntity> createArrayOfOrdenesCerradasXMesEntity(ArrayOfOrdenesCerradasXMesEntity value) {
        return new JAXBElement<ArrayOfOrdenesCerradasXMesEntity>(_ArrayOfOrdenesCerradasXMesEntity_QNAME, ArrayOfOrdenesCerradasXMesEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrdenesCerradasXMesEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OrdenEntities", name = "OrdenesCerradasXMesEntity")
    public JAXBElement<OrdenesCerradasXMesEntity> createOrdenesCerradasXMesEntity(OrdenesCerradasXMesEntity value) {
        return new JAXBElement<OrdenesCerradasXMesEntity>(_OrdenesCerradasXMesEntity_QNAME, OrdenesCerradasXMesEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrdenesCerradasEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OrdenEntities", name = "ArrayOfOrdenesCerradasEntity")
    public JAXBElement<ArrayOfOrdenesCerradasEntity> createArrayOfOrdenesCerradasEntity(ArrayOfOrdenesCerradasEntity value) {
        return new JAXBElement<ArrayOfOrdenesCerradasEntity>(_ArrayOfOrdenesCerradasEntity_QNAME, ArrayOfOrdenesCerradasEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrdenesCerradasEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OrdenEntities", name = "OrdenesCerradasEntity")
    public JAXBElement<OrdenesCerradasEntity> createOrdenesCerradasEntity(OrdenesCerradasEntity value) {
        return new JAXBElement<OrdenesCerradasEntity>(_OrdenesCerradasEntity_QNAME, OrdenesCerradasEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOrdenDetalleEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OrdenEntities", name = "ArrayOfOrdenDetalleEntity")
    public JAXBElement<ArrayOfOrdenDetalleEntity> createArrayOfOrdenDetalleEntity(ArrayOfOrdenDetalleEntity value) {
        return new JAXBElement<ArrayOfOrdenDetalleEntity>(_ArrayOfOrdenDetalleEntity_QNAME, ArrayOfOrdenDetalleEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrdenDetalleEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/OrdenEntities", name = "OrdenDetalleEntity")
    public JAXBElement<OrdenDetalleEntity> createOrdenDetalleEntity(OrdenDetalleEntity value) {
        return new JAXBElement<OrdenDetalleEntity>(_OrdenDetalleEntity_QNAME, OrdenDetalleEntity.class, null, value);
    }

}
