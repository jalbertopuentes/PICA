package co.com.kallsonys.backend.services.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.ws.commons.schema.XmlSchemaContentModel;
import org.datacontract.schemas._2004._07.ordenentities.ArrayOfOrdenesAbiertasEntity;
import org.datacontract.schemas._2004._07.ordenentities.ArrayOfOrdenesCerradasEntity;
import org.datacontract.schemas._2004._07.ordenentities.ArrayOfOrdenesCerradasXMesEntity;
import org.tempuri.ISrvEntOrden;
import org.tempuri.SrvEntOrden;

public class ServicioOrdenImpl {

	public ArrayOfOrdenesAbiertasEntity buscarOrdenesAbiertas(){
		ArrayOfOrdenesAbiertasEntity arrayOfOrdenesAbiertasEntity = null;
		try{
			SrvEntOrden srvEntOrden = new SrvEntOrden();
			ISrvEntOrden port = srvEntOrden.getPort(ISrvEntOrden.class);
			return port.buscarOrdenesAbiertas();
		}catch(Exception e){
			e.printStackTrace();
		}
		return arrayOfOrdenesAbiertasEntity;
	}
	
	public ArrayOfOrdenesCerradasXMesEntity buscarOrdenesCerradasXMes(){
		ArrayOfOrdenesCerradasXMesEntity arrayOfOrdenesAbiertasEntity = null;
		try{
			SrvEntOrden srvEntOrden = new SrvEntOrden();
			ISrvEntOrden port = srvEntOrden.getPort(ISrvEntOrden.class);
			return port.buscarOrdenesCerradasXMes();
		}catch(Exception e){
			e.printStackTrace();
		}
		return arrayOfOrdenesAbiertasEntity;
	}
	
	public ArrayOfOrdenesCerradasEntity buscarOrdenesCerradas( XMLGregorianCalendar fechaInicio, XMLGregorianCalendar fechaFin ){
		ArrayOfOrdenesCerradasEntity arrayOfOrdenesCerradasEntity = null;
		try{
			SrvEntOrden srvEntOrden = new SrvEntOrden();
			ISrvEntOrden port = srvEntOrden.getPort(ISrvEntOrden.class);
			return port.buscarOrdenesCerradas(fechaInicio, fechaFin);
		}catch(Exception e){
			e.printStackTrace();
		}
		return arrayOfOrdenesCerradasEntity;
	}

}
