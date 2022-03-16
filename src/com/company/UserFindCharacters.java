package com.company;

import java.util.Scanner;

public class UserFindCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the a word or a phrase: ");
        String word = scanner.next();
        String responseString = "";
        String errorString = "";
        for (int i = 0; i < word.length(); i++) {
            char checkLetter = word.toLowerCase().charAt(i);
            switch (checkLetter) {
                case 'u':
                case 'w':
                case '6':
                case 'i':
                case 'b':
                case 'q':
                    responseString = "The character " + checkLetter + " is contained in the string " + word;
                    break;
                default:
                    errorString = "No accepted charachters were found";
                    break;
            }
        }
        if (responseString.isEmpty()) {
            System.out.println((errorString));
        } else {
            System.out.println(responseString);

        }
    }

}

