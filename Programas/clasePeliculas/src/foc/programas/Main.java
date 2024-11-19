package foc.programas;

public class Main {
    public static void main(String[] args) {
        Pelicula p1 = new Pelicula("Gandhi", "Richard Attenborough", Generos.DRAMA,
                191, 1982, 8.1);

        Pelicula p2 = new Pelicula("Thor", "Kenneth Branagh", Generos.ACCION,
                115, 2011, 7.0 );

        System.out.println("La primera pelicula es epica?: " + p1.esPeliculaEpica() );
        System.out.println("La segunda pelicula es epica?: " + p2.esPeliculaEpica() );
        System.out.println("---------------------------------------------------------");
        System.out.println("La primera pelicula: " + p1.calcularValoracion());
        System.out.println("La segunda pelicula: " + p2.calcularValoracion());
        System.out.println("---------------------------------------------------------");
        System.out.println("Son las 2 peliculas similares?: " + p1.esSimilar(p2));

    }
}
