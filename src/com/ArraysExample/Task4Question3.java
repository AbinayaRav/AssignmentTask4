package com.ArraysExample;

import java.util.Scanner;

public class Task4Question3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the size of the input array :");
        int n = scan.nextInt();
        int[] inputArray = new int[n];
        System.out.println("Please enter the elements of the input array :");
        for (int i = 0; i < n; i++) {
            inputArray[i] = scan.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int second_min = Integer.MAX_VALUE;;
        for (int i : inputArray) {
            if (i<min) {
                second_min = min;
                min = i;
            } else {
                if (i<second_min) {
                    second_min = i;
                }
            }
        }
        System.out.println("The second smallest number in the array is "+second_min);
        scan.close();
    }

}
