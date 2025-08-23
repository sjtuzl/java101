package com.daft.exercise;
import java.util.Scanner;
// improve 2_22 to show singular/plural form of dollar and penny
public class CH_3_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount in double, for example 11.56: ");
        double amount = input.nextDouble();
        int remainingAmount = (int)(amount*100);
        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;
        int numberOfPennies = remainingAmount;
        System.out.print("Your amount $" + amount + " consists of ");
        //judge whether to use singular or plural
        if (numberOfOneDollars > 1) {
            System.out.print(numberOfOneDollars + " dollars and ");
        }
        else {
            System.out.print(numberOfOneDollars + " dollar and ");
        }
        if (numberOfPennies > 1) {
            System.out.print(numberOfPennies + " pennies");
        }
        else {
            System.out.print(numberOfPennies + " penny");
        }
    }
}
