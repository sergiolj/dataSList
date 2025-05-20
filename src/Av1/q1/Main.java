package Av1.q1;

public class Main {
    public static void main(String[] args) {
        ConvidadosTAD<Convidado> lista = new ConvidadosTAD<>();

        lista.adicionar(new Convidado("Sérgio", "sergio@", "719999999"));
        lista.adicionar(new Convidado("Maria", "maria@", "719999949"));
        System.out.println("O número de convidados é de "+ lista.quantidade()+" pessoas");
    }
}
