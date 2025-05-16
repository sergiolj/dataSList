package Av1.q3;

public class Show {
    private String nome;

    public Show(String destino) {

        this.nome = destino;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Show='" + nome + '\'' +
                ']';
    }
}
