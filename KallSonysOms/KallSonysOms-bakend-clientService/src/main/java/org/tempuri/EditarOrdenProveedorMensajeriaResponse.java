
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EditarOrdenProveedorMensajeriaResult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "editarOrdenProveedorMensajeriaResult"
})
@XmlRootElement(name = "EditarOrdenProveedorMensajeriaResponse")
public class EditarOrdenProveedorMensajeriaResponse {

    @XmlElement(name = "EditarOrdenProveedorMensajeriaResult")
    protected Boolean editarOrdenProveedorMensajeriaResult;

    /**
     * Obtiene el valor de la propiedad editarOrdenProveedorMensajeriaResult.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEditarOrdenProveedorMensajeriaResult() {
        return editarOrdenProveedorMensajeriaResult;
    }

    /**
     * Define el valor de la propiedad editarOrdenProveedorMensajeriaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEditarOrdenProveedorMensajeriaResult(Boolean value) {
        this.editarOrdenProveedorMensajeriaResult = value;
    }

}
