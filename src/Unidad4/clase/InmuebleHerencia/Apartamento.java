package Unidad4.clase.InmuebleHerencia;

public class Apartamento extends InmuebleVivienda{

    public Apartamento(int identificador, int area, String direccion,double precioVenta, int numHabitaciones, int numBanos) {
        super(identificador, area, direccion, precioVenta, numHabitaciones, numBanos);
    }

    public Apartamento() {
        super();
    }

    public void imprimir() {
        System.out.println("Apartamento");
        super.imprimir();
    }


}
