
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.productoentities.ArrayOfProductoEntity;


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
 *         &lt;element name="BuscarProductoCodigoResult" type="{http://schemas.datacontract.org/2004/07/ProductoEntities}ArrayOfProductoEntity" minOccurs="0"/&gt;
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
    "buscarProductoCodigoResult"
})
@XmlRootElement(name = "BuscarProductoCodigoResponse")
public class BuscarProductoCodigoResponse {

    @XmlElement(name = "BuscarProductoCodigoResult", nillable = true)
    protected ArrayOfProductoEntity buscarProductoCodigoResult;

    /**
     * Obtiene el valor de la propiedad buscarProductoCodigoResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProductoEntity }
     *     
     */
    public ArrayOfProductoEntity getBuscarProductoCodigoResult() {
        return buscarProductoCodigoResult;
    }

    /**
     * Define el valor de la propiedad buscarProductoCodigoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProductoEntity }
     *     
     */
    public void setBuscarProductoCodigoResult(ArrayOfProductoEntity value) {
        this.buscarProductoCodigoResult = value;
    }

}
