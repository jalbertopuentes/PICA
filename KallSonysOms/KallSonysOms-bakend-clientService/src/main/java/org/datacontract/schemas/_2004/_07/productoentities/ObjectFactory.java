
package org.datacontract.schemas._2004._07.productoentities;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.productoentities package. 
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

    private final static QName _ProductoEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/ProductoEntities", "ProductoEntity");
    private final static QName _ArrayOfProductoEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/ProductoEntities", "ArrayOfProductoEntity");
    private final static QName _ArrayOfCategoriaEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/ProductoEntities", "ArrayOfCategoriaEntity");
    private final static QName _CategoriaEntity_QNAME = new QName("http://schemas.datacontract.org/2004/07/ProductoEntities", "CategoriaEntity");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.productoentities
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProductoEntity }
     * 
     */
    public ProductoEntity createProductoEntity() {
        return new ProductoEntity();
    }

    /**
     * Create an instance of {@link ArrayOfProductoEntity }
     * 
     */
    public ArrayOfProductoEntity createArrayOfProductoEntity() {
        return new ArrayOfProductoEntity();
    }

    /**
     * Create an instance of {@link ArrayOfCategoriaEntity }
     * 
     */
    public ArrayOfCategoriaEntity createArrayOfCategoriaEntity() {
        return new ArrayOfCategoriaEntity();
    }

    /**
     * Create an instance of {@link CategoriaEntity }
     * 
     */
    public CategoriaEntity createCategoriaEntity() {
        return new CategoriaEntity();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductoEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ProductoEntities", name = "ProductoEntity")
    public JAXBElement<ProductoEntity> createProductoEntity(ProductoEntity value) {
        return new JAXBElement<ProductoEntity>(_ProductoEntity_QNAME, ProductoEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProductoEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ProductoEntities", name = "ArrayOfProductoEntity")
    public JAXBElement<ArrayOfProductoEntity> createArrayOfProductoEntity(ArrayOfProductoEntity value) {
        return new JAXBElement<ArrayOfProductoEntity>(_ArrayOfProductoEntity_QNAME, ArrayOfProductoEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCategoriaEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ProductoEntities", name = "ArrayOfCategoriaEntity")
    public JAXBElement<ArrayOfCategoriaEntity> createArrayOfCategoriaEntity(ArrayOfCategoriaEntity value) {
        return new JAXBElement<ArrayOfCategoriaEntity>(_ArrayOfCategoriaEntity_QNAME, ArrayOfCategoriaEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoriaEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ProductoEntities", name = "CategoriaEntity")
    public JAXBElement<CategoriaEntity> createCategoriaEntity(CategoriaEntity value) {
        return new JAXBElement<CategoriaEntity>(_CategoriaEntity_QNAME, CategoriaEntity.class, null, value);
    }

}
