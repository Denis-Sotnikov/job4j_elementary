package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        int expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when20to02then282() {
        double expected = 2.82;
        Point a = new Point(2, 0);
        Point b = new Point(0, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when215to020then538() {
        double expected = 5.38;
        Point a = new Point(2, 15);
        Point b = new Point(0, 20);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when0to0And0then8() {
        double expected = 8;
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 0, 8);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when1to1And1then8() {
        double expected = 8.48;
        Point a = new Point(2, 2, 0);
        Point b = new Point(0, 0, 8);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}