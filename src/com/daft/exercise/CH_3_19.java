package com.daft.exercise;
import java.util.Scanner;
//calculating the perimeter of a triangle
public class CH_3_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the three sides of a triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        double perimeter = side1 + side2 + side3;
        double difference1 = side2 - side3;
        double difference2 = side1 - side3;
        double difference3 = side1 - side2;
        if (difference1 < 0) {
            difference1 = difference1 * -1;
        }
        if (difference2 < 0) {
            difference2 = difference2 * -1;
        }
        if (difference3 < 0) {
            difference3 = difference3 * -1;
        }
        if ((side1 > 0) && (side2 > 0) && (side3 > 0)) {
            if ((side1 < side2 + side3) && (side2 < side1 + side3) && (side3 < side1 + side2)) {
                if ((side1 > difference1) && (side2 > difference2) && (side3 > difference3)) {
                    System.out.println("The perimeter of the triangle is " + perimeter);
                    System.exit(1);
                }
            }
        }
        System.out.println("Invalid input");
    }
}
