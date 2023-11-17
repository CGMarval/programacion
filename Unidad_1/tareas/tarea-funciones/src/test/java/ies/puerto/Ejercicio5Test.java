package ies.puerto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class Ejercicio5Test {

    Ejercicio5 ejercicio5;
    @BeforeEach
    public void before (){ejercicio5 = new Ejercicio5();}

    @Test
    public void numeroPrimoTest(){
        numeroPrimo(2);
        numeroPrimo(3);
        numeroPrimo(5);
        numeroPrimo(7);
        numeroPrimo(11);
    }

    @Test
    public void numeroNoPrimoTest() {

    }
    /**
     * Función que recibe un número y comprueba que este sea primo
     * @param numero
     */
    public void numeroPrimo(int numero){
        boolean resultado;
        resultado = ejercicio5.esPrimo(numero);
        Assertions.assertTrue(resultado,"Error, no se ha obtenido el resultado esperado");
    }
}