package list1.tadExerc.models;

public abstract class Sport {
    private final String name;
    private final String description;
    private final int startingPlayers;
    private final int benchPlayers;
    private final int teamPlayers;

    public Sport(String name, String description, int startingPlayers, int benchPlayers) {
        this.name = name;
        this.description = description;
        this.startingPlayers = startingPlayers;
        this.benchPlayers = benchPlayers;
        this.teamPlayers = startingPlayers + benchPlayers;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getStartingPlayers() {
        return startingPlayers;
    }

    public int getBenchPlayers() {
        return benchPlayers;
    }

    public int getTeamPlayers() {
        return teamPlayers;
    }
}
