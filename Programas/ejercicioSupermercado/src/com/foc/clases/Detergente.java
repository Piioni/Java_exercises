package com.foc.clases;

import com.foc.interfaces.ConDescuento;
import com.foc.interfaces.EsLiquido;

public class Detergente implements EsLiquido, ConDescuento {
    private String marca;
    private double precio;
    private double volumen;
    private String tipoEnvase;


    public Detergente(String marca, double precio) {
        this.marca = marca;
        this.precio = precio;
    }

    // Metodos de las interfaces
    @Override
    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    @Override
    public double getVolumen() {
        return volumen;
    }

    @Override
    public void setTipoEnvases(String envases) {
        this.tipoEnvase = envases;
    }

    @Override
    public String getTipoEnvase() {
        return tipoEnvase;
    }

    @Override
    public void setDescuento(double descuento) {
        precio = 0;
    }

    @Override
    public double getDescuento() {
        return precio;
    }

    @Override
    public double getPrecioDescuento() {
        return 0;
    }

    // Getters & Setters de la clase
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
