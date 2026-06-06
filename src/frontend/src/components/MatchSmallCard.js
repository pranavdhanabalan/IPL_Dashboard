import {React} from 'react';
import {Link} from "react-router-dom";

import './MatchSmallCard.scss';

export const MatchSmallCard=({teamName,match})=> {
    if (!match) {
        return null;
    }
    const otherTeam=match.team1===teamName?match.team2:match.team1;
    const otherTeamRoute=`/team/${otherTeam}`;
    const isMatchWon=teamName===match.matchWinner;

    return (
        <div className={isMatchWon ? 'MatchSmallCard won-card':'MatchSmallCard lost-card'}>
            <h2>vs</h2>
            <h1> <Link to={otherTeamRoute}>{otherTeam}</Link></h1>
            <h4 className="match-Result">{match.matchWinner} won by {match.resultMargin} {match.result}</h4>
        </div>
    );
}

