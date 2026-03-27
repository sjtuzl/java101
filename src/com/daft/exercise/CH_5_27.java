package com.daft.exercise;
public class CH_5_27 {
    public static void main(String[] args) {
        int count = 1;
        int neutralCount = 1;
        for (int year = 101; year <= 2100; year ++) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                if (count < 10) {
                    System.out.print(year + " ");
                } else {
                    System.out.println(year);
                    count = 0;
                }
                count ++;
                neutralCount ++;
            }
        }
        System.out.println("\n" + "There is a total of " + neutralCount + " years in the period");
    }
}
