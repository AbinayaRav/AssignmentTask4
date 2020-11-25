package com.ArraysExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task4Question1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner((System.in));
        System.out.println("Please enter the size of the input array :");
        int n = scan.nextInt();
        int[] inputArray = new int[n];
        System.out.println("Please enter the elements of the input array :");
        for (int i = 0; i < n; i++) {
            inputArray[i] = scan.nextInt();
        }
        Arrays.sort(inputArray);
        int m = inputArray[0];
        List<Integer> li = new ArrayList<>();
        li.add(m);
        for (int i = 1; i < inputArray.length; i++) {
            int count = 1;
            if (m == inputArray[i]) {
                count++;
            }
            m = inputArray[i];
            if (count == 1) {
                li.add(inputArray[i]);
            }

        }

        System.out.println("The resultant array without duplicates is : "+li);

    }
}
