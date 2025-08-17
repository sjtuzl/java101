package com.daft.exercise;
import java.util.Scanner;
public class CH_2_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double speed, acceleration, length;
        System.out.print("Enter the speed and acceleration: ");
        speed = input.nextDouble();
        acceleration = input.nextDouble();
        length = speed * speed / 2 / acceleration;
        System.out.println("The minimum runway length for this airplane is " + length);
    }
}
