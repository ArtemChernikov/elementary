package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        int result1 = Math.abs(x1 - x2);
        int result2 = Math.abs(y1 - y2);
        if (isValid(x1) && isValid(x2)
                && isValid(y1) && isValid(y2)) {
            if (result1 == result2) {
                rsl = Math.abs(x1 - x2);
            }
        }
        return rsl;
    }

    private static boolean isValid(int coordinate) {
        return coordinate >= 0 && coordinate <= 7;
    }
}
