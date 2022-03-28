package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class MagicDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year YYYY: ");
        String year = scanner.next();
        System.out.println("Enter a month: ");
        int month = scanner.nextInt();
        System.out.println("Enter a day: ");
        int day = scanner.nextInt();
        int [] yearDigits = new int[4];
        for (int i = 0; i < 4; i++) {
            yearDigits [i] =  Integer.parseInt(year.charAt(i));
        }
        System.out.println(Arrays.toString(yearDigits));
        if ((month * day) == yearDigits [3]) {
            System.out.println("it is a magic date");
        } else if (month * day == (yearDigits[2]*10 + yearDigits [3])) {
            System.out.println("it is a magic date");
        } else if (month * day == (yearDigits[1]*100 + yearDigits[2]*10 + yearDigits[3])){
            System.out.println("it is a magic date");
        } else {
            System.out.println("it is not a magic date :(");
        }
    }
}
