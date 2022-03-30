package com.company;

import java.util.Scanner;

public class MethodSimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an amount in EUR: ");
        int amount = scanner.nextInt();
        System.out.println("Please enter interest rate, in %: ");
        float interest = scanner.nextFloat();
        System.out.println("Please enter a number of years: ");
        int years = scanner.nextInt();

        System.out.println("the interest paid will be: " + simpleInterest(amount, interest, years));

    }
    public static float simpleInterest (int sum, float percentage, int time) {
        return sum*percentage*time/100;
    }
}

