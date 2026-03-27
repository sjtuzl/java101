package com.daft.exercise;
public class CH_5_11 {
    public static void main(String[] args) {
        int count = 0;
        for (int number = 100; number <= 200; number ++) {
            if (((number % 5 == 0) && (number % 6 != 0)) || ((number % 5 != 0) && (number % 6 == 0))) {
                if (count < 9) {
                    System.out.print(number + " ");
                    number ++;
                    count ++;
                } else {
                    System.out.println(number);
                    number ++;
                    count = 0;
                }
            } else {
                number ++;
            }
        }
    }
}
