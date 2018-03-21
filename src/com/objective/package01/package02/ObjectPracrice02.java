package com.objective.package01.package02;

public class ObjectPracrice02 {
    public int radius;

    public ObjectPracrice02() {
        this.radius = 5;
    }

    public ObjectPracrice02(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return (radius * radius * 3.14);
    }


    public double getCircumference() {
        return (2 * radius * 3.14);
    }
}
