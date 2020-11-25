package com.ArraysExample;

import java.util.Arrays;
import java.util.Scanner;

public class Task4Question2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner((System.in));
        System.out.println("Please enter the size of the input array :");
        int n = scan.nextInt();
        int[] inputArray = new int[n];
        int[] outputArray = new int[n];
        System.out.println("Please enter the elements of the input array :");
        for (int i = 0; i < n; i++) {
            inputArray[i] = scan.nextInt();
        }
        int m=inputArray[0];
        for(int i=1; i<n; i++)
        {
            int count = 1;
            if(m==inputArray[i])
            {
                count++;
            }
            m =inputArray[i];
            if(count==1)
            {
                outputArray[i]=m;
            }
        }
        Arrays.sort(outputArray);
        System.out.println("The second largest number in the array is "+(outputArray[outputArray.length-2]));
    }

}
