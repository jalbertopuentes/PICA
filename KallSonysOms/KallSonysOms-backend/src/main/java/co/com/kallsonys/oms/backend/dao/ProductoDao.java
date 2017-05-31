package co.com.kallsonys.oms.backend.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

import co.com.kallsonys.oms.backend.entity.Categoria;
import co.com.kallsonys.oms.backend.entity.Producto;

public class ProductoDao {

	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("KallSonysOms-backend");

	public  List<Producto> consultarTodosLosProductos(){
		List<Producto> productos = new ArrayList<Producto>();
		try{
			EntityManager entitymanager = emfactory.createEntityManager( );
			Query query = entitymanager.createNamedQuery("Producto.findXId",Producto.class);

			for (int i = 0;i<200;i++){
				query.setParameter("idProducto",i);
				Producto producto = null;
				try{
					producto =  (Producto) query.getSingleResult();
				}catch (NoResultException e) {

				}
				if( producto != null ){
					productos.add(producto);
				}
			}

			//			Query query = entitymanager.createNamedQuery("Producto.findAll");
			//			query.setMaxResults(1000);
			//			productos =  query.getResultList();
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
			producto.setCategoria(p.getCategoria());
			producto.setFabricante(p.getFabricante());
			producto.setDescripcion(p.getDescripcion());
			producto.setValorDescuento(p.getValorDescuento());
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

	public void crearProducto( Producto p ){
		EntityManager entitymanager = emfactory.createEntityManager( );
		try{
			entitymanager.getTransaction().begin();
			entitymanager.persist(p);
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
