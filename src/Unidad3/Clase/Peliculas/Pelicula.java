package Unidad3.Clase.Peliculas;

import Unidad3.Clase.Peliculas.enums.Generos;

import java.util.ArrayList;

public class Pelicula {
    private String nombre;
    private String director;
    private ArrayList<Generos> genero;
    private int duracion;
    private int anio_salida;
    private double calificacion;

    // Constructor
    public Pelicula(String nombre, String director, ArrayList<Generos> genero, int duracion, int anio_salida, double calificacion) {
        this.nombre = nombre;
        this.director = director;
        this.genero = genero;
        this.duracion = duracion;
        this.anio_salida = anio_salida;
        this.calificacion = calificacion;
    }

    // Metodo para calcular la valoracion
    public String calcularValoracion() {
        if (calificacion <= 2) {
            return "Es muy mala, no la veas";
        } else if (calificacion <= 5) {
            return "Es mala, no la recomendaría";
        } else if (calificacion <= 7) {
            return "Es regular, lo dejo a tu criterio";
        } else if (calificacion <= 8) {
            return "Es buena, recomendada";
        } else if (calificacion <= 10) {
            return "Es excelente, no te vas a arrepentir de verla";
        } else return "Calificacion no valida";
    }

    // Metodo para comprobar si 2 películas son similares
    public boolean esSimilar(Pelicula pelicula) {
        if (getGenero().equals(pelicula.getGenero())) {
            return calcularValoracion().equals(pelicula.calcularValoracion());
        }
        return false;
    }

    // Metodo para saber si es pelicula epica
    public boolean esPeliculaEpica() {
        return duracion >= 180;
    }

    // Metodo mostrar lindo
    public void imprimirCarte() {
        String estrellas = "";
        if (calificacion <= 2) {
            estrellas = "*";
        } else if (calificacion <= 5) {
            estrellas = "**";
        } else if (calificacion <= 7) {
            estrellas = "***";
        } else if (calificacion <= 8) {
            estrellas = "****";
        } else if (calificacion <= 10) {
            estrellas = "*****";
        } else estrellas = "?";


        System.out.println("-------" + nombre + "-------" + "\n" +
                estrellas + "\n" +
                getAño_salida() + "\n" +
                genero + "\n" +
                director);
    }

    // Metodo imprimir
    public void imprimir() {
        System.out.println("Pelicula: " + "\n" +
                "Nombre: " + nombre + "\n" +
                "Director: " + director + "\n" +
                "Genero: " + genero + "\n" +
                "Duracion: " + duracion + "\n" +
                "Año_salida=" + anio_salida + "\n" +
                "Calificacion: " + calificacion);
    }

    // Getter & Setter
    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    private void setDirector(String director) {
        this.director = director;
    }

    public ArrayList<Generos> getGenero() {
        return genero;
    }

    private void setGenero(ArrayList<Generos> genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    private void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getAño_salida() {
        return anio_salida;
    }

    private void setAño_salida(int año_salida) {
        this.anio_salida = año_salida;
    }

    public double getCalificacion() {
        return calificacion;
    }

    private void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
}
