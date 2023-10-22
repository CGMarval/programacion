package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio2Test {
    Ejercicio2 ejercicio2;
    @BeforeEach
    public void before() {
        ejercicio2 = new Ejercicio2();
    }

    /**
    @Test
    public void calcularCirculoTest() {
        int radio = 3;
        double resultadoOk = 28.274333882308138;
        double resultado = ejercicio2.areaCirculo(radio);
        Assertions.assertEquals(resultadoOk, resultado, "No se ha obtenido el resultado esperado");
    }
    */

    @Test
    public void calcularCirculoTest() {
      calcularCirculo(3, 28.274333882308138);
      calcularCirculo(5, 78.53981633974483);
      calcularCirculo(598, 1123446.0992943244);
    }


    public void calcularCirculo(int radio, double resultOk) {
        double resultado = 0;
        resultado = ejercicio2.areaCirculo(radio);
        Assertions.assertEquals(resultOk,resultado, "No se ha obtenido el resultado esperado");
    }



}