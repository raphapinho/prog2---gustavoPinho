package ativ02;
 

public class ativ02{
    public static void main(String[] args) {

        //INSTANCIA A CLASSE
        Conta c1 = new Conta("romario", "099896378527");
        c1.saldo = 1200;

        c1.getSaldo();
        c1.saque(120);

        c1.getSaldo();

        Conta c2 = new Conta("jose", "1234567890");
        
        c1.saldo = 2200;

        c1.transferir(200, c2);

        c1.getSaldo();
        c2.getSaldo();
    }
}