package com.ignek.core.java.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterationOnCollections {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Mango", "Orange", "Banana", "Apple");

        System.out.println();
        System.out.println("Traditional for loop : ");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.print(fruits.get(i) +" ");
        }

        System.out.println();
        System.out.println("Enhanced for loop : ");
        for (String fruit : fruits){
            System.out.print(fruit + " ");
        }

        System.out.println();
        System.out.println("Using iterator : ");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }

        System.out.println();
        System.out.println("Using for-each : ");
        fruits.forEach(fruit -> System.out.print(fruit + " "));

    }
}