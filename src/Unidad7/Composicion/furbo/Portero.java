package Unidad7.Composicion.furbo;

public class Portero extends Jugador{
    protected int golesRecibidos;

    public Portero(String nombre, String apellidos, int edad, boolean titular, int golesRecibidos) {
        super(nombre, apellidos, edad, titular);
        this.golesRecibidos = golesRecibidos;
    }

    public Portero() {
        super();
        this.golesRecibidos = 0;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Goles Recibidos: " + this.golesRecibidos);
    }
}
