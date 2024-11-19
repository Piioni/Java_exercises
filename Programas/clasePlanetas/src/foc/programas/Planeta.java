package foc.programas;

public class Planeta {
    private String nombre = null;
    private int satelites = 0;
    private double masa = 0.0;
    private double volumen = 0.0;
    private int diametro = 0;
    private double dist_sol = 0;
    private tipoPlaneta tipo_Planeta = null;
    private boolean observable = false;

    public Planeta(String nombre, int satelites, double masa, double volumen, int diametro, double dist_sol, tipoPlaneta tipo_Planeta, boolean observable) {
        this.nombre = nombre;
        this.satelites = satelites;
        this.dist_sol = dist_sol;
        this.diametro = diametro;
        this.volumen = volumen;
        this.masa = masa;
        this.tipo_Planeta = tipo_Planeta;
        this.observable = observable;

    }

    //Metodo para hallar la densidad de un planeta
    public double getDensidad() {
        return masa / volumen;
    }

    //Metodo para saber si un determinado se encuentra dentro o fuera del cinturon de asteroides
    public void esExterior() {
        final double borde_cinturon_asteroides = 778.0;
        if (dist_sol > borde_cinturon_asteroides) {
            System.out.println("El planeta se considera como planeta exterior");
        } else System.out.println("El planeta se considera como planeta interior");
    }

    //Metodo toString
    public void mostrar() {
        System.out.println("Planeta" + "\n" +
                "Nombre: " + nombre + '\n' +
                "Satelites: " + satelites + '\n' +
                "Masa: " + masa + '\n' +
                "Volumen: " + volumen + '\n' +
                "Diametro: " + diametro + '\n' +
                "Distancia al sol en millones de km: " + dist_sol);
    }

    // Getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSatelites() {
        return satelites;
    }

    public void setSatelites(int satelites) {
        this.satelites = satelites;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public double getDist_sol() {
        return dist_sol;
    }

    public void setDist_sol(double dist_sol) {
        this.dist_sol = dist_sol;
    }

    public tipoPlaneta getTipo_Planeta() {
        return tipo_Planeta;
    }

    public void setTipo_Planeta(tipoPlaneta tipo_Planeta) {
        this.tipo_Planeta = tipo_Planeta;
    }

    public boolean isObservable() {
        return observable;
    }

    public void setObservable(boolean observable) {
        this.observable = observable;
    }
}
