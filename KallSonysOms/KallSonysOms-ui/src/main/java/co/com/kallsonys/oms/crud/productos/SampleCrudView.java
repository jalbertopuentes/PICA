package co.com.kallsonys.oms.crud.productos;

import co.com.kallsonys.backend.services.impl.ServicioProductoImpl;
import co.com.kallsonys.oms.backend.data.Product;
import co.com.kallsonys.oms.samples.ResetButtonForTextField;
import co.com.kallsonys.oms.util.EUrlB2c;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.datacontract.schemas._2004._07.productoentities.ArrayOfProductoEntity;
import org.datacontract.schemas._2004._07.productoentities.ProductoEntity;

import com.vaadin.data.provider.DataProvider;
import com.vaadin.data.provider.ListDataProvider;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.DateField;
import com.vaadin.ui.Grid;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Link;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Notification.Type;
import com.vaadin.ui.components.grid.DetailsGenerator;
import com.vaadin.ui.components.grid.ItemClickListener;
import com.vaadin.ui.renderers.AbstractRenderer;
import com.vaadin.ui.renderers.HtmlRenderer;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Grid.Column;
import com.vaadin.ui.Grid.ItemClick;
import com.vaadin.ui.Grid.SelectionMode;
import com.vaadin.ui.themes.ValoTheme;

/**
 * A view for performing create-read-update-delete operations on products.
 *
 * See also {@link SampleCrudLogic} for fetching the data, the actual CRUD
 * operations and controlling the view based on events from outside.
 */
public class SampleCrudView extends CssLayout implements View {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2125299197528651519L;
	public static final String VIEW_NAME = "Productos";
	private ProductGrid grid;
	private ProductForm form;
	private TextField filter;
	private Grid<ProductoEntity> gridProductosMasVendidos;
	private ListDataProvider<ProductoEntity> dataProviderProductosMasVendidos;
	private SampleCrudLogic viewLogic = new SampleCrudLogic(this);
	private Button newProduct;
	private ProductDataProvider dataProvider = new ProductDataProvider();
	private ServicioProductoImpl servicioProductoImpl= new ServicioProductoImpl();

	public SampleCrudView() {

	}

	private VerticalLayout generarProductosMasVendidos(){
		VerticalLayout vl = new VerticalLayout();
		vl.addComponent(generarSeccionFiltrosBusqueda());
		vl.addComponent(generarGridProductosMasVendidos());
		return vl;
	}
	
	private Grid<ProductoEntity> generarGridProductosMasVendidos(){

			gridProductosMasVendidos = new Grid<>();
			gridProductosMasVendidos.setCaption("Productos");
			gridProductosMasVendidos.setWidth("100%");
			gridProductosMasVendidos.setSelectionMode(SelectionMode.NONE);

			Collection<ProductoEntity> productos = new ArrayList<>();
			dataProviderProductosMasVendidos = DataProvider.ofCollection(productos);
			gridProductosMasVendidos.setDataProvider(dataProviderProductosMasVendidos);
			
			gridProductosMasVendidos.addColumn(producto ->
		      "<a href='" +EUrlB2c.URL_B2C.getValue()+producto.getIdProducto() + "' target='_blank'>Ver</a>",
		      new HtmlRenderer());
			
			gridProductosMasVendidos.addColumn(ProductoEntity::getIdProducto).setCaption("Número");
			gridProductosMasVendidos.addColumn(ProductoEntity::getCodigo).setCaption("Código");
			gridProductosMasVendidos.addColumn(ProductoEntity::getNombre).setCaption("Nombre del producto");

			final DecimalFormat decimalFormat = new DecimalFormat();
			decimalFormat.setMaximumFractionDigits(2);
			decimalFormat.setMinimumFractionDigits(2);
			gridProductosMasVendidos.addColumn(producto -> decimalFormat.format(producto.getValor()!=null?producto.getValor():"0" ) + " $")
			.setCaption("Precio")
			.setStyleGenerator(product -> "align-right");
			
			gridProductosMasVendidos.addColumn(producto -> decimalFormat.format(producto.getValorDescuento()) + " $")
			.setCaption("Valor Descuento").setStyleGenerator(producto -> "align-right");

			gridProductosMasVendidos.addColumn(producto -> {
				if (producto.getCantidad() == 0) {
					return "-";
				}
				return Integer.toString(producto.getCantidad());
			}).setCaption("Cantidad Disponible")
			.setStyleGenerator(product -> "align-right");

			gridProductosMasVendidos.addColumn(this::formatCategories).setCaption("Categoria").setSortable(false);
			gridProductosMasVendidos.addColumn(ProductoEntity::getUrlImagen).setCaption("URL Imagen").setSortable(false);
			gridProductosMasVendidos.addColumn(this::formatFabricante).setCaption("Fabricante").setSortable(false);
			
			return gridProductosMasVendidos;
	}
	
