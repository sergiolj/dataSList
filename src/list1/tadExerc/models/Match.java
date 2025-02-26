package list1.tadExerc.models;

import list1.tadExerc.interfaces.Game;

import java.time.LocalDate;
import java.time.LocalTime;

public class Match implements Game {
    private Team homeTeam;
    private Team visitorTeam;
    private String city;
    private String stadiumName;
    private LocalDate date;
    private LocalTime time;


    public Match(Team homeTeam, Team visitorTeam, String city, String stadiumName, LocalDate date, LocalTime time) {
        this.homeTeam = homeTeam;
        this.visitorTeam = visitorTeam;
        this.city = city;
        this.stadiumName = stadiumName;
        this.date = date;
        this.time = time;
    }

    public Match(Team homeTeam, Team visitorTeam) {
        this.homeTeam = homeTeam;
        this.visitorTeam = visitorTeam;
    }

    @Override
    public void scoreSystem() {

    }

    @Override
    public void startGame() {

    }

    @Override
    public void updateGame() {

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
