package com.charlie.exercise;
import java.util.Scanner;
public class CH_2_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pounds, inches, meters, kilos, bmi;
        System.out.print("Enter weight in pounds: ");
        pounds = input.nextDouble();
        System.out.print("Enter height in inches: ");
        inches = input.nextDouble();
        meters = inches * 0.0254;
        kilos = pounds * 0.45359237;
        bmi = kilos / meters / meters;
        System.out.println("BMI is " + bmi);
    }
}
