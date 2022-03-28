package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class AreaRightAngledTriangle {
    public static void main(String[] args) {
        // Ask the user to enter the sides of a right-angled triangle, a,b,c.
        // Find the area of the triangle
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter side of right-angled triangle 'a': ");
        int a = scanner.nextInt();
        System.out.println("Please enter side of right-angled triangle 'b': ");
        int b = scanner.nextInt();
        System.out.println("Please enter side of right-angled triangle 'c': ");
        int c = scanner.nextInt();
        int[] sides = {a, b, c};
        Arrays.sort(sides);
        System.out.println("The area of this right-angled triangle is: " + ((sides[0] * sides[1]) / 2));
    }

}
