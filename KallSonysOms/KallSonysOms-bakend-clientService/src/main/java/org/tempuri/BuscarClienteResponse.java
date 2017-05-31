
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.clienteentities.ClienteEntity;


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
 *         &lt;element name="BuscarClienteResult" type="{http://schemas.datacontract.org/2004/07/ClienteEntities}ClienteEntity" minOccurs="0"/&gt;
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
    "buscarClienteResult"
})
@XmlRootElement(name = "BuscarClienteResponse")
public class BuscarClienteResponse {

    @XmlElement(name = "BuscarClienteResult", nillable = true)
    protected ClienteEntity buscarClienteResult;

    /**
     * Obtiene el valor de la propiedad buscarClienteResult.
     * 
     * @return
     *     possible object is
     *     {@link ClienteEntity }
     *     
     */
    public ClienteEntity getBuscarClienteResult() {
        return buscarClienteResult;
    }

    /**
     * Define el valor de la propiedad buscarClienteResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ClienteEntity }
     *     
     */
    public void setBuscarClienteResult(ClienteEntity value) {
        this.buscarClienteResult = value;
    }

}
