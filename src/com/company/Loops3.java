package com.company;

public class Loops3 {
    public static void main(String[] args) {
        for (int value = 1; value < 51; value++) {
            if (value % 3 == 0 && value % 7 == 0){
                System.out.println("FizzBuzz");
            }
            else if (value % 3 == 0){
                System.out.println("Fizz");
            }
            else if (value % 7 == 0){
                System.out.println("Buzz");
            }
            else {
                System.out.println(value);
            }
        }
    }
}
