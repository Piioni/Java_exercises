package LeetCode.Arrays.findMaxConsecutives;

public class Main {
    public static void main(String[] args) {

        int[] nums = {1, 1, 0, 1 ,1, 0, 0 };
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        // Declaramos las variables, una que devolveremos y otra que nos ayudará a contar los consecutivos
        int maxConsecutives = 0;
        int consecutivos = 0;
        // recorremos el array
        for (int num : nums) {
            if (num == 1) {
                consecutivos += 1;
                // si consecutivos es mayor que maxConsecutives, actualizamos maxConsecutives
                if (consecutivos > maxConsecutives) {
                    maxConsecutives = consecutivos;
                }
                // si el numero es 0, reseteamos consecutivos
            } else {
                consecutivos = 0;
            }

        }
        return maxConsecutives;
    }
}
