package com.company;

import java.time.LocalDate;
import java.time.Period;

public class YearMonthDifference {
    public static void main(String[] args) {
        //Write a Java program to get year and months between two dates.
        LocalDate today = LocalDate.now();
        LocalDate userDay = LocalDate.of(2020, 6, 23);
        Period difference = Period.between(userDay, today);
        System.out.println("The difference between " + userDay + " - " + ": " +
                difference.getYears() + " years " + " and " + difference.getMonths() + " months ");
    }
}
