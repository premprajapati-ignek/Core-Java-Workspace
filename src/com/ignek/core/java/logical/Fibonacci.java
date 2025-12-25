package com.ignek.core.java.logical;

import java.util.Scanner;

public class Fibonacci {

    public static void calculateFibonacciWithTwoVariables(int nthNumber){
        int number1 = 0;
        int number2 = 1;

        System.out.print(number1 + " ");

        for (int i = 1; i < nthNumber; i++) {
            number1 = number1 + number2;
            number2 = number1 - number2;
            System.out.print(number1 + " ");
        }
    }

    public static void calculateFibonacci(int nthNumber){
        int number1 = 0;
        int number2 = 1;

        System.out.println();
        for (int i = 0; i < nthNumber; i++) {
            System.out.print(number1 + " ");
            int number3 = number1 + number2;
            number1 = number2;
            number2 = number3;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int nthNumber = sc.nextInt();

        System.out.println("Fibonacci series : ");
        calculateFibonacci(nthNumber);
        System.out.println("Fibonacci series using only two variables : ");
        calculateFibonacciWithTwoVariables(nthNumber);
        sc.close();
    }
}
