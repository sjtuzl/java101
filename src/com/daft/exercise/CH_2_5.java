package com.daft.exercise;

import java.util.Scanner;
public class CH_2_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double subtotal, gratuityRate, gratuity, total;
        System.out.print("Enter the subtotal and a gratuity rate: ");
        subtotal = input.nextDouble();
        gratuityRate = input.nextDouble();
        gratuity = subtotal * gratuityRate / 100;
        total = subtotal + gratuity;
        System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
    }
}
