package Unidad4.Libros;

public class LibroTexto extends Libro {
    protected String cursoAsociado;

    public LibroTexto() {
        super();
    }
    public LibroTexto(String titulo, String autor, String cursoAsociado) {
        super(titulo, autor);
        this.cursoAsociado = cursoAsociado;
    }
}
