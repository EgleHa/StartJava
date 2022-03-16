package com.company;

public class VowelsInAWord {
    public static void main(String[] args) {
        String myString = "Physician";
        int counter = 0;
        for (int i = 0; i < myString.length(); i++) {
            System.out.println(myString.toLowerCase().charAt(i));
            if (('a' == myString.charAt(i)) || ('e' == myString.charAt(i)) || ('i' == myString.charAt(i)) || ('o' == myString.charAt(i)) || ('u' == myString.charAt(i)) || ('y' == myString.charAt(i))) {
                counter++;
            }

        }
        System.out.println("the number of vowels is:" + (counter));
    }
}
