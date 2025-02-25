package Unidad7.Composicion.furbo;

public abstract class Jugador extends Persona {
    private boolean titular;

    public Jugador(String nombre, String apellidos, int edad, boolean titular) {
        super(nombre, apellidos, edad);
        this.titular = titular;
    }

    public Jugador() {
        super();
        this.titular = false;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Titular: " + this.titular);
    }
}
