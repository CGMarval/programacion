package ies.puerto;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un número para verificar si es palíndromo: ");
        int numero = sc.nextInt();

        if (esPalindromo(numero)) {
            System.out.println(numero + " es un número palíndromo.");
        } else {
            System.out.println(numero + " no es un número palíndromo.");
        }

        sc.close();
    }

    public static boolean esPalindromo(int numero) {
        int numeroOriginal = numero;
        int numeroInvertido = 0;

        while (numero > 0) {
            int digito = numero % 10;
            numeroInvertido = numeroInvertido * 10 + digito;
            numero /= 10;
        }

        return numeroOriginal == numeroInvertido;

    }


}