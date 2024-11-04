package com.vladproduction._5_multi_threading.synchronized_methods;

public class Users {
    static final BankAccount account = new BankAccount(50);

    public static void main(String[] args) {

        account.deposit(100);

        Thread thread1 = new Thread(()->{
            ATM.withdrawATM(account, 100);
        });
        Thread thread2 = new Thread(()->{
            ATM.withdrawATM(account, 100);
        });

        thread1.start();
        thread2.start();
    }
}
