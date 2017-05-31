
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
 *         &lt;element name="NuevaTarjetaOrdenResult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
    "nuevaTarjetaOrdenResult"
})
@XmlRootElement(name = "NuevaTarjetaOrdenResponse")
public class NuevaTarjetaOrdenResponse {

    @XmlElement(name = "NuevaTarjetaOrdenResult")
    protected Boolean nuevaTarjetaOrdenResult;

    /**
     * Obtiene el valor de la propiedad nuevaTarjetaOrdenResult.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNuevaTarjetaOrdenResult() {
        return nuevaTarjetaOrdenResult;
    }

    /**
     * Define el valor de la propiedad nuevaTarjetaOrdenResult.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNuevaTarjetaOrdenResult(Boolean value) {
        this.nuevaTarjetaOrdenResult = value;
    }

}
