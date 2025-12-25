package com.ignek.core.java.oops;

abstract class OnlineOrder{
    String customerName;
    String deliveryAddress;

    abstract void processPayment();
    void displayOrderSummary(){
        System.out.println("Customer name : " + customerName);
        System.out.println("Address : " + deliveryAddress);
    }
}

class Product extends OnlineOrder{
    String productName;
    double productPrice;
    String paymentMethod;

    void showProduct(){
        System.out.println("oops.Product name : " + productName);
        System.out.println("oops.Product price : " + productPrice);
    }

    @Override
    void processPayment() {
        System.out.println("oops.Payment : " + paymentMethod);
    }
}

public class PartialAbstraction {
    public static void main(String[] args) {
        Product order1 = new Product();
        order1.customerName = "Prem";
        order1.deliveryAddress = "Ganesh glory 11";
        order1.productName = "Logitech mouse";
        order1.productPrice = 899;
        order1.paymentMethod = "Cash on delivery";

        order1.showProduct();
        order1.displayOrderSummary();
        order1.processPayment();
    }
}
