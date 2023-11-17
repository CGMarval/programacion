package ies.puerto;


public class Ejercicio7 {

    public static void main (String[] args){
        Ejercicio7 ejercicio7 = new Ejercicio7();
        ejercicio7.registroConductores();
    }
    public void registroConductores(){
        String[] Nombre = {"Conductor01", "Conductor02", "Conductor03"};
        double[][] Kms = {{15.5,18.43,28.59,140.10,200.05,0,0},
                        {20.45,47.23,59.04,97.08,159.47,0,0 },
                        {0,0,0,0,0,0,0}};
        float[] total_kms;

        total_kms = totalKms(Kms);
        mostrarResultado(Nombre,total_kms);
    }

    public float[] totalKms(double[][] Kms){
        float[] total_kms = new float[3];
        float total;

        for (int i=0; i < Kms.length; i++){
            total=0;
            for (int j=0; j < 7;j++){
                total += Kms[i][j];
            }
            total_kms[i]=total;
        }
        return total_kms;
    }

    public void mostrarResultado(String[] Nombre, float[] total_kms){
        for(int i=0; i < Nombre.length; i++){
            System.out.println("El conductor "+Nombre[i]+" realizó "+total_kms[i]+" kms");
        }
    }

}
