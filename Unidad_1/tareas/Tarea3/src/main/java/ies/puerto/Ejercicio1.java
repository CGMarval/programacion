package ies.puerto;

public class Ejercicio1 {
    public static void main(String[] args) {
       /** int n = 1; // Inicializamos el número a imprimir

        // Iteramos a través de las filas del patrón
        for (int i = 1; i <= 4; i++) {
            // Iteramos a través de las columnas de cada fila
            for (int j = 1; j <= i; j++) {
                System.out.print(n + " "); // Imprimimos el número y un espacio
                n++; // Incrementamos el número
            }
            System.out.println(); // Cambiamos de línea después de cada fila
        }
        */
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