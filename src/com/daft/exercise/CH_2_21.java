package com.daft.exercise;
import java.util.Scanner;
public class CH_2_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double amount, interestRate, years, value;
        System.out.print("Enter investment amount: ");
        amount = input.nextDouble();
        System.out.print("Enter annual interest rate in percentage: ");
        interestRate = input.nextDouble();
        System.out.print("Enter number of years: ");
        years = input.nextDouble();
        value = amount * Math.pow(1+interestRate/1200,years*12);
        System.out.println("Future value is $" + value);
    }
}
