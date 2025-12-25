package com.ignek.core.java.oops;

abstract class Account{
    abstract double calculateInterest();
}

class SavingAccount extends Account{
    double balance;
    @Override
    double calculateInterest() {
        double interest = balance * 0.05;
        return interest;
    }
}

class CurrentAccount extends Account{
    double balance;
    @Override
    double calculateInterest() {
        double interest = balance * 0.025;
        return interest;
    }
}

public class AnotherAbstractClass {
    public static void main(String[] args) {
        CurrentAccount currentAccount1 = new CurrentAccount();
        currentAccount1.balance = 100000;
        System.out.println("Interest of current oops.Account : " + currentAccount1.calculateInterest());

        SavingAccount savingAccount1 = new SavingAccount();
        savingAccount1.balance = 100000;
        System.out.println("Interest of saving oops.Account : " + savingAccount1.calculateInterest());
    }
}
