package com.ignek.core.java.thread;

class BankAccount{
    double availableBalance;

    BankAccount(double availableBalance){
        this.availableBalance = availableBalance;
    }

    public synchronized void withdawCash(double amount){
        if (availableBalance >= amount){
            System.out.println(Thread.currentThread().getName() + " is withdrawing ammount : " + amount);
            availableBalance -= amount;
        } else {
            System.out.println("insufficient Balance....");
        }
    }

    public double checkBalance(){
        return availableBalance;
    }
}

class Customer extends Thread{
    BankAccount account;
    String userName;
    double ammount;

    Customer(BankAccount account, String userName, double ammount){
        super(userName);
        this.account = account;
        this.ammount = ammount;
    }

    public void run(){
        account.withdawCash(ammount);
    }
}

public class ATMWithdrawUsingThread {
    public static void main(String[] args) {
        BankAccount sharedATMAccount = new BankAccount(5000);

        Customer customer1 = new Customer(sharedATMAccount, "Prem", 200);
        Customer customer2 = new Customer(sharedATMAccount, "Rajesh", 1000);
        Customer customer3 = new Customer(sharedATMAccount, "Umang", 3000);
        Customer customer4 = new Customer(sharedATMAccount, "Vivek", 1000);
        Customer customer5 = new Customer(sharedATMAccount, "Keyur", 200);

        customer1.start();
        customer2.start();
        customer3.start();
        customer4.start();
        customer5.start();

        try {
            customer1.join();
            customer2.join();
            customer3.join();
            customer4.join();
            customer5.join();
        } catch (Exception e){
            System.out.println(e);
        }

        System.out.println("Available balance in account : " + sharedATMAccount.checkBalance());
    }
}
