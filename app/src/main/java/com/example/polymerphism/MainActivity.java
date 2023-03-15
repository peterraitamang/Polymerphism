package com.example.polymerphism;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Shape circle = new Circle(5);
        Shape square = new Square(2);
        Shape rectangle = new Rectangle(2,4);

        circle.calculateArea();
        circle.calculatePerimeter();

        square.calculateArea();
        square.calculatePerimeter();

        rectangle.calculateArea();
        rectangle.calculatePerimeter();

        System.out.println("Area of circle:" + circle.area);
        System.out.println("Perimeter of circle:" +circle.perimeter);

        System.out.println("Area of square:"+ square.area);
        System.out.println("Perimeter"+square.perimeter);

        System.out.println("Area of Rectangle:"+rectangle.area);
        System.out.println("Perimeter"+rectangle.perimeter);

    }
}