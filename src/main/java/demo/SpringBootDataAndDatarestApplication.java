package demo;

import demo.domain.Player;
import demo.domain.Team;
import demo.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class SpringBootDataAndDatarestApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDataAndDatarestApplication.class, args);
    }

    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBootDataAndDatarestApplication.class);
    }

    @PostConstruct
    public void init(){
        Set<Player> players = new HashSet<>();
        players.add(new Player("Van Dirk","DF"));
        players.add(new Player("Henderson","MF"));
        players.add(new Player("Sarah","FW"));

        Team liverpool = new Team("Liverpool","Anfield",players);

        Set<Player> chelseaPlayers = new HashSet<>();
        chelseaPlayers.add(new Player("N'Golo Kante","MF"));
        chelseaPlayers.add(new Player("Tammy Abraham","FW"));
        chelseaPlayers.add(new Player("Kepa Arrizabalaga","GK"));

        Team chelsea = new Team("Chelsea","Stamford Bridge" , chelseaPlayers);

        teamRepository.save(liverpool);
        teamRepository.save(chelsea);
    }

    @Autowired
    TeamRepository teamRepository ;
}
