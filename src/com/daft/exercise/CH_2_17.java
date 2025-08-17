package com.daft.exercise;
import java.util.Scanner;
public class CH_2_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double actualTemp, windChill, v;
        System.out.print("Enter the temperature between -58°F and 41°F: ");
        actualTemp = input.nextDouble();
        System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
        v = input.nextDouble();
        windChill = 35.74 + 0.6215 * actualTemp - 35.75 * Math.pow (v , 0.16) + 0.4275 * actualTemp * Math.pow (v , 0.16);
        System.out.println("The wind chill index is " + windChill);

    }
}
