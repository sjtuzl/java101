package com.daft.exercise;
import java.util.Scanner;
//solving 2*2 linear functions (user input)
public class CH_3_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x, y;
        System.out.print("Enter a, b, c, d, e, f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        if((a*d - b*c) == 0){
            System.out.println("The equation has no solution.");
        }
        else {
            x = (e*d - b*f) / (a*d - b*c);
            y = (a*f - e*c) / (a*d - b*c);
            System.out.println("x is " + x +" and y is " + y);
        }
    }
}
