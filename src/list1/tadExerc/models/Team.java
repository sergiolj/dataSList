package list1.tadExerc.models;

import list1.tadExerc.tad.MyList;

public class Team {
    private String teamName;
    private String sportName;
    private MyList<Athlete> athletes = new MyList<>();

    public Team(String teamName, String sportName) {
        this.teamName = teamName;
        this.sportName = sportName;
    }

    public MyList<Athlete> getAthletes() {
        return athletes;
    }
}
