package ativ03;

public abstract class Carro {
    protected int velocidade, velMax, acelera;

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelMax(int velMax) {
        this.velMax = velMax;
    }

    public int getVelMax() {
        return velMax;
    }

    protected void velocidadeMaxima(){
        if(velocidade == velMax && velocidade > 0){
            System.out.println("está na velocidade maxima.");
            return;
        } if (velocidade > velMax && velocidade > 0) {
            System.out.println("utrapassou a velocidade máxima.");
            return;
        } else {
            System.out.println("está abaixo da velocidade maxima");
        }
    }

    protected abstract void acelerar(int acelera);
    
}


