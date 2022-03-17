package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int expected = 2;
        int result = Max.max(left, right);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax3To1Then3() {
        int left = 3;
        int right = 1;
        int expected = 3;
        int result = Max.max(left, right);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax4To10Then10() {
        int left = 4;
        int right = 10;
        int expected = 10;
        int result = Max.max(left, right);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax4To4Then4() {
        int left = 4;
        int right = 4;
        int expected = 4;
        int result = Max.max(left, right);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax2To3To4Then4() {
        int first = 2;
        int second = 3;
        int third = 4;
        int expected = 4;
        int result = Max.max(first, second, third);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax10To3To4To10Then10() {
        int first = 10;
        int second = 3;
        int third = 4;
        int fourth = 10;
        int expected = 10;
        int result = Max.max(first, second, third, fourth);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax50To50To50To50Then50() {
        int first = 50;
        int second = 50;
        int third = 50;
        int fourth = 50;
        int expected = 50;
        int result = Max.max(first, second, third, fourth);
        Assert.assertEquals(expected, result);
    }
}