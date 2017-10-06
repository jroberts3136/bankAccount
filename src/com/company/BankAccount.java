package com.company;

/**
 * Created by jroberts3136 on 10/4/17.
 */
public class BankAccount {
    public String accountName;
    public double accountBalance;

    public BankAccount(String name, double balance){
        accountName = name;
        accountBalance = balance;
    }
    public void deposit(double deposit){
        accountBalance += deposit;
        System.out.println("Your balance is now $" + accountBalance + ".");
    }
    public void withdraw(double withdraw){
        if (withdraw <= accountBalance){
            accountBalance -= withdraw;
            System.out.println("Your balance is now $" + accountBalance + ".");
        }
        else{
            System.out.println("You cannot withdraw that much. Your balance is only $" + accountBalance + ".");
        }
    }
}
