package challenges.duplaList;

import java.util.LinkedList;

public class TestList {
    public static void main(String[] args) {
        var lista = new ListaDuplamenteEncadeada();
        var lista1 = new ListaDuplamenteEncadeada();

        for (int i = 0; i < 10; i++) {
            lista1.addEsquerda(i);
        }

        System.out.println(lista1);

        for (int i = 0; i < 10; i++) {
            lista.addDireita(i);
        }
        System.out.println(lista);

        lista1.removerEsquerda();
        lista1.removerEsquerda();
        System.out.println(lista1);
        lista1.removerDireita();
        System.out.println(lista1);

    }

}
