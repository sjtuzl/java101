package com.daft.exercise;
import java.util.Scanner;
//repeat subtractions
public class CH_5_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int NUMBER_OF_QUESTIONS = 10;
        int count = 0;
        int correctCount = 0;
        boolean rightOrWrong;
        String output = " ";

        long startTime = System.currentTimeMillis();

        while (count < NUMBER_OF_QUESTIONS) {
            int number1 = (int) (Math.random() * 15);
            int number2 = (int) (Math.random() * 15);
            if (number1 < number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }

            System.out.print("What is " + number1 + " - " + number2 + "? ");
            int answer = input.nextInt();

            if (answer == (number1 - number2)) {
                System.out.println("You are correct!");
                correctCount++;
                rightOrWrong = true;
            } else {
                System.out.println("Your answer is wrong.");
                System.out.println(number1 + " - " + number2 + " should be " + (number1 - number2));
                rightOrWrong = false;
            }

            count++;

            if (rightOrWrong) {
                output += "\n" + number1 + "-" + number2 + "=" + answer + " correct";
            } else {
                output += "\n" + number1 + "-" + number2 + "=" + answer + " wrong";
            }
        }

        long finishTime = System.currentTimeMillis();
        long testTime = (finishTime - startTime) / 1000;

        System.out.println("\n" + "Correct count is " + correctCount);
        System.out.println("Test time is " + (int)(testTime) + " seconds");
        System.out.println(output);
    }
}
