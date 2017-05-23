package test;

import java.util.List;

import co.com.kallsonys.oms.backend.bdservice.oracle.OracleDataService;
import co.com.kallsonys.oms.backend.entity.oracle.Campana;

public class MainTest {
	
	public static void main(String[] args) {
		List<Campana> campanas = OracleDataService.get().getAllCampanas();
		for(Campana c: campanas){
			System.out.println(c.getTitulocampana());
		}
	}
	

}
