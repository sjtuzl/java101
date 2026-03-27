package com.daft.exercise;
//random character
public class CH_4_16 {
    public static void main(String[] args) {
        double fullNumber = Math.random() * 26;
        //so now you get a random number from 0.00 to 25.99
        int number = (int) fullNumber;
        char randomLetter = (char) (number + 'A');
        System.out.println("Random uppercase letter: "+ randomLetter);
    }
}
