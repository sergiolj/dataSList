package simuladoAV1.q2;

import java.time.LocalDate;

public class TestMain {
    public static void main(String[] args) {
        var list = new MyListaEncadeada<Viagem>();

        var viagem1 = new Viagem("França");
        var viagem2 = new Viagem("Brasília");

        list.adicionar(viagem1);
        list.adicionar(viagem2);
        System.out.println(list);

        list.remover();
        System.out.println(list);
        list.remover();
        System.out.println(list);
        list.remover();
    }
}
