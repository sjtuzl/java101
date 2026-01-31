package com.daft.exercise;
import java.util.Scanner;
//vowel or consonant
public class CH_4_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String inputLetter = input.next();
        if (inputLetter.length() == 1) {
            char letter = inputLetter.charAt(0);
            if ((letter >= 65 && letter <= 90) || (letter >= 97 && letter <= 122)) {
                if (letter == 'a' || letter == 'e' || letter == 'o' || letter == 'i' || letter == 'u' || letter == 'A' || letter == 'E' || letter == 'O'|| letter == 'I' || letter == 'U'){
                    System.out.println(inputLetter + " is a vowel");
                } else {
                    System.out.println(inputLetter + " is a consonant");
                }
            } else {
                System.out.println(inputLetter + " is an invalid input");
            }
        } else {
            System.out.println("You must exactly enter one letter");
        }
    }
}
