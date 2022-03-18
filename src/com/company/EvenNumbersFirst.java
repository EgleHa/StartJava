package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class EvenNumbersFirst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers would you like to enter?");
        int [] numbers = new int[scanner.nextInt()];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number");
            numbers [i] = scanner.nextInt();
        }
        int [] set = new int[numbers.length];
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers [i] % 2 == 0) {
                counter++;
                set[counter - 1] = numbers[i];
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers [i] % 2 != 0){
                counter++;
                set[counter - 1] = numbers[i];
            }
        }
        System.out.println("The set of even first, odd after, is: " + Arrays.toString(set));

    }
}
