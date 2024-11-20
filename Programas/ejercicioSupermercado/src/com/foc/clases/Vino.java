package com.foc.clases;

import com.foc.interfaces.EsAlimento;
import com.foc.interfaces.EsLiquido;

import java.time.LocalDate;

public class Vino implements EsLiquido, EsAlimento {
    private String marca;
    private String tipo;
    private double grados_alcohol;
    private double precio;
    private double volumen;
    private String tipoEnvase;
    private final double calorias;
    private LocalDate caducidad;

    // Constructor
    public Vino(String marca, String tipo, double grados_alcohol, double precio) {
        this.marca = marca;
        this.tipo = tipo;
        this.grados_alcohol = grados_alcohol;
        this.precio = precio;
        this.calorias = grados_alcohol*10;
    }

    // Metodos de la interfaz de alimento
    @Override
    public void setCaducidad(LocalDate fecha) {
        this.caducidad = fecha;
    }

    @Override
    public LocalDate getCaducidad() {
        return caducidad;
    }

    @Override
    public double getCalorias() {
        return calorias;
    }

    // Metodos de la interfaz liquida
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

    // Getter & Setter
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getGrados_alcohol() {
        return grados_alcohol;
    }

    public void setGrados_alcohol(double grados_alcohol) {
        this.grados_alcohol = grados_alcohol;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
