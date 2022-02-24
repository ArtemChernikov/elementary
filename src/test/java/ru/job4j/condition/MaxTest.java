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
}