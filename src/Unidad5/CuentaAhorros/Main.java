package Unidad5.CuentaAhorros;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CuentaAhorro cuenta = new CuentaAhorro();
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido a su cuenta de ahorros.");
        int opcion = -1;
        while (opcion != 0){
            showMenu();
            System.out.println("Ingrese una opción: ");
            try{
                opcion = sc.nextInt();
                switch (opcion){
                    case 1:
                        System.out.println("Ingrese el monto a consignar: ");
                        double montoConsignar = sc.nextDouble();
                        cuenta.consignar(montoConsignar);
                        break;
                    case 2:
                        System.out.println("Ingrese el monto a retirar: ");
                        double montoRetirar = sc.nextDouble();
                        cuenta.retirar(montoRetirar);
                        break;
                    case 3:
                        cuenta.mostrarExtracto();
                        break;
                    case 0:
                        System.out.println("Gracias por usar nuestros servicios.");
                        break;
                    default:
                        System.out.println("Opción inválida.");
                }
            } catch (Exception e){
                System.out.println("Error: " + e.getMessage());
                sc.nextLine();
            }
        }
    }

    public static void showMenu(){
        System.out.println("1. Consignar");
        System.out.println("2. Retirar");
        System.out.println("3. Mostrar extracto");
        System.out.println("0. Salir");
    }

}
