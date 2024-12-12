package LeetCode.Arrays.findMaxConsecutives;

public class Main {
    public static void main(String[] args) {

        int[] nums = {1, 1, 0, 1, 1 ,1 };
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxConsecutives = 0;
        int consecutivos = 0;
        int anterior = nums[0];
        if (nums.length == 1) {
            if (nums[0] == 0) {
                return 0;
            } else  return 1;
        }
        for (int num : nums) {

            if (num == anterior) {
                consecutivos += 1;
            } else {
                consecutivos = 1;
                anterior = num;
            }
            if ( consecutivos > maxConsecutives) {
                maxConsecutives = consecutivos;
            }

        }
        return maxConsecutives;
    }
}
