package com.daft.exercise;
import java.util.Scanner;
//order three cities
public class CH_4_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first city: ");
        String firstCity = input.nextLine();
        System.out.print("Enter the second city: ");
        String secondCity = input.nextLine();
        System.out.print("Enter the third city: ");
        String thirdCity = input.nextLine();
        char charFirst = firstCity.charAt(0);
        char charSecond = secondCity.charAt(0);
        char charThird = thirdCity.charAt(0);
        if (charFirst <= charSecond) {
            if (charSecond <= charThird) {
                System.out.println("The three cities in alphabetical order are " + firstCity + " " + secondCity + " " + thirdCity);
            } else if (charFirst <= charThird) {
                System.out.println("The three cities in alphabetical order are " + firstCity + " " + thirdCity + " " + secondCity);
            } else {
                System.out.println("The three cities in alphabetical order are " + thirdCity + " " + firstCity + " " + secondCity);
            }
        } else {
            if (charThird <= charSecond) {
                System.out.println("The three cities in alphabetical order are " + thirdCity + " " + secondCity + " " + firstCity);
            } else if (charFirst <= charThird) {
                System.out.println("The three cities in alphabetical order are " + secondCity + " " + firstCity + " " + thirdCity);
            } else {
                System.out.println("The three cities in alphabetical order are " + secondCity + " " + thirdCity + " " + firstCity);
            }
        }
    }
}
