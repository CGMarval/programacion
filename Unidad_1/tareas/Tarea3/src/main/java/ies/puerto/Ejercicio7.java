package ies.puerto;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un número del 1 al 7 para obtener el día de la semana: ");
        int numeroDia = sc.nextInt();

        String nombreDia = obtenerNombreDia(numeroDia);

        if (nombreDia != null) {
            System.out.println("El día correspondiente al número " + numeroDia + " es " + nombreDia);
        } else {
            System.out.println("Número de día inválido. Debe ser un número del 1 al 7.");
        }

        sc.close();
    }

    public static String obtenerNombreDia(int numeroDia) {
        String nombreDia;

        switch (numeroDia) {
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miércoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6:
                nombreDia = "Sábado";
                break;
            case 7:
                nombreDia = "Domingo";
                break;
            default:
                nombreDia = null;
                break;
        }

        return nombreDia;

    }


}