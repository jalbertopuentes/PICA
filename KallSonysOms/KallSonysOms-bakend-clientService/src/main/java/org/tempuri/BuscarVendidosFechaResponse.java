
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
 *         &lt;element name="BuscarVendidosFechaResult" type="{http://schemas.datacontract.org/2004/07/ProductoEntities}ArrayOfProductoEntity" minOccurs="0"/&gt;
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
    "buscarVendidosFechaResult"
})
@XmlRootElement(name = "BuscarVendidosFechaResponse")
public class BuscarVendidosFechaResponse {

    @XmlElement(name = "BuscarVendidosFechaResult", nillable = true)
    protected ArrayOfProductoEntity buscarVendidosFechaResult;

    /**
     * Obtiene el valor de la propiedad buscarVendidosFechaResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfProductoEntity }
     *     
     */
    public ArrayOfProductoEntity getBuscarVendidosFechaResult() {
        return buscarVendidosFechaResult;
    }

    /**
     * Define el valor de la propiedad buscarVendidosFechaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfProductoEntity }
     *     
     */
    public void setBuscarVendidosFechaResult(ArrayOfProductoEntity value) {
        this.buscarVendidosFechaResult = value;
    }

}
