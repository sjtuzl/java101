package com.daft.exercise;
import java.util.Scanner;
public class CH_2_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double distance, mpg, ppg;
        System.out.print("Enter the driving distance: ");
        distance = input.nextDouble();
        System.out.print("Enter miles per gallon: ");
        mpg = input.nextDouble();
        System.out.print("Enter price per gallon: ");
        ppg = input.nextDouble();
        double cost;
        cost = distance / mpg * ppg;
        System.out.println("The cost of driving is $" + cost);
    }
}
