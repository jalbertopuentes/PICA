package co.com.kallsonys.oms.backend.test;

import java.util.List;

import co.com.kallsonys.oms.backend.dao.ProductoDao;
import co.com.kallsonys.oms.backend.entity.Producto;

public class TestJpa {

	public static void main(String[] args) {
		ProductoDao dao = new ProductoDao();

		List<Producto> productos = dao.consultarTodosLosProductos();

		for( Producto p : productos ){
			System.out.println(p.getCodigo());
		}
	}

}
