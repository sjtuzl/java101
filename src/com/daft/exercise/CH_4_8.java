package com.daft.exercise;
import java.util.Scanner;
//find the character of an ASCII code
public class CH_4_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an ASCII code: ");
        int user = input.nextInt();
        char number = (char) user;
        System.out.println("The character for ASCII code " + user + " is " + number);
    }
}
