package com.ArraysExample;

import java.util.Scanner;

public class Task4Question9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the size of the input array : ");
        int n = scan.nextInt();
        int[] inputArray = new int[n];
        System.out.println("Please enter the elements for the input array : ");
        for (int i = 0; i < n; i++) {
            inputArray[i] = scan.nextInt();
        }
        System.out.println("Please enter the target sum value : ");
        int target = scan.nextInt();
        int m = 0;
        System.out.println("The resulting pairs of elements equalling to the target " + target + " is : ");
        for (int i = 0; i < inputArray.length; i++) {
            if (i != m||(m==0)) {
                for (int j = i + 1; j < inputArray.length; j++) {
                    if (inputArray[i] + inputArray[j] == target) {
                        System.out.print("(" + inputArray[i] + "," + inputArray[j] + ")");
                        m = j;
                        break;
                    }
                }
            } else {
                continue;
            }
        }
    }
}