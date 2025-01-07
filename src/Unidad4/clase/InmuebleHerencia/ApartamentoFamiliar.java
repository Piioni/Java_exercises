package Unidad4.clase.InmuebleHerencia;

public class ApartamentoFamiliar extends Apartamento{
    protected double AreaValor;
    protected int valorAdministracion;

    public ApartamentoFamiliar(int identificador, int area, String direccion, double precioVenta, int numHabitaciones, int numBanos, double AreaValor, int valorAdministracion) {
        super(identificador, area, direccion, precioVenta, numHabitaciones, numBanos);
        this.AreaValor = AreaValor;
        this.valorAdministracion = valorAdministracion;
    }

    public ApartamentoFamiliar() {
        super();
        this.AreaValor = 0;
        this.valorAdministracion = 0;
    }

    public void imprimir() {
        System.out.println("Apartamento Familiar");
        super.imprimir();
        System.out.println("Area Valor: " + this.AreaValor);
        System.out.println("Valor Administracion: " + this.valorAdministracion);
    }


}
