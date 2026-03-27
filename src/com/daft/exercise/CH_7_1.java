package com.daft.exercise;
import java.util.Scanner;
//assign grades
public class CH_7_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        int[] studentScores = new int[numberOfStudents];
        int bestScore = 0;
        System.out.print("Enter " + numberOfStudents + " scores: ");
        for (int i = 0; i < numberOfStudents; i++) {
            studentScores[i] = input.nextInt();
            if (studentScores[i] > bestScore) {
                bestScore = studentScores[i];
            }
        }
        for (int i = 0; i < numberOfStudents; i++) {
            if (studentScores[i] >= (bestScore - 10)) {
                System.out.println("Student " + i + " score is " + studentScores[i] + " and grade is A");
            } else if (studentScores[i] >= (bestScore - 20)) {
                System.out.println("Student " + i + " score is " + studentScores[i] + " and grade is B");
            } else if (studentScores[i] >= (bestScore - 30)) {
                System.out.println("Student " + i + " score is " + studentScores[i] + " and grade is C");
            } else if (studentScores[i] >= (bestScore - 40)) {
                System.out.println("Student " + i + " score is " + studentScores[i] + " and grade is D");
            } else {
                System.out.println("Student " + i + " score is " + studentScores[i] + " and grade is F");
            }
        }
    }
}
