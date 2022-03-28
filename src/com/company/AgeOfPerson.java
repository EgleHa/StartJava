package com.company;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.Scanner;

public class AgeOfPerson {
    public static void main(String[] args) {
        //write a program to calculate the age of person if he enters the date of birth
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your date of birth YYYY.MM.DD: ");
        String inputDateBirth = scanner.nextLine();
       // int year = Integer.parseInt(inputDateBirth.split("."[0]));
        LocalDate today = LocalDate.now();
        //LocalDate dateOfBirth = LocalDate.of(year, 12, 3);
       // Period age = Period.between(dateOfBirth, today);
       // System.out.println("Your age is: " + age.getYears());
    }
}
