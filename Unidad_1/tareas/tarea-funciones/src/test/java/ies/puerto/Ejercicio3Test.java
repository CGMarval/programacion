package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Ejercicio3Test {
    Ejercicio3 ejercicio3;
    @BeforeEach
    public void before() {
        ejercicio3 = new Ejercicio3();
    }


    @Test
    public void calcularAreaCuadradoRectangulo105TestOK(){
        calculaArea(7, 15, 105);
    }

    @Test
    public void calcularAreaCuadradoRectangulo81TestOK(){
        calculaArea(9, 9, 81);
    }

    @Test
    public void calcularAreaRectangulo4900TestOK(){
        calculaArea(100, 49, 4900);
    }

    @Test
    public void calcularAreaRectangulo80TestOK(){
        calculaArea(20, 4, 80);
    }

    @Test
    public void calcularAreaCuadradoTestOK(){
        calculaArea(3, 3, 9);
    }

    @Test
    public void calcularAreaCuadrado9025TestOK(){
        calculaArea(95, 95, 9025);
    }

    /**
     * Función que calcula el área tanto de un cuadrado como de un rectángulo
     * @param ladoA del cuadrado o rectángulo a calcular
     * @param ladoB del cuadrado o rectángulo a calcular
     * @param resultOk entrega el valor del resultado esperado de la operación
     */
    public void calculaArea(int ladoA, int ladoB, int resultOk){
        int resultado = 0;
        resultado = ejercicio3.area(ladoA, ladoB);
        Assertions.assertEquals(resultOk, resultado, "Error, no se ha obtenido el resultado esperado");
    }

}