package com.daft.exercise;
import java.util.Scanner;
//shipping cost
public class CH_3_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the weight of the package in pounds: ");
        double weight = input.nextDouble();
        if (weight <= 0) {
            System.out.println("Invalid input");
        } else if (weight <= 1) {
            System.out.println("The price is $3.5");
        } else if (weight <= 3) {
            System.out.println("The price is $5.5");
        } else if (weight <= 10) {
            System.out.println("The price is $8.5");
        } else if (weight <= 20) {
            System.out.println("The price is $10.5");
        } else {
            System.out.println("The package cannot be shipped");
        }
    }
}
