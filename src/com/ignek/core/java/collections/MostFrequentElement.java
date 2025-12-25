package com.ignek.core.java.collections;

import java.util.ArrayList;
import java.util.List;

public class MostFrequentElement {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(40);
        numbers.add(50);
        numbers.add(10);
        numbers.add(30);
        numbers.add(10);

        int maximumCount = 0;
        int maximumCountNumber = 0;

        for (int i = 0; i < numbers.size(); i++) {
            int count = 0;
            for (int j = 0; j < numbers.size(); j++) {
               if (numbers.get(i) == numbers.get(j)){
                   count++;
               }
            }

            if (count > maximumCount){
                maximumCount = count;
                maximumCountNumber = numbers.get(i);
            }

        }

        System.out.println("Most frequent element is : " + maximumCountNumber);
        System.out.println("Count is : " + maximumCount);
    }
}
