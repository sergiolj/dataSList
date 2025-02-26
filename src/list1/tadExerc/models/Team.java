package list1.tadExerc.models;

import list1.tadExerc.tad.MyList;

public class Team {
    private String teamName;
    private Sport sport;
    private MyList<Athlete> athletes = new MyList<>();

    public Team(String teamName, Sport sport) {
        this.teamName = teamName;
        this.sport = sport;
    }

    public void addAthlete(Athlete athlete){
        if(athlete != null){
            athletes.add(athlete);
        }else{
         throw new NullPointerException("Athlete cannot be null");
        }
    }
}
