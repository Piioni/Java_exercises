package Unidad7.Composicion.furbo;

public class Delantero extends  Jugador{
    protected int goles;

    public Delantero(String nombre, String apellidos, int edad, boolean titular, int goles) {
        super(nombre, apellidos, edad, titular);
        this.goles = goles;
    }

    public Delantero() {
        super();
        this.goles = 0;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Goles: " + this.goles);
    }
}
