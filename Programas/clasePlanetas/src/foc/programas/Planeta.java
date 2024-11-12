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

    public Planeta(String nombre,int satelites, double masa, double volumen,int diametro ,double dist_sol, tipoPlaneta tipo_Planeta, boolean observable ) {
        this.nombre = nombre;
        this.satelites = satelites;
        this.dist_sol = dist_sol;
        this.diametro = diametro;
        this.volumen = volumen;
        this.masa = masa;
        this.tipo_Planeta = tipo_Planeta;
        this.observable = observable;

    }

    public void mostrar() {
        System.out.println("Planeta" + "\n" +
                "Nombre: " + nombre + '\n' +
                "Satelites: " + satelites + '\n' +
                "Masa: " + masa + '\n' +
                "Volumen: " + volumen + '\n' +
                "Diametro: " + diametro + '\n' +
                "Distancia al sol en millones de km: " + dist_sol );
    }

    public double getDensidad() {
        return masa/volumen;
    }

    public void esExterior(){
        final double borde_cinturon_asteroides = 778.0;
        if (dist_sol > borde_cinturon_asteroides ) {
            System.out.println("El planeta se considera como planeta exterior");
        }
        else System.out.println("El planeta se considera como planeta interior");
    }

}
