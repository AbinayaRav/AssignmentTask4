package com.ArraysExample;

import java.util.Scanner;

public class Task4Question10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the size of the input array : ");
        int n = scan.nextInt();
        int[] inputArray = new int[n];
        System.out.println("Please enter the elements for the input array : ");
        for (int i = 0; i < n; i++) {
            inputArray[i] = scan.nextInt();
        }
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int min1 = 0;
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                sum = inputArray[i] + inputArray[j];
                if (Math.abs(sum) < min) {
                    min = Math.abs(sum);
                    min1 = sum;
                }
            }
        }
        System.out.println("The sum that is closest to zero is " + min1);
    }

}
