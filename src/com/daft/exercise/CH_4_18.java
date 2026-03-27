package com.daft.exercise;
import java.util.Scanner;
//student major and status
public class CH_4_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two characters: ");
        String inputCharacters = input.next();
        char major = inputCharacters.charAt(0);
        char year = inputCharacters.charAt(1);
        switch (major) {
            case 'M' -> {
                switch (year) {
                    case '1': System.out.println("Mathematics Freshman"); break;
                    case '2': System.out.println("Mathematics Sophomore"); break;
                    case '3': System.out.println("Mathematics Junior"); break;
                    case '4': System.out.println("Mathematics Senior"); break;
                }
            }
            case 'C' -> {
                switch (year) {
                    case '1': System.out.println("Computer Science Freshman"); break;
                    case '2': System.out.println("Computer Science Sophomore"); break;
                    case '3': System.out.println("Computer Science Junior"); break;
                    case '4': System.out.println("Computer Science Senior"); break;
                }
            }
            case 'I' -> {
                switch (year) {
                    case '1': System.out.println("Information Technology Freshman"); break;
                    case '2': System.out.println("Information Technology Sophomore"); break;
                    case '3': System.out.println("Information Technology Junior"); break;
                    case '4': System.out.println("Information Technology Senior"); break;
                }
            }
            default -> System.out.println("Invalid input");
        }
    }
}
