package com.daft.exercise;
//Palindrome integer
import java.util.Scanner;

public class CH_6_3 {

    public static int reverse(int number) {
        String reverseNumber = "";
        while (number > 0) {
            reverseNumber += (number % 10);
            number /= 10;
        }
        return Integer.parseInt(reverseNumber);
    }

    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        if (isPalindrome(number)) {
            System.out.println("This number is a palindrome");
        } else {
            System.out.println("This number is not a palindrome");
        }
    }

}
