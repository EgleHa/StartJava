package com.company;
import java.util.Scanner;

public class BMIaverage {
    public static void main(String[] args) {
        //calculate the average of 5 persons' BMI
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the weight of 1st person (kg): ");
        float weight1 = scanner.nextFloat();
        System.out.println("Enter the height of 1st person (m): ");
        float height1 = scanner.nextFloat();
        System.out.println("Enter the weight of 2nd person (kg): ");
        float weight2 = scanner.nextFloat();
        System.out.println("Enter the height of 2nd person (m): ");
        float height2 = scanner.nextFloat();
        System.out.println("Enter the weight of 3rd person (kg): ");
        float weight3 = scanner.nextFloat();
        System.out.println("Enter the height of 3rd person (m): ");
        float height3 = scanner.nextFloat();
        System.out.println("Enter the weight of 4th person (kg): ");
        float weight4 = scanner.nextFloat();
        System.out.println("Enter the height of 4th person (m): ");
        float height4 = scanner.nextFloat();
        System.out.println("Enter the weight of 5th person (kg): ");
        float weight5 = scanner.nextFloat();
        System.out.println("Enter the height of 5th person (m): ");
        float height5 = scanner.nextFloat();
        float [] weights = {weight1,weight2,weight3,weight4,weight5};
        float [] heights = {height1,height2,height3,height4,height5};
        float [] bmi = new float[5];
        float sumBMI = 0;
        for (int i = 0; i < 5; i++) {
            bmi [i] = weights [i]/(heights[i]*heights[i]);
            sumBMI += bmi[i];
        }
        System.out.println("The average of 5 persons' BMIs' is: " + sumBMI/5);

    }
}
