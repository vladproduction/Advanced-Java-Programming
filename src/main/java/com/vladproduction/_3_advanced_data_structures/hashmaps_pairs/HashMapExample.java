package com.vladproduction._3_advanced_data_structures.hashmaps_pairs;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {

        HashMap<String, Integer> phonebook = new HashMap<>();
        phonebook.put("Kevin", 12345);
        phonebook.put("Jill", 98765);
        phonebook.put("Brenda", 123123);
        phonebook.put("Bob", 22222);
        phonebook.put("Bob", 33333); //update value if key duplicated
        phonebook.put(null, 000); //allow null as a key
        System.out.println(phonebook); //{null=0, Kevin=12345, Brenda=123123, Bob=33333, Jill=98765}
        if(phonebook.containsKey("Brenda")) {
            phonebook.remove("Brenda"); //removing by key
        }
        System.out.println(phonebook);//{null=0, Kevin=12345, Bob=33333, Jill=98765} no Brenda any longer in a phonebook

        //remove all elements from hasMap
        phonebook.clear();
        System.out.println(phonebook);//{}

    }
}
