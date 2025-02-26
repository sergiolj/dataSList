package list1.tadExerc.models;

import list1.tadExerc.interfaces.Game;
import list1.tadExerc.tad.MyList;

public class Championship<T extends Sport> implements Game {
    private final String name;
    private final MyList<Team> teams = new MyList<>();
    private final MyList<Match> matchs = new MyList<>();

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
    public void addMatch(Team homeTeam, Team visitorTeam){
        if(homeTeam != null && visitorTeam != null){
            matchs.add(new Match(homeTeam, visitorTeam));
        }else{
            throw new NullPointerException("Match needs to have two teams");
        }
    }


    @Override
    public void scoreSystem() {

    }

    @Override
    public void startGame() {

    }

    @Override
    public void addGameResult() {

    }

    @Override
    public void displayResult() {

    }

    @Override
    public void electWinner() {

    }
}
