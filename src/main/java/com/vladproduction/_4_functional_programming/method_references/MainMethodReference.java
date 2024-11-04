package com.vladproduction._4_functional_programming.method_references;

public class MainMethodReference {
    public static void main(String[] args) {

        Square square = new Square(4);
        Shapes<Square> shapes = Square::calculateArea;
        System.out.println(shapes.getArea(square));

        Circle c = new Circle(5);
        Shapes<Circle> shapesCircle = Circle::calculateArea;
        System.out.println(shapesCircle.getArea(c));

    }
}
