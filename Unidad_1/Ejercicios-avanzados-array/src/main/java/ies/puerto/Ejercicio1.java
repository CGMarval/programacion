package ies.puerto;

import java.util.Scanner;

public class Ejercicio1 {
    Scanner read = new Scanner(System.in);

    public static void main (String[] args){
        Ejercicio1 ejercicio1 = new Ejercicio1();
        ejercicio1.notasAlumno();
    }

    public void notasAlumno (){
        float[] notas = new float[5];
        float nota;

        for (int i=0; i < 5; i++){
            System.out.println("Ingrese la nota nº"+(i+1));
            nota = read.nextFloat();
            nota = verificaNota(nota, i);
            notas[i] = nota;
        }
        int limiteSupArray = notas.length;
        mostrarNotas(notas, limiteSupArray);
        notaMedia(notas, limiteSupArray);
        mayorNota(notas, limiteSupArray);
        menorNota(notas,limiteSupArray);
    }

    public float verificaNota(float nota, int posicionArray){
        float notaCorrecta = nota;
        while (notaCorrecta < 0 || notaCorrecta > 10){
            System.out.println("La nota debe estar comprendida entre 0 y 10");
            System.out.println("Ingrese la nota nº"+(posicionArray+1));
            notaCorrecta = read.nextFloat();
        }
        return notaCorrecta;
    }

    public void mostrarNotas(float notas[], int limiteSupArray){
        System.out.println("Todas las notas obtenidas por el alumno son las siguiente:");
        for (int i=0; i < limiteSupArray; i++){
            System.out.println(notas[i]);
        }
    }

    public void notaMedia(float notas[], int limiteSupArray){
        float sumaNotas=0;
        int contador=0;
        float promedio;
        for(int i=0; i<limiteSupArray; i++){
            sumaNotas += notas[i];
            contador += 1;
        }
        promedio = sumaNotas/contador;
        System.out.println("La nota media es de: "+promedio);
    }

    public void mayorNota(float notas[], int limiteSupArray){
        float notaMayor=0;
        for (int i=0; i < limiteSupArray; i++){
            if (notas[i] > notaMayor){
                notaMayor=notas[i];
            }
        }
        System.out.println("La nota más alta es: "+notaMayor);
    }

    public void menorNota(float notas[], int limiteSupArray){
        float notamenor=10;
        for (int i=0; i < limiteSupArray; i++){
            if (notas[i] < notamenor){
                notamenor = notas[i];
            }
        }
        System.out.println("La menor nota es: "+notamenor);
    }

}
