package LeetCode.Arrays.sortedSquares;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    public static int[] sortedSquares(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
             list.add(num * num);
        }
        Collections.sort(list);
        list.toArray();
        return list.stream().mapToInt(i -> i).toArray();}
}
