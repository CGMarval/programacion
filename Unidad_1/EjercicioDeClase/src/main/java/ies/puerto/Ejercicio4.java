package ies.puerto;

public class Ejercicio4 {

    String titular;
    double saldo;

    public Ejercicio4(){
    }

    public Ejercicio4 (String titular){
        this.titular = titular;
    }

    public Ejercicio4 (double saldo){
        this.saldo = saldo;
    }

    public Ejercicio4 (String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }



    /** ejercicio hecho por Jony en clases
    public void depositar(double deposito){
        if (deposito > 0) {
            this.saldo += deposito;
        }
    }
    */

    public boolean depositar(double deposito){
        boolean ingresoCorrecto = true;
        if (deposito < 0) {
            ingresoCorrecto = false;
        } else {
            saldo = saldo + deposito;
        }
        return ingresoCorrecto;
    }

    public boolean retirar(double reintegro){
        boolean reintegroCorrecto = true;
        if (reintegro < 0){
            reintegroCorrecto = false;
        } else if (saldo >= reintegro) {
            saldo -= reintegro;
        }else {
            reintegroCorrecto = false;
        }
        return reintegroCorrecto;
    }

    /** ejercicio hecho por Jony en clases
    public boolean retirar (double reintegro){
        if (saldo - reintegro > 0){
            saldo -= reintegro;
            return true;
        }
        return false;
    }
*/
    public String informacion(){
        return "titular:"+titular+"saldo:"+saldo;
    }

    @Override
    public String toString(){
        return "titular:"+titular+"saldo:"+saldo;
    }


}
