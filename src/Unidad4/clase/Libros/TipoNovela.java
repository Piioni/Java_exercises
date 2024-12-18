package Unidad4.clase.Libros;

public enum TipoNovela {
    HISTORICA("Historica"),
    ROMANTICA("Romantica"),
    CIENCIA_FICCION("Ciencia Ficcion"),
    POLICIACA("Policíaca"),
    REALISTA("Realista");

    private final String descripcion;

    TipoNovela(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

}
