package com.daft.exercise;

public class CH_1_7 {
    public static void main(String[] args) {
        double pi_one = 1.0 - 1.0/3.0 + 1.0/5.0 - 1.0/7.0 + 1.0/9.0 - 1.0/11.0;
        double pi_two = 1.0 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11 + 1.0/13;
        System.out.println(4 * pi_one);
        System.out.println(4 * pi_two);
    }
}
