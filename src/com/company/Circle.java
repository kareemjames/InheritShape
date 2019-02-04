package com.company;

public class Circle extends Shape {
    double radius;

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getArea() {
        double circleArea = Math.PI * radius * radius;
        System.out.println(circleArea);
        return circleArea;
    }

    public double getPerimeter() {
        double circlePerimeter = 2 * Math.PI * radius;
        System.out.println(circlePerimeter);
        return circlePerimeter;
    }

    public void printShape() {
        System.out.println("The shape is " + getColor() + " and it is " + isFilled() + " that it is filled " + getArea() + " " + getPerimeter());
    }
}
