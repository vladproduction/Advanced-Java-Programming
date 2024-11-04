package com.vladproduction._1_generic_methods;

public class Varargs {
    public static void main(String[] args) {
        String item1 = "A";
        String item2 = "B";
        String item3 = "C";
        entityElements(item1, item2, item3);
        System.out.println("-----");
        entityElements("item1", "item2", "item3", "item4", "item5");
        System.out.println("-----");
        String[] items = {"item10", "item20", "item30", "item40", "item50"};
        entityElements(items);
    }

    private static void entityElements(String... items) {
        System.out.println("ELEMENTS:");
        int count = 0;
        for (String item : items) {
            System.out.println(count + 1 + " : " + item);
            count++;
        }

    }
}
