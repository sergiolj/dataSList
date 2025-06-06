package list5.model;
/**
 * @date 2024/november
 * @author Sérgio Lopes Junior
 * @email sergiolj@gmail.com
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Book extends CollectionItem {
    private int edition;
    private int editionYear;
    private String publisher;

    //Constructor
    public Book() {}

    public Book(String title, String author, int pageNumbers, int publicationYear, int edition, int editionYear,
                String publisher) {
        super(title, author, pageNumbers, publicationYear);
        this.edition = edition;
        this.editionYear = editionYear;
        this.publisher = publisher;
    }

    //Getters and Setters
    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        /**
         * Aqui podem ser implementadas regras sobre como esse campo deve ser preenchido,
         * impedindo, por exemplo, a inserção de números negativos ou outras regras aplicáveis.
         */
        this.edition = edition;
    }

    public int getEditionYear() {
        return editionYear;
    }

    public void setEditionYear(int editionYear) {
        /**
         * Aqui podem ser implementadas regras sobre como esse campo deve ser preenchido,
         * impedindo, por exemplo, a inserção de números negativos, valores maiores do que a
         * data atual ou outras regras aplicáveis.
         */
        this.editionYear = editionYear;
    }


    public String getPublisher() {
        return publisher;
    }


    public void setPublisher(String publisher) {
        /**
         * Aqui podem ser implementadas regras sobre como esse campo deve ser preenchido,
         * possivelmente comprimento mínimo e máximo do atributo ou outras regras aplicáveis.
         */
        this.publisher = publisher;
    }

    //Methods

    @Override
    /**
     * Livros comuns podem ter um prazo de emprétimo de 15 dias
     * Esse método é parte da Interface LendRules que pode futuramente
     * criar novas regras para empréstimos.
     */
    public int lendPeriod() {
        return 15;
    }


    @Override
    /**
     * Método abstrato definido na superclasse CollectionItem para ser SOBREESCRITO
     * para cada classe que herdar a CollectionItem, deste modo itens com diferentes características
     * podem ser criados e modificados sob demanda.
     */
    public CollectionItem createCollectionItem(Scanner sc) {
        Book book = new Book();
        System.out.print("\nInsert a new book to Library Collection\n"
                + "Insert title: ");
        book.setTitle(sc.nextLine());

        System.out.print("Insert author: ");
        book.setAuthor(sc.nextLine());


        while(book.getPageNumbers() <=0) {
            try {
                System.out.print("Insert number of pages: ");
                book.setPageNumbers(sc.nextInt());
                sc.nextLine();
            }catch (InputMismatchException e) {
                System.out.println("Invalid option. Only numbers are accepted.\n");
                sc.nextLine(); // Cleaning buffer to avoid ifinite loop behavior
            }
        }


        while(book.getPublicationYear() <=0) {
            try {
                System.out.print("Insert publication year: ");
                book.setPublicationYear(sc.nextInt());
                sc.nextLine();

            }catch (InputMismatchException e) {
                System.out.println("Invalid option. Only numbers are accepted.\n");
                sc.nextLine(); // Cleaning buffer to avoid ifinite loop behavior
            }
        }


        while(book.getEdition() <=0) {
            try {
                System.out.print("Insert edition number: ");
                book.setEdition(sc.nextInt());
                sc.nextLine();

            }catch (InputMismatchException e) {
                System.out.println("Invalid option. Only numbers are accepted.\n");
                sc.nextLine(); // Cleaning buffer to avoid ifinite loop behavior
            }
        }


        while(book.getEditionYear() <=0) {
            try {
                System.out.print("Insert edition year: ");
                book.setEditionYear(sc.nextInt());
                sc.nextLine();

            }catch (InputMismatchException e) {
                System.out.println("Invalid option. Only numbers are accepted.\n");
                sc.nextLine(); // Cleaning buffer to avoid ifinite loop behavior
            }
        }

        System.out.print("Insert publisher name: ");
        book.setPublisher(sc.nextLine());
        System.out.println();

        return book;
    }

    @Override
    public double lateReturnFee() {
        // TODO Auto-generated method stub
        return 0;
    }
}