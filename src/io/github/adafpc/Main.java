package io.github.adafpc;

/**
 * Escreva um programa que, com base em uma temperatura em graus celsius,
 *         a converta e exiba em Kelvin (K), Reaumur (Re), Rankine (Ra) e Fahrenheit (F)
 *         segundo as formulas:
 *
 *         F = (C * 1.8) + 32*
 *          K = C + 273.15
 *           Re = C * 0.8
 *           Ra = (C * 1.8) + 459.67*
 *
 *         Considere a conversão de 18 ºC e a precisão de duas casa decimais
 */
public class Main {
    public static void main(String[] args) {

        double temperature = Leitor.readInput();

        Impressor.print(temperature);
    }


}
