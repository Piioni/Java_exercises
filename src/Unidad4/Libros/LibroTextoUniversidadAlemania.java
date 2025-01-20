package Unidad4.Libros;

public class LibroTextoUniversidadAlemania extends LibroTexto{
    protected String facultadPublicacion;

    public LibroTextoUniversidadAlemania() {
        super();
    }

    public LibroTextoUniversidadAlemania(String titulo, String autor, String cursoAsociado, String facultadPublicacion) {
        super(titulo, autor, cursoAsociado);
        this.facultadPublicacion = facultadPublicacion;
    }
}
