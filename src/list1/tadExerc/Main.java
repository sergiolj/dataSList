package list1.tadExerc;

import list1.tadExerc.models.*;
import list1.tadExerc.tad.*;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Year;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lista de exercícios de TAD - Type Abstract Data\n");
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
        exercise6();
        exercise7();
        exercise8();
        exercise9();
        exercise10();
        exercise11();
        exercise12();
        exercise13();
        exercise14();
        exercise15();
        exercise16();
    }

    public static void exercise1() {
        System.out.println("1- TAD para armazenar dados de livros: Título, editora, ano de publicação.");
        System.out.println("TAD Classes -  Book.java e MyListStack.java\n");

        MyListStack<Book> livrosLerSemestre = new MyListStack<>();
        var b1 = new Book("Engenharia de software", Year.of(2011), "Perason Education do Brasil");
        var b2 = new Book("Estrutura de Dados, algoritmos e análise...", Year.of(2010),
                "Perason Education do Brasil");
        var b3 = new Book("Utilizando UML e Padrões", Year.of(2005), "Pearson Education");

        livrosLerSemestre.push(b1);
        livrosLerSemestre.push(b2);
        livrosLerSemestre.push(b3);
    }

    public static void exercise2() {
        System.out.println("2- Crie um TAD para armazenar dados dos alunos: nome, semestre.");
        System.out.println("TAD Classes -  NaturalPerson.java, Student.java e MyListQueue.java\n");

        MyListQueue<Student> collegesSemester = new MyListQueue<>();
        var st1 = new Student(new NaturalPerson("Tony Stark", "52565213563"), 1);
        var st2 = new Student(new NaturalPerson("Steve Rogers", "45241524315"), 3);
        var st3 = new Student(new NaturalPerson("Natasha Romanov", "61382145814"), 8);

        collegesSemester.poll(st1);
        collegesSemester.poll(st2);
        collegesSemester.poll(st3);
    }

    public static void exercise3() {
        System.out.println("3-Crie um TAD para armazenar dados dos professores: nome, Código da disciplina.");
        System.out.println("TAD Classes -  NaturalPerson.java, Teacher.java e MyListStack.java\n");

        var tutor1 = new Teacher(new NaturalPerson("Angela Peixoto Santana",
                "57623547235"), "BES006");
        var tutor2 = new Teacher(new NaturalPerson("Mario Jorge Pereira",
                "41338051854"), "BES050");
        MyListStack<Teacher> teachersList = new MyListStack<>();
        teachersList.push(tutor1);
        teachersList.push(tutor2);
    }

    public static void exercise4() {
        System.out.println("4- Crie um Tipo Abstrato de Dados (TAD) que represente os números racionais\n" +
                "e que contenha as seguintes funcionalidades de:\n" +
                "(a) Criar racional;\n" +
                "(b) Somar racionais;\n" +
                "(c) Multiplicar racionais;\n" +
                "(d) testar igualdade.");
        System.out.println("TAD Classes -  RationalNUmber.java e TadRational.java\n");
        try {
            var num1 = new RationalNumber(2, 4);
            var num2 = new RationalNumber(3, 1);
            var num3 = new RationalNumber(4, 3);
            TadRational opComRacionais = new TadRational();
            opComRacionais.create(new RationalNumber(1, 2));
            opComRacionais.sum();
            opComRacionais.multiply();
            opComRacionais.isEqual(num2, num3);
        } catch (IllegalArgumentException e) {
            System.out.println("Error creating rational number" + e.getMessage());
        }
    }

    public static void exercise5() {
        System.out.println("5- Sabendo que uma conta bancária tem as operações de visualizar saldo,\n" +
                "depositar, sacar e atualizar. Crie uma TAD para representar essas operações");
        System.out.println("TAD Classes -  NaturalPerson.java e TadBankAccount.java\n");

        var client1 = new NaturalPerson("Bruce Benner", "1212121");
        var account = new CheckingAccount(client1, "1111");
        TadBankAccount<CheckingAccount> conta = new TadBankAccount<>();

        conta.getBalance();
        conta.deposit(1000.00);
        conta.withdraw(100.00);
        conta.update();
    }

    public static void exercise6() {
        System.out.println("6 – Sabendo que as operações de uma agenda telefônica possuem as\n" +
                "operações: Adicionar, excluir, atualizar, remover. Elabore uma TAD para\n" +
                "representar essas operações.");
        System.out.println("TAD Classes - Contact.java e MyList.java\n");

        var contact1 = new Contact("Tony Stark", "719999889");
        var contact2 = new Contact("Steve Rogers", "719999889");
        var contact3 = new Contact("Natasha Romanov", "719999889");
        MyList<Contact> agenda = new MyList<>();
        agenda.add(contact1);
        agenda.add(contact2);
        agenda.add(contact3);
        agenda.remove(contact2);
        agenda.update(contact3);

    }

    public static void exercise7() {
        System.out.println("7 – Crie um TAD para armazenar dados dos pets de um petshop. Os pets\n" +
                "deverão ter nome, telefone do tutor, data de nascimento, raça");
        System.out.println("TAD Classes -  Pet.java e MyListQueue.java\n");

        var pet1 = new Pet("Pluto", LocalDate.of(1930, 01, 01),
                "7199999", "Bloodhound");
        var pet2 = new Pet("Sauron", LocalDate.of(2025, 01, 01),
                "71123232", "Pincher");
        var pet3 = new Pet("Fifi", LocalDate.of(2024, 12, 25),
                "71123232", "Poodle");

        MyListQueue<Pet> listaPets = new MyListQueue<>();
        listaPets.poll(pet1);
        listaPets.poll(pet2);
        listaPets.poll(pet3);
    }

    public static void exercise8() {
        System.out.println("8 – Crie um TAD para armazenar dados da coleção de carrinhos de hotweels.");
        System.out.println("TAD Classes - HotWheels.java e MyList.java\n");

        var car1 = new HotWheels("Camaro", Year.of(1969), "1/64", "Branco");
        var car2 = new HotWheels("Mustang", Year.of(2015), "1/64", "Verde");

        MyList<HotWheels> colecao = new MyList<>();
        colecao.add(car1);
        colecao.add(car2);
    }

    public static void exercise9() {
        System.out.println("9 – Crie um TAD para representar um pedido de restaurante. O pedido deve\n" +
                "conter nome do cliente, itens do pedido, quantidades e valor total.");
        System.out.println("TAD Classes - Client.java, Product.java, Order.java e TadPurchaseList.java\n");

        var client2 = new Client("Tony Stark");
        var product1 = new Product("Lasagna", 1, 55.90, 5);
        var product2 = new Product("Coca-Cola lata 350ml", 2, 10, 50);
        var product3 = new Product("Petit gateau", 3, 20, 10);

        var item1 = new Order(client2, product1, 1);
        var item2 = new Order(client2, product2, 2);
        var item3 = new Order(client2, product3, 1);

        TadPurchaseList orderClient1 = new TadPurchaseList();
        orderClient1.add(item1);
        orderClient1.add(item2);
        orderClient1.add(item3);

        orderClient1.bill();

        MyListQueue<TadPurchaseList> kitchenOrder = new MyListQueue<>();
        kitchenOrder.poll(orderClient1);
    }

    public static void exercise10() {
        System.out.println("10 – Crie um TAD para representar uma playlist de músicas. Cada música deve\n" +
                "conter título, artista e duração. A playlist deve permitir adicionar, remover e\n" +
                "listar músicas.");
        System.out.println("TAD Classes - Music.java e MyListQueue.java\n");

        var music1 = new Music("We are the champions", "Queen",
                Duration.ofMinutes(3).plusSeconds(57));
        var music2 = new Music("Highway to Hell", "AC/DC",
                Duration.ofMinutes(3).plusSeconds(28));

        MyListQueue<Music> playList = new MyListQueue<>();
        playList.poll(music1);
        playList.poll(music2);

        playList.remove();
        playList.toString();
    }

    public static void exercise11() {
        System.out.println("11 – Crie um TAD para representar um estoque de produtos de uma loja. Cada\n" +
                "produto deve conter nome, código, quantidade em estoque e preço unitário.");
        System.out.println("TAD Classes -  Product.java e MyList.java\n");

        var product4 = new Product("Iphone 12", 122, 3300.00, 10);
        var product5 = new Product("Mouse Logitech", 1, 50.00, 2);

        MyList<Product> productsList = new MyList<>();
        productsList.add(product4);
        productsList.add(product5);
        productsList.remove();
    }

    public static void exercise12() {
        System.out.println("12 – Crie um TAD para representar um histórico de compras de um cliente.\n" +
                "Cada compra deve conter a data, a lista de itens comprados e o valor total.");
        System.out.println("TAD Classes -  Client.java, Product.java, " +
                "Order.java e MyPurchaseList.java\n");
        var product4 = new Product("Iphone 12", 122, 3300.00, 10);
        var product5 = new Product("Mouse Logitech", 1, 50.00, 2);
        var client2 = new Client("Bruce Benner", "1212121");

        var purchase1 = new Order(client2, product4, 1);
        var purchase2 = new Order(client2, product5, 1);

        TadPurchaseList orders = new TadPurchaseList();
        orders.add(purchase1);
        orders.add(purchase2);

        orders.bill();
    }

    public static void exercise13() {
        System.out.println("13 – Crie um TAD para representar um campeonato esportivo. Deve conter\n" +
                "nome do campeonato, times participantes e sistema de pontuação.");
        System.out.println("TAD Classes -  Athlete.java, Team.java, Championship.java\n");

        var athlete1 = new Athlete("Michael Jordan", "32154125714", 29);
        var athlete2 = new Athlete("Scott Pippen", "43432423411", 26);
        var athlete3 = new Athlete("Magic Johnson", "89825379867", 32);
        var athlete4 = new Athlete("Karl Malone", "1231124121", 28);

        var team1 = new Team("Chicago Bulls", "Basketball");
        var team2 = new Team("Los Angeles Lakers", "Basketball");
        var team3 = new Team("Utah Jazz", "Basketball");

        team1.getAthletes().add(athlete1);
        team1.getAthletes().add(athlete2);
        team2.getAthletes().add(athlete3);
        team3.getAthletes().add(athlete4);

        Championship championship = new Championship("NBA");

        championship.getTeams().add(team1);
        championship.getTeams().add(team2);
        championship.getTeams().add(team3);

        championship.scoreSystem();
    }

    public static void exercise14() {
        System.out.println("14 – Crie um TAD para representar um funcionário de uma empresa. Deve\n" +
                "conter nome, cargo, salário e data de admissão.");
        System.out.println("TAD Classes - Employe.java, Company.java\n");

        var employe1 = new Employe("Angela Peixoto Santana",
                "57623547235", 20000.00, "Chair Professor",
                LocalDate.of(2025, 01, 01));
        var employe2 = new Employe("Mario Jorge Pereira",
                "41338051854", 20000.00, "Chair Proefessor",
                LocalDate.of(2025, 01, 01));

        var company = new Company("MIT Education", "Massachusets", "11-11223232");

        company.getEmployees().add(employe1);
        company.getEmployees().add(employe2);

    }

    public static void exercise15() {
        System.out.println("15 – Crie um TAD para representar uma fila de atendimento em um hospital.\n" +
                "Deve conter nome do paciente, prioridade e horário de chegada.");
        System.out.println("TAD Classes - Patient.java e TadHospital.java\n");

        var pacient1 = new Patient("Bruce Benner", "34374384723");
        var pacient2 = new Patient("Tony Stark", "1231341341");
        var pacient3 = new Patient("Pepper Pots", "3423423552");

        TadHospital pacientList = new TadHospital();

        pacientList.poll(pacient1);
        pacientList.poll(pacient2);
        pacientList.poll(pacient3);

        pacientList.peekFirst();
        pacientList.priorityRules(pacient1);
    }

    public static void exercise16() {
        System.out.println("16 – Crie um TAD para representar um diário de anotações. Cada anotação\n" +
                "deve conter a data, um título e o conteúdo da anotação.");
        System.out.println("TAD Classes - Annotation.java e MyList.java\n");

        var note1 = new Annotation("Revelations", "I just became awere! That's what I enjoy " +
                "doing the most.");
        var note2 = new Annotation("Revelations", "The Easter Bunny can't lay chocolate eggs," +
                " that's just a lie.");
        var note3 = new Annotation("Revelations", "Money doesn't bring happiness, " +
                "but poverty doen't either, it just makes things even tougher.");

        MyList<Annotation> diary = new MyList<>();
        diary.add(note1);
        diary.add(note2);
        diary.add(note3);
    }
}
