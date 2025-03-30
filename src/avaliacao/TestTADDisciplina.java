package avaliacao;

import list1.tadExerc.tad.MyList;

public class TestTADDisciplina {
    public static void main(String[] args) {
            var d1 = new Disciplina("Banco de dados", "Angela Peixoto Santana", 10);
            var d2 = new Disciplina("Introdução a Engenharia de Software", "Angela Peixoto Santana", 10);
            var d3 = new Disciplina("Lógica de Programação e Algoritmos", "Christianne Orrico Dalforno", 10);

            MyList<Disciplina> disciplinas = new MyList<>();
            disciplinas.add(d1);
            disciplinas.add(d2);
            disciplinas.add(d3);
    }
}
