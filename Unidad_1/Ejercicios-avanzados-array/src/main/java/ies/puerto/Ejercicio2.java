package ies.puerto;

import java.util.Scanner;

public class Ejercicio2 {

    //Scanner read = new Scanner(System.in);

    public static void main (String[] args){
        Ejercicio2 ejercicio2 = new Ejercicio2();
        ejercicio2.iniciar();
    }


    /**
     * Metodo la llamada a todos los metodos que conforman el programa
     */
    public void iniciar(){
        pedirValores();
    }
    public void pedirValores(){
        int[] numeros = new int[10];
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int numero;
        int elementosMostrar=0;
        boolean salir = false;
        do {
            System.out.println("Introduzca el valor: "+(i+1));
            numero = scanner.nextInt();
            if (numero > 0){
                numeros[i] = numero;
                i++;
            }else{
                salir = true;
                elementosMostrar=i;
            }
        }while(i < numeros.length && salir==false);

        muestraNumeros(numeros, elementosMostrar);

    }

    public void muestraNumeros(int numeros[], int limitSupArray){
        System.out.println("Los números positivos del Array son los siguientes:");
        for (int i=0; i < limitSupArray; i++){
            System.out.println(numeros[i]);
        }
    }

}
