import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion =1;
        do {
            System.out.println("""
                Que quieres realizar?
                0. Salir del programa
                1. Calcular el Logaritmo Neperiano
                2. Calular la Raiz Cuadrada.
                3. Calcular la pendiente entre 2 puntos.
                4. Calcular el punto medio.
                5. Calcular las raices de una ecuación cuadratica.
                """);
            String operacion = sc.nextLine();
            switch (operacion) {
                case "0":
                    opcion = 0;
                    break;
                case "1":
                    try {
                        System.out.println("Introduzca el numero del que quiere calcular el Logaritmo Neperiano ");
                        double numero = sc.nextDouble();
                        CalculosNumericos.calcularLogaritmoNeperiano(numero);
                    } catch (IllegalArgumentException e1) {
                        System.out.println("No haz introducido un numero valido");
                        sc.nextLine();
                    } catch (ArithmeticException e2) {
                        System.out.println("El numero tiene que ser mayor a 0");
                        sc.nextLine();
                    } catch (Exception e3) {
                        System.out.println("Error en la operation");
                        sc.nextLine();
                    }
                    sc.nextLine();
                    break;
                case "2":
                    try {
                        System.out.println("Introduzca el numero del que quiere realizar la raiz cuadrada");
                        double numero = sc.nextDouble();
                        CalculosNumericos.calcularRaizCuadrada(numero);
                    } catch (IllegalArgumentException e1) {
                        System.out.println("No haz introducido un numero valido");
                        sc.nextLine();
                    } catch (ArithmeticException e2) {
                        System.out.println("El numero tiene que ser mayor a 0");
                        sc.nextLine();
                    } catch (Exception e3) {
                        System.out.println("Error en la operation");
                        sc.nextLine();
                    }
                    sc.nextLine();
                    break;
                case "3":
                    try {
                        System.out.println("Te voy a preguntar 4 cordenadas, Y2, Y1, X2 y X1");
                        System.out.println("Introduce Y2:");
                        double y2 = sc.nextDouble();
                        System.out.println("Introduce Y1:");
                        double y1 = sc.nextDouble();
                        System.out.println("Introduce X2:");
                        double x2 = sc.nextDouble();
                        System.out.println("Introduce X1:");
                        double x1 = sc.nextDouble();
                        CalculosNumericos.calcularPendiente(y2, y1, x2, x1);
                    } catch (IllegalArgumentException e1) {
                        System.out.println("No haz introducido un numero valido");
                    } catch (ArithmeticException e2) {
                        System.out.println("La resta de X2 - X1 no puede ser igual a 0");
                    } catch (Exception e3) {
                        System.out.println("Error en la operation");
                    }
                    sc.nextLine();
                    break;
                case "4":
                    try {
                        System.out.println("Te voy a preguntar 4 cordenadas, Y2, Y1, X2 y X1");
                        System.out.println("Introduce Y2:");
                        double y2 = sc.nextDouble();
                        System.out.println("Introduce Y1:");
                        double y1 = sc.nextDouble();
                        System.out.println("Introduce X2:");
                        double x2 = sc.nextDouble();
                        System.out.println("Introduce X1:");
                        double x1 = sc.nextDouble();
                        CalculosNumericos.calcularPuntoMedioRecta(y2, y1, x2, x1);
                    } catch (IllegalArgumentException e1) {
                        System.out.println("No haz introducido un numero valido");
                    } catch (Exception e3) {
                        System.out.println("Error en la operation");
                    }
                    sc.nextLine();
                    break;
                case "5":
                    try{
                        System.out.println("Te voy a preguntar el valor de a, b y c, tomando como ejemplo una ecuacion: ax^2 + bx +c");
                        System.out.println("Introduce a: ");
                        double a = sc.nextDouble();
                        System.out.println("Introduce b: ");
                        double b = sc.nextDouble();
                        System.out.println("Introduce c: ");
                        double c = sc.nextDouble();
                        CalculosNumericos.calcularRaices(a, b, c);
                    } catch (IllegalArgumentException e1){
                        System.out.println("No haz introducido un numero valido");
                        sc.nextLine();
                    } catch (ArithmeticException e2){
                        System.out.println("El valor de a no puede ser igual a 0, y el valor de la raiz no debe ser negativa");
                        sc.nextLine();
                    } catch (Exception e3) {
                        System.out.println("Error en la operation");
                        sc.nextLine();
                    }
                    sc.nextLine();
                    break;
            }
        } while (opcion != 0);

        sc.close();
    }
}
