package com.vladproduction._3_advanced_data_structures.queue;

public class Customer {

    private boolean hasBeenServed;
    private String name;

    public Customer(String name) {
        hasBeenServed = false;
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public void serve(){
        hasBeenServed = true;
        System.out.println(name + " has been served");
    }
}
