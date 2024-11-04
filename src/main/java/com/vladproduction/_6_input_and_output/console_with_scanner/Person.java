package com.vladproduction._6_input_and_output.console_with_scanner;

public class Person {

    private String name;
    private int age;
    private long phoneNumber;

    public Person(String name, int age, long phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        System.out.println("Person Created. Name: "
                + name + ", Age: " + age + ", phone number: " + phoneNumber);
    }

}
