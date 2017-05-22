package co.com.kallsonys.oms.backend.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import co.com.kallsonys.oms.backend.entity.Fabricante;

public class FabricanteDao {
	
	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("KallSonysOms-backend");
	
	public  List<Fabricante> consultarTodosLosFabricantes(){
		List<Fabricante> fabricantes = null;
		try{
			EntityManager entitymanager = emfactory.createEntityManager( );
			Query query = entitymanager.createNamedQuery("Fabricante.findAll");
			fabricantes =  query.getResultList();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return fabricantes;
	}

}
