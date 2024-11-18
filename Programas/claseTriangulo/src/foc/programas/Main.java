package foc.programas;

public class Main {
    public static void main(String[] args) {

        Triangulo t1 = new Triangulo(7, 4);
        Triangulo t2 = new Triangulo(5, 5);
        Triangulo t3 = new Triangulo(4, 3);


        System.out.println("La hipotenusa del triangulo 1 es: " + t1.hipotenusa());
        System.out.println("La hipotenusa del triangulo 2 es: " + t2.hipotenusa());
        t1.queSoy();
        t2.queSoy();
        t3.queSoy();

    }
}
