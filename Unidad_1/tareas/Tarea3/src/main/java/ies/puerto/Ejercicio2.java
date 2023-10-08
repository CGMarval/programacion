package ies.puerto;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int numero1 = sc.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int numero2 = sc.nextInt();

        int mcd = calcularMCD(numero1, numero2);

        System.out.println("El MCD de " + numero1 + " y " + numero2 + " es " + mcd);

        sc.close();
    }

    // Función para calcular el MCD utilizando el algoritmo de Euclides
    public static int calcularMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;

    }


}