package com.daft.exercise;
import java.util.Scanner;
//decimal to hex
public class CH_4_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal value (0 to 15): ");
        int decimal = input.nextInt();
        if (decimal<0 || decimal>15) {
            System.out.println(decimal + " is an invalid input");
        } else if (decimal <10) {
            System.out.println("The hex value is " + decimal);
        } else {
            char value = (char) ((decimal - 10) + 'A');
            System.out.println("The hex value is "+ value);
        }
    }
}
