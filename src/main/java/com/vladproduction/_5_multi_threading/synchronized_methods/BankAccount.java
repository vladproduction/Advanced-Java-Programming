package com.vladproduction._5_multi_threading.synchronized_methods;

public class BankAccount {

    private int balance = 0;
    private final int overdraft;

    public BankAccount(int overdraft) {
        this.overdraft = overdraft;
    }

    public int getBalance() {
        return balance;
    }

    public int getOverdraft() {
        return overdraft;
    }

    public void deposit(int amount){
        balance += amount;
    }

    public void withdraw(int amount){
        balance -= amount;
    }
}
