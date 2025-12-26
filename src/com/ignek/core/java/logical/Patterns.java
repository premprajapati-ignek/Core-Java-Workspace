package com.ignek.core.java.logical;

public class Patterns {
    public static void printTrianglePattern(int number){
        for (int i = 0; i < number; i++) {
            for (int j = number; j > i; j--) {
                System.out.print(' ');
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printPyramidPattern(int number){
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printDiamondPattern(int number){
        for (int row = 0; row < number; row++) {
            for (int i = number; i > row; i--) {
                System.out.print(" ");
            }
            for (int i = 0; i < row; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int row = 0; row < number; row++) {
            for (int i = 0; i < row; i++) {
                System.out.print(" ");
            }
            for (int i = number; i > row; i--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int number = 5;

        System.out.println("Triangle pattern : ");
        printTrianglePattern(number);
        System.out.println("\nPyramid pattern : ");
        printPyramidPattern(number);
        System.out.println("\nDiamond pattern : ");
        printDiamondPattern(number);
    }
}
