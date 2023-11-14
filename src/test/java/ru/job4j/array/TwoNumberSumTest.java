package ru.job4j.array;


import org.junit.Test;
import org.junit.Assert;

public class TwoNumberSumTest {

    @Test
    public void whenTwoEqualsNumbersYesTarget() {
        int[] array = {5, 5};
        int target = 10;
        int[] result = TwoNumberSum.getIndexes(array, target);
        int[] expected = {0, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenTwoEqualsNumbersNoTarget() {
        int[] array = {5, 5};
        int target = 12;
        int[] result = TwoNumberSum.getIndexes(array, target);
        int[] expected = {};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenWithNegativeNumbersYesTarget() {
        int[] array = {-7, -5, 0, 5, 8, 12};
        int target = 3;
        int[] result = TwoNumberSum.getIndexes(array, target);
        int[] expected = {1, 4};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenWithoutNegativeNumbersYesTarget() {
        int[] array = {0, 2, 5, 8, 10, 12};
        int target = 15;
        int[] result = TwoNumberSum.getIndexes(array, target);
        int[] expected = {2, 4};
        Assert.assertArrayEquals(expected, result);
    }

}