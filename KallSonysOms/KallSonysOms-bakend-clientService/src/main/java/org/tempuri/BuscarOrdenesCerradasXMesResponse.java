
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ordenentities.ArrayOfOrdenesCerradasXMesEntity;


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
 *         &lt;element name="BuscarOrdenesCerradasXMesResult" type="{http://schemas.datacontract.org/2004/07/OrdenEntities}ArrayOfOrdenesCerradasXMesEntity" minOccurs="0"/&gt;
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
    "buscarOrdenesCerradasXMesResult"
})
@XmlRootElement(name = "BuscarOrdenesCerradasXMesResponse")
public class BuscarOrdenesCerradasXMesResponse {

    @XmlElement(name = "BuscarOrdenesCerradasXMesResult", nillable = true)
    protected ArrayOfOrdenesCerradasXMesEntity buscarOrdenesCerradasXMesResult;

    /**
     * Obtiene el valor de la propiedad buscarOrdenesCerradasXMesResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrdenesCerradasXMesEntity }
     *     
     */
    public ArrayOfOrdenesCerradasXMesEntity getBuscarOrdenesCerradasXMesResult() {
        return buscarOrdenesCerradasXMesResult;
    }

    /**
     * Define el valor de la propiedad buscarOrdenesCerradasXMesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrdenesCerradasXMesEntity }
     *     
     */
    public void setBuscarOrdenesCerradasXMesResult(ArrayOfOrdenesCerradasXMesEntity value) {
        this.buscarOrdenesCerradasXMesResult = value;
    }

}
