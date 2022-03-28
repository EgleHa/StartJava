package com.company;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DaysDifferenceBtwDates {
    public static void main(String[] args) {
        //Write a Java program to calculate the difference between two dates in days.
        LocalDate userDate1 = LocalDate.of(2022, 1, 3);
        LocalDate userDate2 = LocalDate.of(2022, 3, 22);
        long numberOfDaysBetween = Math.abs(ChronoUnit.DAYS.between(userDate1, userDate2));
        System.out.println("the difference btw them in days is: " + numberOfDaysBetween);
    }
}
