package ies.puerto;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main (String[] args){
        Ejercicio5 ejercicio5 = new Ejercicio5();
        ejercicio5.crearMatriz();
    }
    public void crearMatriz(){
        int[][] diagonal = new int[5][5];

        for (int i = 0; i < diagonal.length; i++){
            diagonal[i][i] = 1;
        }
        muestraMatriz(diagonal);
    }

    public void muestraMatriz(int[][] matriz){
        for (int i=0; i < matriz.length; i++){
            for (int j=0; j < matriz.length; j++){
                System.out.print(matriz[i][j]+"  ");
            }
            System.out.println();
        }
    }
}





