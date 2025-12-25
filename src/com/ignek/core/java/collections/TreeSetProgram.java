package com.ignek.core.java.collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetProgram {
    public static void main(String[] args) {
        Set<Integer> treeSetNumbers = new TreeSet<Integer>();
        treeSetNumbers.add(50);
        treeSetNumbers.add(30);
        treeSetNumbers.add(20);
        treeSetNumbers.add(40);

        for (int elements : treeSetNumbers){
            System.out.println(elements);
        }
    }
}
