package co.com.kallsonys.oms.main;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.ValoTheme;

/**
 * View shown when trying to navigate to a view that does not exist using
 * {@link com.vaadin.navigator.Navigator}.
 * 
 * 
 */
public class ErrorView extends VerticalLayout implements View {

    private Label explanation;

    public ErrorView() {
        Label header = new Label("Bienvenido al OMS de KALL-SONY'S");
        header.addStyleName(ValoTheme.LABEL_H1);
        addComponent(header);
        addComponent(explanation = new Label());
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
        explanation.setValue(String.format(
                "Seleccione una opción del menú.",
                event.getViewName()));
    }
}
