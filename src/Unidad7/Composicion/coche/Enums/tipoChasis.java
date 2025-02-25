package Unidad7.Composicion.coche.Enums;

public enum tipoChasis {
    MONOCASCO("Monocasco"),
    INDEPENDIENTE("Independiente"),;


    private final String descripcion;

    tipoChasis(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

}
