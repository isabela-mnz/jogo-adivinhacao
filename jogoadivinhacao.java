import java.util.Random;
import java.util.Scanner;

public class jogoadivinhacao {
    public static void main(String[] args) {
        String nome = "Jogo de adivinhação";
        Random rand = new Random();
        int numeroAleatorio = rand.nextInt(101);
        int i;
        boolean acertou = false;

        System.out.println("---------------");
        System.out.println(nome);
        System.out.println("Vamos começar!");

        Scanner leitura = new Scanner(System.in);

        for (i = 1; i <= 5; i++){
            System.out.println("Tentativa " + i + ": Digite um número entre 0 e 100");
            int tentativasRestantes = 5 - i;

            int palpite = leitura.nextInt();

            if (palpite == numeroAleatorio){
                System.out.println("Você acertou o número aleatório com " + tentativasRestantes + " tentativas restantes. Parabéns!");
                break;
            }
            else if (palpite > numeroAleatorio) {
                System.out.println("Você errou para mais " + tentativasRestantes + " tentativas restantes");
            } else {
                System.out.println("Você errou para menos " + tentativasRestantes + " tentativas restantes");
            }
        }
        System.out.println("Fim de jogo! O número era: " + numeroAleatorio);
    }
}
