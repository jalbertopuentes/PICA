package co.com.kallsonys.oms.backend;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import co.com.kallsonys.oms.backend.data.Category;
import co.com.kallsonys.oms.backend.data.Product;
import co.com.kallsonys.oms.backend.entity.Categoria;
import co.com.kallsonys.oms.backend.entity.Fabricante;
import co.com.kallsonys.oms.backend.mock.MockDataService;

/**
 * Back-end service interface for retrieving and updating product data.
 */
public abstract class DataService implements Serializable {

    public abstract Collection<Product> getAllProducts();

    public abstract Collection<Category> getAllCategories();
    
    public abstract List<Categoria> getCategorias();

    public abstract void updateProduct(Product p);

    public abstract void deleteProduct(int productId);

    public abstract Product getProductById(int productId);

    public static DataService get() {
        return MockDataService.getInstance();
    }
    
    public abstract  List<Fabricante> consultarTodosLosFabricantes();

}
