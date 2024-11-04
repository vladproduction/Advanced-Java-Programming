package com.vladproduction._5_multi_threading.runnable_interface;

public class Main {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new RunnableExample());
        thread1.start();

        Thread thread2 = new Thread(() -> {
            int i = 1;
            while (i <= 100){
                System.out.println(i + " " + Thread.currentThread().getName());
                i++;
            }
        });
        thread2.start();

    }
}
