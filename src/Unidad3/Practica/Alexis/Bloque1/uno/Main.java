package Unidad3.Practica.Alexis.Bloque1.uno;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos numeros vas a querer ingresar?");
        int cantidad = Integer.parseInt(sc.nextLine());
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i <cantidad; i++) {
            System.out.println("Dime un entero");
            int numero = Integer.parseInt(sc.nextLine());
            numeros.add(numero);
        }

        int mayor = numeros.getFirst();
        int menor  = numeros.getFirst();
        int cantidad_mayor = 1;
        int cantidad_menor = 1;
        for (int num : numeros) {
            if (num > mayor ){
                mayor = num;
                cantidad_mayor = 1;
            } else if (num == mayor ){
                cantidad_mayor++;
            }

            if (num < menor ){
                menor = num;
                cantidad_menor = 1;
            } else if (num == menor ){
                cantidad_menor++;
            }
        }
        System.out.println("El numero mayor es: " + mayor + " con una frecuencia de: " + cantidad_mayor );
        System.out.println("El numero menor es: " + menor + " con una frecuencia de: " + cantidad_menor );

        sc.close();
    }
}
