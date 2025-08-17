package com.daft.exercise;

import java.util.Scanner;
public class CH_2_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double feet, meter;
        System.out.print("Enter a value for feet: ");
        feet = input.nextDouble();
        meter = feet * 0.305;
        System.out.println(feet + " feet is " + meter + " meters");
    }
}
