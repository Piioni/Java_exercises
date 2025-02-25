package Unidad7.Composicion.furbo;

public abstract class Persona {
    private String nombre;
    private String apellidos;
    private int edad;

    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public Persona() {
        this.nombre = "Desconocido";
        this.apellidos = "Desconocido";
        this.edad = 0;
    }

    public void imprimir() {
        System.out.println("Nombre: " + this.nombre + " " + this.apellidos);
        System.out.println("Edad: " + this.edad);
    }
}
