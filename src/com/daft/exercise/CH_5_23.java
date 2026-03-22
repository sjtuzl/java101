package com.daft.exercise;
//demonstrate cancellation errors
public class CH_5_23 {
    public static void main(String[] args) {
        double leftToRight = 0, rightToLeft = 0;
        double difference;
        for (double i = 1; i <= 50000; i++) {
            leftToRight += (1 / i);
        }
        for (double i = 50000; i >= 1; i--) {
            rightToLeft += (1 / i);
        }
        System.out.println("Calculating from left to right is: " + leftToRight);
        System.out.println("Calculating from right to left is: " + rightToLeft);
        difference = Math.abs(leftToRight - rightToLeft);
        System.out.println("The difference between the two results is " + difference);
    }
}
