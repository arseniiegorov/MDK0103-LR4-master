package com.company.shapes;

import com.company.shapes.base.Shape;

public class Circle extends Shape {

    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, Boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }
    //TODO
    @Override
    public double getArea() {
        return 0;
    }
    //TODO
    public double getPerimeter(){
        return 0;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
