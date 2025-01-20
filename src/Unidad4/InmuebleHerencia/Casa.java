package Unidad4.InmuebleHerencia;

public class Casa extends InmuebleVivienda {
    protected int numPisos;

    public Casa(int identificador, int area, String direccion, double precioVenta, int numHabitaciones, int numBanos, int numPisos) {
        super(identificador, area, direccion, precioVenta, numHabitaciones, numBanos);
        this.numPisos = numPisos;
    }

    public Casa() {
        super();
        this.numPisos = 0;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Numero de pisos: " + this.numPisos);
    }

}
