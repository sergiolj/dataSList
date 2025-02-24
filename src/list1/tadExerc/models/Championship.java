package list1.tadExerc.models;

import list1.tadExerc.interfaces.IChampionshipRules;
import list1.tadExerc.tad.MyList;

public class Championship implements IChampionshipRules {
    private String name;
    private MyList<Team> teams = new MyList<>();

    public Championship(String name) {
        this.name = name;
    }

    public MyList<Team> getTeams() {
        return teams;
    }

    @Override
    public void scoreSystem() {

    }
}
