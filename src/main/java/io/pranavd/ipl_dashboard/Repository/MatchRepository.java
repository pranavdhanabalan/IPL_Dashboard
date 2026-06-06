package io.pranavd.ipl_dashboard.Repository;

import io.pranavd.ipl_dashboard.Model.Match;
import org.springframework.data.domain.Limit;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.CrudRepository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;

import java.time.LocalDate;
import java.util.List;

public interface MatchRepository extends CrudRepository<Match,Long> {
    List<Match> getByTeam1OrTeam2OrderByDateDesc(String team1, String team2, Pageable pageable);

    List<Match> getByTeam1AndDateBetweenOrTeam2AndDateBetweenOrderByDateDesc(String team1, LocalDate dateAfter, LocalDate dateBefore, String team2, LocalDate dateAfter1, LocalDate dateBefore1);
}
