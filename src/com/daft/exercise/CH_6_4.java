package com.daft.exercise;
//Display an integer reversed
import java.util.Scanner;

public class CH_6_4 {

    public static void reverse(int number) {
        String reverseNumber = "";
        while (number > 0) {
            reverseNumber += (number % 10);
            number /= 10;
        }
        int result = Integer.parseInt(reverseNumber);
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        reverse(number);
    }

}
