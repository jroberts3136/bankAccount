package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        Scanner keyInput = new Scanner(System.in);
        Scanner stringInput = new Scanner(System.in);

        boolean done = false;
        boolean validResponse = false;

        System.out.println("Please enter your name.");
        String name = stringInput.nextLine();

        System.out.println("Please enter your initial deposit.");
        double initialDeposit = keyInput.nextDouble();

        BankAccount theAccount = new BankAccount(name, initialDeposit);
        while(!done){

           while(!validResponse){
               System.out.println("Would you like to deposit or withdraw?");
               String dOrW = stringInput.nextLine();

               if (dOrW.equalsIgnoreCase("deposit")){
                   System.out.println("How much would you like to deposit?");
                   double deposit = keyInput.nextDouble();
                   theAccount.deposit(deposit);
                   validResponse = true;
               }

               else if (dOrW.equalsIgnoreCase("withdraw")){
                   System.out.println("How much would you like to withdraw?");
                   double withdraw = keyInput.nextDouble();
                   theAccount.withdraw(withdraw);
                   validResponse = true;
               }

               else{
                   System.out.println("That is not a valid response. Please try again.");
               }
           }

           System.out.println("Are you done with your account?");
           String yNResponse = stringInput.nextLine();

           if (yNResponse.equalsIgnoreCase("yes")){
               done = true;
           }

        }
*/

        BankAccount myAccount = new BankAccount("Sally Jones", 1000);
        myAccount.deposit(505.22);
        System.out.println(myAccount.accountBalance);
        myAccount.withdraw(100);
        System.out.println("The Sally Jones account balance is, " + myAccount.accountBalance);

    }
}
