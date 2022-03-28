package com.company;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base of triangle: ");
        long base = scanner.nextLong();
        System.out.println("Enter the height of triangle: ");
        long height = scanner.nextLong();
        System.out.println("The area of triangle is: " + Math.multiplyExact(base, height)/2);
    }
}
