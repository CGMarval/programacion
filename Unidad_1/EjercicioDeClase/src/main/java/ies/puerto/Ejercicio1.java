package ies.puerto;

public class Ejercicio1 {
    public static int busquedaBinaria (int [] items, int numeroBuscado){
        //int resultado;
        int limiteInferior = 0;
        int limiteSuperior = items.length - 1;
        int indice;

        while (limiteInferior <= limiteSuperior){
            indice = (limiteInferior + limiteSuperior) / 2;
            if (items[indice] == numeroBuscado){
                return indice;
            } else if (items[indice] < numeroBuscado) {
                limiteInferior = indice + 1;
            }else{
                limiteSuperior = indice - 1;
            }
        }
        return -1;
    }


    public int busquedaBinaria (int [] array, int valor){
        int posicion;

        return posicion;
    }

}

