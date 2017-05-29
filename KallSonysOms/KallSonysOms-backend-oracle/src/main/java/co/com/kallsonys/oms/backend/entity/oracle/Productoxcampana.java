package co.com.kallsonys.oms.backend.entity.oracle;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the PRODUCTOXCAMPANA database table.
 * 
 */
@Entity
@NamedQuery(name="Productoxcampana.findAll", query="SELECT p FROM Productoxcampana p")
public class Productoxcampana implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idproductoxcampana;

	private String descripcion;

	private BigDecimal idproducto;

	private BigDecimal valor;

	//bi-directional many-to-one association to Campana
	@ManyToOne
	@JoinColumn(name="IDCAMPANA")
	private Campana campana;
	

	public Productoxcampana() {
	}

	public long getIdproductoxcampana() {
		return this.idproductoxcampana;
	}

	public void setIdproductoxcampana(long idproductoxcampana) {
		this.idproductoxcampana = idproductoxcampana;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public BigDecimal getIdproducto() {
		return this.idproducto;
	}

	public void setIdproducto(BigDecimal idproducto) {
		this.idproducto = idproducto;
	}

	public BigDecimal getValor() {
		return this.valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Campana getCampana() {
		return this.campana;
	}

	public void setCampana(Campana campana) {
		this.campana = campana;
	}

}