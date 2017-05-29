package co.com.kallsonys.oms.orden;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.Locale;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.datacontract.schemas._2004._07.productoentities.ArrayOfCategoriaEntity;
import org.datacontract.schemas._2004._07.productoentities.CategoriaEntity;
import org.datacontract.schemas._2004._07.productoentities.ProductoEntity;

import com.vaadin.data.provider.DataProvider;
import com.vaadin.data.provider.ListDataProvider;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.Sizeable.Unit;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.DateField;
import com.vaadin.ui.Grid;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Grid.SelectionMode;
import com.vaadin.ui.Notification.Type;
import com.vaadin.ui.renderers.ButtonRenderer;
import com.vaadin.ui.renderers.DateRenderer;
import com.vaadin.ui.themes.ValoTheme;

import co.com.kallsonys.backend.services.impl.ServicioProductoImpl;
import co.com.kallsonys.oms.backend.bdservice.oracle.OracleDataService;
import co.com.kallsonys.oms.backend.entity.oracle.Campana;
import co.com.kallsonys.oms.backend.entity.oracle.Ciudad;
import co.com.kallsonys.oms.backend.entity.oracle.Cliente;
import co.com.kallsonys.oms.backend.entity.oracle.Orden;
import co.com.kallsonys.oms.backend.entity.oracle.Tarjeta;

public class OrdenView extends VerticalLayout implements View {


	/**
	 * 
	 */
	private static final long serialVersionUID = 2196259731475337163L;

	public static final String VIEW_NAME = "Ordenes";

	private Grid<Orden> grid;
	private ListDataProvider<Orden> dataProvider;

	public OrdenView(){


		setSizeFull();
		addStyleName("crud-view");

		TabSheet mainTab = new TabSheet();
		mainTab.setHeight(100.0f, Unit.PERCENTAGE);
		mainTab.addStyleName(ValoTheme.TABSHEET_FRAMED);
		mainTab.addStyleName(ValoTheme.TABSHEET_PADDED_TABBAR);

		mainTab.addTab(generarCrudView(),"Crud Ordenes");
		mainTab.addTab(generarOrdenesCerradasTotalFacturado(),"Ordenes Cerradas-Total Facturado");
		mainTab.addTab(generarTopOrdenesAbiertas(),"Top Ordenes Abiertas");
		mainTab.addTab(generarRankingOrdenesCerradas(),"Top Ordenes Cerradas Mayor Ganancias");
		addComponent(mainTab);


	}

	@Override
	public void enter(ViewChangeEvent event) {

	}

	private VerticalLayout generarRankingOrdenesCerradas(){
		VerticalLayout vl = new VerticalLayout();

		return vl;
	}

	private VerticalLayout generarTopOrdenesAbiertas(){
		VerticalLayout vl = new VerticalLayout();

		return vl;
	}

	private VerticalLayout generarOrdenesCerradasTotalFacturado(){
		VerticalLayout vl = new VerticalLayout();

		return vl;
	}

	private VerticalLayout generarCrudView(){
		VerticalLayout vl = new VerticalLayout();
		//		vl.addComponent(generarSeccionBusqueda());
		vl.addComponent(generarGrid());
		return vl;
	}


	private void actioBuscar( DateField fechaInicial, DateField fechaFinal ) throws DatatypeConfigurationException{

		if( fechaInicial.getValue() != null && fechaFinal.getValue() != null ){

			//			GregorianCalendar gcalTmp = GregorianCalendar.from(fechaInicial.getValue().atStartOfDay(ZoneId.systemDefault()));
			//			XMLGregorianCalendar xcalFechaInicio = DatatypeFactory.newInstance().newXMLGregorianCalendar(gcalTmp);
			//
			//			gcalTmp = GregorianCalendar.from(fechaFinal.getValue().atStartOfDay(ZoneId.systemDefault()));
			//			XMLGregorianCalendar xcalFechaFinal = DatatypeFactory.newInstance().newXMLGregorianCalendar(gcalTmp);
			//
			//			ArrayOfCategoriaEntity arrayOfCategoriaEntity = servicioProductoImpl.buscarCategoriasFecha(xcalFechaInicio, xcalFechaFinal);
			//			Collection<CategoriaEntity> categoriasFiltradas = new ArrayList<>();
			//			if( arrayOfCategoriaEntity.getCategoriaEntity() != null ){
			//				categoriasFiltradas = arrayOfCategoriaEntity.getCategoriaEntity();
			//			}
			//			dataProvider = DataProvider.ofCollection(categoriasFiltradas);
			//			grid.setDataProvider(dataProvider);

		}else{
			if( fechaInicial.getValue()==null ){
				Notification.show("La fecha inicial es un valor obligatorio", Type.ERROR_MESSAGE);
			}
			if( fechaFinal.getValue()==null ){
				Notification.show("La fecha final es un valor obligatorio", Type.ERROR_MESSAGE);
			}
		}

	}

