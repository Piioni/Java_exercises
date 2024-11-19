package foc.programas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int catetoA;
        int catetoB;
        int anguloY;
        while (true) {
            System.out.println("Dime el primer cateto del triangulo: ");
            int cateto_prueba_A = Integer.parseInt(sc.nextLine());
            System.out.println("Dime el segundo cateto del triangulo: ");
            int cateto_prueba_B = Integer.parseInt(sc.nextLine());
            System.out.println("Dime el angulo en grados que hay entre estos 2 catetos: ");
            int angulo_prueba_Y = Integer.parseInt(sc.nextLine());
            if (cateto_prueba_A <= 0 || cateto_prueba_B <= 0 || angulo_prueba_Y <= 0) {
                System.out.println("Error en los datos, introduzcalos nuevamente");
            } else {
                catetoA = cateto_prueba_A;
                catetoB = cateto_prueba_B;
                anguloY = angulo_prueba_Y;
                break;
            }
        }
        Triangulo t1 = new Triangulo(catetoA, catetoB, anguloY);
        t1.queSoy();
        t1.getPerimetro();
        t1.getArea();
        sc.close();
    }
}
