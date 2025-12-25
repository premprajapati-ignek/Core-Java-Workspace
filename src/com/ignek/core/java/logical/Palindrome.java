package com.ignek.core.java.logical;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number : ");
        int originalNumber = sc.nextInt();
        int copyNumber = originalNumber;
        int reverseNumber = 0;

        while (copyNumber > 0) {
            int reminder = copyNumber % 10;
            reverseNumber = reverseNumber*10 + reminder;
            copyNumber = copyNumber / 10;
        }

        System.out.println();
        if (originalNumber == reverseNumber)
            System.out.println(originalNumber + " is Palindrome");
        else
            System.out.println(originalNumber + " is not Palindrome");
        sc.close();
    }
}
