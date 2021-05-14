package com.company.shapes;

public class Square extends Rectangle {

    public Square() {
    }

    public Square(double _width, double _length) {
        super(_width, _length);
    }

    public Square(String color, Boolean filled, double width, double length) {
        super(color, filled, width, length);
    }

    public double getSide() {
        return super.getWidth();
    }

    public void setSide(double _side) {
        super.setLength(_side);
        super.setWidth(_side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "Square{} " + super.toString();
    }
}
