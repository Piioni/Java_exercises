package Unidad3.Practica.Propia.Supermercado.interfaces;

import java.time.LocalDate;

public interface EsAlimento {
    public void setCaducidad(LocalDate fecha);
    public LocalDate getCaducidad();
    public double getCalorias();
}
