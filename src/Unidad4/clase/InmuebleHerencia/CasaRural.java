package Unidad4.clase.InmuebleHerencia;

public class CasaRural extends Casa{
    protected double valorArea;
    protected int distanciaCabecera;
    protected int latitud;

    public CasaRural(int identificador, int area , String direccion, double precioVenta, int numHabitaciones, int numBanos, int numPisos, double valorArea, int distanciaCabecera, int latitud){
        super(identificador, area, direccion, precioVenta, numHabitaciones, numBanos, numPisos);
        this.valorArea = valorArea;
        this.distanciaCabecera = distanciaCabecera;
        this.latitud = latitud;
    }

    public CasaRural(){
        super();
        this.valorArea = 0;
        this.distanciaCabecera = 0;
        this.latitud = 0;
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Valor del area: " + this.valorArea);
        System.out.println("Distancia a la cabecera: " + this.distanciaCabecera);
        System.out.println("Latitud: " + this.latitud);
    }

}
