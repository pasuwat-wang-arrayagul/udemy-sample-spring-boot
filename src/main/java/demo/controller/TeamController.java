package demo.controller;

import demo.domain.Player;
import demo.domain.Team;
import demo.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeamController {

    @Autowired
    TeamRepository teamRepository ;

    @GetMapping("/teams/{teamName}")
    public Team getTeam(@PathVariable String teamName){
        return teamRepository.findByName(teamName);
    }

    @GetMapping("/teams")
    public List<Team> getAllTeams(){
        return teamRepository.findAll();
    }
}