	private Link generarLink(ProductoEntity producto){
		Link link = new Link("Ver",
		        new ExternalResource("http://www.google.com/"));
		return link;
	}
	
	private String formatCategories(ProductoEntity producto) {
		if (producto.getCategoria() == null ) {
			return "";
		}
		return producto.getCategoria();
	}
	
	private String formatFabricante(ProductoEntity producto) {
		if (producto.getFabricante() == null ) {
			return "";
		}
		return producto.getFabricante();
	}

	private VerticalLayout generarSeccionFiltrosBusqueda(){
		HorizontalLayout hl = new HorizontalLayout();
		hl.setSpacing(true);

		DateField fechaInicial = new DateField("Fecha Inicial");
		LocalDate tmp = LocalDate.now();
		fechaInicial.setRangeStart(tmp.minusMonths(1).plusDays(1));
		fechaInicial.setRangeEnd(LocalDate.now());
		fechaInicial.setRequiredIndicatorVisible(true);

		DateField fechaFinal = new DateField("Fecha Final");
		fechaFinal.setRangeStart(tmp.minusMonths(1).plusDays(1));
		fechaFinal.setRangeEnd(LocalDate.now());
		fechaFinal.setRequiredIndicatorVisible(true);

		Button btnBuscar = new Button("Realizar Busqueda");

		btnBuscar.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = -4488239168999571799L;

			@Override
			public void buttonClick(ClickEvent event) {
										try {
											actioBuscar( fechaInicial, fechaFinal );
										} catch (DatatypeConfigurationException e) {
											e.printStackTrace();
											Notification.show("Error realizando consulta!!", Type.ERROR_MESSAGE);
										}
			}
		});

		hl.addComponent(fechaInicial);
		hl.addComponent(fechaFinal);
		hl.addComponent(btnBuscar);
		hl.setComponentAlignment(btnBuscar, Alignment.MIDDLE_CENTER);

		VerticalLayout vl = new VerticalLayout();
		vl.setWidth("100%");
		vl.setResponsive(true);

		vl.addComponent(hl);
		
		return vl;

	}
	
	private void actioBuscar(DateField fechaInicial, DateField fechaFinal) throws DatatypeConfigurationException{
		if( fechaInicial.getValue() != null && fechaFinal.getValue() != null ){

			GregorianCalendar gcalTmp = GregorianCalendar.from(fechaInicial.getValue().atStartOfDay(ZoneId.systemDefault()));
			XMLGregorianCalendar xcalFechaInicio = DatatypeFactory.newInstance().newXMLGregorianCalendar(gcalTmp);

			gcalTmp = GregorianCalendar.from(fechaFinal.getValue().atStartOfDay(ZoneId.systemDefault()));
			XMLGregorianCalendar xcalFechaFinal = DatatypeFactory.newInstance().newXMLGregorianCalendar(gcalTmp);

			ArrayOfProductoEntity arrayOfProductoEntity = servicioProductoImpl.buscarVendidosFecha(xcalFechaInicio, xcalFechaFinal);
			
//			ArrayOfProductoEntity arrayOfProductoEntity = new ArrayOfProductoEntity();
//			ProductoEntity e = new ProductoEntity();
//			e.setValor(BigDecimal.ONE);
//			e.setValorDescuento(BigDecimal.ONE);
//			e.setCantidad(1);
//			e.setCodigo("werer");
//			arrayOfProductoEntity.getProductoEntity().add(e);
			
			Collection<ProductoEntity> productosFiltrados = new ArrayList<>();
			if( arrayOfProductoEntity.getProductoEntity() != null ){
				productosFiltrados = arrayOfProductoEntity.getProductoEntity();
			}
			dataProviderProductosMasVendidos = DataProvider.ofCollection(productosFiltrados);
			gridProductosMasVendidos .setDataProvider(dataProviderProductosMasVendidos);

		}else{
			if( fechaInicial.getValue()==null ){
				Notification.show("La fecha inicial es un valor obligatorio", Type.ERROR_MESSAGE);
			}
			if( fechaFinal.getValue()==null ){
				Notification.show("La fecha final es un valor obligatorio", Type.ERROR_MESSAGE);
			}
		}
	}

	private VerticalLayout generarCrudProducto(){

		HorizontalLayout topLayout = createTopBar();

		grid = new ProductGrid();
		grid.setDataProvider(dataProvider);
		grid.asSingleSelect().addValueChangeListener(
				event -> viewLogic.rowSelected(event.getValue()));
		//        grid.setHeightByRows(10);

		form = new ProductForm(viewLogic);
		//        form.setCategories(DataService.get().getAllCategories());

		VerticalLayout barAndGridLayout = new VerticalLayout();
		barAndGridLayout.addComponent(topLayout);
		barAndGridLayout.addComponent(grid);
		barAndGridLayout.setSizeFull();
		barAndGridLayout.setExpandRatio(grid, 1);
		barAndGridLayout.setStyleName("crud-main-layout");

		VerticalLayout vl = new VerticalLayout();
		vl.addComponent(barAndGridLayout);
		vl.addComponent(form);

		viewLogic.init();
		return vl;
	}

	public HorizontalLayout createTopBar() {
		filter = new TextField();
		filter.setStyleName("filter-textfield");
		filter.setPlaceholder("Ingrese el nombre");
		ResetButtonForTextField.extend(filter);
		// Apply the filter to grid's data provider. TextField value is never null
		filter.addValueChangeListener(event -> dataProvider.setFilter(event.getValue()));

		newProduct = new Button("Nuevo producto");
		newProduct.addStyleName(ValoTheme.BUTTON_PRIMARY);
		newProduct.setIcon(VaadinIcons.PLUS_CIRCLE);
		newProduct.addClickListener(click -> viewLogic.newProduct());

		HorizontalLayout topLayout = new HorizontalLayout();
		topLayout.setWidth("100%");
		topLayout.addComponent(filter);
		topLayout.addComponent(newProduct);
		topLayout.setComponentAlignment(filter, Alignment.MIDDLE_LEFT);
		topLayout.setExpandRatio(filter, 1);
		topLayout.setStyleName("top-bar");
		return topLayout;
	}

	@Override
	public void enter(ViewChangeEvent event) {
		removeAllComponents();
		setSizeFull();
		addStyleName("crud-view");

		TabSheet mainTab = new TabSheet();
		mainTab.setHeight(100.0f, Unit.PERCENTAGE);
		mainTab.addStyleName(ValoTheme.TABSHEET_FRAMED);
		mainTab.addStyleName(ValoTheme.TABSHEET_PADDED_TABBAR);

		mainTab.addTab(generarCrudProducto(),"Crud Producto");
		mainTab.addTab(generarProductosMasVendidos(),"Productos Más Vendidos");
		addComponent(mainTab);
		
		viewLogic.enter(event.getParameters());
	}

	public void showError(String msg) {
		Notification.show(msg, Type.ERROR_MESSAGE);
	}

	public void showSaveNotification(String msg) {
		Notification.show(msg, Type.TRAY_NOTIFICATION);
	}

	public void setNewProductEnabled(boolean enabled) {
		newProduct.setEnabled(enabled);
	}

	public void clearSelection() {
		grid.getSelectionModel().deselectAll();
	}

	public void selectRow(Product row) {
		grid.getSelectionModel().select(row);
	}

	public Product getSelectedRow() {
		return grid.getSelectedRow();
	}

	public void updateProduct(Product product) {
		dataProvider.save(product);
		// FIXME: Grid used to scroll to the updated item
	}

	public void removeProduct(Product product) {
		dataProvider.delete(product);
	}

	public void editProduct(Product product) {
		if (product != null) {
			form.addStyleName("visible");
			form.setEnabled(true);
		} else {
			form.removeStyleName("visible");
			form.setEnabled(false);
		}
		form.editProduct(product);
	}
}
