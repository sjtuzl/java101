package com.daft.exercise;
import java.util.Scanner;
//convert letter grade to number
public class CH_4_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter grade: ");
        String inputGrade = input.next();
        char grade = inputGrade.charAt(0);
        if ((grade >= 65 && grade <= 68) || (grade == 70)) {
            int numericValue;
            if (grade == 'A') {
                numericValue = 4;
            } else if (grade == 'B') {
                numericValue = 3;
            } else if (grade == 'C') {
                numericValue = 2;
            } else if (grade == 'D') {
                numericValue = 1;
            } else {
                numericValue = 0;
            }
            System.out.println("The numeric value for grade " + grade + " is " + numericValue);
        } else {
            System.out.println(grade + " is an invalid grade");
        }
    }
}
