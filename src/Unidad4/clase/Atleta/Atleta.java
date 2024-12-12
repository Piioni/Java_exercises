package Unidad4.clase.Atleta;

public class Atleta {
    private int id ;
    private String nombre = "";
    private double tiempoPrueba;
    private static int numeroAtletas = 0;
    private static String seleccion = "Colombia";
    private static double tiempoEquipo ;

    public Atleta(String nombre, double tiempoPrueba) {
        this.id = ++numeroAtletas;
        this.nombre = nombre;
        this.tiempoPrueba = tiempoPrueba;
        numeroAtletas++;
    }

    public void correr400Metros() {
        tiempoEquipo += tiempoPrueba;
    }

    public static void imprimirSeleccion() {
        System.out.println("La selección es: " + seleccion);
    }

    public static void imprimirTiempoEquipo() {
        System.out.println("El tiempo del equipo es: " + tiempoEquipo);
    }


}
