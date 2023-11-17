package ies.puerto;

public class Ejercicio2 {
    public void ordenamientoBurbuja (int items []) {
        int limiteSuperior = items.length;
        int temporal;

        boolean intercambiado = false;
        do {
            for (int i = 1; i <= limiteSuperior - 1; i++) {
                if (items[i - 1] > items[i]) {
                    temporal = items[i];
                    items[i] = items[i - 1];
                    items[i - 1] = temporal;
                    intercambiado = true;
                }
                limiteSuperior = limiteSuperior - 1;
            }

        } while (intercambiado);
    }

    public int[] burbuja (int[] array){
        int tamanio = array.length;
        boolean intercambio;

        do{
            intercambio = false;
            for (int i = 1; i < tamanio-1; i++){
                if (array[i-1] > array[i]){
                    int temporal = array[i];
                    array[i] = array[i-1];
                    array[i-1] = temporal;
                    intercambio = true;
                }
            }
        }while (intercambio);

    }

}
