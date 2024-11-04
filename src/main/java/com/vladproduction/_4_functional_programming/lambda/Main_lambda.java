package com.vladproduction._4_functional_programming.lambda;

public class Main_lambda {
    public static void main(String[] args) {

        WelcomeMessage wm = message -> System.out.println("Hello " + message+ "!");
        wm.welcoming("Valle!!"); //Hello Valle!!!

        //if no parameters in the method override from  functional interface:
        MessagePrinter mp = ()->{
            System.out.println("This is the message!");
        };
        mp.printMessage();

        //or we can print it even shorter (in case we have only one function to do inside):
        MessagePrinter mp2 = ()-> System.out.println("This is the shorter message from mp2!!!");
        mp2.printMessage();

    }
}
