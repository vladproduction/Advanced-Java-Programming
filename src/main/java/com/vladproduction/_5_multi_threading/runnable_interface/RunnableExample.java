package com.vladproduction._5_multi_threading.runnable_interface;

public class RunnableExample implements Runnable{

    @Override
    public void run() {
        int i = 1;
        while (i <= 100){
            System.out.println(i + " " + Thread.currentThread().getName());
            i++;
        }
    }
}
