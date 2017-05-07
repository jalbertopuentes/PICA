package entity;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-05-04T00:12:23.674-0500")
@StaticMetamodel(Producto.class)
public class Producto_ {
	public static volatile SingularAttribute<Producto, Long> idProducto;
	public static volatile SingularAttribute<Producto, Long> cantidad;
	public static volatile SingularAttribute<Producto, String> codigo;
	public static volatile SingularAttribute<Producto, String> descripcion;
	public static volatile SingularAttribute<Producto, Integer> idCategoria;
	public static volatile SingularAttribute<Producto, Integer> idFabricante;
	public static volatile SingularAttribute<Producto, String> nombre;
	public static volatile SingularAttribute<Producto, String> urlImagen;
	public static volatile SingularAttribute<Producto, BigDecimal> valor;
	public static volatile SingularAttribute<Producto, BigDecimal> valorDescuento;
}
