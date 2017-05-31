package co.com.kallsonys.oms.backend.dao.oracle;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import co.com.kallsonys.oms.backend.entity.oracle.Tarjeta;
import co.com.kallsonys.oms.backend.entity.oracle.TarjetaPK;

public class TarjetaDao {
	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("KallSonysOms-backend-oracle");

	public  Tarjeta getTarjetaXId( long idTarjeta, long idCliente ){
		List<Tarjeta> tarjetas = null;
		Tarjeta tarjeta = null;
		try{
			TarjetaPK pk = new TarjetaPK();
			pk.setIdtarjeta(idTarjeta);
			pk.setIdcliente(idCliente);
			EntityManager entitymanager = emfactory.createEntityManager( );
			Query query = entitymanager.createNamedQuery("Tarjeta.findXid");
			query.setParameter("idTarjeta",pk);
			tarjetas = query.getResultList();
			for(Tarjeta t:tarjetas ){
				tarjeta = t;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return tarjeta;
	}
}
