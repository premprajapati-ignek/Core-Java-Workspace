package com.ignek.core.java.oops;

class Payment{
    void payMoney(){
        System.out.println("oops.Payment is done using cash.");
    }
    void payMoney(long cardNo){
        System.out.println("oops.Payment is done using debit card.");
    }
    void payMoney(String upiId){
        System.out.println("oops.Payment is done using upi.");
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Payment payment1 = new Payment();

        payment1.payMoney();

        payment1.payMoney(1000900078);

        payment1.payMoney("premprj74@upi");
    }
}
