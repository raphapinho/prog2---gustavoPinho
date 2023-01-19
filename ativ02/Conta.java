package ativ02;


class Conta extends Correntista{
    //atributos
    protected double saldo = 0;
    protected double valor;


    protected Conta(String nome, String cpf){
        super(nome, cpf);
        
    
    }


    //métodos
    protected double getSaldo(){
        return saldo;
    }

    protected double saque(double valor){

        if( valor > 0 && valor <= this.saldo ){
            this.saldo -= valor;
            System.out.println("saque de R$" +valor+ " efetuado com sucesso.");
            return valor;
        } else {
            System.out.println("saldo insuficiente");
            return valor;
        }

    }

    protected void transferir(double valor , Conta to){
        if( valor > 0 && valor <= this.saldo ){
            System.out.println("valor tranferido de R$" +valor+ " para o titular " + to.getNome()+ " de cpf: " + to.getCpf());
            this.saldo -= valor;
            to.saldo += valor;
        } else {
            System.out.println("sem saldo para efetuar a transferencia");
        }
    }
        
    
}
