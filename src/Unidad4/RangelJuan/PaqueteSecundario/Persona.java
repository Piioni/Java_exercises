package Unidad4.RangelJuan.PaqueteSecundario;

public class Persona {
    private String nombre;
    private int edad;

    // Constructor con parametros.
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Constructor sin parametros.
    public Persona() {
        this.nombre = "Nueva Persona";
        this.edad = 0;
    }

    // Getters & Setters.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Metodo toString.
    public void imprimir(){
        System.out.println("Nombre: " + nombre + "\nEdad: " + edad);
    }
}
