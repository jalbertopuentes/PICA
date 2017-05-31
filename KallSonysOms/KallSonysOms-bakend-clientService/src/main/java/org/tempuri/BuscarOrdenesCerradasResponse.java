
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ordenentities.ArrayOfOrdenesCerradasEntity;


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
 *         &lt;element name="BuscarOrdenesCerradasResult" type="{http://schemas.datacontract.org/2004/07/OrdenEntities}ArrayOfOrdenesCerradasEntity" minOccurs="0"/&gt;
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
    "buscarOrdenesCerradasResult"
})
@XmlRootElement(name = "BuscarOrdenesCerradasResponse")
public class BuscarOrdenesCerradasResponse {

    @XmlElement(name = "BuscarOrdenesCerradasResult", nillable = true)
    protected ArrayOfOrdenesCerradasEntity buscarOrdenesCerradasResult;

    /**
     * Obtiene el valor de la propiedad buscarOrdenesCerradasResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrdenesCerradasEntity }
     *     
     */
    public ArrayOfOrdenesCerradasEntity getBuscarOrdenesCerradasResult() {
        return buscarOrdenesCerradasResult;
    }

    /**
     * Define el valor de la propiedad buscarOrdenesCerradasResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrdenesCerradasEntity }
     *     
     */
    public void setBuscarOrdenesCerradasResult(ArrayOfOrdenesCerradasEntity value) {
        this.buscarOrdenesCerradasResult = value;
    }

}
