
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ordenentities.ArrayOfOrdenDetalleEntity;


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
 *         &lt;element name="BuscarOrdenDetalleResult" type="{http://schemas.datacontract.org/2004/07/OrdenEntities}ArrayOfOrdenDetalleEntity" minOccurs="0"/&gt;
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
    "buscarOrdenDetalleResult"
})
@XmlRootElement(name = "BuscarOrdenDetalleResponse")
public class BuscarOrdenDetalleResponse {

    @XmlElement(name = "BuscarOrdenDetalleResult", nillable = true)
    protected ArrayOfOrdenDetalleEntity buscarOrdenDetalleResult;

    /**
     * Obtiene el valor de la propiedad buscarOrdenDetalleResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrdenDetalleEntity }
     *     
     */
    public ArrayOfOrdenDetalleEntity getBuscarOrdenDetalleResult() {
        return buscarOrdenDetalleResult;
    }

    /**
     * Define el valor de la propiedad buscarOrdenDetalleResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrdenDetalleEntity }
     *     
     */
    public void setBuscarOrdenDetalleResult(ArrayOfOrdenDetalleEntity value) {
        this.buscarOrdenDetalleResult = value;
    }

}
