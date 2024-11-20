package foc.programas;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayList<Generos> generos_p1 = new ArrayList<>(Arrays.asList(Generos.DRAMA, Generos.ACCION));
        ArrayList<Generos> generos_p2 = new ArrayList<>(Arrays.asList(Generos.COMEDIA, Generos.SUSPENSO));

        Pelicula p1 = new Pelicula("Gandhi", "Richard Attenborough", generos_p1,
                191, 1982, 8.1);

        Pelicula p2 = new Pelicula("Thor", "Kenneth Branagh", generos_p2,
                115, 2011, 7.0);

        String son_similares = (p1.esSimilar(p2)) ? "Si!": "No!";

        System.out.println("La primera pelicula es epica?:  " + (p1.esPeliculaEpica()));
        System.out.println("La segunda pelicula es epica?: " + p2.esPeliculaEpica());
        System.out.println("---------------------------------------------------------");
        System.out.println("La primera pelicula: " + p1.calcularValoracion());
        System.out.println("La segunda pelicula: " + p2.calcularValoracion());
        System.out.println("---------------------------------------------------------");
        System.out.println("Las 2 películas " + son_similares + " son similares");
        System.out.println("---------------------------------------------------------");
        p1.imprimirCarte();
    }
}
