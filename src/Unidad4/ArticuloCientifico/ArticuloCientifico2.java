package Unidad4.ArticuloCientifico;

public class ArticuloCientifico2 {
    private String titulo;
    private String autor;
    private String[] palabrasClave;
    private String publicacion;
    private int anio;
    private String resumen;

    public ArticuloCientifico2( String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }

    public ArticuloCientifico2( String titulo, String autor, String[] palabrasClave, int anio){
        this(titulo, autor);
        this.palabrasClave = palabrasClave;
        this.anio = anio;
    }

    public ArticuloCientifico2( String titulo, String autor, String[] palabrasClave, String publicacion, int anio, String resumen){
        this(titulo, autor, palabrasClave, anio);
        this.publicacion = publicacion;
        this.resumen = resumen;
    }

    public void mostrarDatos(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Palabras clave: ");
        for (int i = 0; i < palabrasClave.length; i++) {
            System.out.println(i);
        }
        System.out.println("Publicacion: " + publicacion);
        System.out.println("Año: " + anio);
        System.out.println("Resumen: " + resumen);
    }
}
