package com.example.polymerphism;

public class Rectangle extends Shape{
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void calculateArea() {
        area = length * breadth;
    }

    @Override
    public void calculatePerimeter() {
        perimeter = 2 * (length + breadth);
    }
}
