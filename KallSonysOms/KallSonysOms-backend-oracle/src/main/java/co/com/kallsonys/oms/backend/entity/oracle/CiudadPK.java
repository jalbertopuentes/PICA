package co.com.kallsonys.oms.backend.entity.oracle;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the CIUDAD database table.
 * 
 */
@Embeddable
public class CiudadPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private long idciudad;

	@Column(insertable=false, updatable=false)
	private long idpais;

	public CiudadPK() {
	}
	public long getIdciudad() {
		return this.idciudad;
	}
	public void setIdciudad(long idciudad) {
		this.idciudad = idciudad;
	}
	public long getIdpais() {
		return this.idpais;
	}
	public void setIdpais(long idpais) {
		this.idpais = idpais;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CiudadPK)) {
			return false;
		}
		CiudadPK castOther = (CiudadPK)other;
		return 
			(this.idciudad == castOther.idciudad)
			&& (this.idpais == castOther.idpais);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.idciudad ^ (this.idciudad >>> 32)));
		hash = hash * prime + ((int) (this.idpais ^ (this.idpais >>> 32)));
		
		return hash;
	}
}