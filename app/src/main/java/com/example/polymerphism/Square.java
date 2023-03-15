package com.example.polymerphism;

public class Square extends Shape{
    private double side;

    public Square(double side){
        this.side = side;
    }

    @Override
    public void calculateArea() {
        area = side*side;
    }

    @Override
    public void calculatePerimeter() {
        perimeter = 4* side;
    }
}
