package com.ArraysExample;


import java.util.Arrays;
import java.util.Scanner;

public class Task4Question6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the size of the input array : ");
        int n = scan.nextInt();
        int[] inputArray = new int[n];
        System.out.println("Please enter the elements for the input array : ");
        for (int i = 0; i < n; i++) {
            inputArray[i] = scan.nextInt();
        }
        Arrays.sort(inputArray);
        System.out.println("The input sorted array is : ");
        Arrays.stream(inputArray).forEach(e -> {
            System.out.print(e + "\t");
        });
        System.out.println();
        int m = inputArray[0];
        int count;
        for (int j = 1; j < inputArray.length; j++) {
            count = 1;
            if (m == inputArray[j]) {
                count++;
                inputArray[j] = 0;
            } else {
                m = inputArray[j];
            }
        }
        inputArray = Task4Question5.pushzeroesToEnd(inputArray);
        System.out.println("The resulting array is : ");
        Arrays.stream(inputArray).forEach(e -> {
            System.out.print(e + "\t");
        });

    }
}
