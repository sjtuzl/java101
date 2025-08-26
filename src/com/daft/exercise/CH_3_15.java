package com.daft.exercise;
import java.util.Scanner;
//the lottery
public class CH_3_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a three-digit integer: ");
        int userInteger = input.nextInt();
        int calcInteger = userInteger;
        int userNumber3 = calcInteger % 10;
        calcInteger = calcInteger / 10;
        int userNumber2 = calcInteger % 10;
        int userNumber1 = calcInteger / 10;
        int compNumber1 = (int)(Math.random() * 9);
        int compNumber2 = (int)(Math.random() * 9);
        int compNumber3 = (int)(Math.random() * 9);
        if (compNumber1 == 0) {
            compNumber1 = compNumber1 + 1;
        }
        int compInteger = compNumber1*100 + compNumber2*10 + compNumber3;
        if (userInteger == compInteger) { //numbers are exactly the same
            System.out.println("Your number is exactly the same as ours! Your prize is $10000");
            System.exit(1);
        } else if (userNumber1 == compNumber1) { //digits are the same: user first number and computer first number are the same
            if (userNumber2 == compNumber3 && userNumber3 == compNumber2) { //digits are correct
                System.out.println("Your number has the same digits as ours! Our number is " + compInteger +". Your prize is $3000");
                System.exit(1);
            }
            else { //only one digit is the same
                System.out.println("Your number has at least one digit the same as ours! Our number is " + compInteger+". Your prize is $1000");
                System.exit(1);
            }
        } else if (userNumber1 == compNumber2) { //digits are the same: user first number and computer second number are the same
            if (userNumber2 == compNumber1) {
                if (userNumber3 == compNumber3) {
                    System.out.println("Your number has the same digits as ours! Our number is " + compInteger +". Your prize is $3000");
                    System.exit(1);
                }
            } else if (userNumber2 == compNumber3) {
                if (userNumber3 == compNumber1) {
                    System.out.println("Your number has the same digits as ours! Our number is " + compInteger +". Your prize is $3000");
                    System.exit(1);
                }
            }
        } else if (userNumber1 == compNumber3) { //digits are the same: user first number and computer third number are the same
            if (userNumber2 == compNumber2) {
                if (userNumber3 == compNumber1) {
                    System.out.println("Your number has the same digits as ours! Our number is " + compInteger +". Your prize is $3000");
                    System.exit(1);
                }
            } else if (userNumber2 == compNumber1) {
                if (userNumber3 == compNumber2) {
                    System.out.println("Your number has the same digits as ours! Our number is " + compInteger +". Your prize is $3000");
                    System.exit(1);
                }
            }
        } else if ((userNumber2 == compNumber2) || (userNumber3 == compNumber3)) { // only one digit is the same
            System.out.println("Your number has at least one digit the same as ours! Our number is " + compInteger+". Your prize is $1000");
            System.exit(1);
        }
        else { //no prize
            System.out.println("Sorry, but you didn't win any prize. Our number is "+ compInteger);
            System.exit(1);
        }
        System.out.println("Sorry, but you didn't win any prize. Our number is "+ compInteger);
    }
}
