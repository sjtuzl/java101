package com.daft.exercise;
//Use the isPrime Method
public class CH_6_10 {

    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("List of prime numbers less than 10000: ");
        for (int i = 2; i < 10000; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

}
