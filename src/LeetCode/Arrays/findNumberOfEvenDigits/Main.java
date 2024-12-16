package LeetCode.Arrays.findNumberOfEvenDigits;

public class Main {
    public static void main(String[] args) {

        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));
    }

    // meotdo que retorna la cantidad de numeros que tienen una cantidad par de digitos
    public static int findNumbers(int[] nums) {
        // inicializamos el contador en 0
        int count = 0;
        // recorremos el arreglo de numeros
        for (int num : nums) {
            // Convertimos el numero en string y verificamos si la longitud del string es par
            if (String.valueOf(num).length() % 2 == 0) {
                count++;
            }
        }
        return count;

    }
}
