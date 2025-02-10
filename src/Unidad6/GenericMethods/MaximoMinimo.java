package Unidad6.GenericMethods;

public class MaximoMinimo {
    public static void main(String[] args) {

        System.out.println("El maximo entre:  " + 5.5 + " y " + 7.7 + " Es igual a: " + maximo(5.5, 7.7));
        System.out.println("El maximo entre:  " + 5 + " y " + 7 + " Es igual a: " +   maximo(5, 7));
        System.out.println("El maximo entre:  " + "a" + " y " + "b" + " Es igual a: " +  maximo('a', 'b'));
        System.out.println("El maximo entre:  " + "hola" + " y " + "mundo" + " Es igual a: " +   maximo("Hola", "Mundo"));

        System.out.println("El minimo entre: "+ 5.5 + " y " + 7.7 + " Es igual a: " + minimo(5.5, 7.7));
        System.out.println("El minimo entre: "+ 5 + " y " + 7 + " Es igual a: " +   minimo(5, 7));
        System.out.println("El minimo entre: "+ "a" + " y " + "b" + " Es igual a: " + minimo('a', 'b'));
        System.out.println("El minimo entre: "+ "hola" + " y " + "mundo" + " Es igual a: " +  minimo("Hola", "Mundo"));
    }

    public static <T extends Comparable<T>> T maximo(T x, T y) {
        return x.compareTo(y) > 0 ? x : y;
    }

    public static <T extends Comparable<T>> T minimo(T x, T y) {
        return x.compareTo(y) < 0 ? x : y;
    }
}
