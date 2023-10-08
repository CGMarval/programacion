package ies.puerto;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println("Números Armstrong entre 1 y 1000:");
        for (int i = 1; i <= 1000; i++) {
            if (esNumeroArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean esNumeroArmstrong(int numero) {
        int numOriginal = numero;
        int numDigitos = contarDigitos(numero);
        int suma = 0;

        while (numero > 0) {
            int digito = numero % 10;
            suma += Math.pow(digito, numDigitos);
            numero /= 10;
        }

        return suma == numOriginal;
    }

    public static int contarDigitos(int numero) {
        int count = 0;
        while (numero > 0) {
            numero /= 10;
            count++;
        }
        return count;

    }


}