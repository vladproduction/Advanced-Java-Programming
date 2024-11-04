package com.vladproduction._4_functional_programming.lambda;

public class Main {
    public static void main(String[] args) {

        WelcomeMessage wm = new WelcomeMessage() {
            @Override
            public void welcoming(String message) {
                System.out.println("Hello " + message+ "!");
            }
        };
        wm.welcoming("Valle!!"); //Hello Valle!!!
    }
}
