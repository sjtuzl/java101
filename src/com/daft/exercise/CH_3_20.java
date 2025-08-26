package com.daft.exercise;
import java.util.Scanner;
//wind chill index (with input detection)
public class CH_3_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double actualTemp, windChill, v;
        System.out.print("Enter the temperature between -58°F and 41°F: ");
        actualTemp = input.nextDouble();
        System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
        v = input.nextDouble();
        if ((actualTemp >= -58) && (actualTemp <= 41) && (v >= 2)) {
            windChill = 35.74 + 0.6215 * actualTemp - 35.75 * Math.pow (v , 0.16) + 0.4275 * actualTemp * Math.pow (v , 0.16);
            System.out.println("The wind chill index is " + windChill);
        } else {
            System.out.println("Invalid input");
        }
    }
}
