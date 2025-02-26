package list1.tadExerc.models;

import list1.tadExerc.interfaces.ChampionshipRules;
import list1.tadExerc.tad.MyList;

public class Championship<Sport> implements ChampionshipRules {
    private final String name;
    private final MyList<Team> teams = new MyList<>();

    public Championship (String name) {
        this.name = name;
    }

    public MyList<Team> getTeams() {
        return teams;
    }

    public void addTeam(Team team) {
        if (team != null) {
            teams.add(team);
        }else{
            throw new NullPointerException("Team cannot be null");
        }
    }

    @Override
    public void scoreSystem() {

    }
}
