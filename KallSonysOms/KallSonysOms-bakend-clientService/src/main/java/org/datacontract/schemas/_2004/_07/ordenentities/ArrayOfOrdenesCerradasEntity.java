
package org.datacontract.schemas._2004._07.ordenentities;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfOrdenesCerradasEntity complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOrdenesCerradasEntity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrdenesCerradasEntity" type="{http://schemas.datacontract.org/2004/07/OrdenEntities}OrdenesCerradasEntity" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOrdenesCerradasEntity", propOrder = {
    "ordenesCerradasEntity"
})
public class ArrayOfOrdenesCerradasEntity {

    @XmlElement(name = "OrdenesCerradasEntity", nillable = true)
    protected List<OrdenesCerradasEntity> ordenesCerradasEntity;

    /**
     * Gets the value of the ordenesCerradasEntity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ordenesCerradasEntity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrdenesCerradasEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrdenesCerradasEntity }
     * 
     * 
     */
    public List<OrdenesCerradasEntity> getOrdenesCerradasEntity() {
        if (ordenesCerradasEntity == null) {
            ordenesCerradasEntity = new ArrayList<OrdenesCerradasEntity>();
        }
        return this.ordenesCerradasEntity;
    }

}
