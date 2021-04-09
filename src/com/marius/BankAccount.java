package com.marius;

public class BankAccount {

    private String firstName, lastName;
    private double balance;

    public static final int CHECHING = 1;
    public static final int SAVINGS = 2;

    private int accountType;

    public BankAccount(String firstName, String lastName, double balance, int accountType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        this.accountType = accountType;
    }

    // boolean branch is true if the customer is performing the transaction at a branch
    // false if the transaction is performed at an ATM
    public double deposit(double amount, boolean branch){
        balance +=amount;
        return balance;
    }

    public double withdraw(double amount, boolean branch){
        if((amount > 500.00) && !branch){
            throw new IllegalArgumentException();
        }
        balance-=amount;
        return balance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isChecking(){
        return accountType == CHECHING;
    }


}
