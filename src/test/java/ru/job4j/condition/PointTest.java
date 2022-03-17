package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when34to68then5() {
        int x1 = 3;
        int y1 = 4;
        int x2 = 6;
        int y2 = 8;
        double expected = 5;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.1);
    }

    @Test
    public void when32to54then2dot8284() {
        int x1 = 3;
        int y1 = 2;
        int x2 = 5;
        int y2 = 4;
        double expected = 2.8284;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when5428to8032then26dot3058() {
        int x1 = 54;
        int y1 = 28;
        int x2 = 80;
        int y2 = 32;
        double expected = 26.3058;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}
