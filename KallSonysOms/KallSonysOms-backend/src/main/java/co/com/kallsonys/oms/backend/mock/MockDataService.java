package co.com.kallsonys.oms.backend.mock;

import java.util.ArrayList;
import java.util.List;

import co.com.kallsonys.oms.backend.DataService;
import co.com.kallsonys.oms.backend.dao.CategoriaDao;
import co.com.kallsonys.oms.backend.dao.ProductoDao;
import co.com.kallsonys.oms.backend.data.Category;
import co.com.kallsonys.oms.backend.data.Product;
import co.com.kallsonys.oms.backend.entity.Categoria;
import co.com.kallsonys.oms.backend.entity.Producto;

/**
 * Mock data model. This implementation has very simplistic locking and does not
 * notify users of modifications.
 */
public class MockDataService extends DataService {

	private static MockDataService INSTANCE;

	private List<Product> products;
	private List<Category> categories;
	private int nextProductId = 0;
	private ProductoDao productoDao = new ProductoDao();
	private CategoriaDao categoriaDao = new CategoriaDao();

	private MockDataService() {
		categories = MockDataGenerator.createCategories();
		products = MockDataGenerator.createProducts(categories);
		nextProductId = products.size() + 1;
	}

	public synchronized static DataService getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new MockDataService();
		}
		return INSTANCE;
	}

	@Override
	public synchronized List<Product> getAllProducts() {

		List<Producto> productosBd = productoDao.consultarTodosLosProductos();
		List<Product> products = new ArrayList<Product>();
		if( productosBd != null ){
			for( Producto p : productosBd ){
				Product pView= new Product();
				pView.setProductName(p.getNombre());
				pView.setPrice(p.getValor());
				pView.setStockCount(p.getCantidad());
				pView.setId(p.getIdProducto());
				pView.setCodigo(p.getCodigo());
				pView.setUrlImagen(p.getUrlImagen());
				pView.setCategoria(p.getCategoria());
				products.add(pView);
			}
		}


		return products;
	}

	@Override
	public synchronized List<Category> getAllCategories() {
		List<Categoria> categoriasBD=categoriaDao.consultarTodasLasCategorias();
		categories = new ArrayList<>();
		if(categoriasBD != null){
			for( Categoria c: categoriasBD ){
				Category cView= new Category();
				cView.setId(c.getIdCategoria());
				cView.setName(c.getNombre());
				categories.add(cView);
			}
		}
		
		return categories;
	}

	@Override
	public synchronized void updateProduct(Product p) {
		Producto producto = new Producto();
		producto.setIdProducto(p.getId());
		producto.setCantidad(p.getStockCount());
		producto.setCategoria(p.getCategoria());
		producto.setCodigo(p.getCodigo());
		producto.setNombre(p.getProductName());
		producto.setUrlImagen(p.getUrlImagen());
		producto.setValor(p.getPrice());
		productoDao.actualizarProducto(producto);
	}

	@Override
	public synchronized Product getProductById(int productId) {
		for (int i = 0; i < products.size(); i++) {
			if (products.get(i).getId() == productId) {
				return products.get(i);
			}
		}
		return null;
	}

	@Override
	public synchronized void deleteProduct(int productId) {
		productoDao.eliminarProducto(productId);
	}
}
