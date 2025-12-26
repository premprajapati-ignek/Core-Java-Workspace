package com.ignek.core.java.oops;

class Vehicle{
    String color;

    void startVehicle(){
        System.out.println("Start vehicle");
    }
}

class Car extends Vehicle{
    String name;

    void wheel(){
        System.out.println("oops.Car contain 4 wheels");
    }
}

class Bike extends Vehicle{
    String name;

    void wheel(){
        System.out.println("oops.Bike contain 2 wheels");
    }
}

public class HeirarchicalInheritance {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.color = "White";
        System.out.println("oops.Car color : " + car1.color);
        car1.wheel();

        System.out.println();

        Bike bike1 = new Bike();
        bike1.color = "Black";
        System.out.println("oops.Bike color : " + bike1.color);
        bike1.wheel();

    }
}
