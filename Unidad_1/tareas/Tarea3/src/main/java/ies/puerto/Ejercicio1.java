package ies.puerto;

public class Ejercicio1 {
    public static void main(String[] args) {
        int n = 4; // Número de filas
        int num = 1; // Inicializa el número a imprimir

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println(); // Cambia de línea después de cada fila
        }

    }


}