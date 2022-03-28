package com.company;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class NumberOfDaysBtwYears {
    public static void main(String[] args) {
        //write a program to calculate number of days between two years (beginning of the year is the input)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the start year: ");
        int userYear1 = scanner.nextInt();
        System.out.println("Enter the end year: ");
        int userYear2 = scanner.nextInt();
        LocalDate year1 = LocalDate.of(userYear1, 1,1);
        LocalDate year2 = LocalDate.of(userYear2, 1,1);
        long numberOfDays = Math.abs(ChronoUnit.DAYS.between(year1, year2));
        System.out.println("The number of days in between is: " + numberOfDays);

    }
}
