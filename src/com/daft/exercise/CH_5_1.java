package com.daft.exercise;
import java.util.Scanner;
//count positive and negative numbers and compute the average of numbers
public class CH_5_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer, the input ends if it is 0: ");
        int positives = 0;
        int negatives = 0;
        double sum = 0;
        int count = 0;
        while (true) {
            int number = input.nextInt();
            if (number == 0) {
                break;
            }
            if (number > 0) {
                positives ++;
            } else {
                negatives ++;
            }
            sum += number;
            count ++;
        }
        if (count == 0) {
            System.out.println("No numbers are entered except 0");
        } else {
            System.out.println("The number of positives is " + positives);
            System.out.println("The number of negatives is " + negatives);
            System.out.println("The total is " + sum);
            System.out.println("The average is " + sum/count);
        }
    }
}
