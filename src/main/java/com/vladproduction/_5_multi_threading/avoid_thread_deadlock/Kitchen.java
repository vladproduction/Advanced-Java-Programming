package com.vladproduction._5_multi_threading.avoid_thread_deadlock;

public class Kitchen {

    public static Object spoon = new Object();
    public static Object bowl = new Object();

    public static void main(String[] args) {

        Thread cook1 = new Thread(()->{
            synchronized (spoon){
                System.out.println("cook1: hold bowl...");
                System.out.println("cook1: wait spoon...");
                synchronized (bowl){
                    System.out.println("cook1: hold spoon & bowl.");
                }
            }
        });

        Thread cook2 = new Thread(()->{
            synchronized (spoon){
                System.out.println("cook2: hold spoon...");
                System.out.println("cook2: wait bowl...");
                synchronized (bowl){
                    System.out.println("cook2: hold spoon & bowl.");
                }
            }
        });

        cook1.start();
        cook2.start();

    }

}
