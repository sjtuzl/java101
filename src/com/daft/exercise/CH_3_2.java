package com.daft.exercise;
import java.util.Scanner;
//game: adding three numbers together
public class CH_3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);
        int number3 = (int)(Math.random() * 10);
        System.out.print("What is " + number1 + " + " + number2 + " + " + number3 +"? ");
        int answer = input.nextInt();
        int standardAns = number1 + number2 + number3;
        if(answer == standardAns) {
            System.out.println("You are correct!");
        }
        else {
            System.out.println("You are wrong. The correct answer is "+ standardAns);
        }
    }
}
