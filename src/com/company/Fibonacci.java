package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        //write a program to return the fibonacci sequence up to a specified lenght by the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many Fibonacci numbers do you want to display?: ");
        int number = scanner.nextInt();
        int [] fibonacciSet = new int[number];
        fibonacciSet [0] = 0;
        fibonacciSet [1] = 1;
        for (int i = 2; i < number; i++) {
            fibonacciSet[i] = (fibonacciSet[i - 1] + fibonacciSet[i - 2]);
        }
        System.out.println("The Fibonacci numbers are: " + Arrays.toString(fibonacciSet));
    }
}
