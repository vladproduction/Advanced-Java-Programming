package com.vladproduction._5_multi_threading.thread_class;

public class ThreadExample extends Thread{

    @Override
    public void run() {
        int i = 1;
        while (i <= 100){
            System.out.println(i + " " + this.getName());
            i++;
        }
    }
}