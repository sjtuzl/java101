package com.charlie.exercise;
import java.util.Scanner;
public class CH_2_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sideLength, mass;
        System.out.print("Enter the length of the side: ");
        sideLength = input.nextDouble();
        mass = 3 * Math.pow( 3 , 0.5 ) * 0.5 * sideLength * sideLength;
        System.out.print("The area of the hexagon is " + mass);
    }
}
