
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
 *         &lt;element name="BuscarCategoriasFechaResult" type="{http://schemas.datacontract.org/2004/07/ProductoEntities}ArrayOfCategoriaEntity" minOccurs="0"/&gt;
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
    "buscarCategoriasFechaResult"
})
@XmlRootElement(name = "BuscarCategoriasFechaResponse")
public class BuscarCategoriasFechaResponse {

    @XmlElement(name = "BuscarCategoriasFechaResult", nillable = true)
    protected ArrayOfCategoriaEntity buscarCategoriasFechaResult;

    /**
     * Obtiene el valor de la propiedad buscarCategoriasFechaResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCategoriaEntity }
     *     
     */
    public ArrayOfCategoriaEntity getBuscarCategoriasFechaResult() {
        return buscarCategoriasFechaResult;
    }

    /**
     * Define el valor de la propiedad buscarCategoriasFechaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCategoriaEntity }
     *     
     */
    public void setBuscarCategoriasFechaResult(ArrayOfCategoriaEntity value) {
        this.buscarCategoriasFechaResult = value;
    }

}
