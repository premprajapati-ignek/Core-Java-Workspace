package com.ignek.core.java.oops;

class Notification{
    void message(){
        System.out.println("General notification");
    }
}

class Email extends Notification{
    void message(){
        System.out.println("oops.Email notification");
    }
}

class SMS extends Notification{
    void message(){
        System.out.println("oops.SMS notification");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Email emailMessage = new Email();
        emailMessage.message();

        SMS smsMessage = new SMS();
        smsMessage.message();
    }
}
