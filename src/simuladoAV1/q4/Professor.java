package simuladoAV1.q4;

public class Professor {
    private String nome;

    public Professor(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "[Professor(a): " + nome + "]";
    }
}
