package ies.puerto;
import java.util.Scanner;

/**
 * Desarrolle un algoritmo que permita calcular
 * Promedio de Notas; finaliza cuando N = 0.
 */
public class Tarea1 {

    public static void main(String[] args){
        Scanner lectura = new Scanner (System.in);
        int N;
        float Promedio;
        float Acumula=0;
        int C=0;

        System.out.println("Ingrese el número de notas que desea calcular");
        N = lectura.nextInt();
        while(C<N){
            System.out.println("Ingresa el valor de la nota "+(C+1));
            Acumula = Acumula + lectura.nextFloat();
            C++;
        }

        Promedio = Acumula / C;
        System.out.println("El promedio de las "+C+" notas introducidas es: "+Promedio);
    }

}
