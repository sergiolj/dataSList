package list1.tadExerc.models;

import java.time.Year;

public class Sport {
    private String name;
    private String championshipName;
    private Year year;

    public Sport(String name, String championshipName, Year year) {
        this.name = name;
        this.championshipName = championshipName;
        this.year = year;
    }
}
