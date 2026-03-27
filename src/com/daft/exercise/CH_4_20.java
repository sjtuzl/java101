package com.daft.exercise;
import java.util.Scanner;
//process a string
public class CH_4_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = input.next();
        char firstCharacter = inputString.charAt(0);
        int length = inputString.length();
        System.out.println("Length: " + length);
        System.out.println("First character: " + firstCharacter);
    }
}
