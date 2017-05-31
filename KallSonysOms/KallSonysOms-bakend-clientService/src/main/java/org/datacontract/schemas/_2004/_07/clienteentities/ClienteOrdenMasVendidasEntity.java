
package org.datacontract.schemas._2004._07.clienteentities;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ClienteOrdenMasVendidasEntity complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ClienteOrdenMasVendidasEntity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Cliente" type="{http://schemas.datacontract.org/2004/07/ClienteEntities}ClienteEntity" minOccurs="0"/&gt;
 *         &lt;element name="NumeroOrdenes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ValorFacturado" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClienteOrdenMasVendidasEntity", propOrder = {
    "cliente",
    "numeroOrdenes",
    "valorFacturado"
})
public class ClienteOrdenMasVendidasEntity {

    @XmlElement(name = "Cliente", nillable = true)
    protected ClienteEntity cliente;
    @XmlElement(name = "NumeroOrdenes")
    protected Integer numeroOrdenes;
    @XmlElement(name = "ValorFacturado", nillable = true)
    protected BigDecimal valorFacturado;

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
     * Obtiene el valor de la propiedad numeroOrdenes.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroOrdenes() {
        return numeroOrdenes;
    }

    /**
     * Define el valor de la propiedad numeroOrdenes.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroOrdenes(Integer value) {
        this.numeroOrdenes = value;
    }

    /**
     * Obtiene el valor de la propiedad valorFacturado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorFacturado() {
        return valorFacturado;
    }

    /**
     * Define el valor de la propiedad valorFacturado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorFacturado(BigDecimal value) {
        this.valorFacturado = value;
    }

}
