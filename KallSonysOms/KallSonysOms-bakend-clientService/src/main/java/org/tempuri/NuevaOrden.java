
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ordenentities.ArrayOfOrdenDetalleRequestEntity;
import org.datacontract.schemas._2004._07.ordenentities.OrdenRequestEntity;


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
 *         &lt;element name="OE" type="{http://schemas.datacontract.org/2004/07/OrdenEntities}OrdenRequestEntity" minOccurs="0"/&gt;
 *         &lt;element name="ODES" type="{http://schemas.datacontract.org/2004/07/OrdenEntities}ArrayOfOrdenDetalleRequestEntity" minOccurs="0"/&gt;
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
    "oe",
    "odes"
})
@XmlRootElement(name = "NuevaOrden")
public class NuevaOrden {

    @XmlElement(name = "OE", nillable = true)
    protected OrdenRequestEntity oe;
    @XmlElement(name = "ODES", nillable = true)
    protected ArrayOfOrdenDetalleRequestEntity odes;

    /**
     * Obtiene el valor de la propiedad oe.
     * 
     * @return
     *     possible object is
     *     {@link OrdenRequestEntity }
     *     
     */
    public OrdenRequestEntity getOE() {
        return oe;
    }

    /**
     * Define el valor de la propiedad oe.
     * 
     * @param value
     *     allowed object is
     *     {@link OrdenRequestEntity }
     *     
     */
    public void setOE(OrdenRequestEntity value) {
        this.oe = value;
    }

    /**
     * Obtiene el valor de la propiedad odes.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrdenDetalleRequestEntity }
     *     
     */
    public ArrayOfOrdenDetalleRequestEntity getODES() {
        return odes;
    }

    /**
     * Define el valor de la propiedad odes.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrdenDetalleRequestEntity }
     *     
     */
    public void setODES(ArrayOfOrdenDetalleRequestEntity value) {
        this.odes = value;
    }

}
