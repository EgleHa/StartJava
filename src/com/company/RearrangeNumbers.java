package com.company;

import java.util.Arrays;

public class RearrangeNumbers {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 9, 10, 7, 2, 1};
        System.out.println(numbers);
        Arrays.sort(numbers);
        System.out.println(numbers);
        int [] newSet = new int[7];

        numbers [2] = newSet [1];
        numbers [4] = newSet [3];
        numbers [6] = newSet [5];
        System.out.println(Arrays.toString(newSet));

    }
}
