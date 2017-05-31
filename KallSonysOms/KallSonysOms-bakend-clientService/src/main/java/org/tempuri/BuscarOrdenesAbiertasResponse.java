
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ordenentities.ArrayOfOrdenesAbiertasEntity;


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
 *         &lt;element name="BuscarOrdenesAbiertasResult" type="{http://schemas.datacontract.org/2004/07/OrdenEntities}ArrayOfOrdenesAbiertasEntity" minOccurs="0"/&gt;
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
    "buscarOrdenesAbiertasResult"
})
@XmlRootElement(name = "BuscarOrdenesAbiertasResponse")
public class BuscarOrdenesAbiertasResponse {

    @XmlElement(name = "BuscarOrdenesAbiertasResult", nillable = true)
    protected ArrayOfOrdenesAbiertasEntity buscarOrdenesAbiertasResult;

    /**
     * Obtiene el valor de la propiedad buscarOrdenesAbiertasResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrdenesAbiertasEntity }
     *     
     */
    public ArrayOfOrdenesAbiertasEntity getBuscarOrdenesAbiertasResult() {
        return buscarOrdenesAbiertasResult;
    }

    /**
     * Define el valor de la propiedad buscarOrdenesAbiertasResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrdenesAbiertasEntity }
     *     
     */
    public void setBuscarOrdenesAbiertasResult(ArrayOfOrdenesAbiertasEntity value) {
        this.buscarOrdenesAbiertasResult = value;
    }

}
