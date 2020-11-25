package com.ArraysExample;

import java.util.Arrays;
import java.util.Scanner;

public class Task4Question5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the size of the input array :");
        int n = scan.nextInt();
        int[] inputArray = new int[n];
        System.out.println("Please enter the elements of the input array :");
        for (int i = 0; i < n; i++) {
            inputArray[i] = scan.nextInt();
        }
        System.out.println("The input array is : ");
        Arrays.stream(inputArray).forEach(m -> {
            System.out.print(m + "\t");
        });
        System.out.println();
        inputArray = pushzeroesToEnd((inputArray));
        System.out.println("The resulting Array is : ");
        Arrays.stream(inputArray).forEach(e -> {
            System.out.print(e + "\t");
        });
    }

    public static int[] pushzeroesToEnd(int[] inputArray) {
        int temp;
        int count = 0;
        while (count < inputArray.length) {
            for (int i = 0; i < inputArray.length - 1; i++) {
                temp = 0;
                if (inputArray[i] == 0) {
                    temp = inputArray[i];
                    inputArray[i] = inputArray[i + 1];
                    inputArray[i + 1] = temp;
                }
            }
            count++;
        }
      return inputArray;
    }
}
