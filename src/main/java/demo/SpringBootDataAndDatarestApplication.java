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
        players.add(new Player("Van Dirk","CB"));
        players.add(new Player("Henderson","MC"));
        players.add(new Player("Sarah","FC"));

        Team team = new Team("Liverpool","Anfield",players);
        teamRepository.save(team);
    }

    @Autowired
    TeamRepository teamRepository ;
}
