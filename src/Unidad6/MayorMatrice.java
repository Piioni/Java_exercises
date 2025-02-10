package Unidad6;

public class MayorMatrice {
    public static void main(String[] args) {

        int[][] matrizA = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrizB = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        int[][] matrizResultado = mayorMatriz(matrizA, matrizB);

        for (int[] ints : matrizResultado) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    public static int[][] mayorMatriz(int[][] matrizA, int[][] matrizB) {
        int[][] matrizResultado = new int[matrizA.length][matrizA[0].length];
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                matrizResultado[i][j] = Math.max(matrizA[i][j], matrizB[i][j]);
            }
        }
        return matrizResultado;

    }
}
