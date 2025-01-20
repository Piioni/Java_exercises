package Unidad4.Atleta;

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

    public void imprimirAtleta() {
        System.out.println("Atleta: " + id + " " + nombre + " " + tiempoPrueba);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTiempoPrueba() {
        return tiempoPrueba;
    }

    public void setTiempoPrueba(double tiempoPrueba) {
        this.tiempoPrueba = tiempoPrueba;
    }
}
