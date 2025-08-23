package com.daft.exercise;
import java.util.Scanner;
//generating dates in the future
public class CH_3_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter today's day: ");
        int currentDay = input.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int daysElapsed = input.nextInt();
        int futureDay = (currentDay+daysElapsed) % 7;
        switch(currentDay) {
            case 0: System.out.print("Today is Sunday and the future day is "); break;
            case 1: System.out.print("Today is Monday and the future day is "); break;
            case 2: System.out.print("Today is Tuesday and the future day is "); break;
            case 3: System.out.print("Today is Wednesday and the future day is "); break;
            case 4: System.out.print("Today is Thursday and the future day is "); break;
            case 5: System.out.print("Today is Friday and the future day is "); break;
            case 6: System.out.print("Today is Saturday and the future day is "); break;
        }
        switch(futureDay) {
            case 0: System.out.print("Sunday"); break;
            case 1: System.out.print("Monday"); break;
            case 2: System.out.print("Tuesday"); break;
            case 3: System.out.print("Wednesday"); break;
            case 4: System.out.print("Thursday"); break;
            case 5: System.out.print("Friday"); break;
            case 6: System.out.print("Saturday"); break;
        }
    }
}
