package com.foc.clases;

import com.foc.interfaces.EsAlimento;

import java.time.LocalDate;

public class Cereales implements EsAlimento {
    private String marca;
    private double precio;
    private String tipoCereal;
    private LocalDate caducidad;
    private int calorias;

    // Constructor
    public Cereales(String marca, double precio, String tipoCereal) {
        this.marca = marca;
        this.precio = precio;
        this.tipoCereal = tipoCereal;
        switch (tipoCereal.toLowerCase()) {
            case "espelta" -> calorias = 5;
            case "maiz" -> calorias = 8;
            case "trigo" -> calorias = 12;
            default -> calorias = 15;
        }
    }

    // Metodos de la interfaz
    public void setCaducidad(LocalDate fecha){
        this.caducidad = fecha;
    }

    public LocalDate getCaducidad(){
        return this.caducidad;
    }

    public int getCalorias(){
        return this.calorias;
    }

    // Metodo toString
    @Override
    public String toString() {
        return "Cereales: " + '\n' +
                "Marca: " + marca + '\n' +
                "Precio:  " + precio + '\n' +
                "Tipo de Cereal: " + tipoCereal + '\n' +
                "Caducidad: " + caducidad + '\n' +
                "Calorias; " + calorias ;
    }

    // Getters & Setters
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoCereal() {
        return tipoCereal;
    }

    public void setTipoCereal(String tipoCereal) {
        this.tipoCereal = tipoCereal;
    }
}
