package com.ArraysExample;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Task4Question11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the size of the input array : ");
        int n = scan.nextInt();
        Integer[] inputArray = new Integer[n];
        System.out.println("Please enter the elements for the input array : ");
        for (int i = 0; i < n; i++) {
            inputArray[i] = scan.nextInt();
        }
        int[] outputArray = new int[inputArray.length];
        Arrays.sort(inputArray, Collections.reverseOrder());
        int count = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (i % 2 == 0) {
                outputArray[i] = inputArray[count];
                count++;
            }
        }
        Arrays.sort(inputArray);
        count = 0;
        for (int j = 0; j < inputArray.length; j++) {
            if (j % 2 != 0) {
                outputArray[j] = inputArray[count];
                count++;
            }
        }
        System.out.println("The resulting sorted array : ");
        Arrays.stream(outputArray).forEach(e-> System.out.print(e+"\t"));
    }
}
