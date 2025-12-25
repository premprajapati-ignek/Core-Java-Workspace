package com.ignek.core.java.basics;

public class TypeCasting {
    public static void main(String[] args) {

        //widening Type Casting
        int myInteger = 10;
        double myDouble = myInteger;
        System.out.println(myDouble);

        //Narrow Type Casting
        double largePrecisonNumber = 3.147358d;
        byte myBytes = (byte) largePrecisonNumber;
        System.out.println(myBytes);

    }
}
