package ies.puerto;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el número de términos de la secuencia de Fibonacci que deseas imprimir: ");
        int n = sc.nextInt();

        System.out.println("Los primeros " + n + " términos de la secuencia de Fibonacci son:");
        imprimirSecuenciaFibonacci(n);

        sc.close();
    }

    public static void imprimirSecuenciaFibonacci(int n) {
        int[] fibonacci = new int[n];
        fibonacci[0] = 0;
        if (n > 1) {
            fibonacci[1] = 1;
        }

        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }

    }


}