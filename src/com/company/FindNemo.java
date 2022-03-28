package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class FindNemo {
    public static void main(String[] args) {
        //You're given a string of words from the user. You need to find the word "Nemo", and return a string like this:
        // "I found Nemo at [the order of the word you find Nemo]!".
        //If you can't find Nemo, return "I can't find Nemo :("
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence about a fish: ");
        String wordPhrase = scanner.nextLine();
        //break the string into words
        String[] wordArray = wordPhrase.split(" ");
        //loop through and find the position of word Nemo
        for (int i = 0; i < wordArray.length; i++) {
            if (wordArray[i].equalsIgnoreCase("Nemo")){
                System.out.println("I found Nemo at word number " + (i+1)+ "!");
                break;
            }
            if (i == wordArray.length - 1 && wordArray[i].equalsIgnoreCase("Nemo")) {
                System.out.println("Could not find Nemo :(");
            }
            }
        }
}
