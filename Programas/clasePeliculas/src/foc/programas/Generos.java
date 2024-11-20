package foc.programas;

public enum Generos {
    ACCION("Accion"),
    COMEDIA("Comedia"),
    DRAMA("Drama"),
    SUSPENSO("Suspenso"),;

    private String nombre;

    private Generos(String nombre) {
        this.nombre = nombre;
    }

}
