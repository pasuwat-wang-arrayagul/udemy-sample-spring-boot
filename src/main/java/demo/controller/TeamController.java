package demo.controller;

import demo.domain.Player;
import demo.domain.Team;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

@RestController
public class TeamController {

    private Team team;

    @PostConstruct
    public void init(){
        Set<Player> players = new HashSet<>();
        players.add(new Player("Van Dirk","CB"));
        players.add(new Player("Henderson","MC"));
        players.add(new Player("Sarah","FC"));

        team = new Team("Liverpool","Anfield",players);
    }

    @GetMapping("/liverpool")
    public Team getTeamLiverpool(){
        return team;
    }
}
