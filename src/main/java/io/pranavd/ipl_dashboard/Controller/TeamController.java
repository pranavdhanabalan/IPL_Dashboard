package io.pranavd.ipl_dashboard.Controller;

import io.pranavd.ipl_dashboard.Model.Team;
import io.pranavd.ipl_dashboard.Repository.TeamRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamController {

    private TeamRepository teamRepository;

    public TeamController(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    @GetMapping("/team/{teamName}")
    public Team getTeam(@PathVariable String teamName){
        return this.teamRepository.findByTeamName(teamName);
    }

    @GetMapping("/teams")
    public Iterable<Team> getAllTeams() {
        return teamRepository.findAll();
    }
    
}
