package co.com.kallsonys.oms.backend.bdservice.oracle;

import java.io.Serializable;
import java.util.List;

import co.com.kallsonys.oms.backend.entity.oracle.Campana;
import co.com.kallsonys.oms.backend.entity.oracle.Cliente;
import co.com.kallsonys.oms.backend.entity.oracle.Orden;
import co.com.kallsonys.oms.backend.entity.oracle.Tarjeta;
import co.com.kallsonys.oms.backend.entity.oracle.Tipocliente;
import co.com.kallsonys.oms.backend.entity.oracle.Usuario;

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
	
	public abstract void eliminarCampana(Campana c);
	
	public abstract List<Orden> getOrdenesParaCancelar();
	
	public abstract Tarjeta getTarjetaXId( long idTarjeta, long idCliente );
	
	public abstract void cancelarOrden( Orden o );
	
	public abstract List<Tipocliente> getAllTipoCliente();
	
	public abstract List<Orden> getOrdenesXidProducto( Long idProducto );
	
	public abstract List<Usuario> getAllUsuarios();

}
