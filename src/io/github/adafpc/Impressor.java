package io.github.adafpc;

import static io.github.adafpc.Calculador.*;

public class Impressor {
    public static void print(double temperature){

        System.out.printf("Fahrenheit: %.2f \n", convertToFahrenheit(temperature));
        System.out.printf("Rankine: %.2f \n", convertToRankine(temperature));
        System.out.printf("Reaumur: %.2f \n", convertToReaumur(temperature));
        System.out.printf("Kelvin: %.2f \n", convertToKelvin(temperature));
    }
}
