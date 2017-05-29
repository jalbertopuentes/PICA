package co.com.kallsonys.oms.backend.entity.oracle;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the CAMPANA database table.
 * 
 */
@Entity
@NamedQuery(name="Campana.findAll", query="SELECT c FROM Campana c")
public class Campana implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idcampana;

	private String descripcion;

	@Temporal(TemporalType.DATE)
	private Date fechafinal;

	@Temporal(TemporalType.DATE)
	private Date fechainicial;

	private String subtitulocampana;

	private String titulocampana;

	private String urlimagen;

	//bi-directional many-to-one association to Productoxcampana
	@OneToMany(mappedBy="campana",cascade = CascadeType.ALL,orphanRemoval=true)
	private List<Productoxcampana> productoxcampanas;

	public Campana() {
	}

	public long getIdcampana() {
		return this.idcampana;
	}

	public void setIdcampana(long idcampana) {
		this.idcampana = idcampana;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFechafinal() {
		return this.fechafinal;
	}

	public void setFechafinal(Date fechafinal) {
		this.fechafinal = fechafinal;
	}

	public Date getFechainicial() {
		return this.fechainicial;
	}

	public void setFechainicial(Date fechainicial) {
		this.fechainicial = fechainicial;
	}

	public String getSubtitulocampana() {
		return this.subtitulocampana;
	}

	public void setSubtitulocampana(String subtitulocampana) {
		this.subtitulocampana = subtitulocampana;
	}

	public String getTitulocampana() {
		return this.titulocampana;
	}

	public void setTitulocampana(String titulocampana) {
		this.titulocampana = titulocampana;
	}

	public String getUrlimagen() {
		return this.urlimagen;
	}

	public void setUrlimagen(String urlimagen) {
		this.urlimagen = urlimagen;
	}

	public List<Productoxcampana> getProductoxcampanas() {
		return this.productoxcampanas;
	}

	public void setProductoxcampanas(List<Productoxcampana> productoxcampanas) {
		this.productoxcampanas = productoxcampanas;
	}

	public Productoxcampana addProductoxcampana(Productoxcampana productoxcampana) {
		getProductoxcampanas().add(productoxcampana);
		productoxcampana.setCampana(this);

		return productoxcampana;
	}

	public Productoxcampana removeProductoxcampana(Productoxcampana productoxcampana) {
		getProductoxcampanas().remove(productoxcampana);
		productoxcampana.setCampana(null);

		return productoxcampana;
	}

}