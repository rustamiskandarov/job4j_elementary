package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void whenMan180Height() {
        short height = 180;
        double expected = 92;
        double result = Fit.manWeight(height);
        Assert.assertEquals(expected, result, 0.01);
    }

    @Test
    public void whenWoman165Heith() {
        short height = 165;
        double expected = 63.24;
        double result = Fit.womanWeight(height);
        Assert.assertEquals(expected, result, 0.01);
    }
}