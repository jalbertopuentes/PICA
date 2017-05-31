package co.com.kallsonys.oms.backend.dao.oracle;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import co.com.kallsonys.oms.backend.entity.oracle.Tipocliente;

public class TipoClienteDao {
	
	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("KallSonysOms-backend-oracle");

	public  List<Tipocliente> getAll(){
		List<Tipocliente> tipoClientes = null;
		try{
			EntityManager entitymanager = emfactory.createEntityManager( );
			Query query = entitymanager.createNamedQuery("Tipocliente.findAll");
			tipoClientes =  query.getResultList();
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		return tipoClientes;
	}

}
