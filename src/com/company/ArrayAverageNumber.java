package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayAverageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter for how many numbers would you like to find an average: ");
        int quantifier = scanner.nextInt();
        int [] numbers = new int[quantifier];
        for (int i = 0; i < quantifier; i++) {
            System.out.println("Enter " + (i+1) +" number:");
            numbers[i] = scanner.nextInt();
        }
        float sum = 0;
        for (int i = 0; i < quantifier; i++) {
            sum += numbers[i];
        }
        System.out.println("average of variable is: " + (sum / quantifier));

    }
}
