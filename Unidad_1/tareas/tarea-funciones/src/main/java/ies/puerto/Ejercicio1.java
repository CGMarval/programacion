package ies.puerto;

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    /**
     * Función que calcula el área de un triángulo
     * @param base del triángulo
     * @param altura del triángulo
     * @return el área del triángulo calculado
     */
    public int areaTriangulo(int base, int altura) {
        int resultado = 0;

        resultado = (base * altura)/2;
        return resultado;
    }

}