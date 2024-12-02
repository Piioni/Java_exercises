package Unidad3.Clase.NumeroPerfecto;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i< 10000; i++){
            if (numeroPerfecto(i)){
                System.out.println(i + " es un numero perfecto");
            }
        }
    }

    private static boolean numeroPerfecto(int numero) {
        int i = 1;
        int sumatoria = 0;
        do {
            if (numero % i == 0){
                sumatoria += i;
            }
            i++;
        } while (i < numero);

        return sumatoria == numero;
    }
}
