package io.pranavd.ipl_dashboard.Controller;

import io.pranavd.ipl_dashboard.Model.Match;
import io.pranavd.ipl_dashboard.Model.Team;
import io.pranavd.ipl_dashboard.Repository.MatchRepository;
import io.pranavd.ipl_dashboard.Repository.TeamRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;

@RestController
@CrossOrigin
public class TeamController {

    private TeamRepository teamRepository;
    private MatchRepository matchRepository;

    public TeamController(TeamRepository teamRepository,MatchRepository matchRepository) {
        this.teamRepository=teamRepository;
        this.matchRepository=matchRepository;
    }

    @GetMapping("/team/{teamName}")
    public Team getTeam(@PathVariable String teamName){
        Team team= this.teamRepository.findByTeamName(teamName);
        Pageable pageable =PageRequest.of(0, 4);
        team.setMatches( matchRepository.getByTeam1OrTeam2OrderByDateDesc(teamName,teamName,pageable));
        return team;
    }

}
