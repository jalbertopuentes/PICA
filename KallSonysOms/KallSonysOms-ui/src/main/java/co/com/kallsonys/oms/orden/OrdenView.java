package co.com.kallsonys.oms.orden;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.datacontract.schemas._2004._07.ordenentities.ArrayOfOrdenesAbiertasEntity;
import org.datacontract.schemas._2004._07.ordenentities.ArrayOfOrdenesCerradasEntity;
import org.datacontract.schemas._2004._07.ordenentities.ArrayOfOrdenesCerradasXMesEntity;
import org.datacontract.schemas._2004._07.ordenentities.OrdenesAbiertasEntity;
import org.datacontract.schemas._2004._07.ordenentities.OrdenesCerradasEntity;
import org.datacontract.schemas._2004._07.ordenentities.OrdenesCerradasXMesEntity;

import com.vaadin.data.provider.DataProvider;
import com.vaadin.data.provider.ListDataProvider;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
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

import co.com.kallsonys.backend.services.impl.ServicioOrdenImpl;
import co.com.kallsonys.oms.backend.bdservice.oracle.OracleDataService;
import co.com.kallsonys.oms.backend.entity.oracle.Orden;
import co.com.kallsonys.oms.backend.entity.oracle.Ordendetalle;
import co.com.kallsonys.oms.backend.entity.oracle.Tarjeta;
import java.math.BigDecimal;

public class OrdenView extends VerticalLayout implements View {


	/**
	 * 
	 */
	private static final long serialVersionUID = 2196259731475337163L;

	public static final String VIEW_NAME = "Ordenes";

	private Grid<Orden> gridCrud;
	private ListDataProvider<Orden> dataProviderCrud;
	private ServicioOrdenImpl servicioOrdenImpl = new ServicioOrdenImpl();


	private Grid<OrdenesCerradasEntity> gridOrdenesCerradasTotal;
	private ListDataProvider<OrdenesCerradasEntity> dataProviderOrdenesCerradasTotal;

	public OrdenView(){

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

		mainTab.addTab(generarCrudView(),"Crud Ordenes");
		mainTab.addTab(generarTabOredenesCerradasTotalFacturado(),"Ordenes Cerradas-Total Facturado");
		mainTab.addTab(generarTopOrdenesAbiertas(),"Top Ordenes Abiertas");
		mainTab.addTab(generarRankingOrdenesCerradas(),"Top Ordenes Cerradas Mayor Ganancias");

		addComponent(mainTab);
	}

	private VerticalLayout generarTabOredenesCerradasTotalFacturado(){
		VerticalLayout vl = new VerticalLayout();
		vl.addComponent(generarFiltrosBusquedaOrdenesCerradasTotal());
		vl.addComponent(generarGridOrdenesCerradasTotal());
		return vl;
	}

	private Grid<OrdenesCerradasEntity> generarGridOrdenesCerradasTotal(){

		gridOrdenesCerradasTotal = new Grid<>();
		gridOrdenesCerradasTotal.setCaption("Órdenes que han facturado más dinero segun filtros");
		gridOrdenesCerradasTotal.setWidth("100%");
		gridOrdenesCerradasTotal.setSelectionMode(SelectionMode.NONE);

		Collection<OrdenesCerradasEntity> ordenesCerradas = new ArrayList<>();
		dataProviderOrdenesCerradasTotal = DataProvider.ofCollection(ordenesCerradas);
		gridOrdenesCerradasTotal.setDataProvider(dataProviderOrdenesCerradasTotal);

		gridOrdenesCerradasTotal.addColumn(oc->oc.getValorFacturado())
		.setCaption("Valor facturado");

		gridOrdenesCerradasTotal.addColumn(ordenAbierta->ordenAbierta.getOrden().getIdOrden())
		.setCaption("Número Orden")
		.setExpandRatio(2);

		gridOrdenesCerradasTotal.addColumn(ordenAbierta->ordenAbierta.getOrden().getEstado())
		.setCaption("Estado Envío")
		.setExpandRatio(2);


		gridOrdenesCerradasTotal.addColumn(oa->oa.getOrden().getCelular())
		.setCaption("Celular")
		.setExpandRatio(2);

		gridOrdenesCerradasTotal.addColumn(oa->oa.getOrden().getDireccion())
		.setCaption("Dirección")
		.setExpandRatio(2);

		gridOrdenesCerradasTotal.addColumn(oa->oa.getOrden().getPersonaContacto())
		.setCaption("Persona Contacto")
		.setExpandRatio(2);

		gridOrdenesCerradasTotal.addColumn(oa->oa.getOrden().getTelefono())
		.setCaption("Teléfono")
		.setExpandRatio(2);

		gridOrdenesCerradasTotal.addColumn(oa->oa.getOrden().getCiudad())
		.setCaption("Ciudad")
		.setExpandRatio(2);

		gridOrdenesCerradasTotal.addColumn(oa->oa.getOrden().getCodigoPostal())
		.setCaption("Código Postal")
		.setExpandRatio(2);

		gridOrdenesCerradasTotal.addColumn(oa->oa.getOrden().getAsesor())
		.setCaption("Asesor")
		.setExpandRatio(2);


		return gridOrdenesCerradasTotal;
	}

