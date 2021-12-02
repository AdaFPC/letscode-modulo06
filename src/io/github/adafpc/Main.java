package io.github.adafpc;

public class Main {
    public static void main(String[] args) {

        //Escreva um programa que, com base em uma temperatura em graus celsius,
        //a converta e exiba em Kelvin (K), Reaumur (Re), Rankine (Ra) e Fahrenheit (F)
        //segundo as formulas:
        /**
         * F = (C * 1.8) + 32*
         * K = C + 273.15
         * Re = C * 0.8
         * Ra = (C * 1.8) + 459.67*
         */
        //Considere a conversão de 18 ºC e a precisão de duas casa decimais
        double temperature = 18;

        System.out.printf("Fahrenheit: %.2f \n", convertToFahrenheit(temperature));
        System.out.printf("Rankine: %.2f \n", convertToRankine(temperature));
        System.out.printf("Reaumur: %.2f \n", convertToReaumur(temperature));
        System.out.printf("Kelvin: %.2f \n", convertToKelvin(temperature));
    }

    public static double convertToFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }

    public static double convertToRankine(double celsius) {
        return (celsius * 1.8) + 459.67;
    }

    public static double convertToReaumur(double celsius) {
        return celsius * 0.8;
    }

    public static double convertToKelvin(double celsius) {
        return celsius + 273.15;
    }
}
