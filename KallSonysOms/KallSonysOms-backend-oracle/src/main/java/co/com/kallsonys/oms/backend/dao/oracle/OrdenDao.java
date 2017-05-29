package co.com.kallsonys.oms.backend.dao.oracle;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import co.com.kallsonys.oms.backend.entity.oracle.Estadoenvio;
import co.com.kallsonys.oms.backend.entity.oracle.Orden;

public class OrdenDao {
	
	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("KallSonysOms-backend-oracle");

	public  List<Orden> getOrdenesParaCancelar(){
		List<Orden> ordenes = null;
		try{
			EntityManager entitymanager = emfactory.createEntityManager( );
			Query query = entitymanager.createNamedQuery("Orden.buscarEstadosValidos");
			
			List<Long> idsEstados = new ArrayList<Long>();
			idsEstados.add(1L);
			idsEstados.add(2L);
			idsEstados.add(3L);
			idsEstados.add(4L);
			idsEstados.add(5L);
			query.setParameter("inListEstados",idsEstados);
			ordenes =  query.getResultList();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return ordenes;
	}
	
	public  void cancelar( Orden o ){
		EntityManager entitymanager = emfactory.createEntityManager( );
		try{
			entitymanager.getTransaction().begin();
			Orden orden = entitymanager.find(Orden.class, o.getIdorden());
			Estadoenvio e = new Estadoenvio();
			e.setIdestado(6);
			orden.setEstadoenvio(e);
			entitymanager.getTransaction().commit();
		}catch( Exception e ){
			e.printStackTrace();
		}
		finally{
			entitymanager.close();
		}
	}
	
}
