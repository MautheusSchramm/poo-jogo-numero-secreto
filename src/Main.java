import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        Jogador jogador = new Jogador(scanner.nextLine());

        System.out.println("Dificuldade: 1-Fácil, 2-Médio, 3-Difícil");
        int opcao = scanner.nextInt();

        int limite;
        if (opcao == 1) {
            limite = 10;
        } else if (opcao == 2) {
            limite = 50;
        } else {
            limite = 100;
        }

        Partida partida = new Partida(jogador, limite);
        partida.jogar(scanner);

        System.out.println(
            "Melhor pontuação: " + jogador.getMelhorPontuacao() + " tentativa(s)"
        );

        scanner.close();
    }
}
