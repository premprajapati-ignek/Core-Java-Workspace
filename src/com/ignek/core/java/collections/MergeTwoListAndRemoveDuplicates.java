package com.ignek.core.java.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MergeTwoListAndRemoveDuplicates {
    public static void main(String[] args) {
        List<Character> list1 = new ArrayList<>();
        list1.add('A');
        list1.add('B');
        list1.add('C');
        list1.add('D');
        list1.add('E');

        List<Character> list2 = new ArrayList<>();
        list2.add('B');
        list2.add('D');
        list2.add('F');
        list2.add('G');

        Set<Character> mergedSet = new HashSet<>();
        mergedSet.addAll(list1);
        mergedSet.addAll(list2);

        List<Character> mergedList = new ArrayList<>(mergedSet);

        for (Character element : mergedList){
            System.out.print(element + " ");
        }
    }
}
