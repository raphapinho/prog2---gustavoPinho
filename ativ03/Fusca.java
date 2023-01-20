package ativ03;

class Fusca extends Carro {

    @Override
   public void acelerar(int acelera){
    if(acelera > 0){super.velocidade += acelera;
    System.out.println("sua velocidade atual é de " +super.velocidade+ " km/h.");}

   }

   public static void main(String[] args) {
    Carro beatle = new Fusca();
    beatle.setVelocidade(20);;
    beatle.acelerar(20);
    beatle.acelerar(200);
    beatle.setVelMax(200);
    beatle.velocidadeMaxima();
   }
}
