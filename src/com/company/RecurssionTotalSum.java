package com.company;

import java.util.Scanner;

public class RecurssionTotalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();
        System.out.println("the total sum is: " + totalSum(number));
    }
    public static int totalSum (int num) {
        if (num == 1) {
            return 1;
        }
        return num + totalSum(num-1);
    }
}
