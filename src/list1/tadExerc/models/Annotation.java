package list1.tadExerc.models;

import java.time.LocalDate;

public class Annotation {
    private String title;
    private String content;
    private LocalDate date;

    public Annotation(String title, String content) {
        this.title = title;
        this.content = content;
        this.date = LocalDate.now();
    }
}
