package ies.puerto;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main (String[] args){
        Ejercicio3 ejercicio3 = new Ejercicio3();
        ejercicio3.pedirValores();
    }

    public void pedirValores(){
        Scanner scanner = new Scanner(System.in);
        int tamanio = 5;
        int[] array1 = new int[tamanio];
        int[] array2 = new int[tamanio];
        int[] array3 = new int[tamanio];
        int i = 0;
        int valor;

       array1 = rellenaArray(array1, 1);
       array2 = rellenaArray(array2, 2);
       for (int j=0; j < tamanio; j++){
           array3[j] = array1[j]+array2[j];
       }
       mostrarArray(array1, 1);
       mostrarArray(array2, 2);
       mostrarArray(array3, 3);

    }

    public int[] rellenaArray (int array[], int nroArray){
        Scanner scanner = new Scanner(System.in);
        int i=0;
        int valor;
        System.out.println("Array "+nroArray);

        do {
            System.out.println("Introduzca el valor "+(i+1));
            valor = scanner.nextInt();
            array[i]=valor;
            i++;
        }while(i < array.length);
        return array;
    }

    public void mostrarArray (int array[], int nroArray){
        Scanner scanner = new Scanner(System.in);
        int i=0;
        System.out.println("Array "+nroArray);

        do {
            System.out.println(array[i]);
            i++;
        }while(i < array.length);
    }

}
