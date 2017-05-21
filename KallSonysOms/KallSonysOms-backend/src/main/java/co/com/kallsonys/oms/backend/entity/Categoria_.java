package co.com.kallsonys.oms.backend.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-05-10T15:10:09.946-0500")
@StaticMetamodel(Categoria.class)
public class Categoria_ {
	public static volatile SingularAttribute<Categoria, Integer> idCategoria;
	public static volatile SingularAttribute<Categoria, String> nombre;
	public static volatile ListAttribute<Categoria, Producto> productos;
}
