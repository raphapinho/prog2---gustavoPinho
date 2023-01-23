public class IngressoSuperior extends VIP{
    private double valorAdcionalCamaroteSuperior;

    public IngressoSuperior(){
        this.valorAdcionalCamaroteSuperior = 10;
    }

    @Override
    public void ImprimeValor(){
        super.valorTotal += valorAdcionalCamaroteSuperior;
        System.out.println("esse é o valor do ingresso Camarote Superior: "+ valorTotal);
        
    }

    public static void main(String[] args) {
        VIP iSuper = new IngressoSuperior();
        iSuper.ImprimeValor();
    }

}
