package Unidad4.clase.PersonaAlumno;

public class Persona {
    private String Nombre;
    private String Apellido;
    private int edad;

    public Persona() {
        this.Nombre = " ";
        this.Apellido = " ";
        this.edad = 0;
    }

    public Persona(String Nombre, String Apellido, int edad) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.edad = edad;

    }

    public void mostrarPersona() {
        System.out.println("Nombre: " + Nombre);
        System.out.println("Apellido: " + Apellido);
        System.out.println("Edad: " + edad);
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
