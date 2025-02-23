package list1.tadExerc.models;

import java.time.Year;

public class Book {
    private String tittle;
    private String publisher;
    private Year releaseYear;

    public Book(String tittle, Year releaseYear, String publisher) {
        this.releaseYear = releaseYear;
        this.publisher = publisher;
        this.tittle = tittle;
    }

    @Override
    public String toString() {
        return "Book{" +
                "tittle='" + tittle + '\'' +
                ", publisher='" + publisher + '\'' +
                ", releaseYear=" + releaseYear +
                '}';
    }
}
