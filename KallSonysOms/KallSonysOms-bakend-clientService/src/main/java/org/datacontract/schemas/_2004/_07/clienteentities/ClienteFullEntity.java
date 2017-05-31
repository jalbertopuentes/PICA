
package org.datacontract.schemas._2004._07.clienteentities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ClienteFullEntity complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ClienteFullEntity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Cliente" type="{http://schemas.datacontract.org/2004/07/ClienteEntities}ClienteEntity" minOccurs="0"/&gt;
 *         &lt;element name="Tarjeta" type="{http://schemas.datacontract.org/2004/07/ClienteEntities}TarjetaEntity" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClienteFullEntity", propOrder = {
    "cliente",
    "tarjeta"
})
public class ClienteFullEntity {

    @XmlElement(name = "Cliente", nillable = true)
    protected ClienteEntity cliente;
    @XmlElement(name = "Tarjeta", nillable = true)
    protected TarjetaEntity tarjeta;

    /**
     * Obtiene el valor de la propiedad cliente.
     * 
     * @return
     *     possible object is
     *     {@link ClienteEntity }
     *     
     */
    public ClienteEntity getCliente() {
        return cliente;
    }

    /**
     * Define el valor de la propiedad cliente.
     * 
     * @param value
     *     allowed object is
     *     {@link ClienteEntity }
     *     
     */
    public void setCliente(ClienteEntity value) {
        this.cliente = value;
    }

    /**
     * Obtiene el valor de la propiedad tarjeta.
     * 
     * @return
     *     possible object is
     *     {@link TarjetaEntity }
     *     
     */
    public TarjetaEntity getTarjeta() {
        return tarjeta;
    }

    /**
     * Define el valor de la propiedad tarjeta.
     * 
     * @param value
     *     allowed object is
     *     {@link TarjetaEntity }
     *     
     */
    public void setTarjeta(TarjetaEntity value) {
        this.tarjeta = value;
    }

}
