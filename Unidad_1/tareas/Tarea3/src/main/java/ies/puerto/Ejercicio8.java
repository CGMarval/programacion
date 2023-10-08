package ies.puerto;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el límite superior para buscar números perfectos: ");
        int limiteSuperior = sc.nextInt();

        System.out.println("Números perfectos en el rango de 1 a " + limiteSuperior + ":");

        for (int numero = 1; numero <= limiteSuperior; numero++) {
            if (esNumeroPerfecto(numero)) {
                System.out.println(numero);
            }
        }

        sc.close();
    }

    public static boolean esNumeroPerfecto(int numero) {
        int sumaDivisores = 0;

        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                sumaDivisores += i;
            }
        }

        return sumaDivisores == numero;

    }


}