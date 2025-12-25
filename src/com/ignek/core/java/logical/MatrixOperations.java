package com.ignek.core.java.logical;

public class MatrixOperations {
    public static void matrixAddition(int matrix1[][], int matrix2[][]){
        int row = matrix1.length;
        int column = matrix1[0].length;

        int additionMatrix[][] = new int[row][column];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                additionMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        printMatrix(additionMatrix);
    }

    public static void matrixMultiplication(int matrix1[][], int matrix2[][]){
        int row = matrix1.length;
        int column = matrix1[0].length;

        int multiplicationMatrix[][] = new int[row][column];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                for (int k = 0; k < matrix2.length; k++) {
                    multiplicationMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        printMatrix(multiplicationMatrix);
    }

    public static void matrixTranspose(int matrix[][]){
        int row = matrix.length;
        int column = matrix[0].length;

        int transposeMatrix[][] = new int[column][row];

        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                transposeMatrix[i][j] = matrix[j][i];
            }
        }
        printMatrix(transposeMatrix);
    }

    public static void printMatrix(int matrix[][]){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int matrix1[][] = {{1, 2},{3, 4}};
        int matrix2[][] = {{1, 2}, {1, 1}};

        System.out.println("Matrix1 : ");
        printMatrix(matrix1);
        System.out.println("Matrix2 : ");
        printMatrix(matrix2);
        System.out.println("Addition of two matrix : ");
        matrixAddition(matrix1, matrix2);
        System.out.println("Multiplication of two matrix : ");
        matrixMultiplication(matrix1, matrix2);

        int matrix3[][] = {{1, 2}, {1, 1}, {4,5}};
        System.out.println("Before transpose of matrix : ");
        printMatrix(matrix3);
        System.out.println("After transpose of matrix : ");
        matrixTranspose(matrix3);
    }
}