	private VerticalLayout generarGrid(){

		VerticalLayout vl = new VerticalLayout();
		grid = new Grid<>();
		grid.setCaption("Ordenes");
		grid.setWidth("100%");
		grid.setSelectionMode(SelectionMode.NONE);

		Collection<Orden> ordenes = OracleDataService.get().getOrdenesParaCancelar();
		dataProvider = DataProvider.ofCollection(ordenes);
		grid.setDataProvider(dataProvider);
		
		TextField filterTextField = new TextField("Número orden");
		filterTextField.setPlaceholder("ingrese número de orden");
		filterTextField.addValueChangeListener(event -> {
			dataProvider.setFilter(Orden::getIdorden , idOrden -> {
				Long id = new Long(idOrden);
				Long valorIngresado=-1L;
				try{
					valorIngresado = new Long(event.getValue());
				}catch( NumberFormatException e ){
					return false;
				}
				if( id.equals(valorIngresado) ){
					return true;
				}
				return false;
			});
		});

		vl.addComponent(filterTextField);

		grid.addColumn(Orden::getIdorden)
		.setCaption("Número Orden")
		.setExpandRatio(2);

		grid.addColumn(this::formatEstadoenvio)
		.setCaption("Estado Envío")
		.setExpandRatio(2);

		grid.addColumn(this::formatCliente)
		.setCaption("Cliente")
		.setExpandRatio(2);

		grid.addColumn( this::formatTarjeta)
		.setCaption("Tarjeta")
		.setExpandRatio(2);

		grid.addColumn(Orden::getCelular)
		.setCaption("Celular")
		.setExpandRatio(2);

		SimpleDateFormat dateFormat = (SimpleDateFormat) DateFormat.getDateInstance(1, UI.getCurrent().getLocale());
		//		String formatString = dateFormat.toPattern();

		grid.addColumn( Orden::getFecha)
		.setCaption("Fecha")
		.setRenderer(new DateRenderer(dateFormat));

		grid.addColumn( Orden::getFecharevision)
		.setCaption("Fecha Revision")
		.setRenderer(new DateRenderer(dateFormat));

		grid.addColumn(Orden::getCodigopostal)
		.setCaption("Código Postal")
		.setExpandRatio(2);

		grid.addColumn(Orden::getComentario)
		.setCaption("Comentario")
		.setExpandRatio(2);

		grid.addColumn(Orden::getDireccion)
		.setCaption("Dirección")
		.setExpandRatio(2);

		grid.addColumn(Orden::getPersonacontacto)
		.setCaption("Persona Contacto")
		.setExpandRatio(2);

		grid.addColumn(Orden::getTelefono)
		.setCaption("Tefono")
		.setExpandRatio(2);

		grid.addColumn(this::formatCiudad)
		.setCaption("Ciudad")
		.setExpandRatio(2);

		grid.addColumn(Orden::getAsesor)
		.setCaption("Asesor")
		.setExpandRatio(2);
		
		grid.addColumn(person -> "Cancelar/Eliminar",
				new ButtonRenderer<Object>(clickEvent -> {
					ordenes.remove(clickEvent.getItem());
					OracleDataService.get().cancelarOrden( (Orden) clickEvent.getItem());
					
					ListDataProvider<Orden> dataProviderTmp = DataProvider.ofCollection(ordenes);
					filterTextField.addValueChangeListener(event -> {
						dataProviderTmp.setFilter(Orden::getIdorden , idOrden -> {
							Long id = new Long(idOrden);
							Long valorIngresado=-1L;
							try{
								valorIngresado = new Long(event.getValue());
							}catch( NumberFormatException e ){
								return false;
							}
							if( id.equals(valorIngresado) ){
								return true;
							}
							return false;
						});
					});
					grid.setDataProvider(dataProviderTmp);
				}));

		vl.addComponent(grid);

		return vl;
	}

	private String formatTarjeta( Orden o ){
		if( o.getIdtarjeta() != 0 ){
			Tarjeta t = OracleDataService.get().getTarjetaXId(o.getIdtarjeta());
			return t.getNumero();
		}
		return "Sin Tarjeta";
	}

	private String formatEstadoenvio(Orden o){
		if( o.getEstadoenvio() != null ){
			return o.getEstadoenvio().getDescripcion();
		}
		return "";
	}

	private String formatCliente(Orden o) {
		if( o.getCliente() != null  ){
			return o.getCliente().getNombre()+" "+o.getCliente().getApellido();
		}
		return "";
	}

	private String formatCiudad(Orden o) {
		if( o.getCiudad() != null  ){
			return o.getCiudad().getNombre();
		}
		return "";
	}


}
