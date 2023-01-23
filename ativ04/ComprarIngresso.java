import java.util.Scanner;


public class ComprarIngresso {

    public static void main(String[] args) {
        
    Scanner scan = new Scanner(System.in);

    int escolha1, escolha2;

    System.out.println("digite 1 para Ingresso normal e 2 para ingresso VIP: ");
    escolha1 = scan.nextInt();
    
    while (escolha1 != 1 && escolha1 != 2) {
        System.out.println("coloque um caracter valido!");

        System.out.println("digite 1 para Ingresso normal e 2 para ingresso VIP: ");
        escolha1 = scan.nextInt();
    }
    if(escolha1 == 1){
        //nomal
        Normal normal = new Normal();
        normal.ImprimeValor();

    } if (escolha1 == 2){
        //VIP
        System.out.println("digite 1 para camarote superior e 2 para camarote inferior : ");
        escolha2 = scan.nextInt();

        while (escolha1 != 1 && escolha1 != 2) {
            System.out.println("coloque um caracter valido!");
            
            System.out.println("digite 1 para Ingresso normal e 2 para ingresso VIP: ");
            escolha1 = scan.nextInt();
        }

        if (escolha2 == 1) {
            //camarote superior
            IngressoSuperior ISuper = new IngressoSuperior();
            ISuper.ImprimeValor();
        } 
        if( escolha2 == 2) {
            //camatore inferior
            IngressoInferior IInfer = new IngressoInferior();
            IInfer.ImprimeValor();
        }

    }

    System.out.println("compra finalizada.");
}
}
