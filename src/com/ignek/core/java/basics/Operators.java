package com.ignek.core.java.basics;

public class Operators {
    public static void main(String[] args) {
        //Arithmetic Operator
        int number1 = 10;
        int number2 = 20;

        System.out.println("Number 1 : " + number1);
        System.out.println("Number 2 : " + number2);

        int sum = number1 + number2;
        int sub = number1 - number2;
        System.out.println("\nSum : " + sum);
        System.out.println("Sub : " + sub);

        //Relational Operator
        if (number1 > number2)
            System.out.println("\nnumber1 is greater Than number2");
        else
            System.out.println("\nnumber2 is greater Than number1");

        //Logical Operator
        boolean condition1 = true;
        boolean condition2 = false;

        System.out.println("\ncondition1 && condition2 = " + (condition1 && condition2));
        System.out.println("condition1 || condition1 = " + (condition1 || condition2));
        System.out.println("!condition1 = " + (!condition1));

        //Assignment Operator
        //sum = sum + 10;
        sum %= 10;
        System.out.println("\nsum += 10" + sum);


        //Unary Operator
        System.out.println("\nPreIncrement No1 : " + (++number1));
        System.out.println("PostDecrement No1 : " + (number1++));

        //Ternary Operator
        int age = 21;
        boolean isMature = (age < 18) ? false : true;
        System.out.println("\n" + isMature);

        //Bitwise Operator
        int a = 10;
        int b = 8;
        System.out.println("\nBitwise Operator : ");
        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);
        System.out.println(a >> 2);
        System.out.println(b << 2);
    }
}
