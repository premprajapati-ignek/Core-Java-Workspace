package com.ignek.core.java.exceptions;

public class PracticeException {

    public static void divOfTwoNumbers(int number1, int number2) throws Exception{
        double div = number1/number2;
        System.out.println(div);
    }

    public static void main(String[] args) {
        int number1 = 18;
        int number2 = 0;

        try {
            divOfTwoNumbers(number1, number2);
        } catch (Exception e){
            System.out.println("Number not divide by zero");
        }
    }
}
