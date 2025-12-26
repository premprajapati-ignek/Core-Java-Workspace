package com.ignek.core.java.lts;

@java.lang.FunctionalInterface
interface Operation{
    int addition(int number1, int number2);
}

public class FunctionalInterface {
    public static void main(String[] args) {
        Operation operation1 = (int number1, int number2) -> number1 + number2;

        System.out.println(operation1.addition(10, 20));    
    }
}
