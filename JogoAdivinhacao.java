import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        // jogo de adivinhação em java
        int numeroSecreto = new Random().nextInt(10);
        Scanner leitura = new Scanner(System.in);
        int numero = 0;
        int numeroDeTentativas = 0;

        System.out.println("Jogo de adivinhação, escolha um número de 1 a 10! ");
        while (numero != numeroSecreto) {
            System.out.println("Digite um número:");
            numero = leitura.nextInt();
            numeroDeTentativas++;
            if (numero == numeroSecreto) {
                System.out.println("Parabéns você acertou o número secreto");
                System.out.println(String.format("Números de tentativas: %d",numeroDeTentativas ));
                break;
            }

            
        }



    }
}
