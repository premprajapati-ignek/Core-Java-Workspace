package com.ignek.core.java.oops;

import java.util.Scanner;

class BankAccount{
    private double balance;

    public void depositCash(double cash){
        balance += cash;
    }

    public void withdrawCash(double cash){
        balance -= cash;
    }

    public double getBalance(){
        return balance;
    }
}

public class BankAccountEncapsulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account1 = new BankAccount();

        int choice = 0;
        while (choice != 4){
            System.out.println("Bank account management");
            System.out.println("1.Deposit cash");
            System.out.println("2.Withdraw cash");
            System.out.println("3.Check balance");
            System.out.println("4.Exit");

            System.out.println("\nEnter Your choice : ");
            choice = sc.nextInt();

            double amount;

            switch (choice){
                case 1 :
                    System.out.println("\nEnter amount to deposit : ");
                    amount = sc.nextInt();
                    account1.depositCash(amount);
                    System.out.println( amount + " Deposited successfully" + "\n");
                    break;
                case 2 :
                    System.out.println("\nEnter amount to withdraw : ");
                    amount = sc.nextInt();
                    account1.withdrawCash(amount);
                    System.out.println( amount + " Withdraw successfully" + "\n");
                    break;
                case 3 :
                    System.out.println("Current balance : " + account1.getBalance() + "\n");
                    break;
                case 4 :
                    break;
                default:
                    System.out.println("Please enter valid number");
                    break;
            }
        }
        sc.close();
    }
}
