package co.com.kallsonys.oms.crud.cliente;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Locale;

import com.vaadin.data.Binder;
import com.vaadin.data.converter.LocalDateToDateConverter;
import com.vaadin.data.provider.DataProvider;
import com.vaadin.data.provider.ListDataProvider;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.DateField;
import com.vaadin.ui.Grid;
import com.vaadin.ui.Grid.SelectionMode;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.renderers.DateRenderer;

import co.com.kallsonys.oms.backend.bdservice.oracle.OracleDataService;
import co.com.kallsonys.oms.backend.entity.oracle.Cliente;

public class ClienteView extends VerticalLayout implements View{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2414122404959623813L;

	public static final String VIEW_NAME = "Clientes";

	public ClienteView(){
		generarTablaFiltro();

	}

	@Override
	public void enter(ViewChangeEvent event) {

	}

	private void generarTablaFiltro(){

		Grid<Cliente> grid = new Grid<>();
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
		
		grid.addColumn(Cliente::getTipodocumento)
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
		setCaption("E-mail")
		.setEditorComponent(direccionEditor, Cliente::setDireccion)
		.setExpandRatio(2);

		
		grid.getEditor().setSaveCaption("Guardar");
		grid.getEditor().setCancelCaption("Cancelar");

		grid.getEditor().addSaveListener(e -> {
			Cliente c = e.getBean();
			OracleDataService.get().actualizarCliente(c);
		});

		grid.getEditor().setEnabled(true);
		addComponent(filterTextField);
		addComponent(grid);
	}
}
