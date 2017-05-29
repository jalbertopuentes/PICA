package co.com.kallsonys.oms.crud.campana;

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
import com.vaadin.ui.renderers.ButtonRenderer;
import com.vaadin.ui.renderers.DateRenderer;

import co.com.kallsonys.oms.backend.bdservice.oracle.OracleDataService;
import co.com.kallsonys.oms.backend.entity.oracle.Campana;

public class CampanaView extends VerticalLayout implements View{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2414122404959623813L;

	public static final String VIEW_NAME = "Campañas";


	public CampanaView(){

		addComponent(generarCrud());

	}

	@Override
	public void enter(ViewChangeEvent event) {

	}

	private VerticalLayout generarCrud(){

		Grid<Campana> grid = new Grid<>();
		grid.setCaption("Campañas");
		grid.setWidth("100%");
		grid.setSelectionMode(SelectionMode.NONE);

		Collection<Campana> campanas = OracleDataService.get().getAllCampanas();
		ListDataProvider<Campana> dataProvider = DataProvider.ofCollection(campanas);
		grid.setDataProvider(dataProvider);

		TextField filterTextField = new TextField("Titulo Campaña");
		filterTextField.setPlaceholder("Titulo Filtro");
		filterTextField.addValueChangeListener(event -> {
			dataProvider.setFilter(Campana::getTitulocampana, name -> {
				String nameLower = name == null ? ""
						: name.toLowerCase(Locale.ENGLISH);
				String filterLower = event.getValue()
						.toLowerCase(Locale.ENGLISH);
				return nameLower.contains(filterLower);
			});
		});

		TextField tituloEditor = new TextField();
		grid.addColumn(Campana::getTitulocampana)
		.setEditorComponent(tituloEditor, Campana::setTitulocampana)
		.setCaption("Titulo")
		.setExpandRatio(2);

		TextField subTituloEditor = new TextField();
		grid.addColumn(Campana::getSubtitulocampana)
		.setCaption("Sub Titulo")
		.setEditorComponent(subTituloEditor, Campana::setSubtitulocampana)
		.setExpandRatio(2);

		TextField urlImagenEditor = new TextField();
		grid.addColumn(Campana::getUrlimagen).
		setCaption("URL Imagen")
		.setEditorComponent(urlImagenEditor, Campana::setUrlimagen)
		.setExpandRatio(2);

		TextField descripcion = new TextField();
		grid.addColumn(Campana::getDescripcion).
		setCaption("Descripcion")
		.setEditorComponent(descripcion, Campana::setDescripcion)
		.setExpandRatio(2);

		Binder<Campana> binder = new Binder<>();

		DateField fechaInicialField = new DateField();
		SimpleDateFormat dateFormat = (SimpleDateFormat) DateFormat.getDateInstance(1, UI.getCurrent().getLocale());
		String formatString = dateFormat.toPattern();
		fechaInicialField.setDateFormat(formatString);
		LocalDateToDateConverter dateConverter = new LocalDateToDateConverter();
		//		binder.bind(Date.from(fechaInicialField.getValue().atStartOfDay(ZoneId.systemDefault()).toInstant()), Campana::getFechainicial,Campana::setFechainicial);

		grid.addColumn(
				Campana::getFechainicial)
		.setCaption("Fecha de Inicio")
		.setRenderer(new DateRenderer(dateFormat))
		.setEditorBinding(binder
				.forField(fechaInicialField)
				.withConverter(dateConverter)
				.bind(Campana::getFechainicial, Campana::setFechainicial));


		DateField fechaFinalField = new DateField();
		fechaFinalField.setDateFormat(formatString);

		grid.addColumn(
				Campana::getFechafinal)
		.setCaption("Fecha final")
		.setRenderer(new DateRenderer(dateFormat))
		.setEditorBinding(binder
				.forField(fechaFinalField)
				.withConverter(dateConverter)
				.bind(Campana::getFechafinal, Campana::setFechafinal));
		
		


		grid.getEditor().setSaveCaption("Guardar");
		grid.getEditor().setCancelCaption("Cancelar");

		grid.getEditor().addSaveListener(e -> {
			Campana c = e.getBean();
			OracleDataService.get().actualizarCampanas(c);
		});

		grid.getEditor().setEnabled(true);
		grid.addColumn(person -> "Elimnar",
				new ButtonRenderer<Object>(clickEvent -> {
					campanas.remove(clickEvent.getItem());
					OracleDataService.get().eliminarCampana( (Campana) clickEvent.getItem());
					ListDataProvider<Campana> dataProviderTmp = DataProvider.ofCollection(campanas);
					filterTextField.addValueChangeListener(event -> {
						dataProviderTmp.setFilter(Campana::getTitulocampana, name -> {
							String nameLower = name == null ? ""
									: name.toLowerCase(Locale.ENGLISH);
							String filterLower = event.getValue()
									.toLowerCase(Locale.ENGLISH);
							return nameLower.contains(filterLower);
						});
					});
					grid.setDataProvider(dataProviderTmp);
				}));
		
		VerticalLayout vL = new VerticalLayout();
		vL.setWidth("100%");
		vL.setResponsive(true);
		vL.addComponent(filterTextField);
		vL.addComponent(grid);
		return vL;
	}

}
