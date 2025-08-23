package com.daft.exercise;
import java.util.Scanner;
//quiz: adding two numbers together
public class CH_3_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = (int)(Math.random() * 100);
        int number2 = (int)(Math.random() * 100);
        System.out.print("What is " + number1 + " + " + number2 + "? ");
        int answer = input.nextInt();
        int standardAns = number1 + number2;
        if(answer == standardAns) {
            System.out.println("You are correct!");
        }
        else {
            System.out.println("You are wrong. The correct answer is "+ standardAns);
        }
    }
}
