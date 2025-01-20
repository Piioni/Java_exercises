package Unidad4.InmuebleHerencia;

public class CasaConjuntoCerrado extends CasaUrbana {
    protected double valorAreaDoble;
    protected double valorAdministracion;
    protected boolean piscina;
    protected boolean camposDeportivos;

    public CasaConjuntoCerrado(int identificador, int area, String direccion, double precioVenta, int numHabitaciones, int numBanos, int numPisos, double valorAreaDoble, double valorAdministracion, boolean piscina, boolean camposDeportivos) {
        super(identificador, area, direccion, precioVenta, numHabitaciones, numBanos, numPisos);
        this.valorAreaDoble = valorAreaDoble;
        this.valorAdministracion = valorAdministracion;
        this.piscina = piscina;
        this.camposDeportivos = camposDeportivos;
    }

    public CasaConjuntoCerrado() {
        super();
        this.valorAreaDoble = 0;
        this.valorAdministracion = 0;
        this.piscina = false;
        this.camposDeportivos = false;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Valor del area doble: " + this.valorAreaDoble);
        System.out.println("Valor de la administracion: " + this.valorAdministracion);
        System.out.println("Piscina: " + this.piscina);
        System.out.println("Campos deportivos: " + this.camposDeportivos);
    }
}
