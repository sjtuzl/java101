package com.daft.exercise;
import java.util.Scanner;
//analyze scores
public class CH_7_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the scores: ");
        int[] count = new int[101];
        int scoreSum = 0;
        int numberOfScores = 0;
        while (true) {
            int score = input.nextInt();
            if (score < 0) {
                break;
            }
            if (score <= 100) {
                count[score]++;
                scoreSum += score;
                numberOfScores++;
            }
        }
        int average = scoreSum / numberOfScores;
        int scoresBelowAverage = 0;
        for (int i = 0; i < average; i++) {
            if (count[i] != 0) {
                scoresBelowAverage += count[i];
            }
        }
        System.out.println("There are " + scoresBelowAverage + " scores below average");
        System.out.println("There are " + (numberOfScores - scoresBelowAverage) + " scores above or equal to the average");
    }
}
