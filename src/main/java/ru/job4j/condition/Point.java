package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double x3 = (x2 - x1);
        double y3 = (y2 - y1);
        double first = Math.pow(x3, 2);
        double second = Math.pow(y3, 2);
        double sum = first + second;
        double result = Math.sqrt(sum);
        return result;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}
