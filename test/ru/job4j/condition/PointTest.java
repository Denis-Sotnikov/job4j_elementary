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
        int x1 = 2;
        int y1 = 0;
        int x2 = 0;
        int y2 = 2;
        Point a = new Point(2, 0);
        Point b = new Point(0, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when215to020then538() {
        double expected = 5.38;
        int x1 = 2;
        int y1 = 15;
        int x2 = 0;
        int y2 = 20;
        Point a = new Point(2, 15);
        Point b = new Point(0, 20);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}