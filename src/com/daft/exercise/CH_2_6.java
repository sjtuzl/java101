package com.daft.exercise;

import java.util.Scanner;
public class CH_2_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, onesPlace, tensPlace, hundredsPlace, sum;
        System.out.print("Enter a number between 0 and 1000: ");
        number = input.nextInt();
        onesPlace = number % 10;
        number /= 10;
        tensPlace = number % 10;
        number /= 10;
        hundredsPlace = number;
        sum = onesPlace + tensPlace + hundredsPlace;
        System.out.println("The sum of the digits is " + sum);
    }
}
