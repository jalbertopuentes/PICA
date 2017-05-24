package co.com.kallsonys.oms.backend.bdservice.oracle;

import java.io.Serializable;
import java.util.List;

import co.com.kallsonys.oms.backend.entity.oracle.Campana;
import co.com.kallsonys.oms.backend.entity.oracle.Cliente;

public abstract class OracleDataService implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8964279183382454550L;
	
	public static OracleDataService get() {
        return OracleDataServiceImpl.getInstance();
    }
	
	public abstract List<Campana> getAllCampanas();
	
	public abstract void actualizarCampanas( Campana c );
	
	public abstract List<Cliente> getAllClientes();
	
	public  abstract void actualizarCliente( Cliente c );

}
