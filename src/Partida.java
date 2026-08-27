import java.util.Random;
import java.util.Scanner;

public class Partida {
    private Jogador jogador;
    private int limite;
    private int numeroSecreto;
    private int tentativas;

    public Partida(Jogador jogador, int limite) {
        this.jogador = jogador;
        this.limite = limite;
        this.numeroSecreto = new Random().nextInt(limite) + 1;
        this.tentativas = 0;
    }

    public void jogar(Scanner scanner) {
        int palpite = 0;

        System.out.printf(
            "%s, tente adivinhar um número entre 1 e %d.%n",
            jogador.getNome(), limite
        );

        while (palpite != numeroSecreto) {
            System.out.print("Seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite < numeroSecreto) {
                System.out.println("O número secreto é maior.");
            } else if (palpite > numeroSecreto) {
                System.out.println("O número secreto é menor.");
            }
        }

        System.out.printf("Acertou em %d tentativa(s)!%n", tentativas);
        jogador.registrarPontuacao(tentativas);
    }
}
