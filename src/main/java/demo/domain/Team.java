package demo.domain;

import java.util.Set;

public class Team {
    String name;
    String stadiumName;
    String mascot;
    Set<Player> players;

    public Team(){
        super();
    }

    public Team(String name, String stadiumName, Set<Player> players) {
        this();
        this.name = name;
        this.stadiumName = stadiumName;
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStadiumName() {
        return stadiumName;
    }

    public void setStadiumName(String stadiumName) {
        this.stadiumName = stadiumName;
    }

    public String getMascot() {
        return mascot;
    }

    public void setMascot(String mascot) {
        this.mascot = mascot;
    }

    public Set<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Set<Player> players) {
        this.players = players;
    }
}
