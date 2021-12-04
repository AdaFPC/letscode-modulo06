package io.github.adafpc;

public class Calculador {
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
