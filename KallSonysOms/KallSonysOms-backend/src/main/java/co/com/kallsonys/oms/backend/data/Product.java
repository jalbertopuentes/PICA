package co.com.kallsonys.oms.backend.data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Set;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Product implements Serializable {

    @NotNull
    private int id = -1;
    @NotNull
    @Size(min = 2, message = "El nombre del producto debe tener al menos dos palabras")
    private String productName = "";
    @Min(0)
    private BigDecimal price = BigDecimal.ZERO;
    private Set<Category> category;
    @Min(value = 0, message = "No se pueden ingresar datos negativos en el disponible")
    private int stockCount = 0;
    @NotNull
    private Availability availability = Availability.COMING;

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
