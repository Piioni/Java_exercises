package Unidad4.clase.InmuebleHerencia;

public class CasaIndependiente extends CasaUrbana {
    protected double valorAreaDoble;

    public CasaIndependiente(int identificador, int area, String direccion, double precioVenta, int numHabitaciones, int numBanos, int numPisos, double valorAreaDoble) {
        super(identificador, area, direccion, precioVenta, numHabitaciones, numBanos, numPisos);
        this.valorAreaDoble = valorAreaDoble;
    }

    public CasaIndependiente() {
        super();
        this.valorAreaDoble = 0;
    }

}
