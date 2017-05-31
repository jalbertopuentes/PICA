package co.com.kallsonys.backend.services.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.datacontract.schemas._2004._07.clienteentities.ArrayOfClienteEntity;
import org.datacontract.schemas._2004._07.clienteentities.ArrayOfClienteOrdenMasVendidasEntity;
import org.tempuri.ISRVEntCliente;
import org.tempuri.SRVEntCliente;

public class ServicioClienteImpl {
	
	public ArrayOfClienteOrdenMasVendidasEntity BuscarClienteOrdenMasVendidas( XMLGregorianCalendar fechaInicio, XMLGregorianCalendar fechaFin ){
		ArrayOfClienteOrdenMasVendidasEntity arrayOfClienteOrdenMasVendidasEntity = null;
		try{
			SRVEntCliente srvEntOrden = new SRVEntCliente();
			ISRVEntCliente port = srvEntOrden.getPort(ISRVEntCliente.class);
			arrayOfClienteOrdenMasVendidasEntity = port.buscarClienteOrdenMasVendidas(fechaInicio, fechaFin);
		}catch(Exception e){
			e.printStackTrace();
		}
		return arrayOfClienteOrdenMasVendidasEntity;
	}
	
	public ArrayOfClienteEntity buscarClientesXIdProducto( Integer idProducto  ){
		ArrayOfClienteEntity arrayOfClienteEntity = null;
		try{
			SRVEntCliente srvEntOrden = new SRVEntCliente();
			ISRVEntCliente port = srvEntOrden.getPort(ISRVEntCliente.class);
			arrayOfClienteEntity= port.buscarClientesXIdProducto(idProducto);
		}catch(Exception e){
			e.printStackTrace();
		}
		return arrayOfClienteEntity;
	}

}
