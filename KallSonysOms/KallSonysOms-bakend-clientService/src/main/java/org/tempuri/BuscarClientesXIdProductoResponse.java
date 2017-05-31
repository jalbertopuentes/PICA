
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.clienteentities.ArrayOfClienteEntity;


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
 *         &lt;element name="BuscarClientesXIdProductoResult" type="{http://schemas.datacontract.org/2004/07/ClienteEntities}ArrayOfClienteEntity" minOccurs="0"/&gt;
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
    "buscarClientesXIdProductoResult"
})
@XmlRootElement(name = "BuscarClientesXIdProductoResponse")
public class BuscarClientesXIdProductoResponse {

    @XmlElement(name = "BuscarClientesXIdProductoResult", nillable = true)
    protected ArrayOfClienteEntity buscarClientesXIdProductoResult;

    /**
     * Obtiene el valor de la propiedad buscarClientesXIdProductoResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClienteEntity }
     *     
     */
    public ArrayOfClienteEntity getBuscarClientesXIdProductoResult() {
        return buscarClientesXIdProductoResult;
    }

    /**
     * Define el valor de la propiedad buscarClientesXIdProductoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClienteEntity }
     *     
     */
    public void setBuscarClientesXIdProductoResult(ArrayOfClienteEntity value) {
        this.buscarClientesXIdProductoResult = value;
    }

}
