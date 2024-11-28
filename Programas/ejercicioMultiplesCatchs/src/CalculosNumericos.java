public class CalculosNumericos {

    public static void calcularLogaritmoNeperiano(double valor) {
        if (valor == (double) valor) {
            if (valor > 0) {
                System.out.println("El logaritmo Neperiano de: " + valor + " es: " + Math.log(valor));
            } else throw new ArithmeticException();
        } else throw new IllegalArgumentException();
    }

    public static void calcularRaizCuadrada(double valor) {
        if (valor == (double) valor) {
            if (valor > 0) {
                System.out.println("La raiz cuadrada de: " + valor + " es: " + Math.sqrt(valor));
            } else throw new ArithmeticException();
        } else throw new IllegalArgumentException();
    }

    public static void calcularPendiente(double y2, double y1, double x2, double x1) {
        if (y1 == (double) y1 && y2 == (double) y2 && x2 == (double) x2 && x1 == (double) x1) {
            if (x2 - x1 != 0) {
                double pendiente = (y2 - y1) / (x2 - x1);
                System.out.println("La pendiente de la recta con los puntos: " + "(" + y2 + "," + y1 + ")" + " y " +
                        "(" + x2 + "," + x1 + ")" + "\n" + "Es: " + pendiente);
            } else throw new ArithmeticException();
        } else throw new IllegalArgumentException();
    }

    public static void calcularPuntoMedioRecta(double y2, double y1, double x2, double x1) {
        if (y1 == (double) y1 && y2 == (double) y2 && x2 == (double) x2 && x1 == (double) x1) {
            double puntoMedioRecta = ((x2 +x1) / 2) + ((y2 + y1)/2);
            System.out.println("El punto media de la recta con los puntos: " + "(" + y2 + "," + y1 + ")" + " y " +
                    "(" + x2 + "," + x1 + ")" + "\n" + "Es: " + puntoMedioRecta);
        } else throw new IllegalArgumentException();
    }

    public static void calcularRaices(double a, double b, double c){
        if (a == (double) a && b == (double) b && c == (double) c) {
            if (a == 0) throw new ArithmeticException();
            else if (b*b - 4*a*c < 0) throw new ArithmeticException();
            else {
                double primera_raiz = (-b + Math.sqrt(b*b - 4*a*c))/2*a ;
                double segunda_raiz = (-b - Math.sqrt(b*b - 4*a*c))/2*a ;
                System.out.println("La primera raiz de la ecuacion" + a+"x^2 + " + b+"x + " + c + "\n" +
                        "Primera Raiz: " + primera_raiz + "\n" +
                        "Segunda Raiz: " + segunda_raiz);
            }
        }
    }

    public static void calcularBase2(int numero){
        StringBuilder numero_base2 = new StringBuilder();
        while (numero != 2) {
//            numero_base2 +=(String) numero % 2;
            numero /= 2;
        }
    }
}
