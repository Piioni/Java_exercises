package Unidad4.InmuebleHerencia;

public class Inmueble {
    protected int identificador;
    protected int area;
    protected String direccion;
    protected double precioVenta;

    public Inmueble(){
        this.identificador = 0;
        this.area = 0;
        this.direccion = "";
        this.precioVenta = 0;
    }

    public Inmueble(int identificador, int area, String direccion, double precioVenta){
        this.identificador = identificador;
        this.area = area;
        this.direccion = direccion;
        this.precioVenta = precioVenta;
    }

    public void imprimir(){
        System.out.println("Identificador: " + this.identificador);
        System.out.println("Area: " + this.area);
        System.out.println("Direccion: " + this.direccion);
    }

}
