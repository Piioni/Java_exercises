package com.foc.interfaces;

import java.time.LocalDate;

public interface EsAlimento {
    public void setCaducidad(LocalDate fecha);
    public LocalDate getCaducidad();
    public int getCalorias();
}
