package co.com.kallsonys.oms.backend.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the Categoria database table.
 * 
 */
@Entity
@NamedQuery(name="Categoria.findAll", query="SELECT c FROM Categoria c")
public class Categoria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="IdCategoria")
	private int idCategoria;

	@Column(name="Nombre")
	private String nombre;

	//bi-directional many-to-one association to Producto
	@OneToMany(mappedBy="categoria")
	private List<Producto> productos;

	public Categoria() {
	}

	public int getIdCategoria() {
		return this.idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Producto> getProductos() {
		return this.productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public Producto addProducto(Producto producto) {
		getProductos().add(producto);
		producto.setCategoria(this);

		return producto;
	}

	public Producto removeProducto(Producto producto) {
		getProductos().remove(producto);
		producto.setCategoria(null);

		return producto;
	}
	
	 @Override
	    public String toString() {
	        return getNombre();
	    }

}