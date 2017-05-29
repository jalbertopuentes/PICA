package co.com.kallsonys.oms.backend.dao.oracle;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import co.com.kallsonys.oms.backend.entity.oracle.Tarjeta;

public class TarjetaDao {
	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("KallSonysOms-backend-oracle");

	public  Tarjeta getTarjetaXId( long idTarjeta ){
		Tarjeta tarjeta = null;
		try{
			EntityManager entitymanager = emfactory.createEntityManager( );
			tarjeta = entitymanager.find(Tarjeta.class, idTarjeta);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return tarjeta;
	}
}
