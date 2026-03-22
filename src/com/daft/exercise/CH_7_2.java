package com.daft.exercise;
import java.util.Scanner;
//reverse the numbers entered
public class CH_7_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] tenNumbers = new int[10];
        System.out.print("Enter ten integers: ");
        for (int i = 0; i < 10; i++) {
            tenNumbers[i] = input.nextInt();
        }
        for (int i = 9; i >= 0; i--) {
            System.out.print(tenNumbers[i] + " ");
        }
    }
}
