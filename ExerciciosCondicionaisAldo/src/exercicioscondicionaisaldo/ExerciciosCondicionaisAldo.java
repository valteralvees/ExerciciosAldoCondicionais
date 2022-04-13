package exercicioscondicionaisaldo;
import java.util.Scanner;
public class ExerciciosCondicionaisAldo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int num = teclado.nextInt();
        if (num % 2 == 0 || num == 0){
            System.out.println("Número par.");
        } else {
            System.out.println("Número ímpar");
        }
        
    }
    
}
