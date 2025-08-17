package com.daft.exercise;
import java.util.Scanner;
public class CH_2_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mass, initialTemp, finalTemp, energy;
        System.out.print("Enter the amount of water in kilograms: ");
        mass = input.nextDouble();
        System.out.print("Enter the initial temperature: ");
        initialTemp = input.nextDouble();
        System.out.print("Enter the final temperature: ");
        finalTemp = input.nextDouble();
        energy = mass * (finalTemp - initialTemp) * 4184;
        System.out.println("The energy needed is " + energy);
    }
}
