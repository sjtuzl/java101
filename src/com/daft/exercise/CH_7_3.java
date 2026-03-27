package com.daft.exercise;
import java.util.Scanner;
public class CH_7_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integers between 1 and 100: ");
        int[] count = new int[101];
        while (true) {
            int number = input.nextInt();
            if (number == 0) {
                break;
            }
            if (number >= 1 && number <= 100) {
                count[number]++;
            }
        }
        for (int i = 0; i < 101; i++) {
            if (count[i] != 0) {
                if (count[i] > 1) {
                    System.out.println(i + " occurs " + count[i] + " times");
                } else {
                    System.out.println(i + " occurs " + count[i] + " time");
                }
            }
        }
    }
}
