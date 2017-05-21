package co.com.kallsonys.oms.backend.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import co.com.kallsonys.oms.backend.entity.Categoria;
import co.com.kallsonys.oms.backend.entity.Producto;

public class CategoriaDao {
	
	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("KallSonysOms-backend");
	
	public  List<Categoria> consultarTodasLasCategorias(){
		List<Categoria> categorias = null;
		try{
			EntityManager entitymanager = emfactory.createEntityManager( );
			Query query = entitymanager.createNamedQuery("Categoria.findAll");
			categorias =  query.getResultList();
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		return categorias;
	}

}
