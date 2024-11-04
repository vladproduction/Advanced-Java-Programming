package com.vladproduction._5_multi_threading.thread_class;

public class Main {
    public static void main(String[] args) {

        ThreadExample thread1 = new ThreadExample();
        thread1.setName("My_First_Thread");
        thread1.start();

        ThreadExample thread2 = new ThreadExample();
        thread2.setName("My_Second_Thread");
        thread2.start();


    }
}
