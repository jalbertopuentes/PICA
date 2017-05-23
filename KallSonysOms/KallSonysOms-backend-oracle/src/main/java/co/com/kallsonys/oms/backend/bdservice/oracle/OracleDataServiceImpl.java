package co.com.kallsonys.oms.backend.bdservice.oracle;

import java.util.List;

import co.com.kallsonys.oms.backend.dao.oracle.CampanaDao;
import co.com.kallsonys.oms.backend.entity.oracle.Campana;

public class OracleDataServiceImpl extends OracleDataService {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8998750844680817948L;
	
	private static OracleDataServiceImpl INSTANCE;
	private CampanaDao campanaDao = new CampanaDao();
	
	public synchronized static OracleDataServiceImpl getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new OracleDataServiceImpl();
		}
		return INSTANCE;
	}
	
	@Override
	public List<Campana> getAllCampanas(){
		return campanaDao.getAllCampanas();
	}
	
	

}
