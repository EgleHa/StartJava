package com.company;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter variable A: ");
        double a = scanner.nextFloat();
        System.out.println("Enter variable B: ");
        double b = scanner.nextFloat();
        System.out.println("Enter variable C: ");
        double c = scanner.nextFloat();

        double x1= (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
        double x2= (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
        System.out.println("X1: " +x1);
        System.out.println("X2: " +x2);

    }
}