	private VerticalLayout generarFiltrosBusquedaOrdenesCerradasTotal(){
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

	private VerticalLayout generarRankingOrdenesCerradas(){
		VerticalLayout vl = new VerticalLayout();
		Button traerInfo = new Button( "Consultar Todo" );

		traerInfo.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = -4488239168999571799L;

			@Override
			public void buttonClick(ClickEvent event) {
				vl.addComponent(generarGridOrdenesCerradas());
				traerInfo.setVisible(false);
			}
		});
		vl.addComponent(traerInfo);
		return vl;
	}
	
	private Grid<OrdenesCerradasXMesEntity> generarGridOrdenesCerradas(){
		Grid<OrdenesCerradasXMesEntity> grid = new Grid<OrdenesCerradasXMesEntity>();
		grid.setCaption("Número de ordenes cerradas y total facturado por mes");
		grid.setWidth("100%");
		grid.setSelectionMode(SelectionMode.NONE);

		Collection<OrdenesCerradasXMesEntity> ordenesCeradasPorMes = new ArrayList<>();
		ArrayOfOrdenesCerradasXMesEntity arrayOfOrdenesCerradasXMesEntity =  servicioOrdenImpl.buscarOrdenesCerradasXMes();
		if( arrayOfOrdenesCerradasXMesEntity != null && arrayOfOrdenesCerradasXMesEntity.getOrdenesCerradasXMesEntity() != null  ){
			ordenesCeradasPorMes = arrayOfOrdenesCerradasXMesEntity.getOrdenesCerradasXMesEntity();
		}
		ListDataProvider<OrdenesCerradasXMesEntity> dataProvider = DataProvider.ofCollection(ordenesCeradasPorMes);
		grid.setDataProvider(dataProvider);

		grid.addColumn(ocm->ocm.getMes())
		.setCaption("Mes")
		.setExpandRatio(2);

		grid.addColumn(ocm->ocm.getNumeroOrdenes())
		.setCaption("Número de ordenes")
		.setExpandRatio(2);

		grid.addColumn(ocm->ocm.getValorFacturado())
		.setCaption("Valor facturado")
		.setExpandRatio(2);
		
		return grid;
	}

	private VerticalLayout generarTopOrdenesAbiertas(){
		VerticalLayout vl = new VerticalLayout();

		Button traerInfo = new Button( "Consultar Todo" );

		traerInfo.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = -4488239168999571799L;

			@Override
			public void buttonClick(ClickEvent event) {
				vl.addComponent(generarGridOrdenesAbiertas());
				traerInfo.setVisible(false);
			}
		});
		
		vl.addComponent(traerInfo);
		return vl;
	}

	private Grid<OrdenesAbiertasEntity> generarGridOrdenesAbiertas(){
		Grid<OrdenesAbiertasEntity> grid = new Grid<OrdenesAbiertasEntity>();
		grid.setCaption("Ordenes que llevan más tiempo abiertas");
		grid.setWidth("100%");
		grid.setSelectionMode(SelectionMode.NONE);

		Collection<OrdenesAbiertasEntity> ordenesAbiertas = new ArrayList<>();
		ArrayOfOrdenesAbiertasEntity arrayOfOrdenesAbiertasEntity =  servicioOrdenImpl.buscarOrdenesAbiertas();
		if( arrayOfOrdenesAbiertasEntity != null && arrayOfOrdenesAbiertasEntity.getOrdenesAbiertasEntity() != null  ){
			ordenesAbiertas = arrayOfOrdenesAbiertasEntity.getOrdenesAbiertasEntity();
		}
		ListDataProvider<OrdenesAbiertasEntity> dataProvider = DataProvider.ofCollection(ordenesAbiertas);
		grid.setDataProvider(dataProvider);

		grid.addColumn(ordenAbierta->ordenAbierta.getOrden().getIdOrden())
		.setCaption("Número Orden")
		.setExpandRatio(2);

		grid.addColumn(ordenAbierta->ordenAbierta.getOrden().getEstado())
		.setCaption("Estado Envío")
		.setExpandRatio(2);

		grid.addColumn(OrdenesAbiertasEntity::getNombreCliente)
		.setCaption("Cliente")
		.setExpandRatio(2);

		grid.addColumn( this::formatTarjetaEntity)
		.setCaption("Tarjeta")
		.setExpandRatio(2);

		grid.addColumn(oa->oa.getOrden().getCelular())
		.setCaption("Celular")
		.setExpandRatio(2);

		grid.addColumn(this::xmlGregorianToString)
		.setCaption("Fecha")
		.setExpandRatio(2);

		grid.addColumn(this::xmlGregorianToString2)
		.setCaption("Fecha Revisión")
		.setExpandRatio(2);

		grid.addColumn(oa->oa.getOrden().getDireccion())
		.setCaption("Dirección")
		.setExpandRatio(2);

		grid.addColumn(oa->oa.getOrden().getPersonaContacto())
		.setCaption("Persona Contacto")
		.setExpandRatio(2);

		grid.addColumn(oa->oa.getOrden().getTelefono())
		.setCaption("Teléfono")
		.setExpandRatio(2);

		grid.addColumn(oa->oa.getOrden().getCiudad())
		.setCaption("Ciudad")
		.setExpandRatio(2);

		grid.addColumn(oa->oa.getOrden().getCodigoPostal())
		.setCaption("Código Postal")
		.setExpandRatio(2);

		grid.addColumn(oa->oa.getOrden().getAsesor())
		.setCaption("Asesor")
		.setExpandRatio(2);
		return grid;
	}

	private String xmlGregorianToString( OrdenesAbiertasEntity oe ){
		XMLGregorianCalendar xmlDate = oe.getOrden().getFecha();
		if( xmlDate != null ){
			SimpleDateFormat dateFormat = (SimpleDateFormat) DateFormat.getDateInstance(1, UI.getCurrent().getLocale());
			return dateFormat.format(xmlDate.toGregorianCalendar().getTime());
		}
		return "";
	}

	private String xmlGregorianToString2( OrdenesAbiertasEntity oe ){
		XMLGregorianCalendar xmlDate = oe.getOrden().getFechaRevision();
		if( xmlDate != null ){
			SimpleDateFormat dateFormat = (SimpleDateFormat) DateFormat.getDateInstance(1, UI.getCurrent().getLocale());
			return dateFormat.format(xmlDate.toGregorianCalendar().getTime());
		}
		return "";
	}

	private VerticalLayout generarCrudView(){
		VerticalLayout vl = new VerticalLayout();
		Button traerInfo = new Button( "Consultar Todo" );

		traerInfo.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = -4488239168999571799L;

			@Override
			public void buttonClick(ClickEvent event) {
				vl.addComponent(generarGridDelCrud());
				traerInfo.setVisible(false);
			}
		});

		vl.addComponent(traerInfo);
		return vl;
	}


	private void actioBuscar( DateField fechaInicial, DateField fechaFinal ) throws DatatypeConfigurationException{

		if( fechaInicial.getValue() != null && fechaFinal.getValue() != null ){

			GregorianCalendar gcalTmp = GregorianCalendar.from(fechaInicial.getValue().atStartOfDay(ZoneId.systemDefault()));
			XMLGregorianCalendar xcalFechaInicio = DatatypeFactory.newInstance().newXMLGregorianCalendar(gcalTmp);

			gcalTmp = GregorianCalendar.from(fechaFinal.getValue().atStartOfDay(ZoneId.systemDefault()));
			XMLGregorianCalendar xcalFechaFinal = DatatypeFactory.newInstance().newXMLGregorianCalendar(gcalTmp);

			ArrayOfOrdenesCerradasEntity arrayOfOrdenesCerradasEntity = servicioOrdenImpl.buscarOrdenesCerradas(xcalFechaInicio, xcalFechaFinal);
			Collection<OrdenesCerradasEntity> categoriasFiltradas = new ArrayList<>();
			if( arrayOfOrdenesCerradasEntity.getOrdenesCerradasEntity() != null ){
				categoriasFiltradas = arrayOfOrdenesCerradasEntity.getOrdenesCerradasEntity();
			}

			dataProviderOrdenesCerradasTotal = DataProvider.ofCollection(categoriasFiltradas);
			gridOrdenesCerradasTotal.setDataProvider(dataProviderOrdenesCerradasTotal);

		}else{
			if( fechaInicial.getValue()==null ){
				Notification.show("La fecha inicial es un valor obligatorio", Type.ERROR_MESSAGE);
			}
			if( fechaFinal.getValue()==null ){
				Notification.show("La fecha final es un valor obligatorio", Type.ERROR_MESSAGE);
			}
		}

	}

	private VerticalLayout generarGridDelCrud(){

		VerticalLayout vl = new VerticalLayout();
		gridCrud = new Grid<>();
		gridCrud.setCaption("Ordenes");
		gridCrud.setWidth("100%");
		gridCrud.setSelectionMode(SelectionMode.NONE);

		Collection<Orden> ordenes = OracleDataService.get().getOrdenesParaCancelar();
		dataProviderCrud = DataProvider.ofCollection(ordenes);
		gridCrud.setDataProvider(dataProviderCrud);

		TextField filterTextField = new TextField("Número orden");
		filterTextField.setPlaceholder("ingrese número de orden");
		filterTextField.addValueChangeListener(event -> {
			dataProviderCrud.setFilter(Orden::getIdorden , idOrden -> {
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

		HorizontalLayout hl= new HorizontalLayout();
		hl.setSpacing(true);
		hl.addComponent(filterTextField);

		TextField filterTextFieldIdProducto = new TextField("Número producto");
		filterTextFieldIdProducto.setPlaceholder("ingrese número de producto");
		filterTextFieldIdProducto.addValueChangeListener(event -> {
			dataProviderCrud.setFilter(Orden::getOrdenDetalles, ordenesDetalle -> {
				boolean retorno=false;
				Long valorIngresado=-1L;
				try{
					valorIngresado = new Long(event.getValue());
				}catch( NumberFormatException e ){
					return false;
				}

				for( Ordendetalle od: ordenesDetalle){
					if( od.getIdproducto().equals( new BigDecimal(valorIngresado) ) ){
						retorno = true;
						break;
					}
				}
				return retorno;
			});
		});

		hl.addComponent(filterTextFieldIdProducto);
		vl.addComponent(hl);

		gridCrud.addColumn(Orden::getIdorden)
		.setCaption("Número Orden")
		.setExpandRatio(2);

		gridCrud.addColumn(this::formatEstadoenvio)
		.setCaption("Estado Envío")
		.setExpandRatio(2);

		gridCrud.addColumn(this::formatCliente)
		.setCaption("Cliente")
		.setExpandRatio(2);

		gridCrud.addColumn( this::formatTarjeta)
		.setCaption("Tarjeta")
		.setExpandRatio(2);

		gridCrud.addColumn(Orden::getCelular)
		.setCaption("Celular")
		.setExpandRatio(2);

		SimpleDateFormat dateFormat = (SimpleDateFormat) DateFormat.getDateInstance(1, UI.getCurrent().getLocale());
		//		String formatString = dateFormat.toPattern();

		gridCrud.addColumn( Orden::getFecha)
		.setCaption("Fecha")
		.setRenderer(new DateRenderer(dateFormat));

		gridCrud.addColumn( Orden::getFecharevision)
		.setCaption("Fecha Revision")
		.setRenderer(new DateRenderer(dateFormat));

		gridCrud.addColumn(Orden::getCodigopostal)
		.setCaption("Código Postal")
		.setExpandRatio(2);

		gridCrud.addColumn(Orden::getComentario)
		.setCaption("Comentario")
		.setExpandRatio(2);

		gridCrud.addColumn(Orden::getDireccion)
		.setCaption("Dirección")
		.setExpandRatio(2);

		gridCrud.addColumn(Orden::getPersonacontacto)
		.setCaption("Persona Contacto")
		.setExpandRatio(2);

		gridCrud.addColumn(Orden::getTelefono)
		.setCaption("Tefono")
		.setExpandRatio(2);

		gridCrud.addColumn(this::formatCiudad)
		.setCaption("Ciudad")
		.setExpandRatio(2);

		gridCrud.addColumn(Orden::getAsesor)
		.setCaption("Asesor")
		.setExpandRatio(2);

		gridCrud.addColumn(person -> "Cancelar/Eliminar",
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
					gridCrud.setDataProvider(dataProviderTmp);
				}));

		vl.addComponent(gridCrud);

		return vl;
	}

	private String formatTarjeta( Orden o ){
		if(  o.getIdtarjeta() != 0 ){
			Tarjeta t = OracleDataService.get().getTarjetaXId(o.getIdtarjeta(), o.getCliente().getIdcliente());
			return t!=null?t.getNumero():"";
		}
		return "Sin Tarjeta";
	}

	private String formatTarjetaEntity( OrdenesAbiertasEntity oa ){
		if( oa.getOrden().getNumeroTarjeta()!=null && !oa.getOrden().getNumeroTarjeta().equals("0") ){
			return oa.getOrden().getNumeroTarjeta();
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
