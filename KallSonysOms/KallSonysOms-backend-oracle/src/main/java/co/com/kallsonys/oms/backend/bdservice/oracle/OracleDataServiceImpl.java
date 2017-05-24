package co.com.kallsonys.oms.backend.bdservice.oracle;

import java.util.List;

import co.com.kallsonys.oms.backend.dao.oracle.CampanaDao;
import co.com.kallsonys.oms.backend.dao.oracle.ClienteDao;
import co.com.kallsonys.oms.backend.entity.oracle.Campana;
import co.com.kallsonys.oms.backend.entity.oracle.Cliente;

public class OracleDataServiceImpl extends OracleDataService {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8998750844680817948L;
	
	private static OracleDataServiceImpl INSTANCE;
	private CampanaDao campanaDao = new CampanaDao();
	private ClienteDao clienteDao = new ClienteDao();
	
	public synchronized static OracleDataServiceImpl getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new OracleDataServiceImpl();
		}
		return INSTANCE;
	}
	
	public static OracleDataService get() {
        return OracleDataServiceImpl.getInstance();
    }
	
	@Override
	public List<Campana> getAllCampanas(){
		return campanaDao.getAllCampanas();
	}
	
	@Override
	public void actualizarCampanas( Campana c ){
		campanaDao.actualizarCampanas(c);
	}
	
	@Override
	public List<Cliente> getAllClientes(){
		return clienteDao.getAll();
	}
	
	@Override
	public  void actualizarCliente( Cliente c ){
		clienteDao.actualizar(c);
	}
	
}
