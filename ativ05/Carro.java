
//passar para dentro do github depois//

package ativ05;

public interface Carro {
    //passando assinaturas dos métodos.
    public void acelerar();
    public void frear();
    public void calculaVelocidade();
}

class Fusca implements Carro{

    private int velocidade, acelera, freia;
    
    public Fusca(){
        velocidade = 0;
        acelera = 10;
        freia = 10;
    }
    //sobrescrevendo os metodos passados pela interface.
    @Override
    public void acelerar() {
        this.velocidade += acelera;
        
    }

    @Override
    public void frear() {
        this.velocidade += freia;
        
    }

    @Override
    public void calculaVelocidade() {
        System.out.println(velocidade);
        
    }

}

class BMW implements Carro{
    private int velocidade, acelera, freia;
    
    public BMW(){
        velocidade = 0;
        acelera = 20;
        freia = 20;
    }

    @Override
    public void acelerar() {
        this.velocidade += acelera;
        
    }

    @Override
    public void frear() {
        this.velocidade += freia;
        
    }

    @Override
    public void calculaVelocidade() {
        System.out.println(velocidade);
        
    }
}

class Main{
    public static void main(String[] args) {
        Carro fusca = new Fusca();
        fusca.acelerar();
        fusca.calculaVelocidade();
    }
}