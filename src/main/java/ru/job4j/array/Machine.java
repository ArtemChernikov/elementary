package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int chang = money - price;
        int size = 0;
        for (int i = 0; i < rsl.length; i++) {
            chang -= coins[i];
            rsl[i] = coins[i];
            size++;
            if (chang > coins[i]) {
                while (coins[i] != chang) {
                    chang -= coins[i];
                    rsl[i + size] = coins[i];
                    size++;
                }
            } else {
                continue;
            }

        }
        return Arrays.copyOf(rsl, size);
    }
}
