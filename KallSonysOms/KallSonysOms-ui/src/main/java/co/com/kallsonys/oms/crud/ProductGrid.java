package co.com.kallsonys.oms.crud;

import java.text.DecimalFormat;
import java.util.Comparator;
import java.util.stream.Collectors;

import com.vaadin.icons.VaadinIcons;
import com.vaadin.ui.Grid;
import com.vaadin.ui.renderers.HtmlRenderer;
import com.vaadin.ui.renderers.NumberRenderer;

import co.com.kallsonys.oms.backend.data.Availability;
import co.com.kallsonys.oms.backend.data.Category;
import co.com.kallsonys.oms.backend.data.Product;

/**
 * Grid of products, handling the visual presentation and filtering of a set of
 * items. This version uses an in-memory data source that is suitable for small
 * data sets.
 */
public class ProductGrid extends Grid<Product> {

    public ProductGrid() {
        setSizeFull();

        addColumn(Product::getCodigo).setCaption("Código");
        addColumn(Product::getProductName).setCaption("Nombre del producto");

        // Format and add " $" to price
        final DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setMaximumFractionDigits(2);
        decimalFormat.setMinimumFractionDigits(2);
        addColumn(product -> decimalFormat.format(product.getPrice()) + " $")
                        .setCaption("Precio").setComparator((p1, p2) -> {
                            return p1.getPrice().compareTo(p2.getPrice());
                        }).setStyleGenerator(product -> "align-right");

        // Add an traffic light icon in front of availability
//        addColumn(this::htmlFormatAvailability, new HtmlRenderer())
//                .setCaption("Disponibilidad").setComparator((p1, p2) -> {
//                    return p1.getAvailability().toString()
//                            .compareTo(p2.getAvailability().toString());
//                });

        // Show empty stock as "-"
        addColumn(product -> {
            if (product.getStockCount() == 0) {
                return "-";
            }
            return Integer.toString(product.getStockCount());
        }).setCaption("Cantidad Disponible").setComparator((p1, p2) -> {
            return Integer.compare(p1.getStockCount(), p2.getStockCount());
        }).setStyleGenerator(product -> "align-right");

        // Show all categories the product is in, separated by commas
        addColumn(this::formatCategories).setCaption("Categoria").setSortable(false);
        addColumn(Product::getUrlImagen).setCaption("URL Imagen").setSortable(false);
    }

    public Product getSelectedRow() {
        return asSingleSelect().getValue();
    }

    public void refresh(Product product) {
        getDataCommunicator().refresh(product);
    }

//    private String htmlFormatAvailability(Product product) {
//        Availability availability = product.getAvailability();
//        String text = availability.toString();
//
//        String color = "";
//        switch (availability) {
//        case AVAILABLE:
//            color = "#2dd085";
//            break;
//        case COMING:
//            color = "#ffc66e";
//            break;
//        case DISCONTINUED:
//            color = "#f54993";
//            break;
//        default:
//            break;
//        }
//
//        String iconCode = "<span class=\"v-icon\" style=\"font-family: "
//                + VaadinIcons.CIRCLE.getFontFamily() + ";color:" + color
//                + "\">&#x"
//                + Integer.toHexString(VaadinIcons.CIRCLE.getCodepoint())
//                + ";</span>";
//
//        return iconCode + " " + text;
//    }

    private String formatCategories(Product product) {
        if (product.getCategoria() == null ) {
            return "";
        }
        return product.getCategoria().getNombre();
//        return product.getCategory().stream()
//                .sorted(Comparator.comparing(Category::getId))
//                .map(Category::getName).collect(Collectors.joining(", "));
    }
}
