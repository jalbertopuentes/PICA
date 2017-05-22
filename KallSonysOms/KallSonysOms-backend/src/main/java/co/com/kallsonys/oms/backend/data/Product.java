package co.com.kallsonys.oms.backend.data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Set;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import co.com.kallsonys.oms.backend.entity.Categoria;
import co.com.kallsonys.oms.backend.entity.Fabricante;

public class Product implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -4101589436634049432L;
	@NotNull
    private int id = -1;
    @NotNull
    @Size(min = 2, message = "El nombre del producto debe tener al menos dos palabras")
    private String productName = "";
    @NotNull
    @Min(0)
    private BigDecimal price = BigDecimal.ZERO;
    @NotNull
    private Set<Category> category;
    @NotNull
    @Min(value = 0, message = "No se pueden ingresar datos negativos en el disponible")
    private int stockCount = 0;
    @NotNull
    private Availability availability = Availability.COMING;
    @NotNull
    private String codigo;
    @NotNull
    private String urlImagen;
    @NotNull
    private Categoria categoria;
    @NotNull
    @Min(0)
    private BigDecimal valorDescuento = BigDecimal.ZERO;
    @NotNull
    private Fabricante fabricante;
    
    public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	private String descripcion;

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	public BigDecimal getValorDescuento() {
		return valorDescuento;
	}

	public void setValorDescuento(BigDecimal valorDescuento) {
		this.valorDescuento = valorDescuento;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

    public String getUrlImagen() {
		return urlImagen;
	}

	public void setUrlImagen(String urlImagen) {
		this.urlImagen = urlImagen;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Set<Category> getCategory() {
        return category;
    }

    public void setCategory(Set<Category> category) {
        this.category = category;
    }

    public int getStockCount() {
        return stockCount;
    }

    public void setStockCount(int stockCount) {
        this.stockCount = stockCount;
    }

    public Availability getAvailability() {
        return availability;
    }

    public void setAvailability(Availability availability) {
        this.availability = availability;
    }

}
