package co.com.kallsonys.oms.backend.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import co.com.kallsonys.oms.backend.entity.Categoria;
import co.com.kallsonys.oms.backend.entity.Producto;

public class ProductoDao {
	
	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("KallSonysOms-backend");
	
	public  List<Producto> consultarTodosLosProductos(){
		List<Producto> productos = null;
		try{
			EntityManager entitymanager = emfactory.createEntityManager( );
			Query query = entitymanager.createNamedQuery("Producto.findAll");
			productos =  query.getResultList();
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		return productos;
	}
	
	public void actualizarProducto( Producto p ){
		EntityManager entitymanager = emfactory.createEntityManager( );
		try{
			entitymanager.getTransaction().begin();
			Producto producto = entitymanager.find(Producto.class, p.getIdProducto());
			producto.setCantidad(p.getCantidad());
			Categoria categoria = new Categoria();
			categoria.setIdCategoria(p.getCategoria().getIdCategoria());
			producto.setCategoria(categoria);
			producto.setCodigo(p.getCodigo());
			producto.setNombre(p.getNombre());
			producto.setUrlImagen(p.getUrlImagen());
			producto.setValor(p.getValor());
			entitymanager.getTransaction().commit();
		}catch( Exception e ){
			e.printStackTrace();
		}
		finally{
			entitymanager.close();
	    }
	}
	
	public void eliminarProducto(int idProducto){
		EntityManager entitymanager = emfactory.createEntityManager( );
		    try{
		    	entitymanager.getTransaction().begin();
		        Producto producto = entitymanager.find(Producto.class, idProducto);
		        entitymanager.remove(producto);
		        entitymanager.getTransaction().commit();
		    }
		    finally{
		    	entitymanager.close();
		    }
	}

}
