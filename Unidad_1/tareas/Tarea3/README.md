Tarea (3) . Bucles y Condiciones
Requisitos de finalización
Apertura: jueves, 5 de octubre de 2023, 14:30
Cierre: domingo, 8 de octubre de 2023, 16:20
Realiza los siguientes programas en Java, cada unos en una clase.


## Ejercicio 1
#### Escribe un programa en Java que imprima el patrón siguiente:

```code
1 

2 3 

4 5 6 

7 8 9 10 
```
<details><summary>PULSE AQUÍ para ver Pseudocódigo Ejercicio 1</summary>

- __Inicio:__
- Declaración de variables: 
  num = 1
  n = 4 (Número de filas a imprimir)
  f = 1 (Para controlar la iteración de cada fila)
  c = 1 (Para controlar la iteración de cada columna)

- __Para__ f de 1 hasta n hacer
-    __Para__ c de 1 hasta f hacer
     Escribir num
     num = num + 1
     Fin Para
   Escribir en la siguiente línea.
- __Fin Para__
__FIN__
</details>

<details><summary>PULSA AQUÍ para ver diagrama de flujo Ejercicio 1</summary>
![Diagrama de flujo Ejercicio 1](https://github.com/CGMarval/programacion/blob/main/Unidad_1/tareas/Tarea3/images/diagrama-flujo-ejercicio1.drawio.png)
</details>

## Ejercicio 2
#### Escribe un programa en Java que encuentre el máximo común divisor (MCD) de dos números. Se debe solicitar los números por teclado.

Aqui el Pseudocódigo:

Procedimiento CalcularMCD(a, b)
Mientras b no sea igual a 0 hacer
Temporal <- b
b <- a % b
a <- Temporal
Fin Mientras
Devolver a
Fin Procedimiento

// Llamada al procedimiento principal
Leer numero1
Leer numero2
Resultado <- CalcularMCD(numero1, numero2)
Escribir "El MCD de ", numero1, " y ", numero2, " es ", Resultado

3. Escribe un programa en Java que encuentre el número de Fibonacci en la posición n.  Se debe solicitar el número por teclado.

Aquí el Pseudocódigo:

Procedimiento EncontrarFibonacciEnPosicion()
Escribir "Ingrese la posición n para encontrar el número de Fibonacci:"
Leer n

    Si n < 0 Entonces
        Escribir "El número de Fibonacci no está definido para posiciones negativas."
    Sino
        Si n = 0 Entonces
            Escribir "El número de Fibonacci en la posición 0 es 0."
        Sino
            Si n = 1 Entonces
                Escribir "El número de Fibonacci en la posición 1 es 1."
            Sino
                fibNMinus1 <- 1
                fibNMinus2 <- 0
                fib <- 0
                
                Para i desde 2 hasta n hacer
                    fib <- fibNMinus1 + fibNMinus2
                    fibNMinus2 <- fibNMinus1
                    fibNMinus1 <- fib
                Fin Para
                
                Escribir "El número de Fibonacci en la posición ", n, " es ", fib
            Fin Si
        Fin Si
    Fin Si
Fin Procedimiento

// Llamada al procedimiento principal
EncontrarFibonacciEnPosicion()


4. Escribe un programa en Java que verifique si un número es palíndromo. Se debe solicitar el número por teclado.

Aquí el Pseudocódigo:

Procedimiento VerificarPalindromo()
Escribir "Ingrese un número para verificar si es palíndromo:"
Leer numero
numeroOriginal <- numero
numeroInvertido <- 0

    Mientras numero > 0 Hacer
        digito <- numero % 10
        numeroInvertido <- numeroInvertido * 10 + digito
        numero <- numero / 10
    Fin Mientras

    Si numeroOriginal = numeroInvertido Entonces
        Escribir numeroOriginal, " es un número palíndromo."
    Sino
        Escribir numeroOriginal, " no es un número palíndromo."
    Fin Si
Fin Procedimiento

// Llamada al procedimiento principal
VerificarPalindromo()


5. Escribe un programa en Java que imprima los primeros n términos de la secuencia de Fibonacci. Se debe solicitar el número n por teclado.

Aquí el Pseudocódigo:

Procedimiento ImprimirSecuenciaFibonacci()
Escribir "Ingrese el número de términos de la secuencia de Fibonacci que desea imprimir:"
Leer n

    secuenciaFibonacci <- arreglo de tamaño n
    secuenciaFibonacci[0] <- 0
    Si n > 1 Entonces
        secuenciaFibonacci[1] <- 1
    Fin Si

    Para i desde 2 hasta n - 1 hacer
        secuenciaFibonacci[i] <- secuenciaFibonacci[i - 1] + secuenciaFibonacci[i - 2]
    Fin Para

    Escribir "Los primeros ", n, " términos de la secuencia de Fibonacci son:"
    Para i desde 0 hasta n - 1 hacer
        Escribir secuenciaFibonacci[i]
        Si i < n - 1 Entonces
            Escribir ", "
        Fin Si
    Fin Para
Fin Procedimiento

// Llamada al procedimiento principal
ImprimirSecuenciaFibonacci()


6. Escribe un programa en Java que encuentre todos los números Armstrong entre 1 y 1000.

Aquí el Pseudocódigo:

Procedimiento EncontrarNumerosArmstrong()
Para numero de 1 hasta 1000 hacer
Si EsNumeroArmstrong(numero) entonces
Escribir numero
Fin Si
Fin Para
Fin Procedimiento

Función EsNumeroArmstrong(numero)
numOriginal <- numero
numDigitos <- ContarDigitos(numero)
suma <- 0

    Mientras numero > 0 Hacer
        digito <- numero % 10
        suma <- suma + (digito ^ numDigitos)
        numero <- numero / 10
    Fin Mientras

    Devolver suma = numOriginal
Fin Función

Función ContarDigitos(numero)
contar <- 0
Mientras numero > 0 Hacer
numero <- numero / 10
contar <- contar + 1
Fin Mientras
Devolver contar
Fin Función

// Llamada al procedimiento principal
EncontrarNumerosArmstrong()


7. Imprimir el nombre del día de la semana correspondiente a un número ingresado por el usuario utilizando una estructura switch.
El día a verificar se debe de pedir por teclado.

Aquí el Pseudocódigo:

Procedimiento ImprimirNombreDia()
Escribir "Ingresa un número del 1 al 7 para obtener el día de la semana:"
Leer numeroDia

    nombreDia <- ObtenerNombreDia(numeroDia)

    Si nombreDia != nulo Entonces
        Escribir "El día correspondiente al número ", numeroDia, " es ", nombreDia
    Sino
        Escribir "Número de día inválido. Debe ser un número del 1 al 7."
    Fin Si
Fin Procedimiento

Función ObtenerNombreDia(numeroDia)
nombreDia <- nulo

    Según numeroDia Hacer
        Caso 1:
            nombreDia <- "Lunes"
        Caso 2:
            nombreDia <- "Martes"
        Caso 3:
            nombreDia <- "Miércoles"
        Caso 4:
            nombreDia <- "Jueves"
        Caso 5:
            nombreDia <- "Viernes"
        Caso 6:
            nombreDia <- "Sábado"
        Caso 7:
            nombreDia <- "Domingo"
        De Otro Modo:
            nombreDia <- nulo
    Fin Según

    Devolver nombreDia
Fin Función

// Llamada al procedimiento principal
ImprimirNombreDia()


8. Encontrar y mostrar todos los números perfectos en un rango dado utilizando un bucle for. Solicita el límite por teclado.

Aquí el Pseudocódigo:

Procedimiento EncontrarNumerosPerfectos()
Escribir "Ingresa el límite superior para buscar números perfectos:"
Leer limiteSuperior

    Escribir "Números perfectos en el rango de 1 a ", limiteSuperior, ":"

    Para numero de 1 hasta limiteSuperior hacer
        Si EsNumeroPerfecto(numero) entonces
            Escribir numero
        Fin Si
    Fin Para
Fin Procedimiento

Función EsNumeroPerfecto(numero)
sumaDivisores <- 0

    Para i de 1 hasta numero / 2 hacer
        Si numero % i = 0 entonces
            sumaDivisores <- sumaDivisores + i
        Fin Si
    Fin Para

    Devolver sumaDivisores = numero
Fin Función

// Llamada al procedimiento principal
EncontrarNumerosPerfectos()


9. Imprimir la tabla de multiplicar de un número ingresado por el usuario utilizando un bucle for. Solicita el valor de la tabla por teclado.

Aquí el Pseudocódigo:

Procedimiento ImprimirTablaMultiplicar()
Escribir "Ingresa un número para obtener su tabla de multiplicar:"
Leer numero

    Escribir "Tabla de multiplicar del ", numero, ":"

    Para i de 1 hasta 10 hacer
        resultado <- numero * i
        Escribir numero, " x ", i, " = ", resultado
    Fin Para
Fin Procedimiento

// Llamada al procedimiento principal
ImprimirTablaMultiplicar()



10. Calcular la suma de todos los números pares entre 1 y un número ingresado por el usuario utilizando un bucle do-while.

Aquí el Pseudocódigo:

Procedimiento CalcularSumaNumerosPares()
Escribir "Ingresa un número para calcular la suma de números pares hasta ese número:"
Leer numeroLimite

    suma <- 0
    numeroActual <- 2 // Empezamos con el primer número par, que es 2

    Hacer
        suma <- suma + numeroActual
        numeroActual <- numeroActual + 2 // Avanzamos al siguiente número par
    Mientras numeroActual <= numeroLimite

    Escribir "La suma de los números pares hasta ", numeroLimite, " es: ", suma
Fin Procedimiento

// Llamada al procedimiento principal
CalcularSumaNumerosPares()



Se puede utilizar.:
If-else-switch.
For/While/do-While.

Desarrolle un algoritmo que permita realizar lo que se pide.
Se solicita: 
- Diagrama de flujos.
- Pseudocódigo.
- Programa en java.
Para cada unos de los algoritmos solicitados y cada uno de ellos en una clase.
