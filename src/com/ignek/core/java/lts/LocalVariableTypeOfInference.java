package com.ignek.core.java.lts;

class Calculation{
    int addition(int number1, int number2){
        var sum = number1 + number2;
        return sum;
    }
    static {
        var number = 10;
        System.out.println(number);
    }
}

public class LocalVariableTypeOfInference {
    public static void main(String[] args) {
        var nameOfPerson = "Prem";
        System.out.println("Name : " + nameOfPerson);
        var result = new Calculation().addition(10, 10);
        System.out.println("Sum of numbers : " + result);
    }
}
