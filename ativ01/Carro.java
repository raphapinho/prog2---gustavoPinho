class Carro {
    private int enginePower;
    private int speed;
    private int fuel;
    private boolean play;
    

  
    public Carro(int power) {
      enginePower = power;
      speed = 0;
      fuel = 0;
      play = false;
    }
  

    public void abastece(){
        fuel += 10;
    }

    public void tocarMusica(){
        play = true;
    }
    public void accelerate() {
      speed += enginePower;
    }
  
    public void slowDown() {
      speed *= 0.5;
    }
  
    public int speed() {
      return speed;
    }

    public boolean play() {
        return play;
    }

    public int fuel() {
        return fuel;
    }
  
    public static void main(String[] args) {
      // como eu faço para instanciar a classe?
      // muito facil: use o new
      Carro jeep = new Carro(10);
      jeep.accelerate();
      jeep.accelerate();
      jeep.accelerate();
      jeep.accelerate();
      jeep.accelerate();
      jeep.accelerate();

      //abastecendo
      jeep.abastece();
      jeep.abastece();
      jeep.abastece();

      int actualFuel = jeep.fuel();
      System.out.println("quantidade no tanque: "+ actualFuel + "litros");


        //ligando a musica
        jeep.tocarMusica();

        boolean radioNow = jeep.play();

        if(radioNow == false){
            System.out.println("som desligado");
        } else {
            System.out.println("som ligado");
        }
      



      int actualSpeed = jeep.speed();
      System.out.println(actualSpeed);
  
      jeep.slowDown();
      jeep.slowDown();
      jeep.accelerate();
      jeep.accelerate();
     
      int speedNow = jeep.speed();
      System.out.println(speedNow);
    }
  }