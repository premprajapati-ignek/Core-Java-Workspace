package com.ignek.core.java.oops;

import java.util.Scanner;

public class Calculator {

    public static double addition(double number1, double number2){
        double result = number1 + number2;
        return result;
    }

    public static double subtraction(double number1, double number2){
        double result = number1 - number2;
        return result;
    }

    public static double multiplication(double number1, double number2){
        double result = number1 * number2;
        return result;
    }

    public static double division(double number1, double number2){
        double result = number1 / number2;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice = 0;
        while (choice != 5){
            System.out.println("Calculation perform on two numbers : ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.println("Enter your choice : ");
            choice = sc.nextInt();

            if (choice < 5) {
                System.out.println("Enter number1 : ");
                int number1 = sc.nextInt();
                System.out.println("Enter number2 : ");
                int number2 = sc.nextInt();

                switch (choice) {
                    case 1:
                        double sum = addition(number1, number2);
                        System.out.println("Ans is : " + sum);
                        break;
                    case 2:
                        double sub = subtraction(number1, number2);
                        System.out.println("Ans is : " + sub);
                        break;
                    case 3:
                        double mul = multiplication(number1, number2);
                        System.out.println("Ans is : " + mul);
                        break;
                    case 4:
                        double div = division(number1, number2);
                        System.out.println("Ans is : " + div);
                        break;
                    default:
                        System.out.println("Please enter valid choice");
                        break;
                }
            } else {
                System.out.println("Please enter valid choice");

            }
        }
        sc.close();
    }
}
