package Unidad3.Clase.NumeroAmigo;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i<=3000; i++){
            for (int j=0; j<=3000; j++){
                if (NumerosAmigos(i, j)){
                    System.out.println(i+ " y " + j+ " Son numeros amigos" );
                }
            }
        }
    }

    private static boolean NumerosAmigos(int numero1, int numero2) {
        int suma1 = 0;
        int suma2 = 0;

        for (int i = 1; i < numero1; i++) {
            if (numero1 % i == 0) {
                suma1 += i;
            }
        }
        for (int i = 1; i < numero2; i++) {
            if (numero2 % i == 0) {
                suma2 += i;
            }
        }

        return suma1 == numero2 && suma2 == numero1;
    }
}
