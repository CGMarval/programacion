package ies.puerto;
import java.util.Scanner;
/**
 * Desarrolle un algoritmo que permita calcular
 * Promedio de Notas; finaliza cuando N = 0.
 */
public class Ejercicio8 {
    public static void main(String[] args){
        Scanner lectura = new Scanner (System.in);
        int N=0;
        float Promedio=0;
        float Acumula=0;
        int C=0;

        System.out.println("Ingrese el número de notas que desea calcular");
        N = lectura.nextInt();
        while(C<N){
            System.out.println("Ingresa el valor de la nota "+(C+1));
            Acumula = Acumula + lectura.nextFloat();
            System.out.println("Aquí la variable Acumula vale: "+Acumula);
            C++;
        }

        Promedio = Acumula / C;
        System.out.println("El promedio de las "+C+" notas introducidas es: "+Promedio);
    }

}
