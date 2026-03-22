package com.daft.exercise;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        double loanAmount = input.nextDouble();
        System.out.print("Number of Years: ");
        int loanYears = input.nextInt();
        System.out.printf("%-15s%-20s%s%n", "Interest Rate", "Monthly Payment", "Total Payment");
        double currentRate = 5.0;
        final double RATE_STEP = 0.125;
        final double MAX_RATE = 8.0;
        while (currentRate <= MAX_RATE) {
            double monthlyRate = currentRate / 1200;
            int totalMonths = loanYears * 12;
            double monthlyPayment = (loanAmount * monthlyRate) / (1 - Math.pow(1 + monthlyRate, -totalMonths));
            double totalPayment = monthlyPayment * totalMonths;
            System.out.printf("%-15.3f%%%-20.2f%.2f%n",
                    currentRate, monthlyPayment, totalPayment);
            currentRate += RATE_STEP;
        }
    }
}
