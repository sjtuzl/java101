package com.daft.exercise;
import java.util.Scanner;
//find the Unicode of a character
public class CH_4_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char character = input.next().charAt(0);
        System.out.println("The Unicode for the character " + character + " is "+ (int) character);
    }
}
