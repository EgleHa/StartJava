package com.company;
import java.time.LocalDate;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a year: ");
        int year = scanner.nextInt();
        //below input any day of year just to get the check,
        // as isLeapYear will only check the year
        Boolean isLeap = LocalDate.ofYearDay(year, 55).isLeapYear();

        if (isLeap == true) {
            System.out.println("The year is a leap year");
        }
        else {
            System.out.println("The year is NOT a leap year");
        }

    }
}
