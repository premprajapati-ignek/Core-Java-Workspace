package com.ignek.core.java.logical;

public class Factorial {

    public static int printFact(int number){
        if (number == 0){
            return 1;
        }

        return number * printFact(number - 1);
    }

    public static void main(String[] args) {
        int number = 5 ;
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }

        System.out.println(number + " logicalPrograms.Factorial is" + factorial);

        System.out.println(printFact(number));
    }
}
