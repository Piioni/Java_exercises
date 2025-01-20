package Unidad4.Libros;

public class Novela extends Libro{
    TipoNovela tipoNovela;

    public Novela() {
        super();
    }

    public Novela(String titulo, String autor, TipoNovela tipoNovela) {
        super(titulo, autor);
        this.tipoNovela = tipoNovela;
    }
}
