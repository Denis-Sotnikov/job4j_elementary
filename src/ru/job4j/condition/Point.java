package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        double distanceX = x2 - x1;
        distanceX = Math.pow(distanceX, 2);
        double distanceY = y2 - y1;
        distanceY = Math.pow(distanceY, 2);
        double distance = distanceX + distanceY;
        distance = Math.sqrt(distance);
        return distance;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        double resultFirst = Point.distance(2, 0, 0, 2);
        System.out.println("result (1, 0) to (2, 0) " + resultFirst);
        double resultSecond = Point.distance(2, 15, 0, 20);
        System.out.println("result (2, 49) to (5, 50) " + resultSecond);
    }
}
