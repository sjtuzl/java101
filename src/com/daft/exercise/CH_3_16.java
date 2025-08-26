package com.daft.exercise;
//generate a random dot
public class CH_3_16 {
    public static void main(String[] args) {
        int xCalc = (int)(Math.random() * 100);
        int yCalc = (int)(Math.random() * 200);
        int xFinal = xCalc - 50;
        int yFinal = yCalc - 100;
        System.out.println("Random number in a rectangle: (" + xFinal + "," + yFinal + ")");
    }
}
