package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers would you like to compare?");
        int quantifier = scanner.nextInt();
        int [] numbers = new int[quantifier];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter your number " + (i + 1) + ":");
            numbers [i] = scanner.nextInt();
        }
        int largestNo = numbers [0];

        for (int i = 0; i < quantifier - 1; i++) {
            if (largestNo > numbers [i + 1]) {
                largestNo = largestNo;
            } else {
                largestNo = numbers [i + 1];
            }
        }
        System.out.println("The largest number is: " + largestNo);
    }
}
