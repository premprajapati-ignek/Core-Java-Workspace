package com.ignek.core.java.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicateElementFromList {
    public static void removeDuplicateElementsFromListUsingSet(List<String> list1){
        HashSet<String> distinctSetValues = new HashSet<>();

        for (String values : list1){
            distinctSetValues.add(values);
        }

        System.out.println(distinctSetValues);
    }
    
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("mango");
        fruits.add("orange");
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("watermelon");

        removeDuplicateElementsFromListUsingSet(fruits);
    }
}
