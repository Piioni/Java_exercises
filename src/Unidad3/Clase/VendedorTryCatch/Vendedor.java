package Unidad3.Clase.VendedorTryCatch;

public class Vendedor {
    private String nombre;
    private String apellido;
    private int edad;

    // Constructor
    public Vendedor(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Metodo para verificar la edad
    public void verificarEdad(int edad) {
        if (edad > 18 && edad < 120) {
            this.edad = edad;
        } else if (edad < 18 && edad >= 0) {
            throw new IllegalArgumentException("La edad debe ser mayor a 18");
        } else
            throw new IllegalArgumentException("La edad debe ser mayor a 18 y menor a 120");
    }

    // Metodo para mostrar atributos
    public void imprimir() {
        System.out.println("Unidad4.VendedorTryCatch.Vendedor" + "\n" +
                "Nombre: " + nombre +   "\n" +
                "Apellido: " + apellido  + "\n" +
                "Edad: " + edad );
    }

    // Getters & Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
