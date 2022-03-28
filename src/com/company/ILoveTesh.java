package com.company;

import java.util.Arrays;

public class ILoveTesh {
    public static void main(String[] args) {
        //Create a program that takes an array of Strings (You can intialize the variable without user input)
        // and checks if the last item matches the rest of the array concatenated together.
        // For example,  ["i", "love", "tesh", "ilovetesh"] will return true
        String[] stringArr = {"i", "love", "tesh", "ilovetesh"};
        String appender = "";
        for (int i = 0; i < stringArr.length - 1; i++) {
            appender += stringArr[i];
        }
        //Ternary operator is conditional that can be used to decide execution
        //flow on the fly
                                            //condition                        //true   //false
       // System.out.println(appender.equals(stringArr[stringArr.length-1])) ? "match" : "don't match";


    }
}
