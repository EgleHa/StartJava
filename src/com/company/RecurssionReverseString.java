package com.company;

import java.util.Scanner;

public class RecurssionReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print ("Enter the a word: ");
        String word = scanner.next();
        System.out.println(reverseWord(word));
    }
    public static String reverseWord (String word) {

        return reverseWord(word.substring(word.length()-1),word.length()) + 1;
    }
}
