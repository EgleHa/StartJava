package com.company;

import java.util.Scanner;

public class StringLengthComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print ("Enter the first word: ");

        String wordOne = scanner.next();

        System.out.print ("Enter the second word: ");

        String wordTwo = scanner.next();

        if (wordOne.equals (wordTwo)) {
            System.out.println("They are equal!");
        } else {
            System.out.println("They are not equal!");
        }
    }
}
