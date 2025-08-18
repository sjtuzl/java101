package com.daft.exercise;
import java.util.Scanner;
public class CH_2_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double balance, interestRate, interest;
        System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
        balance = input.nextDouble();
        interestRate = input.nextDouble();
        interest = balance * interestRate / 1200;
        System.out.println("The interest is " + interest);
    }
}
