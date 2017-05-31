
package org.datacontract.schemas._2004._07.ordenentities;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para OrdenesCerradasXMesEntity complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OrdenesCerradasXMesEntity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Mes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "OrdenesCerradasXMesEntity", propOrder = {
    "mes",
    "numeroOrdenes",
    "valorFacturado"
})
public class OrdenesCerradasXMesEntity {

    @XmlElement(name = "Mes", nillable = true)
    protected String mes;
    @XmlElement(name = "NumeroOrdenes", nillable = true)
    protected Integer numeroOrdenes;
    @XmlElement(name = "ValorFacturado", nillable = true)
    protected BigDecimal valorFacturado;

    /**
     * Obtiene el valor de la propiedad mes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMes() {
        return mes;
    }

    /**
     * Define el valor de la propiedad mes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMes(String value) {
        this.mes = value;
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
