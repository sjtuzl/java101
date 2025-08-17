package com.charlie.exercise;
import java.util.Scanner;
public class CH_2_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double years;
        System.out.print("Enter the number of years: ");
        years = input.nextDouble();
        double tot_time = years * 365 * 24 * 3600;
        double tot_birth = tot_time / 7;
        double tot_death = tot_time / 13;
        double tot_immigrant = tot_time / 45;
        int change = (int)(tot_birth + tot_immigrant - tot_death);
        System.out.println( change + 312032486 );
    }
}
