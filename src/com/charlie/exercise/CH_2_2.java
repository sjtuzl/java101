package com.charlie.exercise;

import java.util.Scanner;
public class CH_2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius, height, area, volume;
        System.out.print("Enter the radius and length of a cylinder: ");
        radius = input.nextDouble();
        height = input.nextDouble();
        area = radius * radius * 3.14159;
        volume = area * height;
        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);
    }
}
