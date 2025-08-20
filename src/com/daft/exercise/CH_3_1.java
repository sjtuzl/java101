package com.daft.exercise;
import java.util.Scanner;
//solving equations
public class CH_3_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c;
        System.out.print("Enter a, b, c: ");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        final double delta = b*b - 4*a*c;
        double r1, r2, rOne;
        if(delta > 0) {
            r1 = (b*-1 + Math.pow(delta,0.5)) / 2 / a;
            r2 = (b*-1 - Math.pow(delta,0.5)) / 2 / a;
            System.out.println("The equation has two roots " + r1 + " and " + r2);
        } else if (delta == 0) {
            rOne = b*-1 / 2 / a;
            System.out.println("The equation has one root " + rOne);
        }
        else {
            System.out.println("The equation has no real roots.");
        }
    }
}
