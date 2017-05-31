package co.com.kallsonys.oms.crud.cliente;

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

import org.datacontract.schemas._2004._07.clienteentities.ArrayOfClienteEntity;
import org.datacontract.schemas._2004._07.clienteentities.ArrayOfClienteOrdenMasVendidasEntity;
import org.datacontract.schemas._2004._07.clienteentities.ClienteEntity;
import org.datacontract.schemas._2004._07.clienteentities.ClienteOrdenMasVendidasEntity;

import com.vaadin.data.Binder;
import com.vaadin.data.converter.LocalDateToDateConverter;
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
import com.vaadin.ui.Grid.ItemClick;
import com.vaadin.ui.Grid.SelectionMode;
import com.vaadin.ui.Notification.Type;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.components.grid.ItemClickListener;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.renderers.DateRenderer;
import com.vaadin.ui.themes.ValoTheme;

import co.com.kallsonys.backend.services.impl.ServicioClienteImpl;
import co.com.kallsonys.oms.backend.bdservice.oracle.OracleDataService;
import co.com.kallsonys.oms.backend.bdservice.oracle.OracleDataServiceImpl;
import co.com.kallsonys.oms.backend.entity.oracle.Cliente;
import co.com.kallsonys.oms.backend.entity.oracle.Tipocliente;

public class ClienteView extends VerticalLayout implements View{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2414122404959623813L;

	public static final String VIEW_NAME = "Clientes";
	private ServicioClienteImpl servicioClienteImpl = new ServicioClienteImpl();
	private Grid<ClienteOrdenMasVendidasEntity> gridClientesOrdenesMasVendidas;
	private ListDataProvider<ClienteOrdenMasVendidasEntity> dataProviderClientesOrdenesMasVendidas;

	private Grid<ClienteEntity> gridClientesXProducto;
	private ListDataProvider<ClienteEntity> dataProviderClientesXProducto;
	private Cliente clienteSeleccionado;
	private ComboBox<Tipocliente> comboTipoUsuarioEditor;
	private Button btnActualizarTipoCliente;

	public ClienteView(){
		setResponsive(true);
	}

	@Override
	public void enter(ViewChangeEvent event) {
		removeAllComponents();
		TabSheet mainTab = new TabSheet();
		mainTab.setResponsive(true);
		mainTab.setHeight(100.0f, Unit.PERCENTAGE);
		mainTab.addStyleName(ValoTheme.TABSHEET_FRAMED);
		mainTab.addStyleName(ValoTheme.TABSHEET_PADDED_TABBAR);

		mainTab.addTab(generarTabClientes(),"Clientes");
		mainTab.addTab(generarTabClientesOrdenesMasVendidas(),"Clientes que Más Facturan");
		mainTab.addTab(generarTabClientesXProducto(),"Buscar Clientes Producto");

		addComponent(mainTab);
	}

	private VerticalLayout generarTabClientesXProducto(){
		VerticalLayout vl = new VerticalLayout();
		vl.addComponent(generarSeccionFiltrosBusquedaClientesXProducto());
		vl.addComponent(generarGridClientesXCodigoProducto());
		return vl;

	}

	private Grid<ClienteEntity> generarGridClientesXCodigoProducto(){

		gridClientesXProducto = new Grid<>();
		gridClientesXProducto.setCaption("Clientes ");
		gridClientesXProducto.setWidth("100%");
		gridClientesXProducto.setSelectionMode(SelectionMode.NONE);

		Collection<ClienteEntity> clientes = new ArrayList<>();
		dataProviderClientesXProducto = DataProvider.ofCollection(clientes);
		gridClientesXProducto.setDataProvider(dataProviderClientesXProducto);
		
		gridClientesXProducto.addColumn(cli->cli.getNombre()+" "+cli.getApellido()).setCaption("Nombre");
		gridClientesXProducto.addColumn(cli->cli.getTelefono() ).setCaption("Teléfono");
		gridClientesXProducto.addColumn(cli->cli.getEmail() ).setCaption("Email");
		
		return gridClientesXProducto;
	}

