package co.com.kallsonys.oms.backend.entity.oracle;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ESTADOENVIO database table.
 * 
 */
@Entity
@NamedQuery(name="Estadoenvio.findAll", query="SELECT e FROM Estadoenvio e")
public class Estadoenvio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(updatable=false)
	private long idestado;

	private String descripcion;

	//bi-directional many-to-one association to Orden
	@OneToMany(mappedBy="estadoenvio")
	private List<Orden> ordens;

	public Estadoenvio() {
	}

	public long getIdestado() {
		return this.idestado;
	}

	public void setIdestado(long idestado) {
		this.idestado = idestado;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Orden> getOrdens() {
		return this.ordens;
	}

	public void setOrdens(List<Orden> ordens) {
		this.ordens = ordens;
	}

	public Orden addOrden(Orden orden) {
		getOrdens().add(orden);
		orden.setEstadoenvio(this);

		return orden;
	}

	public Orden removeOrden(Orden orden) {
		getOrdens().remove(orden);
		orden.setEstadoenvio(null);

		return orden;
	}

}