package io.pranavd.ipl_dashboard.Controller;

import io.pranavd.ipl_dashboard.Model.Match;
import io.pranavd.ipl_dashboard.Model.Team;
import io.pranavd.ipl_dashboard.Repository.MatchRepository;
import io.pranavd.ipl_dashboard.Repository.TeamRepository;
import org.springframework.cglib.core.Local;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;

import java.time.LocalDate;
import java.util.List;

@RestController
@CrossOrigin
public class TeamController {

    private TeamRepository teamRepository;
    private MatchRepository matchRepository;

    public TeamController(TeamRepository teamRepository,MatchRepository matchRepository) {
        this.teamRepository=teamRepository;
        this.matchRepository=matchRepository;
    }

    @GetMapping("/team")
    public Iterable<Team> getAllTeam(){
        return this.teamRepository.findAll();
    }

    @GetMapping("/team/{teamName}")
    public Team getTeam(@PathVariable String teamName){
        Team team= this.teamRepository.findByTeamName(teamName);
        Pageable pageable =PageRequest.of(0, 4);
        team.setMatches( matchRepository.getByTeam1OrTeam2OrderByDateDesc(teamName,teamName,pageable));
        return team;
    }

    @GetMapping("/team/{teamName}/matches")
    public List<Match> getMatchesForTeam(@PathVariable String teamName,@RequestParam int year){
        LocalDate startDate=LocalDate.of(year,1,1);
        LocalDate endDate=LocalDate.of(year+1,1,1);
        return this.matchRepository.getByTeam1AndDateBetweenOrTeam2AndDateBetweenOrderByDateDesc(
                teamName,
                startDate,
                endDate,
                teamName,
                startDate,
                endDate
        );
    }

}
