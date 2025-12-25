package com.ignek.core.java.logical;

import java.util.Scanner;

public class PrimeNumber {

    public static boolean checkNumberIsPrime(int number){
        boolean isPrime = true;

        if (number <= 1){
            isPrime = false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0)
                isPrime = false;
        }
        return isPrime;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int number = sc.nextInt();

        System.out.println();
        for (int i = 0; i < number; i++) {
            if (checkNumberIsPrime(i))
                System.out.println(i + " - Number is prime");
        }
        sc.close();
    }
}
