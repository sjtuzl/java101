package com.daft.exercise;

import java.util.Scanner;
public class CH_2_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long totMillis, totSeconds, totMinutes, totHours, currentSecond, currentMinute, gmtHour, offset, currentHour;
        totMillis = System.currentTimeMillis();
        totSeconds = totMillis / 1000;
        totMinutes = totSeconds / 60;
        totHours = totMinutes / 60;
        currentSecond = totSeconds % 60;
        currentMinute = totMinutes % 60;
        gmtHour = totHours % 24;
        System.out.print("Enter the time zone offset to GMT: ");
        offset = input.nextInt();
        currentHour = gmtHour + offset;
        if (currentHour >= 24) {
            currentHour = currentHour % 24;
        }
        System.out.println("The current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
    }
}

