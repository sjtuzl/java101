package com.daft.exercise;
import java.util.Scanner;
public class CH_5_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int studentNumber = input.nextInt();
        String name;
        double score;
        double highestScore = 0;
        String secondBest = "";
        String bestStudent = "";
        for (int i = 0; i < studentNumber; i++) {
            System.out.print("Enter student name: ");
            name = input.next();
            System.out.print("Enter student score: ");
            score = input.nextDouble();
            if (score >= highestScore) {
                secondBest = bestStudent;
                highestScore = score;
                bestStudent = name;
            }
        }
        System.out.println(bestStudent + " is the student with the highest score");
        System.out.println(secondBest + " is the student with the second highest score");
    }
}
