package com.vladproduction._3_advanced_data_structures.linkedmashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        // Initialize a LinkedHashMap with an initial capacity of 4,
        // load factor of 0.75, and access order set to true
        // (to maintain the order of access).
        LinkedHashMap<String, Integer> phonebook = new LinkedHashMap<>(4, .75f, true);
        phonebook.put("Bob", 123);
        phonebook.put("John", 444);
        phonebook.put("Jelly", 456);
        phonebook.put("Tom", 789);
        phonebook.put("Valle", 999);

        //let say we call to those persons:
        System.out.println("John`s number: " + phonebook.get("John")); //get by key
        System.out.println("Tom`s number: " + phonebook.get("Tom")); //get by key

        System.out.println("\nList of contacts from 'phonebook:'");
        for (Map.Entry<String, Integer> entry : phonebook.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        /*List of contacts from 'phonebook:'
        we pass accessOrder in the constructor to true, so we can see most recently used (we call) at the end:
            Bob : 123
            Jelly : 456
            Valle : 999
            John : 444  //as most recently used
            Tom : 789   //as most recently used
        */
    }
}
