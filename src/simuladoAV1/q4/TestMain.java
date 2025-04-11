package simuladoAV1.q4;

public class TestMain {
    public static void main(String[] args) {
        MyListaDuplaEncadeada<Professor> lista = new MyListaDuplaEncadeada<>();

        var p1 = new Professor("Beto");
        var p2 = new Professor("Carlos");
        var p3 = new Professor("Jose");
        var p4 = new Professor("Maria");
        var p5 = new Professor("Angela");


        lista.adicionarInicio(p1);
        lista.adicionarInicio(p2);
        lista.adicionarInicio(p3);
        System.out.println(lista);

        lista.adicionarFim(p4);
        lista.adicionarFim(p5);
        System.out.println(lista);

        lista.removerInicio();
        System.out.println(lista);
        lista.removerFim();
        System.out.println(lista);
        lista.removerFim();
        System.out.println(lista);
        lista.removerFim();
        lista.removerInicio();
        System.out.println(lista);
        lista.removerInicio();



    }
}
