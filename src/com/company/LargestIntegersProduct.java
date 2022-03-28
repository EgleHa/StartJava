package com.company;

import java.util.Arrays;

public class LargestIntegersProduct {
    public static void main(String[] args) {
        int [] numbers = {2, 3, 5, 7, -7, 5, 8, -5};
        Arrays.sort(numbers);
        System.out.println("The product of the highest two numbers is: " + (numbers [numbers.length-1]*numbers [numbers.length-2]));

    }
}
