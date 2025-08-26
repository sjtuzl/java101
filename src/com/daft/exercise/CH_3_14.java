package com.daft.exercise;
import java.util.Scanner;
//game: guess the side of the coin
public class CH_3_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 0 or 1, representing the two sides of a coin: ");
        int user = input.nextInt();
        int random, answer;
        random = (int)(Math.random() * 10);
        if (random <= 5) {
            answer = 0;
        }
        else {
            answer = 1;
        }
        if (user == answer) {
            System.out.println("You guessed it right, the answer is " + answer);
        }
        else {
            System.out.println("You're wrong, the answer is " + answer);
        }
    }
}
