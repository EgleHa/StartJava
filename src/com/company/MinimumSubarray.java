package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumSubarray {
    public static void main(String[] args) {
        //Write a Java program to find minimum subarray sum of specified size in a given array of integers Example:
        //Input :
        //nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9,10}
        //Output:
        //Sub-array size: 4
        //Sub-array from 0 to 3 and sum is: 10
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers do you want to enter?: ");
        int[] numbers = new int[scanner.nextInt()];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number: ");
            numbers[i] = scanner.nextInt();
        }
        Arrays.sort(numbers);
        //prompt the user to enter the minimum size of array to add up.
        System.out.println("Enter the minimum size to add: ");
        int minSize = scanner.nextInt();
        int sumMinsize = 0;
        for (int i = 0; i < minSize; i++) {
            sumMinsize += numbers[i];
        }
        System.out.println("The min size is: " + sumMinsize);


    }
}
