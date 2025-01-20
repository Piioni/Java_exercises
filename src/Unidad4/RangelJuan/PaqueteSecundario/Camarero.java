package Unidad4.RangelJuan.PaqueteSecundario;

public class Camarero extends Persona implements BarTender {
    private double Sueldo;
    private static int numCamareros = 0;

    // Constructor con parametros. Que suma en 1 el número de camareros.
    public Camarero(String nombre, int edad, double Sueldo) {
        super(nombre, edad);
        this.Sueldo = Sueldo;
        numCamareros++;
    }

    public Camarero() {
        super();
        this.Sueldo = 0;
    }

    // Metodo de la interfaz BarTender.
    public void servirCerveza() {
        System.out.println("Sirviendo cerveza...");
    }

    // Metodo para sumar en 1 el número de camareros. Cada vez que se crea un camarero.
    public static void numCamareros() {
        System.out.println("Hay registrados " + numCamareros + " camareros en el sistema.");
    }

    // Getters & Setters.
    public double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(double sueldo) {
        Sueldo = sueldo;
    }

    // Metodo toString.
    public void imprimir() {
        super.imprimir();
        System.out.println("Sueldo: " + Sueldo);
    }

}
