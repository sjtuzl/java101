package com.daft.exercise;
import java.util.Scanner;
//days of a month
public class CH_4_17 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        System.out.print("Enter a month: ");
        String month = input.next();
        boolean isLeapYear;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                isLeapYear = year % 400 == 0;
            } else {
                isLeapYear = true;
            }
        } else {
            isLeapYear = false;
        }
        int days = 0;
        switch (month) {
            case "Feb" ->  {
                if (isLeapYear) {
                    days = 29;
                } else {
                    days = 28;
                }
            }
            case "Jan", "Mar", "May", "Jul", "Aug", "Oct", "Dec" -> days = 31;
            case "Apr", "Jun", "Sep", "Nov" -> days = 30;
            default -> {
                System.out.println("Invalid input");
                System.exit(1);
            }
        }
        System.out.println(month + " " + year + " has " + days + " days");
    }
}
