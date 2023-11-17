package ies.puerto;

public class Ejercicio6 {

    public static void main (String[] args){
        Ejercicio6 ejercicio6 = new Ejercicio6();
        ejercicio6.creaMarco();
    }
    public void creaMarco(){
        int[][] marco = new int[5][15];

        marco=marcoSuperior(marco);
        marco=marcoInferior(marco);
        marco=marcoLateralIzq(marco);
        marco=marcoLateralDcha(marco);
        muestraMatriz(marco);
    }

    public int[][] marcoSuperior(int[][] marco){
        int i=0;
        for (int j=0; j < 15;j++){
            marco[i][j]=1;
        }
        return marco;
    }

    public int[][] marcoInferior(int[][] marco){
        int i=4;
        for (int j=0; j < 15;j++){
            marco[i][j]=1;
        }
        return marco;
    }

    public int[][] marcoLateralIzq(int[][] marco){
        int j=0;
        for (int i=0; i < 5;i++){
            marco[i][j]=1;
        }
        return marco;
    }

    public int[][] marcoLateralDcha(int[][] marco){
        int j=14;
        for (int i=0; i < 5;i++){
            marco[i][j]=1;
        }
        return marco;
    }

    public void muestraMatriz (int [][] marco){
        for (int i=0; i < 5; i++){
            for(int j=0; j < 15; j++){
                System.out.print(marco[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
