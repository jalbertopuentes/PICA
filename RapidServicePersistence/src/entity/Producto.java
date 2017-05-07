package entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the Producto database table.
 * 
 */
@Entity
@NamedQueries({
@NamedQuery(name="Producto.findAll", query="SELECT p FROM Producto p"),
@NamedQuery(name="Producto.findByCodigo", query="SELECT p FROM Producto p WHERE p.codigo=:pCodigo" )
})
public class Producto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="IdProducto")
	private Long idProducto;

	@Column(name="Cantidad")
	private Long cantidad;

	@Column(name="Codigo")
	private String codigo;

	@Column(name="Descripcion")
	private String descripcion;

	@Column(name="IdCategoria")
	private int idCategoria;

	@Column(name="IdFabricante")
	private int idFabricante;

	@Column(name="Nombre")
	private String nombre;

	@Column(name="UrlImagen")
	private String urlImagen;

	@Column(name="Valor")
	private BigDecimal valor;

	@Column(name="ValorDescuento")
	private BigDecimal valorDescuento;

	public Producto() {
	}

	public Long getIdProducto() {
		return this.idProducto;
	}

	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}

	public Long getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(Long cantidad) {
		this.cantidad = cantidad;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getIdCategoria() {
		return this.idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	public int getIdFabricante() {
		return this.idFabricante;
	}

	public void setIdFabricante(int idFabricante) {
		this.idFabricante = idFabricante;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUrlImagen() {
		return this.urlImagen;
	}

	public void setUrlImagen(String urlImagen) {
		this.urlImagen = urlImagen;
	}

	public BigDecimal getValor() {
		return this.valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public BigDecimal getValorDescuento() {
		return this.valorDescuento;
	}

	public void setValorDescuento(BigDecimal valorDescuento) {
		this.valorDescuento = valorDescuento;
	}

}