package ies.puerto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio6Test {
    Ejercicio6 ejercicio6;
    @BeforeEach
    public void before (){ejercicio6 = new Ejercicio6();}

    @Test
    public void conversionFahrenheitCelsiusTest(){
        converFahrenheitCelsius(45, 7.222222222222222);
        converFahrenheitCelsius(900, 482.22222222222223);
        converFahrenheitCelsius(30, -1.1111111111111112);
        converFahrenheitCelsius(-5, -20.555555555555557);
    }

    /**
     * Función que verifica que la conversión de la temperatura dada en grados Fahrenheit a grados Centigrados es la correcta
     */
    public void converFahrenheitCelsius(double temperatura, double resultOk){
        double resultado = 0;
        resultado = ejercicio6.conversionFahrenheitCelsius(temperatura);
        Assertions.assertEquals(resultOk, resultado,"Error, no se ha obtenido el resultado esperado");
    }

}