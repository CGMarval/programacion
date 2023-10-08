package ies.puerto;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa la posición n para encontrar el número de Fibonacci: ");
        int n = sc.nextInt();

        int resultado = calcularFibonacci(n);

        System.out.println("El número de Fibonacci en la posición " + n + " es: " + resultado);

        sc.close();
    }

    public static int calcularFibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        int fibNMinus1 = 1;
        int fibNMinus2 = 0;
        int fib = 0;

        for (int i = 2; i <= n; i++) {
            fib = fibNMinus1 + fibNMinus2;
            fibNMinus2 = fibNMinus1;
            fibNMinus1 = fib;
        }

        return fib;

    }


}