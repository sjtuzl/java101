package com.daft.exercise;
//Math: pentagonal numbers
import java.util.Scanner;

public class CH_6_2 {

    public static int sumDigits(long n) {
        int sum = 0;
        int permanentSum = (int) n;
        for (int count = 1; count < permanentSum; count++) {
            sum += (int) (n % 10);
            if (n < 10) {
                break;
            } else {
                n = n / 10;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        long number = input.nextLong();
        System.out.println("The sum is " + sumDigits(number));
    }

}
