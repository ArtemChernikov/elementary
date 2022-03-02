package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = data[0];
        if (result) {
            for (int i = 1; i < data.length; i++) {
                if (result != data[i]) {
                    result = false;
                    break;
                }
            }
        } else {
            for (int i = 1; i < data.length; i++) {
                if (result != data[i]) {
                    break;
                }
                result = true;
            }
        }

        return result;
    }
}
