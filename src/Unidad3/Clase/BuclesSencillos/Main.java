package Unidad3.Clase.BuclesSencillos;

public class Main {
    public static void main(String[] args) {

        int numero = 16;

        int sumatoria = 0;
        for (int i = 0; i <= numero; i++) {
            sumatoria += i;
        }
        System.out.println("La sumatoria es: " + sumatoria);

        int factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        System.out.println("El factorial del numero " + numero + " es " + factorial);

        int valorA = 2;
        int valorB = 47;
        int sumaMultiplos = 0;
        for (int i = valorA; i <= valorB; i++) {
            if (i % 5 == 0) {
                System.out.println(i + " Es un multiplo de 5");
                sumaMultiplos += i;
            }
        }
        System.out.println("La suma de los multiplos de 5 entre " + valorA + " y " + valorB + " es " + sumaMultiplos);

        int j = 0;
        do {
            System.out.println(j);
            j +=1;
        } while (j<=10);


    }
}
