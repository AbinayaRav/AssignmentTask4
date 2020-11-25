package com.ArraysExample;

import java.util.Scanner;

public class Task4Question4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number of rows in the matrices : ");
        int n = scan.nextInt();
        System.out.println("Please enter the number of columns in the matrices : ");
        int m = scan.nextInt();
        int[][] matrix1 = new int[n][m];
        int[][] matrix2 = new int[n][m];
        System.out.println("Please enter the elements of the Matrix 1 :");
        for (int a = 0; a < n; a++) {
            for (int b = 0; b < matrix1[a].length; b++) {
                matrix1[a][b] = scan.nextInt();
            }
        }
        System.out.println("Please enter the elements of the Matrix 2 :");
        for (int a = 0; a < n; a++) {
            for (int b = 0; b < matrix2[a].length; b++) {
                matrix2[a][b] = scan.nextInt();
            }
        }
        System.out.println("Sum of the two input Matrices is : ");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                matrix1[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(matrix1[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
