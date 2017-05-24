package co.com.kallsonys.oms.backend.entity.oracle;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the TIPODOCUMENTO database table.
 * 
 */
@Entity
@NamedQuery(name="Tipodocumento.findAll", query="SELECT t FROM Tipodocumento t")
public class Tipodocumento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idtipodocumento;

	private String tipodocumento;

	//bi-directional many-to-one association to Cliente
	@OneToMany(mappedBy="tipodocumento")
	private List<Cliente> clientes;

	public Tipodocumento() {
	}

	public long getIdtipodocumento() {
		return this.idtipodocumento;
	}

	public void setIdtipodocumento(long idtipodocumento) {
		this.idtipodocumento = idtipodocumento;
	}

	public String getTipodocumento() {
		return this.tipodocumento;
	}

	public void setTipodocumento(String tipodocumento) {
		this.tipodocumento = tipodocumento;
	}

	public List<Cliente> getClientes() {
		return this.clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public Cliente addCliente(Cliente cliente) {
		getClientes().add(cliente);
		cliente.setTipodocumento(this);

		return cliente;
	}

	public Cliente removeCliente(Cliente cliente) {
		getClientes().remove(cliente);
		cliente.setTipodocumento(null);

		return cliente;
	}

}