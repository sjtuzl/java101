package com.daft.exercise;
//compute pi
public class CH_5_25 {
    public static void main(String[] args) {
        double pi;
        for (double count = 1; count <= 10; count++) {
            pi = 1;
            for (double i = 3; i < (count*10000); i += 4) {
                pi = pi - 1/i + 1/(i+2);
            }
            pi -= (double) 1 / (2*count*10000 - 1);
            pi = pi * 4;
            System.out.println("pi for i = " + count + "0000 is " + pi);
        }
    }
}
