package com.objective.package01.package03;
import  com.objective.package01.package01.Circle;
public class ObjectPractice03_main {
//    public static void main(String[] args) {
//        ObjectivePractice03 pokemon = new ObjectivePractice03(5);
//
//
//        pokemon.result();
//
//}
//    }

    public static void main(String[] args) {
         Circle  circleArea = new Circle(20);
//         Circle  getCircumference = new Circle (20);
        System.out.println(circleArea.getArea());
        System.out.println(circleArea.getCircumference());
    }

//    public static double circleArea(double radius) {
//        double area = (radius * radius * 3.14);
//        return area;
//    }
//
//    public static double getCircumference(double radius) {
//        return (2 * radius * 3.14);
    }