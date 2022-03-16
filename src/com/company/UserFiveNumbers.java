package com.company;

import java.util.Scanner;

public class UserFiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number : ");
        String firstNumber = scanner.next();
        System.out.print("Enter second number : ");
        String secondNumber = scanner.next();
        System.out.print("Enter third number : ");
        String thirdNumber = scanner.next();
        System.out.print("Enter fourt number : ");
        String fourthNumber = scanner.next();
        System.out.print("Enter fifth number : ");
        String fifthNumber = scanner.next();
        float number1 = Integer.parseInt(firstNumber);
        float number2 = Integer.parseInt(secondNumber);
        float number3 = Integer.parseInt(thirdNumber);
        float number4 = Integer.parseInt(fourthNumber);
        float number5 = Integer.parseInt(fifthNumber);
        System.out.println("The result of ((1st+2nd)*(3rd-4th)) divided by 5th is: " + ((number1+number2)*(number3-number4))/number5);
    }
}
