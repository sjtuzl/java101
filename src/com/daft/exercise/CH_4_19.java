package com.daft.exercise;
import java.util.Scanner;
//business: check ISBN-10 (String version)
public class CH_4_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        String inputISBN = input.next();
        char twoISBN = inputISBN.charAt(1);
        char threeISBN = inputISBN.charAt(2);
        char fourISBN = inputISBN.charAt(3);
        char fiveISBN = inputISBN.charAt(4);
        char sixISBN = inputISBN.charAt(5);
        char sevenISBN = inputISBN.charAt(6);
        char eightISBN = inputISBN.charAt(7);
        char nineISBN = inputISBN.charAt(8);
        int result = ((int) twoISBN * 2 + (int) threeISBN * 3 + (int) fourISBN * 4 + (int) fiveISBN * 5 + (int) sixISBN * 6 + (int) sevenISBN * 7 + (int) eightISBN * 8 + (int) nineISBN * 9) % 11;
        if (result == 10) {
            System.out.println("The ISBN-10 number is " + inputISBN + "X");
        }
        else {
            System.out.println("The ISBN-10 number is " + inputISBN + result);
        }
    }
}
