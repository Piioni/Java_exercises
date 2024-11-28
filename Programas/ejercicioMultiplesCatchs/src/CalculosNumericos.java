public class CalculosNumericos {

    public static void calcularLogaritmoNeperiano(double valor) {
        if (valor == (double) valor) {
            if (valor > 0) {
                System.out.println("El logaritmo Neperiano de: " + valor + " es: " +  Math.log(valor));
            } else throw new ArithmeticException();
        } else throw new IllegalArgumentException();
    }

    public static void calcularRaizCuadrada(double valor) {
        if (valor == (double) valor) {
            if (valor > 0) {
                System.out.println("La raiz cuadrada de: " + valor + " es: " +  Math.sqrt(valor));
            } else throw new ArithmeticException();
        } else throw new IllegalArgumentException();
    }
}
