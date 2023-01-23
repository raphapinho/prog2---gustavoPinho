public class IngressoInferior extends VIP {
    
    public IngressoInferior(){

    }

    @Override
    public void ImprimeValor(){ 
        System.out.println("valor do Camarote inferior: " + super.valorTotal);
    }

    public static void main(String[] args) {
        VIP Ii = new IngressoInferior();
        Ii.ImprimeValor();
    }
}
