import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        int i = 0;
        do {
            System.out.print("Ingrese el " + i + "  numero: ");
            numeros.add(sc.nextInt());
            i++;
        } while (i <=10 );

        int mayor = numeros.getFirst();
        for ( int num: numeros){
            if( num > mayor ){
                mayor = num;
            }
            if (num < 0){
                System.out.println("El numero " + num + " es negativo");
            }
        }
        System.out.println("El mayor numero es: " + mayor);

        sc.close();

    }
}
