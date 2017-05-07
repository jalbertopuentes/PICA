package test;

import java.util.List;

import entity.Producto;
import facade.PersistenceFacade;

public class testMain {

	private static PersistenceFacade facade = new PersistenceFacade();

	public static void main(String[] args) {
//		consultarTodosLosProductos();
		consultarProductoXCodigo();

	}

	private static void consultarProductoXCodigo(){
		Producto producto = facade.consultarProductoXCodigo("LJGTH31TN9N3MJYDR05BP5QODLY1G8KYJJGRVT0SPWX1UJNF");
		if(producto!=null){
			System.out.println(producto.getCantidad()+"; "+producto.getValor());
		}else{
			System.out.println("null");
		}
		
	}

	private static void consultarTodosLosProductos(){
		List<Producto> productos = facade.consultarTodosLosProductos();

		for( Producto p: productos ){
			System.out.println("Nombre: "+p.getNombre()+"; Cantidad:"+p.getCantidad()
			+"; Codigo:"+p.getCodigo());
		}
	}

}
