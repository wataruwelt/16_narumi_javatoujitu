package com.objective.package01.package02;

public class ObjectivePractice_main {
    public static void main(String[] args) {
        double circleArea = circleArea(10);
        double getCircumference = getCircumference (10);
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
