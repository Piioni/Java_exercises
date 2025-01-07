package Unidad4.clase.InmuebleHerencia;

public class Inmueble {
    protected int identificador;
    protected int area;
    protected String direccion;

    public Inmueble(){
        this.identificador = 0;
        this.area = 0;
        this.direccion = "";
    }

    public Inmueble(int identificador, int area, String direccion){
        this.identificador = identificador;
        this.area = area;
        this.direccion = direccion;
    }

    public void imprimir(){
        System.out.println("Identificador: " + this.identificador);
        System.out.println("Area: " + this.area);
        System.out.println("Direccion: " + this.direccion);
    }

}
