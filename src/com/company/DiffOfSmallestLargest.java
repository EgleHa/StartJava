package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class DiffOfSmallestLargest {
    public static void main(String[] args) {
        // Create a program that takes an array and returns the difference between the biggest and smallest numbers.
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers would you like to enter?");
        int [] numbers = new int[scanner.nextInt()];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number");
            numbers [i] = scanner.nextInt();
        }
        Arrays.sort(numbers);
        System.out.println("The difference between largest and smallest number is: " + numbers[numbers.length-1] + " - " + numbers[0]+ " = " + (numbers[numbers.length-1]-numbers[0]));
    }
}
