package com.vladproduction._4_functional_programming.method_references;

public class Circle {

    int radius = 5;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int calculateArea(){
        return (int)Math.PI * (int)Math.pow(2, radius);
    }
}
