package co.com.kallsonys.oms.backend.dao.oracle;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import co.com.kallsonys.oms.backend.entity.oracle.Campana;


public class CampanaDao {
	
	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("KallSonysOms-backend-oracle");
	
	public  List<Campana> getAllCampanas(){
		List<Campana> campanas = null;
		try{
			EntityManager entitymanager = emfactory.createEntityManager( );
			Query query = entitymanager.createNamedQuery("Campana.findAll");
			campanas =  query.getResultList();
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		return campanas;
	}
	
}
