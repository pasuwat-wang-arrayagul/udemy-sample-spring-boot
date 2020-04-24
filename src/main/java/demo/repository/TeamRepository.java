package demo.repository;

import demo.domain.Team;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TeamRepository extends CrudRepository<Team,Long> {

    List<Team> findAll();

    Team findByName(String name);

}
