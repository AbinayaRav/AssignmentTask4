package com.ArraysExample;

import java.util.Arrays;
import java.util.Scanner;

public class Task4Question7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean flag = true;
        int[] inputArray = new int[]{};
        while (flag) {
            System.out.println("Please enter the size of the input array :");
            int n = scan.nextInt();
            if (n <= 1) {
                System.out.println("Size of the array should be greater 1 !! Please try again.");
                continue;
            }
            inputArray = new int[n];
            break;
        }
        System.out.println("Please enter the elements of the input array :");
        for (int i = 0; i <inputArray.length; i++) {
            inputArray[i] = scan.nextInt();
        }
        int result = Arrays.stream(inputArray).max().getAsInt() - Arrays.stream(inputArray).min().getAsInt();
        System.out.println("The difference between the largest and smallest element in the array is " + (result));
    }

}
