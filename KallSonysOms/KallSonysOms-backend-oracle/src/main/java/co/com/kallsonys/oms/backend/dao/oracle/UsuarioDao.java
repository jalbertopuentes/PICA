package co.com.kallsonys.oms.backend.dao.oracle;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import co.com.kallsonys.oms.backend.entity.oracle.Usuario;

public class UsuarioDao {
	
	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("KallSonysOms-backend-oracle");

	public  List<Usuario> getAll(){
		List<Usuario> usuarios = null;
		try{
			EntityManager entitymanager = emfactory.createEntityManager( );
			Query query = entitymanager.createNamedQuery("Usuario.findAll");
			usuarios =  query.getResultList();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return usuarios;
	}
}
