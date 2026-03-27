package com.daft.exercise;
import java.util.Scanner;
//hex to binary
public class CH_4_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex digit: ");
        String hexDigit = input.next();
        if (hexDigit.length() == 1) {
            char digit = hexDigit.charAt(0);
            int dexValue;
            if (digit <= 'F' && digit >= 'A') {
                dexValue = digit - 'A' + 10;
                String binary = Integer.toBinaryString(dexValue);
                System.out.println("The binary value is " + binary);
            } else if (digit == 1 || digit == 2 || digit ==3 || digit ==4 || digit ==5 || digit ==6 || digit ==7 || digit ==8 || digit == 9 || digit ==0){
                dexValue = digit;
                String binary = Integer.toBinaryString(dexValue);
                System.out.println("The binary value is " + binary);
            } else {
                System.out.println(hexDigit + " is an invalid input");
            }
        } else {
            System.out.println("You must exactly enter one character");
        }
    }
}
