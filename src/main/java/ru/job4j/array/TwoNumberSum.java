package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int l = 0, r = array.length - 1;

        while (l < r) {

            int currentSum = array[l] + array[r];

            if (currentSum == target) {
                return new int[]{l, r};
            } else if (currentSum > target) {
                r--;
            } else if (currentSum < target) {
                l++;
            }
        }
        return new int[0];
    }
}
