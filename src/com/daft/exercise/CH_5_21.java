package com.daft.exercise;
import java.util.Scanner;
//financial application: compare loans with various interest rates
public class CH_5_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        double loanAmount = input.nextDouble();
        System.out.print("Number of Years: ");
        int years = input.nextInt();
        int totalMonths = years * 12;
        System.out.println("Interest Rate   Monthly Payment   Total Payment");
        double rate = 5;
        double monthlyPayment;
        double totalPayment;
        while (rate <= 8) {
            monthlyPayment = ((loanAmount * rate / 1200) / (1 - 1 / Math.pow(1 + (rate / 1200), totalMonths)));
            totalPayment = monthlyPayment * totalMonths;
            String roundedRate = String.format("%.3f", rate);
            String roundedMonthly = String.format("%.2f", monthlyPayment);
            String roundedTotal = String.format("%.2f", totalPayment);
            System.out.println(roundedRate + "%          " + roundedMonthly + "            " + roundedTotal);
            rate += 0.125;
        }
    }
}
