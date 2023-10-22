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
    public void calcularAreaCuadradoRectanguloTestOK(){
        calculaArea(7, 15, 105);
        calculaArea(9, 9, 81);
        calculaArea(20, 4, 80);
        calculaArea(3, 3, 9);
        calculaArea(100, 49, 4900);
        calculaArea(459, 5000, 2295000);
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

    /**
    @Test
    public void calcularCuadradoTest() {
        int ladoA = 3;
        int ladoB = 4;
        double resultadoOk = 0;
        double resultado = ejercicio3.areaCuadrado(ladoA, ladoB);
        Assertions.assertEquals(resultadoOk, resultado, "No se ha obtenido el resultado esperado");
    }
    @Test
    public void calcularRectanguloTest() {
        int ladoA = 3;
        int ladoB = 4;
        double resultadoOk = 0;
        double resultado = ejercicio3.areaRectangulo(ladoA,ladoB);
        Assertions.assertEquals(resultadoOk, resultado, "No se ha obtenido el resultado esperado");
    }
    */
}