
package org.datacontract.schemas._2004._07.productoentities;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfProductoEntity complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfProductoEntity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProductoEntity" type="{http://schemas.datacontract.org/2004/07/ProductoEntities}ProductoEntity" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProductoEntity", propOrder = {
    "productoEntity"
})
public class ArrayOfProductoEntity {

    @XmlElement(name = "ProductoEntity", nillable = true)
    protected List<ProductoEntity> productoEntity;

    /**
     * Gets the value of the productoEntity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productoEntity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductoEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductoEntity }
     * 
     * 
     */
    public List<ProductoEntity> getProductoEntity() {
        if (productoEntity == null) {
            productoEntity = new ArrayList<ProductoEntity>();
        }
        return this.productoEntity;
    }

}
