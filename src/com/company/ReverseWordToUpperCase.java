package com.company;

import java.util.Scanner;

public class ReverseWordToUpperCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print ("Enter the a word: ");
        String word = scanner.next();
        String reversedWord = "";
        for (int i = word.length()-1; i > -1 ; i--) {
            reversedWord += word.charAt(i);
        }
        System.out.println("Reversed order in CAPITALS is: " + reversedWord.toUpperCase());
    }
}
