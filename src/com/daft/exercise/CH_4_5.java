package com.daft.exercise;
import java.util.Scanner;
//geometry: area of a regular polygon
public class CH_4_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        int numSide = input.nextInt();
        System.out.print("Enter the side: ");
        double length = input.nextDouble();
        double area = numSide * length * length / 4 / Math.tan(Math.PI / numSide);
        System.out.println("The area of the polygon is " + area);
    }
}
