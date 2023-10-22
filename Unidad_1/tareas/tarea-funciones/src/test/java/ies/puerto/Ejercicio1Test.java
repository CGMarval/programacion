package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio1Test {

    Ejercicio1 ejercicio1;
    @BeforeEach
    public void before() {
        ejercicio1 = new Ejercicio1();
    }

    /**
    @Test
    public void calcularAreaTrianguloTest() {
        int base = 2;
        int altura = 3;
        int resultado = ejercicio1.areaTriangulo(base, altura);
        Assertions.assertEquals(resultado, 3, "No se ha obtenido el resultado esperado");
    }*/

    @Test
    public void calcularAreaTrianguloTestOK (){
        calculaAreaTriangulo(2, 3, 3);
        calculaAreaTriangulo(5, 4, 10);
        calculaAreaTriangulo(27, 48, 648);
    }

    public int calculaAreaTriangulo (int base, int altura, int resultEsperado){
        int resultado = 0;
        resultado = ejercicio1.areaTriangulo(base, altura);
        Assertions.assertEquals(resultado, resultEsperado,"No se ha obtenido el resultado esperado");
        return resultado;
    }

}