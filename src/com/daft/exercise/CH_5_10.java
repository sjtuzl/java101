package com.daft.exercise;
//find numbers divisible by 5 and 6
public class CH_5_10 {
    public static void main(String[] args) {
        int count = 0;
        for (int number = 100; number <= 1000;) {
            if (number % 30 == 0) {
                if (count < 9) {
                    System.out.print(number + " ");
                    number ++;
                    count ++;
                } else {
                    System.out.println(number);
                    count = 0;
                    number ++;
                }
            } else {
                number ++;
            }
        }
    }
}
