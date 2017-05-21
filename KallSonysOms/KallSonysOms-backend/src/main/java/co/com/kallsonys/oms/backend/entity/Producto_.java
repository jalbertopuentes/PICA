package co.com.kallsonys.oms.backend.entity;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-05-10T15:10:10.021-0500")
@StaticMetamodel(Producto.class)
public class Producto_ {
	public static volatile SingularAttribute<Producto, Integer> idProducto;
	public static volatile SingularAttribute<Producto, Integer> cantidad;
	public static volatile SingularAttribute<Producto, String> codigo;
	public static volatile SingularAttribute<Producto, String> descripcion;
	public static volatile SingularAttribute<Producto, String> nombre;
	public static volatile SingularAttribute<Producto, String> urlImagen;
	public static volatile SingularAttribute<Producto, BigDecimal> valor;
	public static volatile SingularAttribute<Producto, BigDecimal> valorDescuento;
	public static volatile SingularAttribute<Producto, Fabricante> fabricante;
	public static volatile SingularAttribute<Producto, Categoria> categoria;
}
