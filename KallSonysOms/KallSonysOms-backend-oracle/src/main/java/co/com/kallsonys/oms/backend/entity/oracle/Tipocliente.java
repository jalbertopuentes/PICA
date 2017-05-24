package co.com.kallsonys.oms.backend.entity.oracle;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the TIPOCLIENTE database table.
 * 
 */
@Entity
@NamedQuery(name="Tipocliente.findAll", query="SELECT t FROM Tipocliente t")
public class Tipocliente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idtipocliente;

	private String tipo;

	//bi-directional many-to-one association to Cliente
	@OneToMany(mappedBy="tipocliente")
	private List<Cliente> clientes;

	public Tipocliente() {
	}

	public long getIdtipocliente() {
		return this.idtipocliente;
	}

	public void setIdtipocliente(long idtipocliente) {
		this.idtipocliente = idtipocliente;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public List<Cliente> getClientes() {
		return this.clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public Cliente addCliente(Cliente cliente) {
		getClientes().add(cliente);
		cliente.setTipocliente(this);

		return cliente;
	}

	public Cliente removeCliente(Cliente cliente) {
		getClientes().remove(cliente);
		cliente.setTipocliente(null);

		return cliente;
	}

}