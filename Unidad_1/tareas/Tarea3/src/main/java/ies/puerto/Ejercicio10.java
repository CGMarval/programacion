package ies.puerto;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un número para calcular la suma de números pares hasta ese número: ");
        int numeroLimite = sc.nextInt();

        int suma = 0;
        int numeroActual = 2; // Empezamos con el primer número par, que es 2

        do {
            suma += numeroActual;
            numeroActual += 2; // Avanzamos al siguiente número par
        } while (numeroActual <= numeroLimite);

        System.out.println("La suma de los números pares hasta " + numeroLimite + " es: " + suma);

        sc.close();

    }


}