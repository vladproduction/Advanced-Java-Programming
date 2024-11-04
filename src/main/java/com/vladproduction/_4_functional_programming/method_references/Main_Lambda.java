package com.vladproduction._4_functional_programming.method_references;

public class Main_Lambda {
    public static void main(String[] args) {

        Square s = new Square(4);
        Circle c = new Circle(5);

        Shapes<Square> shapesSquare = square -> square.calculateArea();
        Shapes<Circle> shapesCircle = circle -> circle.calculateArea();

        System.out.println(shapesSquare.getArea(s));
        System.out.println(shapesCircle.getArea(c));

    }
}
