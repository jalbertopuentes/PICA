package co.com.kallsonys.oms.backend.dao.oracle;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import co.com.kallsonys.oms.backend.entity.oracle.Ordendetalle;

public class OrdenDetalleDao {
	
	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("KallSonysOms-backend-oracle");

	public  List<Ordendetalle> getOrdenDetalleXidProducto( Long idProducto ){
		List< Ordendetalle > ordenesDetalles = null;
		try{
			EntityManager entitymanager = emfactory.createEntityManager( );
			Query query = entitymanager.createNamedQuery("Ordendetalle.findXidProducto");
			query.setParameter("idProducto",idProducto);
			ordenesDetalles =  query.getResultList();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return ordenesDetalles;
	}

}
