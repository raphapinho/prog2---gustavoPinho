package ativ02;
    
class ContaCorrente extends Conta{
    private double chequeEsp;

    private ContaCorrente(String nome, String cpf){
        super(nome, cpf);
        this.chequeEsp = 200;
    }

    @Override
    protected double saque(double valor){
        
        if(saldo > 0){
            return super.saque(valor);
        }
        

        if( saldo <= 0 && valor <= chequeEsp){
            double divida = chequeEsp + valor;
            chequeEsp -= valor;
            System.out.println("você utilizou: " +divida+ " de cheque especial");
            System.out.println("você possue: " +chequeEsp+ " para retirar.");
            
            return valor;
        }

        return valor;
    }

}
