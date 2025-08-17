package com.charlie.exercise;

import java.util.Scanner;
public class CH_2_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pound, kilo;
        System.out.print("Enter a number in pounds: ");
        pound = input.nextDouble();
        kilo = pound * 0.454;
        System.out.println(pound + " pounds is " + kilo + " kilograms");
    }
}
