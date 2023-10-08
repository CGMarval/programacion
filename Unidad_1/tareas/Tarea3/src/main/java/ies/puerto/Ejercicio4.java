package ies.puerto;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un número para verificar si es un palíndromo: ");
        int numero = sc.nextInt();
        int numeroOriginal = numero;
        int numeroInvertido = 0;

        while (numero > 0) {
            int digito = numero % 10;
            numeroInvertido = numeroInvertido * 10 + digito;
            numero /= 10;
        }

        if (numeroOriginal == numeroInvertido) {
            System.out.println(numeroOriginal + " es un palíndromo.");
        } else {
            System.out.println(numeroOriginal + " no es un palíndromo.");
        }

        sc.close();

    }


}