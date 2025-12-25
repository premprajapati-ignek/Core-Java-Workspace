package com.ignek.core.java.logical;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 10 array values");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        double average = sum / array.length;

        int maxNumber = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (maxNumber < array[i]){
                maxNumber = array[i];
            }
        }

        int minNumber = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (minNumber > array[i]){
                minNumber = array[i];
            }
        }

        System.out.print("\nlogicalPrograms.Array elements :");
        for(int element : array){
            System.out.print(element + " ");
        }
        System.out.println("\nlogicalPrograms.Array sum :" + sum);
        System.out.println("logicalPrograms.Array average :" + average);
        System.out.println("Maximum number :" + maxNumber);
        System.out.println("Minimum number :" + minNumber);
        
        sc.close();
    }
}
