package list1.tadExerc;

import list1.tadExerc.models.*;
import list1.tadExerc.tad.*;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Year;

public class Main {
    public static void main(String[] args) {

        /*
         * 1 - Crie um TAD para armazenar dados de livros: Título, editora, ano de
         * publicação.
         */
        MyListStack<Book> livrosLerSemestre = new MyListStack<>();
        var b1 = new Book("Engenharia de software", Year.of(2011),"Perason Education do Brasil");
        var b2 = new Book("Estrutura de Dados, algoritmos e análise...", Year.of(2010),
                "Perason Education do Brasil");
        var b3 = new Book("Utilizando UML e Padrões", Year.of(2005), "Pearson Education");

        livrosLerSemestre.push(b1);
        livrosLerSemestre.push(b2);
        livrosLerSemestre.push(b3);

        /*
         * 2 – Crie um TAD para armazenar dados dos alunos: nome, semestre.
         */
        MyListQueue<Student> colegasSemestre = new MyListQueue<>();
        var st1 = new Student("Tony Stark", 1);
        var st2 = new Student("Steve Rogers", 3);
        var st3 = new Student("Natasha Romanov", 8);

        colegasSemestre.poll(st1);
        colegasSemestre.poll(st2);
        colegasSemestre.poll(st3);


        /*
         * 3 – Crie um TAD para armazenar dados dos professores: nome, Código da
         * disciplina.
         */
        var tut1 = new Teacher("Angela Peixoto Santana", "BES006");
        var tut2 = new Teacher("Mario Jorge Pereira", "BES050");
        MyListStack<Teacher> listaProfessores = new MyListStack<>();
        listaProfessores.push(tut1);
        listaProfessores.push(tut2);

        /*
         * 4 - Crie um Tipo Abstrato de Dados (TAD) que represente os números racionais
         * e que contenha as seguintes funcionalidades de:
         * (a) Criar racional;
         * (b) Somar racionais;
         * (c) Multiplicar racionais;
         * (d) testar igualdade.
         */

        try {
            var num1 = new RationalNumber(2, 4);
            var num2 = new RationalNumber(3, 1);
            var num3 = new RationalNumber(4, 3);
            TadRacional<RationalNumber> opComRacionais = new TadRacional<>();
            opComRacionais.create(new RationalNumber(1, 2));
            opComRacionais.sum();
            opComRacionais.multiply();
            opComRacionais.isEqual(num2, num3);
        } catch (IllegalArgumentException e) {
            System.out.println("Error creating rational number"+e.getMessage());
        }

        /*
         * 5 – Sabendo que uma conta bancária tem as operações de visualizar saldo,
         * depositar, sacar e atualizar. Crie uma TAD para representar essas operações.
         */

        var client = new Client("Sérgio Lopes Júnior", "1212121");
        var account = new CheckingAccount(client, "1111");
        TadContaBancaria<CheckingAccount> conta = new TadContaBancaria<>();

        conta.getBalance();
        conta.deposit(1000.00);
        conta.withdraw(100.00);
        conta.update();

        /*
         * 6 – Sabendo que as operações de uma agenda telefônica possuem as
         * operações: Adicionar, excluir, atualizar, remover. Elabore uma TAD para
         * representar essas operações.
         */
        var contact1 = new Contact("Tony Stark", "719999889");
        var contact2 = new Contact("Steve Rogers", "719999889");
        var contact3 = new Contact("Natasha Romanov", "719999889");
        MyList<Contact> agenda = new MyList<>();
        agenda.add(contact1);
        agenda.add(contact2);
        agenda.add(contact3);
        agenda.remove(contact2);
        agenda.update(contact3);

        /*
         * 7 – Crie um TAD para armazenar dados dos pets de um petshop. Os pets
         *     deverão ter nome, telefone do tutor, data de nascimento, raça.
         */

        var pet1 = new Pet("Pluto", LocalDate.of(1930,01,01),
                "7199999", "Bloodhound");
        var pet2 = new Pet("Sauron", LocalDate.of(2025,01,01),
                "71123232", "Pincher");
        var pet3 = new Pet("Fifi", LocalDate.of(2024,12,25),
                "71123232", "Poodle");

        MyListQueue<Pet> listaPets = new MyListQueue<>();
        listaPets.poll(pet1);
        listaPets.poll(pet2);
        listaPets.poll(pet3);

        /*
         * 8 – Crie um TAD para armazenar dados da coleção de carrinhos de hotweels.
         */

        var car1 = new HotWheels("Camaro", Year.of(1969),"1/64", "Branco");
        var car2 = new HotWheels("Mustang", Year.of(2015), "1/64", "Verde");

        MyList<HotWheels> colecao = new MyList<>();
        colecao.add(car1);
        colecao.add(car2);

        /*
         * 9 – Crie um TAD para representar um pedido de restaurante. O pedido deve
         * conter nome do cliente, itens do pedido, quantidades e valor total.
         */
        var client1 = new Client("Sérgio");

        var item1 =  new OrderItem(client1 , "Lasagna", 1, 55.90);
        var item2 = new OrderItem(client1, "Coca-cola 300ml", 2, 10.00);
        var item3 = new OrderItem(client1, "Petit gateau", 1, 20.00);

        MyList<OrderItem> orderClient1 = new MyList<>();
        orderClient1.add(item1);
        orderClient1.add(item2);
        orderClient1.add(item3);

        orderClient1.bill();

        MyListQueue<MyList> kitchenOrder = new MyListQueue<>();
        kitchenOrder.poll(orderClient1);


        /*
         * 10 – Crie um TAD para representar uma playlist de músicas. Cada música deve
         *   conter título, artista e duração. A playlist deve permitir adicionar, remover e
         *   listar músicas.
         */
        var music1 = new Music("We are the champions", "Queen",
                Duration.ofMinutes(3).plusSeconds(57));
        var music2 = new Music("Highway to Hell", "AC/DC",
                Duration.ofMinutes(3).plusSeconds(28));

        MyListQueue<Music> playList = new MyListQueue<>();
        playList.poll(music1);
        playList.poll(music2);

        playList.remove();
        playList.toString();

        /*
         *11 – Crie um TAD para representar um estoque de produtos de uma loja. Cada
         *  produto deve conter nome, código, quantidade em estoque e preço unitário.
         */
        var product1 = new Product("Iphone 12", 122, 3300.00, 10);
        var product2 = new Product("Mouse Logitech", 1, 50.00, 2);

        MyList<Product> products = new MyList<>();
        products.add(product1);
        products.add(product2);
        products.remove();

        /*
         * 12 – Crie um TAD para representar um histórico de compras de um cliente.
         * Cada compra deve conter a data, a lista de itens comprados e o valor total.
         */


    }
}
