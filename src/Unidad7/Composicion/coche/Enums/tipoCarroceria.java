package Unidad7.Composicion.coche.Enums;

public enum tipoCarroceria {
    INDEPENDIENTE("Independiente"),
    AUTOPORTANTE("Autoportante"),
    TUBULAR("Tubular");

    private final String descripcion;

    tipoCarroceria(String descripcion){
        this.descripcion = descripcion;
    }
}
