package com.ignek.core.java.collections;

import java.util.HashSet;

public class HashSetProgram {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Punch");
        cars.add("Swift");
        cars.add("Alto");
        cars.add("Altroz");
        cars.add("Innova");
        cars.add("Altroz");

        System.out.println(cars);

        System.out.println(cars.contains("Altroz"));
        System.out.println(cars.size());

        System.out.println(cars.remove("Altroz"));
        System.out.println(cars);

        cars.clear();
        System.out.println(cars);
    }
}
