package Unidad3.Clase.Superherores;

public class Dimension {
    private double alto;
    private double ancho;
    private double profundidad;

    // Constructores
    public Dimension() {
        this.alto = 0.0;
        this.ancho = 0.0;
        this.profundidad = 0.0;
    }

    public Dimension(double alto, double ancho, double profundidad) {
        this.alto = alto;
        this.ancho = ancho;
        this.profundidad = profundidad;
    }

    public double getVolumen() {
        return this.alto * this.ancho * this.profundidad;
    }

    // Getters & Setters
    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public String toString() {
        return "Dimensiones: " + '\n' +
                "Alto: " + alto + '\n' +
                "Ancho: " + ancho + '\n' +
                "Profundidad: " + profundidad;
    }
}
