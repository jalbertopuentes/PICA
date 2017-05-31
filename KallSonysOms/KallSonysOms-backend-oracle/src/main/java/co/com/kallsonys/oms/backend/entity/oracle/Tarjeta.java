package co.com.kallsonys.oms.backend.entity.oracle;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the TARJETA database table.
 * 
 */
@Entity
@NamedQueries({
@NamedQuery(name="Tarjeta.findAll", query="SELECT t FROM Tarjeta t"),
@NamedQuery(name="Tarjeta.findXid", query="SELECT t FROM Tarjeta t where t.id =:idTarjeta")
})
public class Tarjeta implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TarjetaPK id;

	private String cvc;

	@Temporal(TemporalType.DATE)
	private Date fechavencimiento;

	private java.math.BigDecimal idfranquicia;

	private String numero;

	public Tarjeta() {
	}

	public TarjetaPK getId() {
		return this.id;
	}

	public void setId(TarjetaPK id) {
		this.id = id;
	}

	public String getCvc() {
		return this.cvc;
	}

	public void setCvc(String cvc) {
		this.cvc = cvc;
	}

	public Date getFechavencimiento() {
		return this.fechavencimiento;
	}

	public void setFechavencimiento(Date fechavencimiento) {
		this.fechavencimiento = fechavencimiento;
	}

	public java.math.BigDecimal getIdfranquicia() {
		return this.idfranquicia;
	}

	public void setIdfranquicia(java.math.BigDecimal idfranquicia) {
		this.idfranquicia = idfranquicia;
	}

	public String getNumero() {
		return this.numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

}