
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.clienteentities.TarjetaAddRequestEntity;


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
 *         &lt;element name="idOrden" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TE" type="{http://schemas.datacontract.org/2004/07/ClienteEntities}TarjetaAddRequestEntity" minOccurs="0"/&gt;
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
    "idOrden",
    "te"
})
@XmlRootElement(name = "NuevaTarjetaOrden")
public class NuevaTarjetaOrden {

    protected Integer idOrden;
    @XmlElement(name = "TE", nillable = true)
    protected TarjetaAddRequestEntity te;

    /**
     * Obtiene el valor de la propiedad idOrden.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdOrden() {
        return idOrden;
    }

    /**
     * Define el valor de la propiedad idOrden.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdOrden(Integer value) {
        this.idOrden = value;
    }

    /**
     * Obtiene el valor de la propiedad te.
     * 
     * @return
     *     possible object is
     *     {@link TarjetaAddRequestEntity }
     *     
     */
    public TarjetaAddRequestEntity getTE() {
        return te;
    }

    /**
     * Define el valor de la propiedad te.
     * 
     * @param value
     *     allowed object is
     *     {@link TarjetaAddRequestEntity }
     *     
     */
    public void setTE(TarjetaAddRequestEntity value) {
        this.te = value;
    }

}
