package com.company;

import java.util.Locale;
import java.util.Scanner;

public class UserNoOfVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word or a phrase: ");
        String wordPhrase = scanner.nextLine();
        int counter = 0;
        for (int i = 0; i < wordPhrase.length(); i++) {
            char currentLetter = wordPhrase.toLowerCase().charAt(i);
            if (('a' == currentLetter) || ('e' == currentLetter) || ('i' == currentLetter) || ('o' == currentLetter) || ('u' == currentLetter) || ('y' == currentLetter)) {
                counter++;

            }
        }
        System.out.println("The number of vowels in your phrase is:" + (counter));
    }
}

