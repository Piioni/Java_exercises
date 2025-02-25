package Unidad7.Composicion.coche.Classes;

import Unidad7.Composicion.coche.Enums.tipoCarroceria;

public class Carroceria {
    private String color;
    private tipoCarroceria tipo;

    public Carroceria(String color, tipoCarroceria tipo) {
        this.color = color;
        this.tipo = tipo;
    }
}
