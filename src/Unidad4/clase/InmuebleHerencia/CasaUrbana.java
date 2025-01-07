package Unidad4.clase.InmuebleHerencia;

public class CasaUrbana extends Casa {

    public CasaUrbana(int identificador, int area, String direccion, int numHabitaciones, int numBanos, int numPisos) {
        super(identificador, area, direccion, numHabitaciones, numBanos, numPisos);
    }

    public CasaUrbana() {
        super();
    }

    public void imprimir() {
        System.out.println("Casa Urbana");
        super.imprimir();
    }
}
