package com.objective.package01.package03;

public class ObjectivePractice03 {
    public int radius;
    public double circleArea = (radius * radius * 3.14);
    public double getCircumference = (2 * radius * 3.14);


    public ObjectivePractice03(int radius) {
        this.radius = radius;
    }

    public void result(){
        System.out.println(circleArea);
        System.out.println(getCircumference);
    }
}
