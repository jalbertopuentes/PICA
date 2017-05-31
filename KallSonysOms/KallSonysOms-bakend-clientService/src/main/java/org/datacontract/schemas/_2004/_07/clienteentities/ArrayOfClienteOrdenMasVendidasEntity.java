
package org.datacontract.schemas._2004._07.clienteentities;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfClienteOrdenMasVendidasEntity complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfClienteOrdenMasVendidasEntity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClienteOrdenMasVendidasEntity" type="{http://schemas.datacontract.org/2004/07/ClienteEntities}ClienteOrdenMasVendidasEntity" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClienteOrdenMasVendidasEntity", propOrder = {
    "clienteOrdenMasVendidasEntity"
})
public class ArrayOfClienteOrdenMasVendidasEntity {

    @XmlElement(name = "ClienteOrdenMasVendidasEntity", nillable = true)
    protected List<ClienteOrdenMasVendidasEntity> clienteOrdenMasVendidasEntity;

    /**
     * Gets the value of the clienteOrdenMasVendidasEntity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clienteOrdenMasVendidasEntity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClienteOrdenMasVendidasEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClienteOrdenMasVendidasEntity }
     * 
     * 
     */
    public List<ClienteOrdenMasVendidasEntity> getClienteOrdenMasVendidasEntity() {
        if (clienteOrdenMasVendidasEntity == null) {
            clienteOrdenMasVendidasEntity = new ArrayList<ClienteOrdenMasVendidasEntity>();
        }
        return this.clienteOrdenMasVendidasEntity;
    }

}
