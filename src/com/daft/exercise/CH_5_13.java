package com.daft.exercise;
//find the largest n such that n^3 < 12,000
public class CH_5_13 {
    public static void main(String[] args) {
        int integer = 0;
        while (integer * integer * integer<= 12000) {
            integer ++;
        }
        integer -= 1;
        System.out.println("The largest n such that n^3 is less than 12000 is " + integer);
    }
}
