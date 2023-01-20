package ativ03;

public class Bmw extends Carro {
    

    @Override
   public void acelerar(int acelera){
    if(acelera > 0){super.velocidade += acelera;
    System.out.println("sua velocidade atual é de " +super.velocidade+ " km/h.");}

   }

   public static void main(String[] args) {
    Carro bm = new Bmw();
    bm.setVelocidade(20);;
    bm.acelerar(20);
   }
}
