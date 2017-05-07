package co.com.kallsonys.oms.backend.data;

public enum Availability {
    COMING("Próximamente"), AVAILABLE("Disponible"), DISCONTINUED("Descontinuado");

    private final String name;

    private Availability(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
