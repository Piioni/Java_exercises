import javax.tools.OptionChecker;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion =1;
        do {
            System.out.println("""
                Que quieres realizar?
                1. Calcular el Logaritmo Neperiano
                2. Calular la Raiz Cuadrada.
                0. Salir del programa""");
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
                        opcion = 0;
                        break;
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
                case "2":
                    try {
                        System.out.println("Introduzca el numero del que quiere realizar la raiz cuadrada");
                        double numero = sc.nextDouble();
                        CalculosNumericos.calcularRaizCuadrada(numero);
                        opcion = 0;
                        break;
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
                    break;
            }
        } while (opcion != 0);
    }
}
