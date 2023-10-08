package ies.puerto;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa la posición n para encontrar el número de Fibonacci: ");
        int n = sc.nextInt();

        int fibNmenos2 = 0;
        int fibNmenos1 = 1;
        int fib = 0;

        if (n == 0) {
            fib = 0;
        } else if (n == 1) {
            fib = 1;
        } else {
            for (int i = 2; i <= n; i++) {
                fib = fibNmenos1 + fibNmenos2;
                fibNmenos2 = fibNmenos1;
                fibNmenos1 = fib;
            }
        }

        System.out.println("El número de Fibonacci en la posición " + n + " es " + fib);

        sc.close();

    }


}