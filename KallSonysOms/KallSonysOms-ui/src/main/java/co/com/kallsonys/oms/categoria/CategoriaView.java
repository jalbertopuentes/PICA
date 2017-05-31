package co.com.kallsonys.oms.categoria;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.datacontract.schemas._2004._07.productoentities.ArrayOfCategoriaEntity;
import org.datacontract.schemas._2004._07.productoentities.CategoriaEntity;

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
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Grid.SelectionMode;
import com.vaadin.ui.Notification.Type;

import co.com.kallsonys.backend.services.impl.ServicioProductoImpl;

public class CategoriaView extends VerticalLayout implements View {


	/**
	 * 
	 */
	private static final long serialVersionUID = 2196259731475337163L;

	public static final String VIEW_NAME = "Top Categorias";

	private ServicioProductoImpl servicioProductoImpl= new ServicioProductoImpl();
	private Grid<CategoriaEntity> grid;
	private ListDataProvider<CategoriaEntity> dataProvider;

	public CategoriaView(){

	}

	@Override
	public void enter(ViewChangeEvent event) {
		removeAllComponents();
		addComponent(generarSeccionBusqueda());
		addComponent(generarGrid());
	}

	private VerticalLayout generarSeccionBusqueda(){
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

		//		LocalDateToDateConverter dateConverter = new LocalDateToDateConverter();
		//		binder.forField(fechaInicial)
		//		.withConverter(dateConverter)
		//		.asRequired("Campo requerido").
		//		bind(FiltroFechasDto::getFechaInicial, FiltroFechasDto::setFechaInicial);
		//		
		//		
		//		binder.forField(fechaFinal)
		//		.withConverter(dateConverter)
		//		.asRequired("Campo requerido").
		//		bind(FiltroFechasDto::getFechaFinal, FiltroFechasDto::setFechaFinal);

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

	private void actioBuscar( DateField fechaInicial, DateField fechaFinal ) throws DatatypeConfigurationException{

		if( fechaInicial.getValue() != null && fechaFinal.getValue() != null ){

			GregorianCalendar gcalTmp = GregorianCalendar.from(fechaInicial.getValue().atStartOfDay(ZoneId.systemDefault()));
			XMLGregorianCalendar xcalFechaInicio = DatatypeFactory.newInstance().newXMLGregorianCalendar(gcalTmp);

			gcalTmp = GregorianCalendar.from(fechaFinal.getValue().atStartOfDay(ZoneId.systemDefault()));
			XMLGregorianCalendar xcalFechaFinal = DatatypeFactory.newInstance().newXMLGregorianCalendar(gcalTmp);

			ArrayOfCategoriaEntity arrayOfCategoriaEntity = servicioProductoImpl.buscarCategoriasFecha(xcalFechaInicio, xcalFechaFinal);
			Collection<CategoriaEntity> categoriasFiltradas = new ArrayList<>();
			if( arrayOfCategoriaEntity.getCategoriaEntity() != null ){
				categoriasFiltradas = arrayOfCategoriaEntity.getCategoriaEntity();
			}
			dataProvider = DataProvider.ofCollection(categoriasFiltradas);
			grid.setDataProvider(dataProvider);

		}else{
			if( fechaInicial.getValue()==null ){
				Notification.show("La fecha inicial es un valor obligatorio", Type.ERROR_MESSAGE);
			}
			if( fechaFinal.getValue()==null ){
				Notification.show("La fecha final es un valor obligatorio", Type.ERROR_MESSAGE);
			}
		}

	}

	private Grid<CategoriaEntity> generarGrid(){

		grid = new Grid<>();
		grid.setCaption("Categorias");
		grid.setWidth("100%");
		grid.setSelectionMode(SelectionMode.NONE);

		Collection<CategoriaEntity> categorias = new ArrayList<>();
		dataProvider = DataProvider.ofCollection(categorias);
		grid.setDataProvider(dataProvider);

		grid.addColumn(CategoriaEntity::getIdCategoria)
		.setCaption("Id Categoria")
		.setExpandRatio(2);

		grid.addColumn(CategoriaEntity::getCategoria)
		.setCaption("Categoria")
		.setExpandRatio(2);
		return grid;
	}



}
