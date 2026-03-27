package com.daft.exercise;
//financial application: compute future tuition
public class CH_5_7 {
    public static void main(String[] args) {
        double tuition = 10000;
        for (int year = 1; year <= 10; year++) {
            tuition += tuition * 0.05;
        }
        System.out.println("Tuition in ten years: $" + tuition);
        double totalCost = 0;
        for (int year = 1; year <= 4; year++) {
            tuition += tuition * 0.05;
            totalCost += tuition;
        }
        System.out.println("Total cost for four years after the tenth year: $" + totalCost);
    }
}
