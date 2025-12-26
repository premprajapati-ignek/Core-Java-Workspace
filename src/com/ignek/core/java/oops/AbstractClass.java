package com.ignek.core.java.oops;

abstract class Device{
    abstract void start();
    abstract void stop();
}

class Laptop extends Device{
    void start(){
        System.out.println("oops.Laptop is started...");
    }
    void stop(){
        System.out.println("oops.Laptop is stopped...");
    }
}

class Mobile extends Device{
    void start(){
        System.out.println("oops.Mobile is started...");
    }
    void stop(){
        System.out.println("oops.Mobile is stopped...");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Laptop hp = new Laptop();
        hp.start();
        hp.stop();

        Mobile onePlus = new Mobile();
        onePlus.start();
        onePlus.stop();
    }
}
