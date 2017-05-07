package facade;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.sun.tools.xjc.generator.bean.ImplStructureStrategy.Result;

import entity.Producto;


public class PersistenceFacade {

	public  List<Producto> consultarTodosLosProductos(){
		List<Producto> productos = null;
		try{
			EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("RapidServicePersistence");
			EntityManager entitymanager = emfactory.createEntityManager( );
			Query query = entitymanager.createNamedQuery("Producto.findAll");
			productos =  query.getResultList();
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		return productos;
	}
	
	public  Producto consultarProductoXCodigo(String codigo){
		Producto producto = null;
		try{
			EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("RapidServicePersistence");
			EntityManager entitymanager = emfactory.createEntityManager( );
			Query query = entitymanager.createNamedQuery("Producto.findByCodigo");
			query.setParameter("pCodigo", codigo);
			producto =  (Producto) query.getSingleResult();
			entitymanager.refresh(producto);
		}
		catch (NoResultException e ) {
			System.out.println("No se encontro producto por codigo:::"+codigo);
		}

		return producto;
	}


}
