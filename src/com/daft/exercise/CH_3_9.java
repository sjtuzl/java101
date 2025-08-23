package com.daft.exercise;
import java.util.Scanner;
//calculating ISBN-10
public class CH_3_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as number: ");
        int number = input.nextInt();
        int calcNumber = number;
        int result, d;
        int calcResult = 0;
        for (int i = 9; i >=1 ; i--) {
            d = calcNumber % 10;
            calcNumber = calcNumber / 10;
            calcResult = calcResult + d * i;
        }
        result = calcResult % 11;
        if (result == 10) {
            System.out.println("The ISBN-10 number is 0" + number + "X");
        }
        else {
            System.out.println("The ISBN-10 number is 0" + number + result);
        }
    }
}
