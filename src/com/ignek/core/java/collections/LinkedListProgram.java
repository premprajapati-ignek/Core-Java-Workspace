package com.ignek.core.java.collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListProgram {
    public static void main(String[] args) {
        List<String> carList = new LinkedList<String>();
        carList.add("Punch");
        carList.add("Swift");
        carList.add("i20");
        carList.add("i20");
        carList.add("Aura");

        System.out.println(carList);

        System.out.println(carList.get(0));
        System.out.println(carList.get(1));

        carList.add(2, "Polo");
        System.out.println(carList);

        carList.remove(3);
        System.out.println(carList);

        carList.set(0, "Altroz");
        System.out.println(carList);

        System.out.println("Iterating in collections :");
        for (int i = 0; i < carList.size(); i++) {
            System.out.print(carList.get(i) + " ");
        }

        Collections.sort(carList);
        System.out.println("\n" + carList);

        carList.clear();
        System.out.println(carList);
    }
}
