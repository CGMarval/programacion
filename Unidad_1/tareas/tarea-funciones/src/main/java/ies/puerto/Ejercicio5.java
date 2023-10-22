package ies.puerto;

public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    /**
     * Función que recibe un número para comprobar, llamando a la función booleana esPrimo si es primo, o no, y lo muestra en pantalla
     * @param numero
     */
    public static void numeroPrimo(int numero){
        if(esPrimo(numero)) {
            System.out.println(numero+" es un número primo");
        }else{
            System.out.println(numero+" no es un número primo");
        }
    }

    /**
     * Función booleana que comprueba si un número dado es primo o no
     * @param numero
     * @return true si es primo o false si no lo es
     */
    public static boolean esPrimo(int numero){
        if (numero <= 1){
            return false;
        }
        for (int i = 2; i * i <= numero; i++){
            if (numero % i == 0){
                return false;
            }
        }
        return true;

    }

}