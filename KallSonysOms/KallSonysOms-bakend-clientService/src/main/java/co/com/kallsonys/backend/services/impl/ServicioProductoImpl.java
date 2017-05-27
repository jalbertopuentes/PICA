package co.com.kallsonys.backend.services.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.datacontract.schemas._2004._07.productoentities.ArrayOfCategoriaEntity;
import org.datacontract.schemas._2004._07.productoentities.ArrayOfProductoEntity;
import org.tempuri.ISrvEntProducto;
import org.tempuri.SrvEntProducto;

public class ServicioProductoImpl {

	public ArrayOfProductoEntity buscarVendidosFecha(XMLGregorianCalendar fechaInicio, XMLGregorianCalendar fechaFin  ){

		ArrayOfProductoEntity arrayOfProductoEntity = null;
		
		try{
			SrvEntProducto srvEntProducto = new SrvEntProducto();
			ISrvEntProducto port =srvEntProducto.getPort(ISrvEntProducto.class);
			arrayOfProductoEntity = port.buscarVendidosFecha(fechaInicio, fechaFin);
		}catch(Exception e){
			e.printStackTrace();
		}
		return arrayOfProductoEntity;

	}
	
	public ArrayOfCategoriaEntity buscarCategoriasFecha(XMLGregorianCalendar fechaInicio, XMLGregorianCalendar fechaFin  ){

		ArrayOfCategoriaEntity arrayOfCategoriaEntity = null;
		
		try{
			SrvEntProducto srvEntProducto = new SrvEntProducto();
			ISrvEntProducto port =srvEntProducto.getPort(ISrvEntProducto.class);
			arrayOfCategoriaEntity = port.buscarCategoriasFecha(fechaInicio, fechaFin);
		}catch(Exception e){
			e.printStackTrace();
		}
		return arrayOfCategoriaEntity;

	}


}
