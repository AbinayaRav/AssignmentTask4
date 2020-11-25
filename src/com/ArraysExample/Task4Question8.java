package com.ArraysExample;

import java.util.Arrays;
import java.util.Scanner;

public class Task4Question8 {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter the size of the input array : ");
            int n = scan.nextInt();
            int[] inputArray = new int[n];
            System.out.println("Please enter the elements for the input array : ");
            for (int i = 0; i < n; i++) {
                inputArray[i] = scan.nextInt();
            }
            int count = 0;
            int m = inputArray[0];
            Arrays.sort(inputArray);
            for (int i = 1; i < inputArray.length; i++) {
                if (m == inputArray[i]) {
                    inputArray[i] = 0;
                } else {
                    m = inputArray[i];
                }
            }
            for (int j : inputArray) {
                if (j != 0) {
                    count++;
                }
            }
            System.out.println("The size of the output array is : " + count);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bound!!" + e.getMessage());
        }
    }
}
