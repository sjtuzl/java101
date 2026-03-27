package com.daft.exercise;
import java.util.Scanner;
//check SSN
public class CH_4_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a SSN: ");
        String stringSSN = input.next();
        boolean validity;
        if (stringSSN.charAt(3) == '-' && stringSSN.charAt(6) == '-') {
            validity = Character.isDigit(stringSSN.charAt(0)) && Character.isDigit(stringSSN.charAt(1)) && Character.isDigit(stringSSN.charAt(2)) && Character.isDigit(stringSSN.charAt(4)) && Character.isDigit(stringSSN.charAt(5)) && Character.isDigit(stringSSN.charAt(7)) && Character.isDigit(stringSSN.charAt(8)) && Character.isDigit(stringSSN.charAt(9)) && Character.isDigit(stringSSN.charAt(10));
        } else validity = false;
        if (validity) {
            System.out.println(stringSSN + " is a valid social security number");
        } else System.out.println(stringSSN + " is an invalid social security number");
    }
}
