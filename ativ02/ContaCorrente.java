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
            
            return getSaldo();
        }

        return getSaldo();
    }

    public static void main(String[] args) {
        Conta c1 = new ContaCorrente("robert", "3489739847");
        c1.setSaldo(1200);
        c1.getSaldo();
        c1.saque(200);
        c1.getSaldo();
    }

}
