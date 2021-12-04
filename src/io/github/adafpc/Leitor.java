package io.github.adafpc;

import java.awt.*;
import java.util.Scanner;

public class Leitor {

    public static double readInput(){
        Scanner readTemperature = new Scanner(System.in);
      double temperature = 0.0;
        boolean valuedNumber = false;
        while (!valuedNumber){
            try {
                System.out.println("Digite uma temperatura valida");
                String inputRead = readTemperature.next();
                temperature = Double.parseDouble(inputRead);
                valuedNumber = true;
            }catch (Exception e){

            }
        }

        return temperature;
    }
}
