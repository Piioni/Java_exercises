package Unidad4.clase.InmuebleHerencia;

public class Apartamento extends InmuebleVivienda{

    public Apartamento(int identificador, int area, String direccion, int numHabitaciones, int numBanos) {
        super(identificador, area, direccion, numHabitaciones, numBanos);
    }

    public Apartamento() {
        super();
    }

    public void imprimir() {
        System.out.println("Apartamento");
        super.imprimir();
    }


}
