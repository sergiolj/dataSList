package challenges.duplaList;

public class ListaDuplamenteEncadeada {
    private Nodo primeiro;
    private Nodo ultimo;
    private int tamanho = 0;


    public void addEsquerda(int dado) {
            if (tamanho == 0) {
                addPrimeiro(dado);
            } else {
                Nodo nodo = new Nodo(dado);
                nodo.setProximo(primeiro);
                nodo.setAnterior(null);
                this.primeiro = nodo;
                this.tamanho++;
            }
    }

    public void addDireita(int dado) {
        if (tamanho == 0) {
            addPrimeiro(dado);
        }else{
            Nodo nodo = new Nodo(dado);
            nodo.setProximo(null);
            nodo.setAnterior(ultimo);
            this.ultimo.setProximo(nodo);
            this.ultimo = nodo;
            this.tamanho++;
        }
    }

    private void addPrimeiro(int dado) {
        Nodo novo = new Nodo(dado);
        this.primeiro = novo;
        this.ultimo = novo;
        this.ultimo.setProximo(null);
        this.primeiro.setAnterior(null);
        tamanho++;
    }

    public boolean removerEsquerda() {
        if (tamanho == 0) {
            System.out.println("Lista vazia");
            return false;
        }else{
            Nodo aux = primeiro.getProximo();
            this.primeiro.setProximo(null);
            aux.setAnterior(null);
            this.primeiro = aux;
            this.tamanho--;
        }
        return true;
    }

    public boolean removerDireita() {
        if (tamanho == 0) {
            System.out.println("Lista vazia");
            return false;
        }else{
            Nodo aux = ultimo.getAnterior();
            this.ultimo.setProximo(null);
            aux.setAnterior(null);
            this.ultimo = aux;
            this.tamanho--;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("{");
        Nodo noAtual = this.primeiro;
        builder.append(noAtual.getDado());
        while (noAtual.getProximo() != null) {
            noAtual= noAtual.getProximo();
            builder.append(',').append(noAtual.getDado());
        }
        builder.append("}");
        return builder.toString();
    }
}
