package ies.puerto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ejercicio4Test {

    Ejercicio4 ejercicio4;
    @BeforeEach
    public void before() {ejercicio4 = new Ejercicio4(); }

    @Test
    public void calcularMayorDosTest(){
        calculaMayorDos(6,3);
        calculaMayorDos(4,9);
        calculaMayorDos(500, 500);
        calculaMayorDos(-500, 500);
        calculaMayorDos(2000000, 300000);
        calculaMayorDos(950, 1);
    }

    @Test
    public void calcularMayorTres(){
        calculaMayorTres(4,5,6);
    }


    /**
     * Función que devuelve el mayor de dos números dados
     * @param numeroA
     * @param numeroB
     * @return el número mayor. Este retorno es útil para reutilizar la función cuando se tienen tres números
     */
    public int calculaMayorDos(int numeroA, int numeroB){
        int resultado = 0;
        int resultOk = numeroA;
        resultado = ejercicio4.esMayor(numeroA, numeroB);
        if (numeroB > numeroA){
            resultOk = numeroB;
        }
        testeo(resultado,resultOk);

        return resultado;
    }

    /**
     * Función que realiza la comprobación de los resultados obtenidos en el test.
     * @param resultado
     * @param resultOk
     */
    public void testeo (int resultado, int resultOk){
        Assertions.assertEquals(resultOk, resultado, "Error, no se ha obtenido el resultado esperado");
    }


    /**
     * Función que calcula el número mayor entre trés números dados
     * @param numeroA
     * @param numeroB
     * @param numeroC
     */
    public void calculaMayorTres(int numeroA, int numeroB, int numeroC){
        int resultado = 0;
        int resultOk = numeroA;
        resultado = ejercicio4.esMayor(numeroA, numeroB, numeroC);
        if (resultado != resultOk){
            resultOk = ejercicio4.esMayor(numeroB, numeroC);
        }
        testeo(resultado, resultOk);
    }



}