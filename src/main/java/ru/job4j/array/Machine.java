package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int changes = money - price;
        for (int i = 0; i < coins.length; i++) {
            if (changes < coins[i]) {
                continue;
            }
            changes -= coins[i];
            rsl[size] = coins[i];
            size++;
            while (changes >= coins[i]) {
                changes -= coins[i];
                rsl[size] = coins[i];
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
