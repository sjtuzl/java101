package com.daft.exercise;
import java.util.Scanner;
public class CH_2_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount in int, for example $11.56 is 1156: ");
        int amount = input.nextInt();
        int numberOfOneDollars = amount / 100;
        amount = amount % 100;
        int numberOfQuarters = amount / 25;
        amount = amount % 25;
        int numberOfDimes = amount / 10;
        amount = amount % 10;
        int numberOfNickles = amount / 5;
        amount = amount % 5;
        int numberOfPennies = amount;
        double amountInDoubles = amount /100;
        System.out.println("Your amount $" + amountInDoubles + " consists of");
        System.out.println("  " + numberOfOneDollars + " dollars");
        System.out.println("  " + numberOfQuarters + " quarters");
        System.out.println("  " + numberOfDimes + " dimes");
        System.out.println("  " + numberOfNickles + " nickles");
        System.out.println("  " + numberOfPennies + " pennies");
    }
}
