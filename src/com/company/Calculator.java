package com.company;

public class Calculator {
    public static void main(String[] args) {
        char operator = '/';
        float number1 = 14;
        float number2 = 3;
        if (operator == '+') {
            System.out.println("The result is: " + (number1 + number2));
        } else if (operator == '-') {
            System.out.println("The result is: " + (number1 - number2));
        } else if (operator == '*') {
            System.out.println("The result is: " + (number1 * number2));
        } else if (operator == '/') {
            System.out.println("The result is: " + (number1 / number2));
        } else {
            System.out.println("Wrong operation");
        }

    }
}
