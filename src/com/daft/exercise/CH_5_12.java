package com.daft.exercise;
//find the smallest n such that n^2 > 12,000
public class CH_5_12 {
    public static void main(String[] args) {
        int integer = 0;
        while (integer * integer <= 12000) {
            integer ++;
        }
        System.out.println("The smallest n such that n squared is greater than 12000 is " + integer);
    }
}
