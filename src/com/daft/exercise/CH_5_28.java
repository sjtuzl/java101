package com.daft.exercise;
import java.util.Scanner;
public class CH_5_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = input.nextInt();
        System.out.print("Enter first day of the year: ");
        int firstDay = input.nextInt();
        int days = 0;
        int indicator;
        for (int month = 1; month <= 12; month ++) {
            if ((month % 2 != 0) || (month == 8)) {
                days += 31;
            } else if ((month % 2 == 0) && (month != 2) && (month != 8)) {
                days += 30;
            } else {
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    days += 28;
                } else {
                    days += 29;
                }
            }
            indicator = firstDay + days % 7;
            indicator = indicator % 7;
        }
    }
}