	private HorizontalLayout generarSeccionFiltrosBusquedaClientesXProducto(){
		HorizontalLayout hl = new HorizontalLayout();
		hl.setSpacing(true);

		TextField filterTextField = new TextField("Número de producto");
		filterTextField.setPlaceholder("ingrese número de producto");

		Button btnBuscar = new Button("Realizar Busqueda");

		btnBuscar.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = -4488239168999571799L;

			@Override
			public void buttonClick(ClickEvent event) {
				try {
					actioBuscarClienteXProducto( filterTextField );
				} catch (DatatypeConfigurationException e) {
					e.printStackTrace();
					Notification.show("Error realizando consulta!!", Type.ERROR_MESSAGE);
				}
			}
		});

		hl.addComponent(filterTextField);
		hl.addComponent(btnBuscar);
		hl.setComponentAlignment(btnBuscar, Alignment.MIDDLE_CENTER);
		return hl;
	}

	private void actioBuscarClienteXProducto( TextField tfIdProducto )throws DatatypeConfigurationException{
		if( tfIdProducto.getValue() != null ){
			Integer numeroProducto;
			try{
				numeroProducto = Integer.parseInt(tfIdProducto.getValue());
			}catch( NumberFormatException e ){
				numeroProducto = null;
				Notification.show("El número del producto debe ser númerico", Type.ERROR_MESSAGE);
			}
			if( numeroProducto != null ){
				ArrayOfClienteEntity arrayOfClienteEntity = servicioClienteImpl.buscarClientesXIdProducto(numeroProducto);
				Collection<ClienteEntity> clientesFiltrados = new ArrayList<>();
				if( arrayOfClienteEntity.getClienteEntity() != null ){
					clientesFiltrados = arrayOfClienteEntity.getClienteEntity();
				}
				dataProviderClientesXProducto = DataProvider.ofCollection(clientesFiltrados);
				gridClientesXProducto .setDataProvider(dataProviderClientesXProducto);
			}
		}else{
			Notification.show("El número del producto es obligatorio", Type.ERROR_MESSAGE);
		}
	}



	private VerticalLayout generarTabClientesOrdenesMasVendidas(){
		VerticalLayout vl = new VerticalLayout();
		vl.addComponent(generarSeccionFiltrosBusqueda());
		vl.addComponent(generarclientesOrdenesMasVendidas());
		return vl;
	}

	private Grid<ClienteOrdenMasVendidasEntity> generarclientesOrdenesMasVendidas(){

		gridClientesOrdenesMasVendidas = new Grid<>();
		gridClientesOrdenesMasVendidas.setCaption("Clientes con ordenes más vendidas");
		gridClientesOrdenesMasVendidas.setWidth("100%");
		gridClientesOrdenesMasVendidas.setSelectionMode(SelectionMode.NONE);

		Collection<ClienteOrdenMasVendidasEntity> productos = new ArrayList<>();
		dataProviderClientesOrdenesMasVendidas = DataProvider.ofCollection(productos);
		gridClientesOrdenesMasVendidas.setDataProvider(dataProviderClientesOrdenesMasVendidas);
		gridClientesOrdenesMasVendidas.addColumn(cov->cov.getCliente().getNombre()+" "+cov.getCliente().getApellido()).setCaption("Cliente");
		gridClientesOrdenesMasVendidas.addColumn( ClienteOrdenMasVendidasEntity::getNumeroOrdenes ).setCaption("Número de Ordenes");
		gridClientesOrdenesMasVendidas.addColumn( ClienteOrdenMasVendidasEntity::getValorFacturado ).setCaption("Total Facturado");
		return gridClientesOrdenesMasVendidas;
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

			ArrayOfClienteOrdenMasVendidasEntity arrayOfClienteOrdenMasVendidasEntity = servicioClienteImpl.BuscarClienteOrdenMasVendidas(xcalFechaInicio, xcalFechaFinal);


			Collection<ClienteOrdenMasVendidasEntity> clientesFiltrados = new ArrayList<>();
			if( arrayOfClienteOrdenMasVendidasEntity.getClienteOrdenMasVendidasEntity() != null ){
				clientesFiltrados = arrayOfClienteOrdenMasVendidasEntity.getClienteOrdenMasVendidasEntity();
			}

			dataProviderClientesOrdenesMasVendidas = DataProvider.ofCollection(clientesFiltrados);
			gridClientesOrdenesMasVendidas .setDataProvider(dataProviderClientesOrdenesMasVendidas);

		}else{
			if( fechaInicial.getValue()==null ){
				Notification.show("La fecha inicial es un valor obligatorio", Type.ERROR_MESSAGE);
			}
			if( fechaFinal.getValue()==null ){
				Notification.show("La fecha final es un valor obligatorio", Type.ERROR_MESSAGE);
			}
		}
	}

	private VerticalLayout generarTabClientes(){

		Grid<Cliente> grid = new Grid<>();
		grid.setResponsive(true);
		grid.setCaption("Clientes");
		grid.setWidth("100%");
		grid.setSelectionMode(SelectionMode.NONE);

		Collection<Cliente> Clientes = OracleDataService.get().getAllClientes();
		ListDataProvider<Cliente> dataProvider = DataProvider.ofCollection(Clientes);
		grid.setDataProvider(dataProvider);

		TextField filterTextField = new TextField("Numero de documento");
		filterTextField.setPlaceholder("ingrese numero de documento");

		filterTextField.addValueChangeListener(event -> {
			dataProvider.setFilter(Cliente::getNumerodocumento , name -> {
				String nameLower = name == null ? "": name.toLowerCase(Locale.ENGLISH);
				String filterLower = event.getValue().toLowerCase(Locale.ENGLISH);
				return nameLower.contains(filterLower);
			});
		});

		grid.addColumn(cli->cli.getTipodocumento().getTipodocumento())
		.setCaption("Tipo Documento")
		.setExpandRatio(2);

		grid.addColumn(Cliente::getNumerodocumento)
		.setCaption("Número Documento")
		.setExpandRatio(2);

		TextField nombreEditor = new TextField();
		grid.addColumn(Cliente::getNombre)
		.setEditorComponent(nombreEditor, Cliente::setNombre)
		.setCaption("Nombre")
		.setExpandRatio(2);

		TextField apellidoEditor = new TextField();
		grid.addColumn(Cliente::getApellido)
		.setCaption("Apellido")
		.setEditorComponent(apellidoEditor, Cliente::setApellido)
		.setExpandRatio(2);
		
		Binder<Cliente> binder = new Binder<>();
		
		
		grid.addColumn(cli->cli.getTipocliente().getTipo())
		.setCaption("Tipo Cliente")
		.setExpandRatio(2);


		DateField fechaNacimiento = new DateField();
		SimpleDateFormat dateFormat = (SimpleDateFormat) DateFormat.getDateInstance(1, UI.getCurrent().getLocale());
		String formatString = dateFormat.toPattern();
		fechaNacimiento.setDateFormat(formatString);
		LocalDateToDateConverter dateConverter = new LocalDateToDateConverter();
		//		binder.bind(Date.from(fechaInicialField.getValue().atStartOfDay(ZoneId.systemDefault()).toInstant()), Cliente::getFechainicial,Cliente::setFechainicial);

		grid.addColumn(
				Cliente::getFechanacimiento)
		.setCaption("Fecha de Nacimiento")
		.setRenderer(new DateRenderer(dateFormat))
		.setEditorBinding(binder
				.forField(fechaNacimiento)
				.withConverter(dateConverter)
				.bind(Cliente::getFechanacimiento, Cliente::setFechanacimiento));


		TextField usuarioEditor = new TextField();
		grid.addColumn(Cliente::getUsuario).
		setCaption("Usuario")
		.setEditorComponent(usuarioEditor, Cliente::setUsuario)
		.setExpandRatio(2);

		TextField telefonoEditor = new TextField();
		grid.addColumn(Cliente::getTelefono).
		setCaption("Telefono")
		.setEditorComponent(telefonoEditor, Cliente::setTelefono)
		.setExpandRatio(2);

		TextField emailEditor = new TextField();
		grid.addColumn(Cliente::getTelefono).
		setCaption("E-mail")
		.setEditorComponent(emailEditor, Cliente::setTelefono)
		.setExpandRatio(2);

		TextField direccionEditor = new TextField();
		grid.addColumn(Cliente::getDireccion).
		setCaption("Dirección")
		.setEditorComponent(direccionEditor, Cliente::setDireccion)
		.setExpandRatio(2);


		grid.getEditor().setSaveCaption("Guardar");
		grid.getEditor().setCancelCaption("Cancelar");

		grid.getEditor().addSaveListener(e -> {
			Cliente c = e.getBean();
			OracleDataService.get().actualizarCliente(c);
		});
		grid.getEditor().setEnabled(true);
		
		
		grid.addItemClickListener(new ItemClickListener<Object>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void itemClick(ItemClick<Object> event) {
				clienteSeleccionado = (Cliente) event.getItem();
				comboTipoUsuarioEditor.setValue(clienteSeleccionado.getTipocliente());
				comboTipoUsuarioEditor.setVisible(true);
				btnActualizarTipoCliente.setVisible(true);
			}
	    });

		VerticalLayout vl = new VerticalLayout();
		vl.setResponsive(true);
		HorizontalLayout hl = new HorizontalLayout();
		hl.setResponsive(true);
		hl.setSpacing(true);
		comboTipoUsuarioEditor = new ComboBox<>("Tipo de cliente");
		comboTipoUsuarioEditor.setVisible(false);
		comboTipoUsuarioEditor.setItemCaptionGenerator(Tipocliente::getTipo);
		comboTipoUsuarioEditor.setItems(OracleDataServiceImpl.get().getAllTipoCliente());
		
		btnActualizarTipoCliente = new Button("Actualizar tipo de cliente");
		btnActualizarTipoCliente.setVisible(false);
		btnActualizarTipoCliente.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = -4488239168999571799L;

			@Override
			public void buttonClick(ClickEvent event) {
					actioActualizarTipoCliente(  );
					dataProvider.refreshItem(clienteSeleccionado);
			}
		});
		
		hl.addComponent(filterTextField);
		hl.addComponent(comboTipoUsuarioEditor);
		hl.addComponent(btnActualizarTipoCliente);
		hl.setComponentAlignment(btnActualizarTipoCliente, Alignment.BOTTOM_CENTER);
		
		vl.addComponent(hl);
		vl.addComponent(grid);
		return vl;
	}
	
	private void actioActualizarTipoCliente(){
		clienteSeleccionado.setTipocliente(comboTipoUsuarioEditor.getValue());
		OracleDataServiceImpl.get().actualizarCliente(clienteSeleccionado);
		Notification.show("Cliente Actualizado satisfactoriamente!!", Type.HUMANIZED_MESSAGE);

	}
}
