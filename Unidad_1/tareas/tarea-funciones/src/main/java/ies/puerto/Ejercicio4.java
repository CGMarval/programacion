package ies.puerto;

public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    /**
     * Función que calcula entre dos números, cuál es el mayor
     * @param numeroA
     * @param numeroB
     * @return el número mayor
     */
    public int esMayor(int numeroA, int numeroB){
        int resultado = numeroA;
        if (numeroB > numeroA){
            resultado = numeroB;
        }
        return resultado;
    }

    /**
     * Función recursiva que calcula entre tres valores, cual es el mayor
     * @param numeroA
     * @param numeroB
     * @param numeroC
     * @return el mayor de los tres valores
     */
    public int esMayor(int numeroA, int numeroB, int numeroC ){
        int resultado = esMayor(numeroA, numeroB);
        if (numeroC > resultado){
            resultado = numeroC;
        }
        return resultado;
    }
}