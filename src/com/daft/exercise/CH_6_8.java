package com.daft.exercise;
//Conversions between Celsius and Fahrenheit
public class CH_6_8 {

    public static double celsiusToFahrenheit(double celsius) {
        return (9.0 / 5) * celsius + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }

    public static void main(String[] args) {
        System.out.println("Celsius   Fahrenheit      Fahrenheit   Celsius");
        double outputCelsius;
        double outputFahrenheit;
        for (int i = 0; i < 10; i++) {
            outputCelsius = 40 - i;
            outputFahrenheit = 120 - 10 * i;
            System.out.print(outputCelsius + "      " + Math.ceil(celsiusToFahrenheit(outputCelsius) * 10) / 10.0 + "            ");
            System.out.println(outputFahrenheit + "        " + Math.ceil(fahrenheitToCelsius(outputFahrenheit) * 100) / 100.0);
        }
    }

}
