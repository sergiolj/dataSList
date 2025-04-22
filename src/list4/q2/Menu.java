package list4.q2;

import list4.MyListaDuplaEncadeada;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    MyListaDuplaEncadeada<String> listL1 = new MyListaDuplaEncadeada<>();
    MyListaDuplaEncadeada<String> listL2 = new MyListaDuplaEncadeada<>();
    MyListaDuplaEncadeada<String> listL3 = new MyListaDuplaEncadeada<>();
    Scanner sc = new Scanner(System.in);
    boolean running = true;


    public void mainMenu(){

        int choice = 0;

        while(running){
            try{
                options();
                choice = sc.nextInt();
                functionsSwitch(choice);

            }catch(InputMismatchException e){
                System.out.println("Opção inválida. Apenas inteiros [0-3]");
                sc.nextLine();
            }
        }
    }

    public void options(){
        System.out.println("\nOptions:");
        System.out.println("0] Sair");
        System.out.println("1] Adicionar nomes a lista L1");
        System.out.println("2] Adicionar nomes a lista L2");
        System.out.println("3] Listar repetidos");
        System.out.println("Digite uma opção de [0-3]");

    }

    public void functionsSwitch(int choice) {
        sc.nextLine();
        switch (choice) {
            case 0:
                running = false;
                break;
            case 1:
                adicionarL1();
                break;
            case 2:
                adicionarL2();
                break;
            case 3:
                listarRepetidos();
                break;
            default:
                System.out.println("Opção inválida. Escolha uma opção válida [0-3].");
                break;
        }
    }

    private void adicionarL1() {
        boolean running = true;
        String userEntry = "";

        while(running){
            System.out.print("Digite um nome na lista L1 ou (x) para saír: ");
            userEntry =  sc.nextLine();
            if(userEntry.equalsIgnoreCase("x")){
                running = false;
            }else {
                listL1.adicionarInicio(userEntry);
                System.out.println("Nome " + userEntry + " adicionado(a) com sucesso na lista L1!");
            }
        }
    }

    private void adicionarL2() {
        boolean running = true;
        String userEntry = "";

        while(running){
            System.out.print("Digite um nome na lista L2 ou (x) para saír: ");
            userEntry =  sc.nextLine();
            if(userEntry.equalsIgnoreCase("x")){
                running = false;
            }else {
                listL2.adicionarInicio(userEntry);
                System.out.println("Nome " + userEntry + " adicionado(a) com sucesso na lista L1!");
            }
        }
    }

    private void listarRepetidos() {
        if(createDuplicatedNamesList()){
            System.out.println("Listas originais");
            System.out.println(listL1 + " | " + listL2);
            System.out.println("Lista repetidos");
            System.out.println(listL3);
        }else{
            System.out.println("Não existem nomes repetidos");
        }
    }

    private boolean createDuplicatedNamesList() {
        listL3.clear();
        if(listL1.isEmpty() || listL2.isEmpty()){
            return false;
        }
        String currentElement;
        int repeated = 0;
        for (int i = 0; i < listL1.length(); i++) {
            currentElement = listL1.get(i);
            for (int j = 0; j < listL2.length(); j++) {
                if (currentElement.equalsIgnoreCase(listL2.get(j))) {
                    listL3.adicionarFim(currentElement);
                    repeated++;
                }
            }
        }
        return repeated != 0;
    }

}
