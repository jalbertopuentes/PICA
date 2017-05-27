package co.com.kallsonys.backend.services.test;

import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.datacontract.schemas._2004._07.productoentities.ArrayOfCategoriaEntity;
import org.datacontract.schemas._2004._07.productoentities.ArrayOfProductoEntity;
import org.datacontract.schemas._2004._07.productoentities.CategoriaEntity;
import org.datacontract.schemas._2004._07.productoentities.ProductoEntity;

import co.com.kallsonys.backend.services.impl.ServicioProductoImpl;

public class Test {
	
	public static void main(String[] args) {
		//buscarVendidosFecha();
		buscarCategoriasFecha();
		
	}
	
	public static void buscarCategoriasFecha(){
		GregorianCalendar c = new GregorianCalendar();
		c.set(2017, 4, 20);
		GregorianCalendar d = new GregorianCalendar();
		d.set(2017, 4, 25);
		try {
			XMLGregorianCalendar fechaInicio = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
			XMLGregorianCalendar fechaFin = DatatypeFactory.newInstance().newXMLGregorianCalendar(d);
			ServicioProductoImpl impl= new ServicioProductoImpl();
			ArrayOfCategoriaEntity arrayOfCategoriaEntity = impl.buscarCategoriasFecha(fechaInicio, fechaFin);
			
			if(arrayOfCategoriaEntity.getCategoriaEntity() !=null){
				for (CategoriaEntity ca:arrayOfCategoriaEntity.getCategoriaEntity()){
					System.out.println(ca.getIdCategoria()+" "+ca.getCategoria());
				}
			}else{
				System.out.println("arrayOfCategoriaEntity.getCategoriaEntity()::NULL");
			}
			
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		}

	}
	
	public static void buscarVendidosFecha(){
		GregorianCalendar c = new GregorianCalendar();
		c.set(2017, 4, 20);
		GregorianCalendar d = new GregorianCalendar();
		d.set(2017, 4, 25);
		try {
			XMLGregorianCalendar fechaInicio = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
			XMLGregorianCalendar fechaFin = DatatypeFactory.newInstance().newXMLGregorianCalendar(d);
			ServicioProductoImpl impl= new ServicioProductoImpl();
			ArrayOfProductoEntity arrayOfProductoEntity = impl.buscarVendidosFecha(fechaInicio, fechaFin);
			
			if(arrayOfProductoEntity.getProductoEntity() !=null){
				for (ProductoEntity pro:arrayOfProductoEntity.getProductoEntity()){
					System.out.println(pro.getNombre()+" "+pro.getCantidad());
				}
			}else{
				System.out.println("arrayOfProductoEntity::NULL");
			}
			
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		}
	}

}
