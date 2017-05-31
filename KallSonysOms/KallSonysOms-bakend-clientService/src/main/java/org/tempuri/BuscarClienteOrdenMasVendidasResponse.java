
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.clienteentities.ArrayOfClienteOrdenMasVendidasEntity;


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
 *         &lt;element name="BuscarClienteOrdenMasVendidasResult" type="{http://schemas.datacontract.org/2004/07/ClienteEntities}ArrayOfClienteOrdenMasVendidasEntity" minOccurs="0"/&gt;
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
    "buscarClienteOrdenMasVendidasResult"
})
@XmlRootElement(name = "BuscarClienteOrdenMasVendidasResponse")
public class BuscarClienteOrdenMasVendidasResponse {

    @XmlElement(name = "BuscarClienteOrdenMasVendidasResult", nillable = true)
    protected ArrayOfClienteOrdenMasVendidasEntity buscarClienteOrdenMasVendidasResult;

    /**
     * Obtiene el valor de la propiedad buscarClienteOrdenMasVendidasResult.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClienteOrdenMasVendidasEntity }
     *     
     */
    public ArrayOfClienteOrdenMasVendidasEntity getBuscarClienteOrdenMasVendidasResult() {
        return buscarClienteOrdenMasVendidasResult;
    }

    /**
     * Define el valor de la propiedad buscarClienteOrdenMasVendidasResult.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClienteOrdenMasVendidasEntity }
     *     
     */
    public void setBuscarClienteOrdenMasVendidasResult(ArrayOfClienteOrdenMasVendidasEntity value) {
        this.buscarClienteOrdenMasVendidasResult = value;
    }

}
