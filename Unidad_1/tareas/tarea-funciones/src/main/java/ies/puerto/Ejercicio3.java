package ies.puerto;

public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    /**
    public int areaCuadrado(int a, int b) {
        int resultado = 0;
        resultado = a*b;
        return resultado;
    }

    public int areaRectangulo(int a, int b) {
        int resultado = 0;
        resultado = a*b;
        return resultado;
    }
    */


    /**
     * Función que calcula el área del un cuadrado o rectangulo mediante dos valores recibidos
     * @param a corresponde al lado "a" del cuadraro o rectángulo
     * @param b corresponde al lado "b" del cuadraro o rectángulo
     * @return retorna el área del cuadrado o rectángulo
     */
    public int area(int a, int b){
        int resultado = 0;
        resultado = a*b;
        return resultado;
    }
}