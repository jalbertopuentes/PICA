package co.com.kallsonys.oms.main;

import co.com.kallsonys.oms.MyUI;
import co.com.kallsonys.oms.about.AboutView;
import co.com.kallsonys.oms.authentication.CurrentUser;
import co.com.kallsonys.oms.backend.entity.oracle.Rol;
import co.com.kallsonys.oms.categoria.CategoriaView;
import co.com.kallsonys.oms.crud.campana.CampanaView;
import co.com.kallsonys.oms.crud.cliente.ClienteView;
import co.com.kallsonys.oms.crud.productos.SampleCrudView;
import co.com.kallsonys.oms.orden.OrdenView;

import com.vaadin.icons.VaadinIcons;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.HorizontalLayout;

/**
 * Content of the UI when the user is logged in.
 * 
 * 
 */
public class MainScreen extends HorizontalLayout {
	private Menu menu;

	public MainScreen(MyUI ui) {

		setSpacing(false);
		setStyleName("main-screen");

		CssLayout viewContainer = new CssLayout();
		viewContainer.addStyleName("valo-content");
		viewContainer.setSizeFull();

		Rol rol = CurrentUser.getRol();

		final Navigator navigator = new Navigator(ui, viewContainer);
		navigator.setErrorView(ErrorView.class);
		menu = new Menu(navigator);

		if( rol.getNombre().toUpperCase().equals("Admin".toUpperCase()) ){
			menu.addView(new SampleCrudView(), SampleCrudView.VIEW_NAME,
					SampleCrudView.VIEW_NAME, VaadinIcons.EDIT);
			menu.addView(new CampanaView(), CampanaView.VIEW_NAME, CampanaView.VIEW_NAME,
					VaadinIcons.EDIT);
			menu.addView(new ClienteView(), ClienteView.VIEW_NAME, ClienteView.VIEW_NAME,
					VaadinIcons.EDIT);
			menu.addView(new CategoriaView(), CategoriaView.VIEW_NAME, CategoriaView.VIEW_NAME, 
					VaadinIcons.EDIT);
			menu.addView(new OrdenView(), OrdenView.VIEW_NAME, OrdenView.VIEW_NAME, 
					VaadinIcons.EDIT);
		}else
			if( rol.getNombre().toUpperCase().equals("orden".toUpperCase()) ){
				menu.addView(new OrdenView(), OrdenView.VIEW_NAME, OrdenView.VIEW_NAME, 
						VaadinIcons.EDIT);
			}else
				if( rol.getNombre().toUpperCase().equals("producto".toUpperCase()) ){
					menu.addView(new SampleCrudView(), SampleCrudView.VIEW_NAME,
							SampleCrudView.VIEW_NAME, VaadinIcons.EDIT);
				}
		

		menu.addView(new AboutView(), AboutView.VIEW_NAME, AboutView.VIEW_NAME,
				VaadinIcons.INFO_CIRCLE);

		navigator.addViewChangeListener(viewChangeListener);

		addComponent(menu);
		addComponent(viewContainer);
		setExpandRatio(viewContainer, 1);
		setSizeFull();
	}

	// notify the view menu about view changes so that it can display which view
	// is currently active
	ViewChangeListener viewChangeListener = new ViewChangeListener() {

		@Override
		public boolean beforeViewChange(ViewChangeEvent event) {
			return true;
		}

		@Override
		public void afterViewChange(ViewChangeEvent event) {
			menu.setActiveView(event.getViewName());
		}

	};
}
