package Av1.q4;

public class Passageiros {
    private String nome;

    public Passageiros(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "[Passageiro(a): " + nome + "]";
    }
}
