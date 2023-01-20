package ativ02;

public class Correntista {
    //atributos
    private String nome;
    private String cpf;
    
    protected Correntista(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    protected String getNome(){
        return nome;
    }

    protected String getCpf() {
        return cpf;
    }


}
