package com.daft.exercise;
//conversion from kilograms to pounds
public class CH_5_3 {
    public static void main(String[] args) {
        System.out.println("Kilograms   Pounds");
        int kilo = 1;
        while (kilo <= 199) {
            double pounds = kilo * 2.2;
            System.out.println(kilo + "           " + pounds);
            kilo += 2;
        }
    }
}
