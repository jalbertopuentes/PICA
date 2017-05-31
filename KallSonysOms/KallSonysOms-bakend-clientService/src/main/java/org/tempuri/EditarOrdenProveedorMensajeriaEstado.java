
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
 *         &lt;element name="idOrden" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="proveedorMensajeria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "proveedorMensajeria",
    "estado"
})
@XmlRootElement(name = "EditarOrdenProveedorMensajeriaEstado")
public class EditarOrdenProveedorMensajeriaEstado {

    protected Integer idOrden;
    @XmlElement(nillable = true)
    protected String proveedorMensajeria;
    @XmlElement(nillable = true)
    protected String estado;

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
     * Obtiene el valor de la propiedad proveedorMensajeria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProveedorMensajeria() {
        return proveedorMensajeria;
    }

    /**
     * Define el valor de la propiedad proveedorMensajeria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProveedorMensajeria(String value) {
        this.proveedorMensajeria = value;
    }

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

}
