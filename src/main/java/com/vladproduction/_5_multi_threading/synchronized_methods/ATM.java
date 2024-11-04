package com.vladproduction._5_multi_threading.synchronized_methods;

public class ATM {

    static synchronized void withdrawATM(BankAccount account, int amount) {
        int balance = account.getBalance();
        if((balance - amount) < - account.getOverdraft()) {
            System.out.println("Transaction denied!");
        } else {
            account.withdraw(amount);
            System.out.println("$" + amount + " successfully withdrawn");
        }
        System.out.println("Current balance: " + account.getBalance());

    }

}
