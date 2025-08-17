package com.charlie.exercise;

import java.util.Scanner;
public class CH_2_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int minutes, days, years, remainDays;
        System.out.print("Enter the number of minutes: ");
        minutes = input.nextInt();
        days = minutes / 1440;
        years = days / 365;
        remainDays = days % 365;
        System.out.println(minutes + " minutes is approximately " + years + " years and " + remainDays + " days");
    }
}
