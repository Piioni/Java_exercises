package Unidad3.Clase.Potencia;

import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {

        int base = 0;
        int exponente = 0;
        boolean numerosCorrectos = false;

        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Introduce la base de la potencia");
            base = Integer.parseInt(sc.nextLine());
            System.out.println("Introduce el exponente de la potencia");
            exponente = Integer.parseInt(sc.nextLine());
            numerosCorrectos = true;
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
        if (numerosCorrectos) {
            try{
                CalcularPotencia.potencia(base, exponente);
            } catch (AssertionError e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}