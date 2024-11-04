package com.vladproduction._4_functional_programming.method_references;

public class Square {

    int sideLength;

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    public int calculateArea() {
        return sideLength * sideLength;
    }

}
