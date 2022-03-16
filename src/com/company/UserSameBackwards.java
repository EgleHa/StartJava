package com.company;

import java.util.Scanner;

public class UserSameBackwards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the a word: ");
        String userInput = scanner.next();
        String reverseInput = "";
        for (int i = userInput.length() - 1; i > -1; i--) {
            reverseInput += userInput.charAt(i);
        }
        if (reverseInput.equalsIgnoreCase(userInput)) {
            System.out.println("The string " + userInput + " is the same as " + reverseInput + " therefore, a palindrome.");
        } else {
            System.out.println("The string " + userInput + " is not the same as " + reverseInput + " therefore, not a palindrome.");
        }
    }
}
