
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
 *         &lt;element name="EditarClienteBasicoResult" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
    "editarClienteBasicoResult"
})
@XmlRootElement(name = "EditarClienteBasicoResponse")
public class EditarClienteBasicoResponse {

    @XmlElement(name = "EditarClienteBasicoResult")
    protected Integer editarClienteBasicoResult;

    /**
     * Obtiene el valor de la propiedad editarClienteBasicoResult.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEditarClienteBasicoResult() {
        return editarClienteBasicoResult;
    }

    /**
     * Define el valor de la propiedad editarClienteBasicoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEditarClienteBasicoResult(Integer value) {
        this.editarClienteBasicoResult = value;
    }

}
