package co.com.kallsonys.oms.backend.entity.oracle;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the ORDENDETALLE database table.
 * 
 */
@Entity
@NamedQuery(name="Ordendetalle.findAll", query="SELECT o FROM Ordendetalle o")
public class Ordendetalle implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(updatable=false)
	private long idordendetalle;

	private BigDecimal cantidad;

	private String categoria;

	private BigDecimal idcategoria;

	private BigDecimal idproducto;

	private String productonombre;

	private BigDecimal valor;
	
	@ManyToOne
	@JoinColumn(name="IDORDEN")
	private Orden orden;

	public Ordendetalle() {
	}

	public long getIdordendetalle() {
		return this.idordendetalle;
	}

	public void setIdordendetalle(long idordendetalle) {
		this.idordendetalle = idordendetalle;
	}

	public BigDecimal getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(BigDecimal cantidad) {
		this.cantidad = cantidad;
	}

	public String getCategoria() {
		return this.categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public BigDecimal getIdcategoria() {
		return this.idcategoria;
	}

	public void setIdcategoria(BigDecimal idcategoria) {
		this.idcategoria = idcategoria;
	}

	public BigDecimal getIdproducto() {
		return this.idproducto;
	}

	public void setIdproducto(BigDecimal idproducto) {
		this.idproducto = idproducto;
	}

	public String getProductonombre() {
		return this.productonombre;
	}

	public void setProductonombre(String productonombre) {
		this.productonombre = productonombre;
	}

	public BigDecimal getValor() {
		return this.valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Orden getOrden() {
		return orden;
	}

	public void setOrden(Orden orden) {
		this.orden = orden;
	}

}