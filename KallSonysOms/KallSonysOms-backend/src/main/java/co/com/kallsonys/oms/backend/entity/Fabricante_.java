package co.com.kallsonys.oms.backend.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-05-10T15:10:10.013-0500")
@StaticMetamodel(Fabricante.class)
public class Fabricante_ {
	public static volatile SingularAttribute<Fabricante, Integer> idFabricante;
	public static volatile SingularAttribute<Fabricante, String> fabricante;
	public static volatile ListAttribute<Fabricante, Producto> productos;
}
