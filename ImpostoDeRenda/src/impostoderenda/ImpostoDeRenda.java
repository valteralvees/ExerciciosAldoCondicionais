package impostoderenda;
import java.util.Scanner;
public class ImpostoDeRenda {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor do seu imposto de renda: R$");
        int valorimposto = teclado.nextInt();
        System.out.println("Digite agora a quantidade de dependentes: ");
        int qtddependentes = teclado.nextInt();
        if (qtddependentes > 0){
            float valorimpostofinal;
            valorimpostofinal = valorimposto - 1000 * qtddependentes;
            if(valorimpostofinal <0){
                System.out.println("Você não precisa pagar imposto pois seus dependentes perpassam a renda.");
            } if(valorimpostofinal > 0){
                System.out.println("Seu imposto de renda ficará em R$"+ valorimpostofinal+ " esse ano");

            }
            
        } else {
            System.out.println("Você peagará o valor integral de R$" +valorimposto + "e sse ano");
        }
                
        
        
    }
    
}
