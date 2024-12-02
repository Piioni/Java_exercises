package Unidad3.Clase.Superherores;

public class Superheroe {
    private String nombre;
    private String descripcion = "";
    private boolean capa = false;

    public Superheroe(String nombre) {
        this.nombre = nombre;
    }

    // Setters y Getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isCapa() {
        return capa;
    }

    public void setCapa(boolean capa) {
        this.capa = capa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String toString() {
        return  "Superhero: " + '\n' +
                "Nombre: " + nombre + '\n' +
                "Description: " + descripcion + '\n' +
                "Capa: " + capa;
    }
}
