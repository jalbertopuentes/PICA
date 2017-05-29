package co.com.kallsonys.oms.backend.entity.oracle;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the ORDEN database table.
 * 
 */
@Entity
@NamedQueries({
@NamedQuery(name="Orden.findAll", query="SELECT o FROM Orden o"),
@NamedQuery(name="Orden.buscarEstadosValidos", query="SELECT o FROM Orden o where o.estadoenvio IN :inListEstados")
})
public class Orden implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(updatable=false)
	private long idorden;

	private String asesor;

	private String celular;

	private String codigopostal;

	private String comentario;

	private String direccion;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	@Temporal(TemporalType.DATE)
	private Date fecharevision;

//	private long idpais;

	private long idtarjeta;

	private String personacontacto;

	private String telefono;

	//bi-directional many-to-one association to Ciudad
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="IDCIUDAD", referencedColumnName="IDCIUDAD"),
		@JoinColumn(name="IDPAIS", referencedColumnName="IDPAIS")
		})
	private Ciudad ciudad;

	//bi-directional many-to-one association to Cliente
	@ManyToOne
	@JoinColumn(name="IDCLIENTE")
	private Cliente cliente;

	//bi-directional many-to-one association to Estadoenvio
	@ManyToOne
	@JoinColumn(name="IDESTADO")
	private Estadoenvio estadoenvio;

	public Orden() {
	}

	public long getIdorden() {
		return this.idorden;
	}

	public void setIdorden(long idorden) {
		this.idorden = idorden;
	}

	public String getAsesor() {
		return this.asesor;
	}

	public void setAsesor(String asesor) {
		this.asesor = asesor;
	}

	public String getCelular() {
		return this.celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getCodigopostal() {
		return this.codigopostal;
	}

	public void setCodigopostal(String codigopostal) {
		this.codigopostal = codigopostal;
	}

	public String getComentario() {
		return this.comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Date getFecharevision() {
		return this.fecharevision;
	}

	public void setFecharevision(Date fecharevision) {
		this.fecharevision = fecharevision;
	}

//	public long getIdpais() {
//		return this.idpais;
//	}
//
//	public void setIdpais(long idpais) {
//		this.idpais = idpais;
//	}

	public long getIdtarjeta() {
		return this.idtarjeta;
	}

	public void setIdtarjeta(long idtarjeta) {
		this.idtarjeta = idtarjeta;
	}

	public String getPersonacontacto() {
		return this.personacontacto;
	}

	public void setPersonacontacto(String personacontacto) {
		this.personacontacto = personacontacto;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Ciudad getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Estadoenvio getEstadoenvio() {
		return this.estadoenvio;
	}

	public void setEstadoenvio(Estadoenvio estadoenvio) {
		this.estadoenvio = estadoenvio;
	}

}