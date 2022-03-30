package com.company;

import java.util.Scanner;

public class MethodCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a bigger number: ");
        double bigNumber = scanner.nextDouble();
        System.out.println("Please +/-/* or /: ");
        String operator = scanner.next();
        System.out.println("Please enter a smaller number: ");
        double smallNumber = scanner.nextDouble();

        System.out.println("the result is: " + result(bigNumber, smallNumber, operator));
    }
    public static double result(double numberOne, double numberTwo, String operator1) {
        switch (operator1) {
            case "+":
                return numberOne + numberTwo;
            case "-":
                return numberOne - numberTwo;
            case "*":
                return numberOne * numberTwo;
            case "/":
                return numberOne / numberTwo;
            default:
                System.out.println("invalid operation");
                return 0;
        }
    }
}
