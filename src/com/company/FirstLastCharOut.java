package com.company;

import java.util.Scanner;

public class FirstLastCharOut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print ("Enter the a word: ");
        String word = scanner.next();
        System.out.println("After removing first and last letter you get: " + word.substring(1, word.length()-1));

    }
}
