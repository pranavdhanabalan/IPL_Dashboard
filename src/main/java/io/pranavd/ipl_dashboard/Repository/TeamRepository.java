package io.pranavd.ipl_dashboard.Repository;

import io.pranavd.ipl_dashboard.Model.Team;
import org.springframework.data.repository.CrudRepository;

public interface TeamRepository extends CrudRepository <Team, Long>{
    Team findByTeamName(String teamName);
}
