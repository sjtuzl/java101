package com.daft.exercise;
import java.util.Scanner;
//palindromes
public class CH_3_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a three-digit integer: ");
        int integer = input.nextInt();
        int number1, number3;
        number3 = integer % 10;
        number1 = integer / 100;
        if (number1 == number3) {
            System.out.println(integer + " is a palindrome");
        }
        else {
            System.out.println(integer + " is not a palindrome");
        }
    }
}
