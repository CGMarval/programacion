package ies.puerto;

public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    /**
     * Función que convierte una temperatura dada de grados Fahrenheit a grados Celsius
     * @param fahrenheit
     * la formula es la siguiente ºC = (5/9)(ºF - 32)
     */
    public double conversionFahrenheitCelsius(double fahrenheit){
        double celsius = (fahrenheit - 32) * 5/9;
        return celsius;
    }

}