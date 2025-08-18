package com.daft.exercise;
import java.util.Scanner;
public class CH_2_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x1, y1, x2, y2, x3, y3, side1, side2, side3, s, result, rootedResult;
        System.out.println("Enter the coordinates of three points separated by spaces");
        System.out.print("like x1 y1 x2 y2 x3 y3: ");
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        x2 = input.nextDouble();
        y2 = input.nextDouble();
        x3 = input.nextDouble();
        y3 = input.nextDouble();
        side1 = Math.pow( (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1) , 0.5 );
        side2 = Math.pow( (x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1) , 0.5 );
        side3 = Math.pow( (x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3) , 0.5 );
        s = ( side1 + side2 + side3 ) / 2;
        result = s * ( s - side1 ) * ( s - side2 ) * ( s - side3 );
        rootedResult = Math.pow (result,0.5);
        System.out.println("The area of the triangle is " + rootedResult);
    }
}
