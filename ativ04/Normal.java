
class Normal extends Ingresso{

    public Normal() {
        
    }

    @Override
    public void ImprimeValor(){

        System.out.println("valor ingresso normal: "+ super.valor);
        
    }
    

    public static void main(String[] args) {
        Ingresso normal = new Normal();
        normal.ImprimeValor();
    }
}