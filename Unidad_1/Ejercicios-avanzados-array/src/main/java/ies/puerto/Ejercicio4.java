package ies.puerto;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main (String [] args){
        Ejercicio4 ejercicio4 = new Ejercicio4();
        ejercicio4.pedirValores();
    }


    public void pedirValores(){
        Scanner scanner = new Scanner(System.in);
        int valor=0;
        int tamanio = 5;
        int[][] matriz = new int[tamanio][tamanio];

        for (int i=0; i < tamanio; i++){
            System.out.println("Valores de la fila "+(i+1));
            for (int j=0; j < tamanio; j++){
                System.out.println("Introduzca el valor "+(j+1));
                valor = scanner.nextInt();
                matriz[i][j] = valor;
            }
        }

        muestraSumaFila(matriz);
        muestraSumaColumna(matriz);

    }
    public void suma (int [][] matriz){
        int sumaFila =0;
        int sumaColumna =0;

        for(int i=0; i < matriz.length; i++){
            sumaFila=0;
            sumaColumna=0;

        }
    }

    public void muestraSumaFila(int [][] matriz){
        int sumaFila;
        for (int i=0; i < matriz.length;i++) {
            sumaFila =0;
            for (int j = 0; j < matriz.length; j++) {
                sumaFila += matriz[i][j];
            }
            System.out.println("Suma de la fila "+(i+1)+"= "+sumaFila);
        }
    }

    public void muestraSumaColumna(int [][] matriz){
        int sumaColumna;
        for (int i=0; i < matriz.length;i++) {
            sumaColumna =0;
            for (int j = 0; j < matriz.length; j++) {
                sumaColumna += matriz[j][i];
            }
            System.out.println("Suma de la columna "+(i+1)+"= "+sumaColumna);
        }
    }

}
