package demo.domain;

import java.util.Set;
import javax.persistence.*;

@Entity
public class Team {
    @Id
    @GeneratedValue
    Long id;
    String name;
    String stadiumName;
    String mascot;

    @OneToMany(cascade = CascadeType.ALL) @JoinColumn(name="teamId")
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
