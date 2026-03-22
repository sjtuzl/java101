package com.daft.exercise;
//Math: pentagonal numbers
public class CH_6_1 {

    public static int getPentagonalNumber(int n) {
        return n * (n*3-1) / 2;
    }

    public static void main(String[] args) {
        int number = 100;
        int count = 1;
        for (int i = 1; i <= number; i++) {
            if (count < 10) {
                System.out.print(getPentagonalNumber(i) + " ");
            } else {
                System.out.println(getPentagonalNumber(i));
                count = 0;
            }
            count ++;
        }
    }

}
