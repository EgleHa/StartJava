package com.company;

import java.util.Scanner;

public class CalculatorWithSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        String number1 = scanner.next();
        System.out.println("Please +/-/* or /: ");
        String operator = scanner.next();
        System.out.println("Please enter a number: ");
        String number2 = scanner.next();
        int numberOne = Integer.parseInt(number1);
        int numberTwo = Integer.parseInt(number2);
        switch (operator) {
            case "+":
                System.out.println("The result is: " + (numberOne + numberTwo));
                break;
            case "-":
                System.out.println("The result is: " + (numberOne - numberTwo));
                break;
            case "*":
                System.out.println("The result is: " + (numberOne * numberTwo));
                break;

        }
    }


}
