package com.daft.exercise;
//conversion from miles to kilometers
public class CH_5_4 {
    public static void main(String[] args) {
        System.out.println("Miles   Kilometers");
        int miles = 1;
        while (miles <= 9) {
            double kilometers = miles * 1.609;
            System.out.println(miles + "       " + kilometers);
            miles ++;
        }
        System.out.println("10      16.090");
    }
}
