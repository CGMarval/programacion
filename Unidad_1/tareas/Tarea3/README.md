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
<details><summary>PSEUDOCÓDIGO - Ejercicio 1</summary>

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

<details><summary>DIAGRAMA DE FLUJO - Ejercicio 1</summary>

![Diagrama de flujo Ejercicio 1](https://github.com/CGMarval/programacion/blob/main/Unidad_1/tareas/Tarea3/images/diagrama-flujo-ejercicio1.drawio.png)

</details>

<details><summary>CÓDIGO JAVA - Ejercicio 1</summary>

```code
public class Ejercicio1 {
    public static void main(String[] args) {
        int n = 4; // Número de filas
        int num = 1; // Inicializa el número a imprimir

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println(); // Cambia de línea después de cada fila
        }

    }
```
</details>

## Ejercicio 2
#### Escribe un programa en Java que encuentre el máximo común divisor (MCD) de dos números. Se debe solicitar los números por teclado.

<details><summary>PSEUDOCÓDIGO - Ejercicio 2</summary>

- __Inicio__
- Inicializar variables: a = 0, b = 0
- Solicitar la introducción de los dos números a calcular su MCD
- Leer los dos valores

- __Mientras__ b no sea igual a 0 hacer

   - Temporal = b
   - b = a % b
   - a = Temporal
- __Fin Mientras__
- Devolver a
- __Fin__

</details>

<details><summary>DIAGRAMA DE FLUJO - Ejercicio 2</summary>

![Diagrama de flujo Ejercicio 2](https://github.com/CGMarval/programacion/blob/main/Unidad_1/tareas/Tarea3/images/diagrama-flujo-ejercicio2.drawio.png)

</details>

<details><summary>CÓDIGO JAVA - Ejercicio 2</summary>

```code
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int numero1 = sc.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int numero2 = sc.nextInt();

        int mcd = calcularMCD(numero1, numero2);

        System.out.println("El MCD de " + numero1 + " y " + numero2 + " es " + mcd);

        sc.close();
    }

    // Función para calcular el MCD utilizando el algoritmo de Euclides
    public static int calcularMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;

    }


}
```
</details>

## Ejercicio 3
#### Escribe un programa en Java que encuentre el número de Fibonacci en la posición n.  Se debe solicitar el número por teclado.

<details><summary>PSEUDOCÓDIGO - Ejercicio 3</summary>

- __Inicio__
- Solicitar Ingresa la posición n para encontrar el número de Fibonacci:"
- Leer n
- Declaracion de variables fibNmenos2 = 0, fibNmenos1 = 1, fib <- 0
- __Si n = 0__ Entonces
- fib <- 0
- __Sino Si n = 1__ Entonces
- fib = 1
- __Sino__
- __Para i desde 2 hasta n__ hacer
- fib = fibNmenos1 + fibNmenos2
- fibNmenos2 = fibNmenos1
- fibNmenos1 = fib
- __Fin Para__
- __Fin Si__
- "El número de Fibonacci en la posición ", n, " es ", fib
- __Fin__

</details>

</details>

<details><summary>DIAGRAMA DE FLUJO - Ejercicio 3</summary>

![Diagrama de flujo Ejercicio 3](https://github.com/CGMarval/programacion/blob/main/Unidad_1/tareas/Tarea3/images/diagrama-flujo-ejercicio3.drawio.png)

</details>

<details><summary>CÓDIGO JAVA - Ejercicio 3</summary>

```code
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa la posición n para encontrar el número de Fibonacci: ");
        int n = sc.nextInt();

        int fibNmenos2 = 0;
        int fibNmenos1 = 1;
        int fib = 0;

        if (n == 0) {
            fib = 0;
        } else if (n == 1) {
            fib = 1;
        } else {
            for (int i = 2; i <= n; i++) {
                fib = fibNmenos1 + fibNmenos2;
                fibNmenos2 = fibNmenos1;
                fibNmenos1 = fib;
            }
        }

        System.out.println("El número de Fibonacci en la posición " + n + " es " + fib);

        sc.close();
```
</details>

## Ejercicio 4
#### Escribe un programa en Java que verifique si un número es palíndromo. Se debe solicitar el número por teclado.

<details><summary>PSEUDOCÓDIGO - Ejercicio 4</summary>

- __Inicio__
- Solicitar que Ingrese un número para verificar si es un palíndromo
- Leer numero
- numeroOriginal = numero
- numeroInvertido = 0
- __Mientras__ numero > 0 Hacer
- digito = numero % 10
- numeroInvertido = numeroInvertido * 10 + digito
- numero = numero / 10
- __Fin Mientras__
- __Si__ numeroOriginal = numeroInvertido Entonces
- Escribir numeroOriginal, " es un palíndromo."
- __Sino__
- Escribir numeroOriginal, " no es un palíndromo."
- __ Fin Si__
- __FIN__
</details>

<details><summary>DIAGRAMA DE FLUJO - Ejercicio 4</summary>

![Diagrama de flujo Ejercicio 4](https://github.com/CGMarval/programacion/blob/main/Unidad_1/tareas/Tarea3/images/diagrama-flujo-ejercicio4.drawio.png)

</details>

<details><summary>CÓDIGO JAVA - Ejercicio 4</summary>

```code
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un número para verificar si es un palíndromo: ");
        int numero = sc.nextInt();
        int numeroOriginal = numero;
        int numeroInvertido = 0;

        while (numero > 0) {
            int digito = numero % 10;
            numeroInvertido = numeroInvertido * 10 + digito;
            numero /= 10;
        }

        if (numeroOriginal == numeroInvertido) {
            System.out.println(numeroOriginal + " es un palíndromo.");
        } else {
            System.out.println(numeroOriginal + " no es un palíndromo.");
        }

        sc.close();

    }


}
```
</details>

## Ejercicio 5
#### Escribe un programa en Java que imprima los primeros n términos de la secuencia de Fibonacci. Se debe solicitar el número n por teclado.

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

## Ejercicio 6
#### Escribe un programa en Java que encuentre todos los números Armstrong entre 1 y 1000.

<details><summary>PSEUDOCÓDIGO - Ejercicio 6</summary>

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

</details>

## Ejercicio 7
#### Imprimir el nombre del día de la semana correspondiente a un número ingresado por el usuario utilizando una estructura switch. El día a verificar se debe de pedir por teclado.

<details><summary>PSEUDOCÓDIGO - Ejercicio 7</summary>

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
</details>

## Ejercicio 8
#### Encontrar y mostrar todos los números perfectos en un rango dado utilizando un bucle for. Solicita el límite por teclado.

<details><summary>PSEUDOCÓDIGO - Ejercicio 8</summary>

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
</details>

## Ejercicio 9
#### Imprimir la tabla de multiplicar de un número ingresado por el usuario utilizando un bucle for. Solicita el valor de la tabla por teclado.

<details><summary>PSEUDOCÓDIGO - Ejercicio 9</summary>

Procedimiento ImprimirTablaMultiplicar()
Escribir "Ingresa un número para obtener su tabla de multiplicar:"
Leer numero

    Escribir "Tabla de multiplicar del ", numero, ":"

    Para i de 1 hasta 10 hacer
        resultado <- numero * i
        Escribir numero, " x ", i, " = ", resultado
    Fin Para
Fin Procedimiento
</details>

## Ejercicio 10
#### Calcular la suma de todos los números pares entre 1 y un número ingresado por el usuario utilizando un bucle do-while.

<details><summary>PSEUDOCÓDIGO - Ejercicio 10</summary>

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
</details>



Se puede utilizar.:
If-else-switch.
For/While/do-While.

Desarrolle un algoritmo que permita realizar lo que se pide.
Se solicita: 
- Diagrama de flujos.
- Pseudocódigo.
- Programa en java.
Para cada unos de los algoritmos solicitados y cada uno de ellos en una clase.
