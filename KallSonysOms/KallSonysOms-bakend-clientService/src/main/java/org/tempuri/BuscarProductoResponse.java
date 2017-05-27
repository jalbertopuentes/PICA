
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.productoentities.ProductoEntity;


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
 *         &lt;element name="BuscarProductoResult" type="{http://schemas.datacontract.org/2004/07/ProductoEntities}ProductoEntity" minOccurs="0"/&gt;
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
    "buscarProductoResult"
})
@XmlRootElement(name = "BuscarProductoResponse")
public class BuscarProductoResponse {

    @XmlElement(name = "BuscarProductoResult", nillable = true)
    protected ProductoEntity buscarProductoResult;

    /**
     * Obtiene el valor de la propiedad buscarProductoResult.
     * 
     * @return
     *     possible object is
     *     {@link ProductoEntity }
     *     
     */
    public ProductoEntity getBuscarProductoResult() {
        return buscarProductoResult;
    }

    /**
     * Define el valor de la propiedad buscarProductoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductoEntity }
     *     
     */
    public void setBuscarProductoResult(ProductoEntity value) {
        this.buscarProductoResult = value;
    }

}
