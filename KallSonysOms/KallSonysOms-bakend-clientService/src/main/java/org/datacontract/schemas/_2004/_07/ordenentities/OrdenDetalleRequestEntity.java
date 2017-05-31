
package org.datacontract.schemas._2004._07.ordenentities;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para OrdenDetalleRequestEntity complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OrdenDetalleRequestEntity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Cantidad" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Categoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Fabricante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdCategoria" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdFabricante" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IdProducto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ProductoNombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="URLImagen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Valor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrdenDetalleRequestEntity", propOrder = {
    "cantidad",
    "categoria",
    "fabricante",
    "idCategoria",
    "idFabricante",
    "idProducto",
    "productoNombre",
    "urlImagen",
    "valor"
})
public class OrdenDetalleRequestEntity {

    @XmlElement(name = "Cantidad")
    protected Integer cantidad;
    @XmlElement(name = "Categoria", nillable = true)
    protected String categoria;
    @XmlElement(name = "Fabricante", nillable = true)
    protected String fabricante;
    @XmlElement(name = "IdCategoria")
    protected Integer idCategoria;
    @XmlElement(name = "IdFabricante")
    protected Integer idFabricante;
    @XmlElement(name = "IdProducto")
    protected Integer idProducto;
    @XmlElement(name = "ProductoNombre", nillable = true)
    protected String productoNombre;
    @XmlElement(name = "URLImagen", nillable = true)
    protected String urlImagen;
    @XmlElement(name = "Valor")
    protected BigDecimal valor;

    /**
     * Obtiene el valor de la propiedad cantidad.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCantidad() {
        return cantidad;
    }

    /**
     * Define el valor de la propiedad cantidad.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCantidad(Integer value) {
        this.cantidad = value;
    }

    /**
     * Obtiene el valor de la propiedad categoria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Define el valor de la propiedad categoria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoria(String value) {
        this.categoria = value;
    }

    /**
     * Obtiene el valor de la propiedad fabricante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFabricante() {
        return fabricante;
    }

    /**
     * Define el valor de la propiedad fabricante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFabricante(String value) {
        this.fabricante = value;
    }

    /**
     * Obtiene el valor de la propiedad idCategoria.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdCategoria() {
        return idCategoria;
    }

    /**
     * Define el valor de la propiedad idCategoria.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdCategoria(Integer value) {
        this.idCategoria = value;
    }

    /**
     * Obtiene el valor de la propiedad idFabricante.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdFabricante() {
        return idFabricante;
    }

    /**
     * Define el valor de la propiedad idFabricante.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdFabricante(Integer value) {
        this.idFabricante = value;
    }

    /**
     * Obtiene el valor de la propiedad idProducto.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdProducto() {
        return idProducto;
    }

    /**
     * Define el valor de la propiedad idProducto.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdProducto(Integer value) {
        this.idProducto = value;
    }

    /**
     * Obtiene el valor de la propiedad productoNombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductoNombre() {
        return productoNombre;
    }

    /**
     * Define el valor de la propiedad productoNombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductoNombre(String value) {
        this.productoNombre = value;
    }

    /**
     * Obtiene el valor de la propiedad urlImagen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLImagen() {
        return urlImagen;
    }

    /**
     * Define el valor de la propiedad urlImagen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURLImagen(String value) {
        this.urlImagen = value;
    }

    /**
     * Obtiene el valor de la propiedad valor.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValor() {
        return valor;
    }

    /**
     * Define el valor de la propiedad valor.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValor(BigDecimal value) {
        this.valor = value;
    }

}
