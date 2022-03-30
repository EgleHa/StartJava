package com.company;

import java.util.Scanner;

public class MethodIsNumberPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();

        System.out.println("the number is " + (isPrime(number) ? "prime number" : "not a prime number"));

    }
    public static boolean isPrime(int i){
            if (((i % 2) > 0) && ((i % 3) > 0) && ((i % 5) > 0) && ((i % 7) > 0)) return true;
            else if ((i == 2) || (i == 3) || (i == 5) || (i == 7)) return true;
            else return false;

    }
}
