package com.marius;

import static org.junit.Assert.*;

public class BankAccountTest {

    private BankAccount account;

    @org.junit.BeforeClass
    public static void beforeClass(){
        System.out.println("This executes once before any test cases");
    }

    // The @org.junit.Before annotation tells Junit to run this method every time
    //before each test
    @org.junit.Before
    public void setup(){
        account = new BankAccount("Marius", "Dragos", 1000.00, BankAccount.CHECHING);
        System.out.println("Running before each test");
    }

    @org.junit.Test
    public void deposit() {
        double balance = account.deposit(200.00, true);
        assertEquals(1200.00, balance, 0);

    }

    @org.junit.Test
    public void withdraw_branch() {
        double balance = account.withdraw(600.00, true);
        assertEquals(400.00, balance, 0);
    }

    // you can tell Junit to expect an exception
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void withdraw_notBranch(){
        //double balance = account.withdraw(600.00, false);
        //assertEquals(400.00, balance, 0);

        //because an exception is expected as a result the above code can be shortened
        account.withdraw(600.00, false);

    }

    @org.junit.Test
    public void getBalance_deposit() {
        account.deposit(200.00, true);
        assertEquals(1200.00, account.getBalance(), 0);
    }

    @org.junit.Test
    public void getBalance_withdraw() {
        BankAccount account = new BankAccount("Marius", "Dragos", 1000.00, BankAccount.CHECHING);
        account.withdraw(200.00, true);
        assertEquals(800.00, account.getBalance(), 0);
    }

    @org.junit.Test
    public void isChecking_true(){
        assertTrue("The account is not a checking account", account.isChecking());
    }

    @org.junit.After
    public void runAfter(){
        System.out.println("Running after each test.");
    }

    @org.junit.AfterClass
    public static void afterClass(){
        System.out.println("This executes after all test cases");
    }

}