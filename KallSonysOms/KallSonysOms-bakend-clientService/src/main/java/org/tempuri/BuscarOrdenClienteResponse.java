
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.ordenentities.ArrayOfOrdenEntity;


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
 *         &lt;element name="BuscarOrdenClienteResult" type="{http://schemas.datacontract.org/2004/07/OrdenEntities}ArrayOfOrdenEntity" minOccurs="0"/&gt;
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
    "buscarOrdenClienteResult"
})
@XmlRootElement(name = "BuscarOrdenClienteResponse")
public class BuscarOrdenClienteResponse {

    @XmlElement(name = "BuscarOrdenClienteResult", nillable = true)
    protected ArrayOfOrdenEntity buscarOrdenClienteResult;

    /**
     * Obtiene el valor de la propiedad buscarOrdenClienteResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrdenEntity }
     *     
     */
    public ArrayOfOrdenEntity getBuscarOrdenClienteResult() {
        return buscarOrdenClienteResult;
    }

    /**
     * Define el valor de la propiedad buscarOrdenClienteResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrdenEntity }
     *     
     */
    public void setBuscarOrdenClienteResult(ArrayOfOrdenEntity value) {
        this.buscarOrdenClienteResult = value;
    }

}
