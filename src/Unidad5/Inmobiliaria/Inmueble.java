package Unidad5.Inmobiliaria;

import java.io.Serial;
import java.io.Serializable;

public class Inmueble implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private int id;
    private String ciudad;
    private String direccion;
    private Tipo tipo;


    public Inmueble(int id, String ciudad, String direccion, Tipo tipo) {
        this.id = id;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.tipo = tipo;
    }

    public void imprimir() {
        System.out.println("Id: " + id);
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Direccion: " + direccion);
        System.out.println("Tipo: " + tipo);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
