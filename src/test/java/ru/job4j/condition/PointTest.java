package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PointTest {

    @Test
    public void when00to20then2() {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(2, 0);
        double expected = 2;
        double out = point1.distance(point2);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when34to68then5() {
        Point point1 = new Point(3, 4);
        Point point2 = new Point(6, 8);
        double expected = 5;
        double out = point1.distance(point2);
        assertEquals(expected, out, 0.1);
    }

    @Test
    public void when32to54then2dot8284() {
        Point point1 = new Point(3, 2);
        Point point2 = new Point(5, 4);
        double expected = 2.8284;
        double out = point1.distance(point2);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when5428to8032then26dot3058() {
        Point point1 = new Point(54, 28);
        Point point2 = new Point(80, 32);
        double expected = 26.3058;
        double out = point1.distance(point2);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when324to424then1() {
        Point point1 = new Point(3, 2, 4);
        Point point2 = new Point(4, 2, 4);
        double expected = 1;
        double out = point1.distance(point2);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when524to524then0() {
        Point point1 = new Point(5, 2, 4);
        Point point2 = new Point(5, 2, 4);
        double expected = 0;
        double out = point1.distance(point2);
        assertEquals(expected, out, 0.01);
    }
}
