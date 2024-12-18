package Unidad4.clase.CuentaBancaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Ingrese los valores para una cuenta de ahorros");
                System.out.println("Ingresa el saldo inicial: ");
                double saldo = sc.nextDouble();
                System.out.println("Ingresa la tasa anual: ");
                double tasaAnual = sc.nextDouble();
                CuentaAhorros cuenta1 = new CuentaAhorros(saldo, tasaAnual);
                System.out.println("Ingrese cantidad a ingresar: ");
                double ingreso = sc.nextDouble();
                cuenta1.ingresar(ingreso);
                System.out.println("Ingrese cantidad a retirar: ");
                double retiro = sc.nextDouble();
                cuenta1.retirar(retiro);
                cuenta1.calcularInteres();
                cuenta1.imprimir();
                break;
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                sc.nextLine();
            }
        }
    }
}
