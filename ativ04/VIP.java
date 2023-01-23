

class VIP extends Ingresso{
    protected double valorAdcional, valorTotal;

    public VIP() {
        valorAdcional = 20;
        valorTotal = valor + valorAdcional;
    }

    public void ImprimeValor(){
        
        System.out.println("esse é o valor do ingresso VIP: "+ valorTotal);
        
    }

    public static void main(String[] args) {
        Ingresso vip = new VIP();
        vip.ImprimeValor();
    }
    


    
}