package com.daft.exercise;
import java.util.Scanner;
public class CH_2_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double savingAmount;
        double resultAmount = 0;
        System.out.print("Enter the monthly saving amount: ");
        savingAmount = input.nextDouble();
        int i = 0;
        while(i <= 5) {
            resultAmount = (savingAmount + resultAmount ) * ( 1 + 0.00417 );
            i++;
        }
        System.out.println("After the sixth month, the account value is " + resultAmount);
    }
}