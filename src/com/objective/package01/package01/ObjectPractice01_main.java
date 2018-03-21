package com.objective.package01.package01;

public class ObjectPractice01_main {
    public static void main(String[] args) {
        double circleArea = circleArea(5);
        double getCircumference = getCircumference(5);
        System.out.println(circleArea);
        System.out.println(getCircumference);
    }

    public static double circleArea(double radius) {
        double area = (radius * radius * 3.14);
        return area;
    }

    public static double getCircumference(double radius) {
        return (2 * radius * 3.14);
    }
}
