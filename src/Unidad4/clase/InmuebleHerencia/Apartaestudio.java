package Unidad4.clase.InmuebleHerencia;

public class Apartaestudio extends Apartamento{
    protected double valorArea;

    public Apartaestudio(int identificador, int area, String direccion, double precioVenta, int numHabitaciones, int numBanos, double valorArea) {
        super(identificador, area, direccion, precioVenta, numHabitaciones, numBanos);
        this.valorArea = valorArea;
    }

    public Apartaestudio() {
        super();
        this.valorArea = 0;
    }

    public void imprimir() {
        System.out.println("Apartaestudio");
        super.imprimir();
        System.out.println("Valor Administracion: " + this.valorArea);
    }
}
