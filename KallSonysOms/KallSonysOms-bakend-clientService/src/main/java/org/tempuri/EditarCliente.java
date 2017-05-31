
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.clienteentities.ClienteModRequestEntity;
import org.datacontract.schemas._2004._07.clienteentities.TarjetaModRequestEntity;


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
 *         &lt;element name="CE" type="{http://schemas.datacontract.org/2004/07/ClienteEntities}ClienteModRequestEntity" minOccurs="0"/&gt;
 *         &lt;element name="TE" type="{http://schemas.datacontract.org/2004/07/ClienteEntities}TarjetaModRequestEntity" minOccurs="0"/&gt;
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
    "ce",
    "te"
})
@XmlRootElement(name = "EditarCliente")
public class EditarCliente {

    @XmlElement(name = "CE", nillable = true)
    protected ClienteModRequestEntity ce;
    @XmlElement(name = "TE", nillable = true)
    protected TarjetaModRequestEntity te;

    /**
     * Obtiene el valor de la propiedad ce.
     * 
     * @return
     *     possible object is
     *     {@link ClienteModRequestEntity }
     *     
     */
    public ClienteModRequestEntity getCE() {
        return ce;
    }

    /**
     * Define el valor de la propiedad ce.
     * 
     * @param value
     *     allowed object is
     *     {@link ClienteModRequestEntity }
     *     
     */
    public void setCE(ClienteModRequestEntity value) {
        this.ce = value;
    }

    /**
     * Obtiene el valor de la propiedad te.
     * 
     * @return
     *     possible object is
     *     {@link TarjetaModRequestEntity }
     *     
     */
    public TarjetaModRequestEntity getTE() {
        return te;
    }

    /**
     * Define el valor de la propiedad te.
     * 
     * @param value
     *     allowed object is
     *     {@link TarjetaModRequestEntity }
     *     
     */
    public void setTE(TarjetaModRequestEntity value) {
        this.te = value;
    }

}
