
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.clienteentities.ClienteVTOrdenEntity;


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
 *         &lt;element name="BuscarClienteOrdenResult" type="{http://schemas.datacontract.org/2004/07/ClienteEntities}ClienteVTOrdenEntity" minOccurs="0"/&gt;
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
    "buscarClienteOrdenResult"
})
@XmlRootElement(name = "BuscarClienteOrdenResponse")
public class BuscarClienteOrdenResponse {

    @XmlElement(name = "BuscarClienteOrdenResult", nillable = true)
    protected ClienteVTOrdenEntity buscarClienteOrdenResult;

    /**
     * Obtiene el valor de la propiedad buscarClienteOrdenResult.
     * 
     * @return
     *     possible object is
     *     {@link ClienteVTOrdenEntity }
     *     
     */
    public ClienteVTOrdenEntity getBuscarClienteOrdenResult() {
        return buscarClienteOrdenResult;
    }

    /**
     * Define el valor de la propiedad buscarClienteOrdenResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ClienteVTOrdenEntity }
     *     
     */
    public void setBuscarClienteOrdenResult(ClienteVTOrdenEntity value) {
        this.buscarClienteOrdenResult = value;
    }

}
