package com.charlie.exercise;

public class CH_1_12 {
    public static void main(String[] args) {
        double time_sec = 100 * 60 + 35;
        double time_hour = time_sec / 3600;
        double distance = 24 * 1.6;
        System.out.println( distance / time_hour );
    }
}
