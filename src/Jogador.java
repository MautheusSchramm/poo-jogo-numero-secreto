public class Jogador {
    private String nome;
    private int melhorPontuacao;

    public Jogador(String nome) {
        this.nome = nome;
        this.melhorPontuacao = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getMelhorPontuacao() {
        return melhorPontuacao;
    }

    public void registrarPontuacao(int pontuacao) {
        if (melhorPontuacao == 0 || pontuacao < melhorPontuacao) {
            melhorPontuacao = pontuacao;
        }
    }
}
