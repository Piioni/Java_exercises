package Unidad4.InmuebleHerencia;

public class CasaUrbana extends Casa {

    public CasaUrbana(int identificador, int area, String direccion, double precioVenta, int numHabitaciones, int numBanos, int numPisos) {
        super(identificador, area, direccion,precioVenta, numHabitaciones, numBanos, numPisos);
    }

    public CasaUrbana() {
        super();
    }

    public void imprimir() {
        System.out.println("Casa Urbana");
        super.imprimir();
    }
}
