
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.productoentities.ArrayOfCategoriaEntity;


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
 *         &lt;element name="BuscarTop5CategoriasFechaResult" type="{http://schemas.datacontract.org/2004/07/ProductoEntities}ArrayOfCategoriaEntity" minOccurs="0"/&gt;
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
    "buscarTop5CategoriasFechaResult"
})
@XmlRootElement(name = "BuscarTop5CategoriasFechaResponse")
public class BuscarTop5CategoriasFechaResponse {

    @XmlElement(name = "BuscarTop5CategoriasFechaResult", nillable = true)
    protected ArrayOfCategoriaEntity buscarTop5CategoriasFechaResult;

    /**
     * Obtiene el valor de la propiedad buscarTop5CategoriasFechaResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCategoriaEntity }
     *     
     */
    public ArrayOfCategoriaEntity getBuscarTop5CategoriasFechaResult() {
        return buscarTop5CategoriasFechaResult;
    }

    /**
     * Define el valor de la propiedad buscarTop5CategoriasFechaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCategoriaEntity }
     *     
     */
    public void setBuscarTop5CategoriasFechaResult(ArrayOfCategoriaEntity value) {
        this.buscarTop5CategoriasFechaResult = value;
    }

}
