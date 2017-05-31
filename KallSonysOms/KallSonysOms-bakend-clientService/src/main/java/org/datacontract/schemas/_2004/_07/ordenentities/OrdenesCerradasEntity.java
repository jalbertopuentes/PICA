
package org.datacontract.schemas._2004._07.ordenentities;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para OrdenesCerradasEntity complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OrdenesCerradasEntity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Orden" type="{http://schemas.datacontract.org/2004/07/OrdenEntities}OrdenEntity" minOccurs="0"/&gt;
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
@XmlType(name = "OrdenesCerradasEntity", propOrder = {
    "orden",
    "valorFacturado"
})
public class OrdenesCerradasEntity {

    @XmlElement(name = "Orden", nillable = true)
    protected OrdenEntity orden;
    @XmlElement(name = "ValorFacturado", nillable = true)
    protected BigDecimal valorFacturado;

    /**
     * Obtiene el valor de la propiedad orden.
     * 
     * @return
     *     possible object is
     *     {@link OrdenEntity }
     *     
     */
    public OrdenEntity getOrden() {
        return orden;
    }

    /**
     * Define el valor de la propiedad orden.
     * 
     * @param value
     *     allowed object is
     *     {@link OrdenEntity }
     *     
     */
    public void setOrden(OrdenEntity value) {
        this.orden = value;
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
