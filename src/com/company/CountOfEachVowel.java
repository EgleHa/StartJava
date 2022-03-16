package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class CountOfEachVowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word or a phrase:");
        String wordPhrase = scanner.nextLine();
        int counterA = 0;
        int counterE = 0;
        int counterI = 0;
        int counterO = 0;
        int counterU = 0;
        for (int i = 0; i < wordPhrase.length(); i++) {
            char currentLetter = wordPhrase.toLowerCase().charAt(i);
            switch (currentLetter) {
                case 'a':
                    counterA++;
                    break;
                case 'e':
                    counterE++;
                    break;
                case 'i':
                    counterI++;
                    break;
                case 'o':
                    counterO++;
                    break;
                case 'u':
                    counterU++;
                    break;
                default:
                    break;
            }
        }
        int [] set = new int[5];
        set[1] = counterA;
        set[2] = counterE;
        set[3] = counterI;
        set[4] = counterO;
        set[5] = counterU;
        System.out.println(Arrays.toString(set));
    }
}
