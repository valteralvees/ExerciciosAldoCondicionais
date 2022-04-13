package ordenarvalores;
import java.util.Scanner;
public class OrdenarValores {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro valor:");
        int num1 = teclado.nextInt();
        System.out.println("Digite o segundo valor:");
        int num2 = teclado.nextInt();
        
        if (num2 < num1 ){
            System.out.println("O valor " + num1 + " é maior que " +num2);
            int guardanum2 = num2;
            int guardanum1 = num1;
            num2 = num1;
            num1 = guardanum2;
            System.out.println("Troquei os números de lugar");
            System.out.println("===================================");
            System.out.println("Número 1:"+ num1 + "Número 2:" +num2);
            System.out.println("===================================");

        } else {
            System.out.println("Os números permanecem no mesmo lugar");
            System.out.println("===================================");
            System.out.println("Número 1:"+ num1 + " Número 2:" +num2);
            System.out.println("===================================");


        }
    }
    
}
