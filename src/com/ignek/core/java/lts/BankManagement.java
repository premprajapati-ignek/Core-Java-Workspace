package com.ignek.core.java.lts;

record Customer(int accountNo, double balance, String name){};

public class BankManagement {
    public static void main(String args[]) {
        Customer customer1 = new Customer(1290, 1000, "Prem");
        Customer customer3 = new Customer(1290, 3000, "Prem");
        Customer customer2 = new Customer(1291, 500, "Rajesh");

        System.out.println(customer1.toString());
        System.out.println(customer2.toString());

        System.out.println(customer1.equals(customer3));
    }
}
