package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class MethodHighestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers would you like to compare?");
        int quantity = scanner.nextInt();
        int[] inumbers = new int[quantity];
        for (int i = 0; i < inumbers.length; i++) {
            System.out.println("Enter your number " + (i + 1) + ":");
            inumbers[i] = scanner.nextInt();
        }
        System.out.println("the highest number is: " + checkMaximum(inumbers));
    }

    public static int checkMaximum(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }

}
