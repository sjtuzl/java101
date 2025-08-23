package com.daft.exercise;
import java.util.Scanner;
//calculating BMI (user + feet and inches)
public class CH_3_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();
        System.out.print("Enter feet: ");
        double feet = input.nextDouble();
        System.out.print("Enter inches: ");
        double inches = input.nextDouble();
        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_FEET = 0.3048;
        final double METERS_PER_INCH = 0.0254;
        double weightInKilos, heightInMeters;
        weightInKilos = weight * KILOGRAMS_PER_POUND;
        heightInMeters = feet*METERS_PER_FEET + inches*METERS_PER_INCH;
        double bmi = weightInKilos / heightInMeters / heightInMeters;
        System.out.println("BMI is " + bmi);
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        }
        else {
            System.out.println("Obese");
        }
    }
}
