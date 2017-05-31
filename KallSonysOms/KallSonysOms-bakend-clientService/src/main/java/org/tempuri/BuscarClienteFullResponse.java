
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.clienteentities.ClienteFullEntity;


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
 *         &lt;element name="BuscarClienteFullResult" type="{http://schemas.datacontract.org/2004/07/ClienteEntities}ClienteFullEntity" minOccurs="0"/&gt;
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
    "buscarClienteFullResult"
})
@XmlRootElement(name = "BuscarClienteFullResponse")
public class BuscarClienteFullResponse {

    @XmlElement(name = "BuscarClienteFullResult", nillable = true)
    protected ClienteFullEntity buscarClienteFullResult;

    /**
     * Obtiene el valor de la propiedad buscarClienteFullResult.
     * 
     * @return
     *     possible object is
     *     {@link ClienteFullEntity }
     *     
     */
    public ClienteFullEntity getBuscarClienteFullResult() {
        return buscarClienteFullResult;
    }

    /**
     * Define el valor de la propiedad buscarClienteFullResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ClienteFullEntity }
     *     
     */
    public void setBuscarClienteFullResult(ClienteFullEntity value) {
        this.buscarClienteFullResult = value;
    }

}
