package co.com.kallsonys.oms.backend.dao.oracle;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import co.com.kallsonys.oms.backend.entity.oracle.Campana;
import co.com.kallsonys.oms.backend.entity.oracle.Cliente;

public class ClienteDao {
	
EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("KallSonysOms-backend-oracle");
	
	public  List<Cliente> getAll(){
		List<Cliente> clientes = null;
		try{
			EntityManager entitymanager = emfactory.createEntityManager( );
			Query query = entitymanager.createNamedQuery("Cliente.findAll");
			clientes =  query.getResultList();
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		return clientes;
	}
	
	public  void actualizar( Cliente c ){
		EntityManager entitymanager = emfactory.createEntityManager( );
		try{
			entitymanager.getTransaction().begin();
			Cliente cliente = entitymanager.find(Cliente.class, c.getIdcliente());
			
			cliente.setApellido(c.getApellido());
			cliente.setCiudad(c.getCiudad());
			cliente.setContrasena(c.getContrasena());
			cliente.setEmail(c.getEmail());
			cliente.setFechanacimiento(c.getFechanacimiento());
			cliente.setNombre(c.getNombre());
			cliente.setNumerodocumento(c.getNumerodocumento());
			cliente.setTipocliente(c.getTipocliente());
			cliente.setTipodocumento(c.getTipodocumento());
			cliente.setUsuario(c.getUsuario());
			entitymanager.getTransaction().commit();
		}catch( Exception e ){
			e.printStackTrace();
		}
		finally{
			entitymanager.close();
	    }
	}

}
