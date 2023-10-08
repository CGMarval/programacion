package ies.puerto;
import java.util.Scanner;
public class Tarea2 {
    public static void main(String[] args) {


        int ini; // variable que guarda el inicio del rango introducido por el usuario
        int fin; // variable que guarda el final del rango introducido por el usuario
        int suma; // suma de divisores propios de cada número perfecto
        int n; // numero a calcular
        int d; // denominador
        Scanner sc = new Scanner(System.in);
        System.out.println("A continuación indique el rango para calcular los números perfectos existentes dentro de este");
        System.out.println("ingrese el inicio del rango");
        ini = sc.nextInt();
        System.out.println("ingrese el final del rango");
        fin = sc.nextInt();

            System.out.println("Números perfectos entre "+ini+" y "+fin);
            for (n=ini; n <= fin; n++) {
                suma = 0;
                for (d = 1; d < n; d++) {
                    if (n % d == 0) {
                        suma = suma + d;
                    }
                }

                if (n == suma) {
                    System.out.println(n);
                }
            }

    }
}

