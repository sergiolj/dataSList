package challenges.duplaList;

public class Nodo {
    private Nodo proximo;
    private Nodo anterior;
    private int dado;

    public Nodo(int dado) {
        this.proximo = null;
        this.anterior = null;
        this.dado = dado;
    }

    public Nodo getProximo() {
        return proximo;
    }

    public void setProximo(Nodo proximo) {
        this.proximo = proximo;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }
}
