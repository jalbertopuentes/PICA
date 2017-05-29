package co.com.kallsonys.oms.backend.entity.oracle;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the TARJETA database table.
 * 
 */
@Embeddable
public class TarjetaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private long idtarjeta;

	private long idcliente;

	public TarjetaPK() {
	}
	public long getIdtarjeta() {
		return this.idtarjeta;
	}
	public void setIdtarjeta(long idtarjeta) {
		this.idtarjeta = idtarjeta;
	}
	public long getIdcliente() {
		return this.idcliente;
	}
	public void setIdcliente(long idcliente) {
		this.idcliente = idcliente;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TarjetaPK)) {
			return false;
		}
		TarjetaPK castOther = (TarjetaPK)other;
		return 
			(this.idtarjeta == castOther.idtarjeta)
			&& (this.idcliente == castOther.idcliente);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.idtarjeta ^ (this.idtarjeta >>> 32)));
		hash = hash * prime + ((int) (this.idcliente ^ (this.idcliente >>> 32)));
		
		return hash;
	}
}