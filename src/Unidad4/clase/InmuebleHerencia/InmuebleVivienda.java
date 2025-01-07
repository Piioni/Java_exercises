package Unidad4.clase.InmuebleHerencia;

public class InmuebleVivienda extends Inmueble{
    protected int numHabitaciones;
    protected int numBanos;

    public InmuebleVivienda(){
        super();
        this.numHabitaciones = 0;
        this.numBanos = 0;
    }

    public InmuebleVivienda(int identificador, int area, String direccion, double precioVenta, int numHabitaciones, int numBanos){
        super(identificador, area, direccion, precioVenta);
        this.numHabitaciones = numHabitaciones;
        this.numBanos = numBanos;
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Numero de habitaciones: " + this.numHabitaciones);
        System.out.println("Numero de baños: " + this.numBanos);
    }
}
