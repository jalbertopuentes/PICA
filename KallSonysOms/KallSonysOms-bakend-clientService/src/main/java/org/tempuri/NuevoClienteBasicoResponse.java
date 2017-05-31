
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
 *         &lt;element name="NuevoClienteBasicoResult" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
    "nuevoClienteBasicoResult"
})
@XmlRootElement(name = "NuevoClienteBasicoResponse")
public class NuevoClienteBasicoResponse {

    @XmlElement(name = "NuevoClienteBasicoResult")
    protected Integer nuevoClienteBasicoResult;

    /**
     * Obtiene el valor de la propiedad nuevoClienteBasicoResult.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNuevoClienteBasicoResult() {
        return nuevoClienteBasicoResult;
    }

    /**
     * Define el valor de la propiedad nuevoClienteBasicoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNuevoClienteBasicoResult(Integer value) {
        this.nuevoClienteBasicoResult = value;
    }

}
