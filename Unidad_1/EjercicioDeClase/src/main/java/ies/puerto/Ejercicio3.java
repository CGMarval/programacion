package ies.puerto;

public class Ejercicio3 {

    public int verificaNota (float nota){
        int resultado = 0;

        if (nota <= 4.99){
            resultado = 1;
        } else if (nota >= 5 && nota <= 5.99) {
            resultado = 2;
        } else if (nota >= 6 && nota <= 6.99) {
            resultado = 3;
        } else if (nota >= 7 && nota <= 8.99) {
            resultado = 4;
        } else if (nota >= 9 && nota <= 9.99) {
            resultado = 5;
        } else if (nota == 10) {
            resultado = 6;
        }
        return resultado;
    }

    /**
     * Método hecho en clases hecho por Jony para ser mas eficiente de los if anidados con sólo una condición y además dar el mensaje de aprobado o no en los if
     * @param nota
     * @return
     */
    public void verificaNotaIf (float nota){

        if (nota <= 4.99){
            System.out.println("Suspenso");
        } else if (nota <= 5.99) {
            System.out.println("Aprobado");
        } else if (nota <= 6.99) {
            System.out.println("Bien");
        } else if (nota >= 7 && nota <= 8.99) {
            System.out.println("Notable");
        } else if (nota >= 9 && nota <= 9.99) {
            System.out.println("Sobresaliente");
        } else if (nota == 10) {
            System.out.println("Matricula");
        }

    }


    /**
     * Metodo hecho en clases por Jony de una manera mas eficiente
     * @param nota
     */
    public void verificaNotaSwitch (int nota){
        int notaClasif = verificaNota(nota);
        switch (notaClasif) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Suspenso");
                break;

            case 5:
                System.out.println("Aprobado");
                break;

            case 6:
                System.out.println("Bien");
                break;

            case 7:
                System.out.println("Notable");
                break;

            case 8:
                System.out.println("Notable");
                break;

            case 9:
                System.out.println("Sobresaliente");
                break;

            case 10:
                System.out.println("Matricula");
                break;

            default:
                System.out.println("La nota del alumno debe estar comprendida entre 0 y 10");
        }
    }


    public void clasificaNotas (float nota){
        int enteroNota = (int) nota;
        switch (enteroNota) {
            case 1:
                System.out.println("Suspenso");
                break;

            case 2:
                System.out.println("Aprobado");
                break;

            case 3:
                System.out.println("Bien");
                break;

            case 4:
                System.out.println("Notable");
                break;

            case 5:
                System.out.println("Sobresaliente");
                break;

            case 6:
                System.out.println("Matricula");
                break;

            default:
                System.out.println("La nota del alumno debe estar comprendida entre 0 y 10");
        }
    }

}
