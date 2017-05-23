package co.com.kallsonys.oms.backend.bdservice.oracle;

import java.io.Serializable;
import java.util.List;

import co.com.kallsonys.oms.backend.entity.oracle.Campana;

public abstract class OracleDataService implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8964279183382454550L;
	
	public abstract List<Campana> getAllCampanas();
	
	public static OracleDataService get() {
        return OracleDataServiceImpl.getInstance();
    }

}
