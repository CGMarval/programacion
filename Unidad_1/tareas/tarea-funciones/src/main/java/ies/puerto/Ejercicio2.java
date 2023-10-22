package ies.puerto;

import static java.lang.Math.PI;

public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    /**
     * Función que calcula el área de un círculo
     * @param radio del círculo a calcular
     * @return el área del círculo
     */
    public double areaCirculo(int radio) {
        double resultado = 0;

        resultado = Math.pow(radio, 2)*PI;

        return resultado;
    }
}